package typingsSlinky.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Body = java.lang.String | (typingsSlinky.std.Record[java.lang.String, js.Any])
  
  // Essentially valid, decoded JSON with the addition of possible RegExp. TS doesn't currently have
  // a great way to represent JSON type data, this data matcher design is based off this comment.
  // https://github.com/microsoft/TypeScript/issues/1897#issuecomment-338650717
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - scala.Double
    - java.lang.String
    - scala.Null
    - js.UndefOr[scala.Nothing]
    - typingsSlinky.std.RegExp
    - typingsSlinky.nock.mod.DataMatcherArray
    - typingsSlinky.nock.mod.DataMatcherMap
  */
  type DataMatcher = js.UndefOr[
    typingsSlinky.nock.mod._DataMatcher | scala.Boolean | scala.Double | java.lang.String | scala.Null | js.RegExp
  ]
  
  type InterceptFunction = js.Function3[
    /* uri */ java.lang.String | js.RegExp | (js.Function1[/* uri */ java.lang.String, scala.Boolean]), 
    /* requestBody */ js.UndefOr[typingsSlinky.nock.mod.RequestBodyMatcher], 
    /* interceptorOptions */ js.UndefOr[typingsSlinky.nock.mod.Options], 
    typingsSlinky.nock.mod.Interceptor
  ]
  
  // a string or decoded JSON
  type ReplyBody = typingsSlinky.nock.mod.Body | typingsSlinky.node.Buffer | typingsSlinky.node.fsMod.ReadStream
  
  type ReplyFnResult = js.Array[typingsSlinky.nock.mod.StatusCode] | (js.Tuple2[typingsSlinky.nock.mod.StatusCode, typingsSlinky.nock.mod.ReplyBody]) | (js.Tuple3[
    typingsSlinky.nock.mod.StatusCode, 
    typingsSlinky.nock.mod.ReplyBody, 
    typingsSlinky.nock.mod.ReplyHeaders
  ])
  
  type ReplyHeaderFunction = js.Function3[
    /* req */ typingsSlinky.node.httpMod.ClientRequest, 
    /* res */ typingsSlinky.node.httpMod.IncomingMessage, 
    /* body */ java.lang.String | typingsSlinky.node.Buffer, 
    java.lang.String | js.Array[java.lang.String]
  ]
  
  type ReplyHeaderValue = java.lang.String | js.Array[java.lang.String] | typingsSlinky.nock.mod.ReplyHeaderFunction
  
  type ReplyHeaders = (typingsSlinky.std.Record[java.lang.String, typingsSlinky.nock.mod.ReplyHeaderValue]) | (typingsSlinky.std.Map[java.lang.String, typingsSlinky.nock.mod.ReplyHeaderValue]) | js.Array[typingsSlinky.nock.mod.ReplyHeaderValue]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.std.RegExp
    - typingsSlinky.nock.mod.DataMatcherArray
    - typingsSlinky.nock.mod.DataMatcherMap
    - js.Function1[/ * body * / js.Any, scala.Boolean]
  */
  type RequestBodyMatcher = typingsSlinky.nock.mod._RequestBodyMatcher | (js.Function1[/* body */ js.Any, scala.Boolean]) | java.lang.String | typingsSlinky.node.Buffer | js.RegExp
  
  type RequestHeaderMatcher = java.lang.String | js.RegExp | (js.Function1[/* fieldValue */ java.lang.String, scala.Boolean])
  
  type StatusCode = scala.Double
}
