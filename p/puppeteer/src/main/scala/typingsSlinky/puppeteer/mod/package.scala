package typingsSlinky.puppeteer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EvaluateFn[T] = java.lang.String | (js.Function2[/* arg1 */ T, /* repeated */ js.Any, js.Any])
  
  type EvaluateFnReturnType[T /* <: typingsSlinky.puppeteer.mod.EvaluateFn[_] */] = js.Any
  
  type Headers = typingsSlinky.std.Record[java.lang.String, java.lang.String]
  
  type LayoutDimension = java.lang.String | scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - scala.Boolean
    - scala.Null
    - typingsSlinky.puppeteer.mod.JSONArray
    - typingsSlinky.puppeteer.mod.JSONObject
  */
  type Serializable = typingsSlinky.puppeteer.mod._Serializable | scala.Double | java.lang.String | scala.Boolean | scala.Null
  
  type SerializableOrJSHandle = typingsSlinky.puppeteer.mod.Serializable | typingsSlinky.puppeteer.mod.JSHandle[js.Any]
  
  type UnwrapElementHandle[X] = X
  
  type WrapElementHandle[X] = X | typingsSlinky.puppeteer.mod.ElementHandle[X]
}
