package typingsSlinky.reactDashCircularDashProgressbar.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashCircularDashProgressbar.distCircularProgressbarMod.default
import typingsSlinky.reactDashCircularDashProgressbar.distTypesMod.CircularProgressbarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashCircularDashProgressbar), Name(distTypesMod), Name(CircularProgressbarProps))) was not a @ScalaJSDefined trait */
object CircularProgressbar
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-circular-progressbar/dist/CircularProgressbar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CircularProgressbarProps
}

