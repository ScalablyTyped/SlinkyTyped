package typingsSlinky.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jsonldSpecMod {
  
  type Context = typingsSlinky.jsonld.jsonldSpecMod.Document
  
  type DOMString = java.lang.String
  
  type Document = typingsSlinky.jsonld.jsonldSpecMod.JsonLd | typingsSlinky.jsonld.jsonldSpecMod.Url
  
  type Frame = typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj | typingsSlinky.jsonld.jsonldSpecMod.Url
  
  type Iri = typingsSlinky.jsonld.jsonldSpecMod.Url
  
  type JsonLd = typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj | typingsSlinky.jsonld.jsonldSpecMod.JsonLdArray
  
  type JsonLdArray = js.Array[typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj]
  
  type JsonLdObj = js.Object
  
  type LoadDocumentCallback = js.Function1[
    /* url */ typingsSlinky.jsonld.jsonldSpecMod.Url, 
    js.Promise[typingsSlinky.jsonld.jsonldSpecMod.RemoteDocument]
  ]
  
  type Url = typingsSlinky.jsonld.jsonldSpecMod.DOMString
}
