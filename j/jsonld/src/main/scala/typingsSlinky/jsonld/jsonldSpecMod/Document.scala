package typingsSlinky.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonld.jsonldSpecMod.JsonLd
  - typingsSlinky.jsonld.jsonldSpecMod.Url
*/
trait Document extends js.Object

object Document {
  @scala.inline
  implicit def apply(value: JsonLd): Document = value.asInstanceOf[Document]
  @scala.inline
  implicit def apply(value: Url): Document = value.asInstanceOf[Document]
}

