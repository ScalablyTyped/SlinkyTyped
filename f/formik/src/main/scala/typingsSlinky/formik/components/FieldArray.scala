package typingsSlinky.formik.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.formik.distFieldArrayMod.FieldArrayConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(formik), Name(distFieldArrayMod), Name(FieldArrayConfig))) was not a @ScalaJSDefined trait */
object FieldArray
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formik.formikMod.FieldArray] {
  @JSImport("formik", "FieldArray")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = FieldArrayConfig
}

