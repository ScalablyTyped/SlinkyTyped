package typingsSlinky.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  type ArrayBatchRequest = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[typingsSlinky.k6.httpMod.RequestBody | scala.Null], 
    js.UndefOr[typingsSlinky.k6.httpMod.Params | scala.Null]
  ]
  type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[typingsSlinky.k6.httpMod.ResponseType] */] = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[typingsSlinky.k6.httpMod.RequestBody | scala.Null], 
    js.UndefOr[typingsSlinky.k6.httpMod.RefinedParams[RT] | scala.Null]
  ]
  type BatchResponses[Q] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
    */ typingsSlinky.k6.k6Strings.BatchResponses with org.scalablytyped.runtime.TopLevel[Q]
  type CookieJarCookies = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type StructuredRequestBody = org.scalablytyped.runtime.StringDictionary[java.lang.String | typingsSlinky.k6.httpMod.FileData]
}
