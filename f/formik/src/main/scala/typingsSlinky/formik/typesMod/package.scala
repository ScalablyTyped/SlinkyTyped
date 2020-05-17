package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typingsSlinky.formik.formikStrings.FormikErrors with org.scalablytyped.runtime.TopLevel[Values]
  type FormikProps[Values] = typingsSlinky.formik.typesMod.FormikSharedConfig[js.Object] with typingsSlinky.formik.typesMod.FormikState[Values] with typingsSlinky.formik.typesMod.FormikActions[Values] with typingsSlinky.formik.typesMod.FormikHandlers with typingsSlinky.formik.typesMod.FormikComputedProps[Values] with typingsSlinky.formik.typesMod.FormikRegistration
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typingsSlinky.formik.formikStrings.FormikTouched with org.scalablytyped.runtime.TopLevel[Values]
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
}
