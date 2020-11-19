package typingsSlinky.bent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BaseUrl = java.lang.String
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Json = (org.scalablytyped.runtime.StringDictionary[js.Any] with org.scalablytyped.runtime.NumberDictionary[js.Any]) | js.Array[js.Any]
  
  type Options = typingsSlinky.bent.mod.HttpMethod | typingsSlinky.bent.mod.StatusCode | typingsSlinky.bent.mod.Headers | typingsSlinky.bent.mod.BaseUrl
  
  type RequestBody = java.lang.String | typingsSlinky.node.streamMod.Stream | typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | typingsSlinky.bent.mod.Json
  
  type RequestFunction[T /* <: typingsSlinky.bent.mod.ValidResponse */] = js.Function3[
    /* url */ java.lang.String, 
    /* body */ js.UndefOr[typingsSlinky.bent.mod.RequestBody], 
    /* headers */ js.UndefOr[typingsSlinky.bent.mod.Headers], 
    js.Promise[T]
  ]
  
  type StatusCode = scala.Double
  
  type ValidResponse = typingsSlinky.bent.mod.BentResponse | java.lang.String | typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | typingsSlinky.bent.mod.Json
}
