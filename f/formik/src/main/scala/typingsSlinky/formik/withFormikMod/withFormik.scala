package typingsSlinky.formik.withFormikMod

import typingsSlinky.formik.typesMod.FormikProps
import typingsSlinky.formik.typesMod.FormikValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("formik/dist/withFormik", "withFormik")
@js.native
object withFormik extends js.Object {
  
  def apply[OuterProps /* <: js.Object */, Values /* <: FormikValues */, Payload](hasMapPropsToValuesConfig: WithFormikConfig[OuterProps, Values, Payload]): ComponentDecorator[OuterProps, OuterProps with FormikProps[Values]] = js.native
}
