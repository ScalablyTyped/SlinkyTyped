package typingsSlinky.lokijs

import typingsSlinky.lokijs.anon.Delimited
import typingsSlinky.lokijs.anon.Delimiter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lokijs.anon.Delimited
  - typingsSlinky.lokijs.anon.Delimiter
*/
trait DeserializeOptions extends js.Object

object DeserializeOptions {
  @scala.inline
  implicit def apply(value: Delimited): DeserializeOptions = value.asInstanceOf[DeserializeOptions]
  @scala.inline
  implicit def apply(value: Delimiter): DeserializeOptions = value.asInstanceOf[DeserializeOptions]
}

