package typingsSlinky.inkDashSpinner.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.inkDashSpinner.inkDashSpinnerMod.ChalkProps
import typingsSlinky.inkDashSpinner.inkDashSpinnerMod.SpinnerProps
import typingsSlinky.inkDashSpinner.inkDashSpinnerMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object InkDashSpinner
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("ink-spinner", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SpinnerProps with ChalkProps
}

