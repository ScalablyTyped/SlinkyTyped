package typingsSlinky.lokijs

import typingsSlinky.lokijs.lokijsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lokijs.AnonDelimited
  - typingsSlinky.lokijs.AnonDelimiter
*/
trait DeserializeOptions extends js.Object

object DeserializeOptions {
  @scala.inline
  def AnonDelimited(delimited: `false`): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimited = delimited.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
  @scala.inline
  def AnonDelimiter(delimiter: String): DeserializeOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeOptions]
  }
}

