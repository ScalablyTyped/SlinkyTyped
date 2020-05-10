package typingsSlinky.formik.fieldArrayMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  name  :string,   validateOnChange ? :boolean} & formik.formik/dist/types.SharedRenderProps<formik.formik/dist/FieldArray.FieldArrayRenderProps> */
@js.native
trait FieldArrayConfig extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, TagMod[Any]]] = js.native
  var component: js.UndefOr[String | (ReactComponentClass[FieldArrayRenderProps | Unit])] = js.native
  var name: String = js.native
  var render: js.UndefOr[js.Function1[/* props */ FieldArrayRenderProps, TagMod[Any]]] = js.native
  var validateOnChange: js.UndefOr[Boolean] = js.native
}

object FieldArrayConfig {
  @scala.inline
  def apply(name: String): FieldArrayConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldArrayConfig]
  }
  @scala.inline
  implicit class FieldArrayConfigOps[Self <: FieldArrayConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: /* props */ FieldArrayRenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[FieldArrayRenderProps | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[FieldArrayRenderProps | Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: String | (ReactComponentClass[FieldArrayRenderProps | Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* props */ FieldArrayRenderProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateOnChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateOnChange")(js.undefined)
        ret
    }
  }
  
}

