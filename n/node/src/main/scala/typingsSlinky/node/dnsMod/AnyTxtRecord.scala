package typingsSlinky.node.dnsMod

import typingsSlinky.node.nodeStrings.TXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyTxtRecord extends AnyRecord {
  var entries: js.Array[java.lang.String]
  var `type`: TXT
}

object AnyTxtRecord {
  @scala.inline
  def apply(entries: js.Array[java.lang.String], `type`: TXT): AnyTxtRecord = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyTxtRecord]
  }
}

