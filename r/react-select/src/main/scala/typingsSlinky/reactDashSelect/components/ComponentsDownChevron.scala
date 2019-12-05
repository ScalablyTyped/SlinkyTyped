package typingsSlinky.reactDashSelect.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(scala), Name(scalajs), Name(js), Name(Any))) was not a @ScalaJSDefined trait */
object ComponentsDownChevron
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-select", "components.DownChevron")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

