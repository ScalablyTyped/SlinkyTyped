package typingsSlinky.jsonld

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsonldSpecMod {
  type Context = typingsSlinky.jsonld.jsonldSpecMod.Document
  type DOMString = java.lang.String
  type Iri = typingsSlinky.jsonld.jsonldSpecMod.Url
  type JsonLdArray = js.Array[typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj]
  type JsonLdObj = js.Object
  type LoadDocumentCallback = js.Function1[
    /* url */ typingsSlinky.jsonld.jsonldSpecMod.Url, 
    js.Promise[typingsSlinky.jsonld.jsonldSpecMod.RemoteDocument]
  ]
  type Url = typingsSlinky.jsonld.jsonldSpecMod.DOMString
}
