package typingsSlinky.jsonld.jsonldSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsonld.jsonldSpecMod.JsonLdObj
  - typingsSlinky.jsonld.jsonldSpecMod.Url
*/
trait Frame extends js.Object

object Frame {
  @scala.inline
  implicit def apply(value: JsonLdObj): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: Url): Frame = value.asInstanceOf[Frame]
}

