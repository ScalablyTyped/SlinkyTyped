package typingsSlinky.gestalt

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStyle extends js.Object {
  var __style: StringDictionary[js.UndefOr[String | Double]] = js.native
}

object AnonStyle {
  @scala.inline
  def apply(__style: StringDictionary[js.UndefOr[String | Double]]): AnonStyle = {
    val __obj = js.Dynamic.literal(__style = __style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
  @scala.inline
  implicit class AnonStyleOps[Self <: AnonStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__style(value: StringDictionary[js.UndefOr[String | Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

