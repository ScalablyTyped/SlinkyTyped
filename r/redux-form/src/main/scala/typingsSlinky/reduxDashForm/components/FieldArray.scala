package typingsSlinky.reduxDashForm.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reduxDashForm.libFieldArrayMod.BaseFieldArrayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reduxDashForm), Name(libFieldArrayMod), Name(BaseFieldArrayProps))) was not a @ScalaJSDefined trait */
object FieldArray
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reduxDashForm.immutableMod.FieldArray[js.Any, js.Any]] {
  @JSImport("redux-form/immutable", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = BaseFieldArrayProps[js.Any, js.Any]
}

