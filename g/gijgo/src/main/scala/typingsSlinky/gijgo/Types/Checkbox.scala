package typingsSlinky.gijgo.Types

import typingsSlinky.gijgo.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checkbox extends JQuery {
  def destroy(): Unit = js.native
  //toggle(): Checkbox;
  def state(value: String): String | Checkbox = js.native
}

