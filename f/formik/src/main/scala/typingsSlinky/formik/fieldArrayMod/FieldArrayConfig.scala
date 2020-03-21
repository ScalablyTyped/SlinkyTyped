package typingsSlinky.formik.fieldArrayMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name  :string,   validateOnChange ? :boolean} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
trait FieldArrayConfig extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, TagMod[Any]]] = js.undefined
  var component: js.UndefOr[String | (ReactComponentClass[FieldArrayRenderProps | Unit])] = js.undefined
  var name: String
  var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, TagMod[Any]]] = js.undefined
  var validateOnChange: js.UndefOr[Boolean] = js.undefined
}

object FieldArrayConfig {
  @scala.inline
  def apply(
    name: String,
    children: /* props */ FieldArrayRenderProps => TagMod[Any] = null,
    component: String | (ReactComponentClass[FieldArrayRenderProps | Unit]) = null,
    render: /* props */ FieldArrayRenderProps => TagMod[Any] = null,
    validateOnChange: js.UndefOr[Boolean] = js.undefined
  ): FieldArrayConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(validateOnChange)) __obj.updateDynamic("validateOnChange")(validateOnChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayConfig]
  }
}

