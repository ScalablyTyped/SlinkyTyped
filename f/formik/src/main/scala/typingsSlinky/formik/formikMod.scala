package typingsSlinky.formik

import slinky.core.facade.ReactElement
import typingsSlinky.formik.anon.Dirty
import typingsSlinky.formik.typesMod.FormikConfig
import typingsSlinky.formik.typesMod.FormikErrors
import typingsSlinky.formik.typesMod.FormikValues
import typingsSlinky.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formikMod {
  
  @JSImport("formik/dist/Formik", "Formik")
  @js.native
  def Formik[Values /* <: FormikValues */, ExtraProps](props: FormikConfig[Values] with ExtraProps): ReactElement = js.native
  
  @JSImport("formik/dist/Formik", "prepareDataForValidation")
  @js.native
  def prepareDataForValidation[T /* <: FormikValues */](values: T): FormikValues = js.native
  
  @JSImport("formik/dist/Formik", "useFormik")
  @js.native
  def useFormik[Values /* <: FormikValues */](
    hasValidateOnChangeValidateOnBlurValidateOnMountIsInitialValidEnableReinitializeOnSubmitRest: FormikConfig[Values]
  ): Dirty[Values] = js.native
  
  @JSImport("formik/dist/Formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any): js.Promise[Partial[T]] = js.native
  @JSImport("formik/dist/Formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: js.UndefOr[scala.Nothing], context: js.Any): js.Promise[Partial[T]] = js.native
  @JSImport("formik/dist/Formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean): js.Promise[Partial[T]] = js.native
  @JSImport("formik/dist/Formik", "validateYupSchema")
  @js.native
  def validateYupSchema[T /* <: FormikValues */](values: T, schema: js.Any, sync: Boolean, context: js.Any): js.Promise[Partial[T]] = js.native
  
  @JSImport("formik/dist/Formik", "yupToFormErrors")
  @js.native
  def yupToFormErrors[Values](yupError: js.Any): FormikErrors[Values] = js.native
}
