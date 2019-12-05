package typingsSlinky.formik.components

import org.scalajs.dom.raw.HTMLFormElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.FormHTMLAttributes
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(std), Name(Pick))) was not a @ScalaJSDefined trait */
object Form
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.formik.formikMod.Form] {
  @JSImport("formik", "Form")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = Pick[
    FormHTMLAttributes[HTMLFormElement], 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 255 */ js.Any
  ]
}

