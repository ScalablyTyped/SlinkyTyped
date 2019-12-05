package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import org.scalajs.dom.raw.HTMLInputElement
  import org.scalajs.dom.raw.HTMLSelectElement
  import org.scalajs.dom.raw.HTMLTextAreaElement
  import typingsSlinky.formik.formikStrings.validate
  import typingsSlinky.formik.formikStrings.validationSchema
  import typingsSlinky.react.reactMod.InputHTMLAttributes
  import typingsSlinky.react.reactMod.SelectHTMLAttributes
  import typingsSlinky.react.reactMod.TextareaHTMLAttributes
  import typingsSlinky.std.Pick

  type FormikContext[Values] = FormikProps[Values] with (Pick[FormikConfig[Values], validate | validationSchema])
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typingsSlinky.formik.formikStrings.FormikErrors with Values
  type FormikProps[Values] = FormikSharedConfig[js.Object] with FormikState[Values] with FormikActions[Values] with FormikHandlers with FormikComputedProps[Values] with FormikRegistration
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typingsSlinky.formik.formikStrings.FormikTouched with Values
  type FormikValues = StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement]
}
