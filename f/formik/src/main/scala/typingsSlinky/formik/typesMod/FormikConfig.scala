package typingsSlinky.formik.typesMod

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikConfig[Values]
  extends FormikSharedConfig[js.Object] {
  var children: js.UndefOr[(js.Function1[/* props */ FormikProps[Values], TagMod[Any]]) | TagMod[Any]] = js.native
  var component: js.UndefOr[ReactComponentClass[FormikProps[Values]] | TagMod[Any]] = js.native
  var initialStatus: js.UndefOr[js.Any] = js.native
  var initialValues: Values = js.native
  var onReset: js.UndefOr[
    js.Function2[/* values */ Values, /* formikActions */ FormikActions[Values], Unit]
  ] = js.native
  var render: js.UndefOr[js.Function1[/* props */ FormikProps[Values], TagMod[Any]]] = js.native
  var validate: js.UndefOr[
    js.Function1[/* values */ Values, Unit | js.Object | js.Promise[FormikErrors[Values]]]
  ] = js.native
  var validationSchema: js.UndefOr[js.Any | js.Function0[_]] = js.native
  def onSubmit(values: Values, formikActions: FormikActions[Values]): Unit = js.native
}

object FormikConfig {
  @scala.inline
  def apply[Values](initialValues: Values, onSubmit: (Values, FormikActions[Values]) => Unit): FormikConfig[Values] = {
    val __obj = js.Dynamic.literal(initialValues = initialValues.asInstanceOf[js.Any], onSubmit = js.Any.fromFunction2(onSubmit))
    __obj.asInstanceOf[FormikConfig[Values]]
  }
  @scala.inline
  implicit class FormikConfigOps[Self[values] <: FormikConfig[values], Values] (val x: Self[Values]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Values] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Values]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Values] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Values] with Other]
    @scala.inline
    def withInitialValues(value: Values): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSubmit(value: (Values, FormikActions[Values]) => Unit): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenFunction1(value: /* props */ FormikProps[Values] => TagMod[Any]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: (js.Function1[/* props */ FormikProps[Values], TagMod[Any]]) | TagMod[Any]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentReactElement(value: ReactElement): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentFunctionComponent(value: ReactComponentClass[FormikProps[Values]]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentComponentClass(value: ReactComponentClass[FormikProps[Values]]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponent(value: ReactComponentClass[FormikProps[Values]] | TagMod[Any]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialStatus(value: js.Any): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialStatus: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: (/* values */ Values, /* formikActions */ FormikActions[Values]) => Unit): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* props */ FormikProps[Values] => TagMod[Any]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* values */ Values => Unit | js.Object | js.Promise[FormikErrors[Values]]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationSchemaFunction0(value: () => _): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidationSchema(value: js.Any | js.Function0[_]): Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationSchema: Self[Values] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationSchema")(js.undefined)
        ret
    }
  }
  
}

