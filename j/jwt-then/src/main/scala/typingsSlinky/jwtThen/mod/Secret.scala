package typingsSlinky.jwtThen.mod

import typingsSlinky.jwtThen.anon.Key
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.node.Buffer
  - typingsSlinky.jwtThen.anon.Key
*/
trait Secret extends js.Object

object Secret {
  @scala.inline
  implicit def apply(value: Buffer): Secret = value.asInstanceOf[Secret]
  @scala.inline
  implicit def apply(value: Key): Secret = value.asInstanceOf[Secret]
  @scala.inline
  implicit def apply(value: String): Secret = value.asInstanceOf[Secret]
}

