package typingsSlinky.nodeFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BlobPart = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | typingsSlinky.nodeFetch.mod.Blob | java.lang.String
  
  type BodyInit = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | typingsSlinky.node.NodeJS.ReadableStream | java.lang.String | typingsSlinky.node.urlMod.URLSearchParams | typingsSlinky.formData.mod.^ 
  
  type HeaderInit = typingsSlinky.nodeFetch.mod.HeadersInit
  
  type HeadersInit = typingsSlinky.nodeFetch.mod.Headers | js.Array[js.Array[java.lang.String]] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.nodeFetch.mod.URLLike
    - typingsSlinky.nodeFetch.mod.Request
  */
  type RequestInfo = typingsSlinky.nodeFetch.mod._RequestInfo | java.lang.String
}
