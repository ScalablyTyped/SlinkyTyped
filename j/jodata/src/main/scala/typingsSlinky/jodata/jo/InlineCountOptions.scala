package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineCountOptions extends js.Object {
  def allPages(): typingsSlinky.jodata.jo
  def none(): typingsSlinky.jodata.jo
}

object InlineCountOptions {
  @scala.inline
  def apply(allPages: () => typingsSlinky.jodata.jo, none: () => typingsSlinky.jodata.jo): InlineCountOptions = {
    val __obj = js.Dynamic.literal(allPages = js.Any.fromFunction0(allPages), none = js.Any.fromFunction0(none))
    __obj.asInstanceOf[InlineCountOptions]
  }
}

