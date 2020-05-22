package typingsSlinky.monacoEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FromLineNumber extends js.Object {
  /**
    * The start of the range (inclusive)
    */
  val fromLineNumber: Double
  /**
    * The end of the range (inclusive)
    */
  val toLineNumber: Double
}

object FromLineNumber {
  @scala.inline
  def apply(fromLineNumber: Double, toLineNumber: Double): FromLineNumber = {
    val __obj = js.Dynamic.literal(fromLineNumber = fromLineNumber.asInstanceOf[js.Any], toLineNumber = toLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromLineNumber]
  }
}

