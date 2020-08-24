package typingsSlinky.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FieldValidator = js.Function1[
    /* value */ js.Any, 
    java.lang.String | scala.Unit | (js.Promise[java.lang.String | scala.Unit])
  ]
  type FormikErrors[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K][number]> * / object> | string | std.Array<string> : string | std.Array<string> : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikErrors<Values[K]> * / object : string}
    */ typingsSlinky.formik.formikStrings.FormikErrors with org.scalablytyped.runtime.TopLevel[js.Any]
  type FormikTouched[Values] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Values ]:? Values[K] extends std.Array<any>? Values[K][number] extends object? std.Array</ * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K][number]> * / object> : boolean : Values[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias formik.formik/dist/types.FormikTouched<Values[K]> * / object : boolean}
    */ typingsSlinky.formik.formikStrings.FormikTouched with org.scalablytyped.runtime.TopLevel[js.Any]
  type FormikValues = org.scalablytyped.runtime.StringDictionary[js.Any]
  type GenericFieldHTMLAttributes = typingsSlinky.react.mod.DetailedHTMLProps[
    typingsSlinky.react.mod.InputHTMLAttributes[org.scalajs.dom.raw.HTMLInputElement] | typingsSlinky.react.mod.SelectHTMLAttributes[org.scalajs.dom.raw.HTMLSelectElement] | typingsSlinky.react.mod.TextareaHTMLAttributes[org.scalajs.dom.raw.HTMLTextAreaElement], 
    org.scalajs.dom.raw.HTMLInputElement | org.scalajs.dom.raw.HTMLSelectElement | org.scalajs.dom.raw.HTMLTextAreaElement
  ]
}
