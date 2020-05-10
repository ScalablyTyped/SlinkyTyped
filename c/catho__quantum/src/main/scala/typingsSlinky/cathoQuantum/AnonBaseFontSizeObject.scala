package typingsSlinky.cathoQuantum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBaseFontSizeObject extends js.Object {
  var baseFontSize: js.UndefOr[js.Object] = js.native
}

object AnonBaseFontSizeObject {
  @scala.inline
  def apply(): AnonBaseFontSizeObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonBaseFontSizeObject]
  }
  @scala.inline
  implicit class AnonBaseFontSizeObjectOps[Self <: AnonBaseFontSizeObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseFontSize(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseFontSize")(js.undefined)
        ret
    }
  }
  
}

