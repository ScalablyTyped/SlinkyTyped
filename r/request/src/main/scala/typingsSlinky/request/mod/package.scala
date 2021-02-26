package typingsSlinky.request

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Cookie = typingsSlinky.toughCookie.mod.Cookie
  
  type Headers = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MultipartBody = java.lang.String | typingsSlinky.node.Buffer | js.typedarray.ArrayBuffer | js.typedarray.Uint8Array
  
  type OptionalUriUrl = typingsSlinky.request.mod.RequiredUriUrl | js.Object
  
  type Options = typingsSlinky.request.mod.OptionsWithUri | typingsSlinky.request.mod.OptionsWithUrl
  
  type OptionsWithUri = typingsSlinky.request.mod.UriOptions with typingsSlinky.request.mod.CoreOptions
  
  type OptionsWithUrl = typingsSlinky.request.mod.UrlOptions with typingsSlinky.request.mod.CoreOptions
  
  type RequestCallback = js.Function3[
    /* error */ js.Any, 
    /* response */ typingsSlinky.request.mod.Response, 
    /* body */ js.Any, 
    scala.Unit
  ]
  
  type RequestResponse = typingsSlinky.request.mod.Response
  
  // aliases for backwards compatibility
  type ResponseRequest = typingsSlinky.request.mod.Request
}
