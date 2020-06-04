package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bordered extends js.Object {
  var bordered: Boolean
}

object Bordered {
  @scala.inline
  def apply(bordered: Boolean): Bordered = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bordered]
  }
  @scala.inline
  implicit class BorderedOps[Self <: Bordered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
  }
  
}

