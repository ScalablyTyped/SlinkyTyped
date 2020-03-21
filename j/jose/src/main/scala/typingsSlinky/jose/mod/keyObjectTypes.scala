package typingsSlinky.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jose.joseStrings.secret
  - typingsSlinky.jose.joseStrings.`private`
  - typingsSlinky.jose.joseStrings.public
*/
trait keyObjectTypes extends js.Object

object keyObjectTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.jose.joseStrings.`private` = this.cast("private")
  @scala.inline
  def public: typingsSlinky.jose.joseStrings.public = this.cast("public")
  @scala.inline
  def secret: typingsSlinky.jose.joseStrings.secret = this.cast("secret")
}

