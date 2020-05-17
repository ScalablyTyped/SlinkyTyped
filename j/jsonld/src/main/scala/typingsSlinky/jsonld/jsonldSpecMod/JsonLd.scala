package typingsSlinky.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj
  - typingsSlinky.jsonld.jsonldSpecMod.JsonLdArray
*/
trait JsonLd extends Document

object JsonLd {
  @scala.inline
  implicit def apply(value: JsonLdArray): JsonLd = value.asInstanceOf[JsonLd]
  @scala.inline
  implicit def apply(value: JsonLdObj): JsonLd = value.asInstanceOf[JsonLd]
}

