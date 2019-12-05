package typingsSlinky.reduxDashForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashForm.libFieldsMod.BaseFieldsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Fields
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxDashForm.immutableMod.Fields[js.Any]] {
  @JSImport("redux-form/immutable", "Fields")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = BaseFieldsProps[js.Any] with js.Any
}

