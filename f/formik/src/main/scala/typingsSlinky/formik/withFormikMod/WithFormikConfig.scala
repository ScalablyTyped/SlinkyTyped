package typingsSlinky.formik.withFormikMod

import typingsSlinky.formik.typesMod.FormikSharedConfig
import typingsSlinky.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithFormikConfig[Props, Values /* <: FormikValues */, DeprecatedPayload] extends FormikSharedConfig[Props] {
  var displayName: js.UndefOr[String] = js.native
  var mapPropsToStatus: js.UndefOr[js.Function1[/* props */ Props, _]] = js.native
  var mapPropsToValues: js.UndefOr[js.Function1[/* props */ Props, Values]] = js.native
  var mapValuesToPayload: js.UndefOr[js.Function1[/* values */ Values, DeprecatedPayload]] = js.native
  var validate: js.UndefOr[
    js.Function2[/* values */ Values, /* props */ Props, Unit | js.Object | js.Promise[_]]
  ] = js.native
  var validationSchema: js.UndefOr[js.Any | (js.Function1[/* props */ Props, _])] = js.native
  def handleSubmit(values: Values, formikBag: FormikBag[Props, Values]): Unit = js.native
}

object WithFormikConfig {
  @scala.inline
  def apply[Props, Values, DeprecatedPayload](handleSubmit: (Values, FormikBag[Props, Values]) => Unit): WithFormikConfig[Props, Values, DeprecatedPayload] = {
    val __obj = js.Dynamic.literal(handleSubmit = js.Any.fromFunction2(handleSubmit))
    __obj.asInstanceOf[WithFormikConfig[Props, Values, DeprecatedPayload]]
  }
  @scala.inline
  implicit class WithFormikConfigOps[Self[props, values, deprecatedpayload] <: WithFormikConfig[props, values, deprecatedpayload], Props, Values, DeprecatedPayload] (val x: Self[Props, Values, DeprecatedPayload]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, Values, DeprecatedPayload] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, Values, DeprecatedPayload]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, Values, DeprecatedPayload]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, Values, DeprecatedPayload]) with Other]
    @scala.inline
    def withHandleSubmit(value: (Values, FormikBag[Props, Values]) => Unit): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPropsToStatus(value: /* props */ Props => _): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapPropsToStatus: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withMapPropsToValues(value: /* props */ Props => Values): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToValues")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapPropsToValues: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPropsToValues")(js.undefined)
        ret
    }
    @scala.inline
    def withMapValuesToPayload(value: /* values */ Values => DeprecatedPayload): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValuesToPayload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMapValuesToPayload: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValuesToPayload")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: (/* values */ Values, /* props */ Props) => Unit | js.Object | js.Promise[_]): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSchemaFunction1(value: /* props */ Props => _): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidationSchema(value: js.Any | (js.Function1[/* props */ Props, _])): Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationSchema: Self[Props, Values, DeprecatedPayload] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(js.undefined)
        ret
    }
  }
  
}

