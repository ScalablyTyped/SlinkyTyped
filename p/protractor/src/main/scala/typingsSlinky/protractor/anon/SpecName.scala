package typingsSlinky.protractor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecName extends js.Object {
  var specName: js.UndefOr[String] = js.native
  var stackTrace: js.UndefOr[String] = js.native
}

object SpecName {
  @scala.inline
  def apply(): SpecName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecName]
  }
  @scala.inline
  implicit class SpecNameOps[Self <: SpecName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpecName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specName")(js.undefined)
        ret
    }
    @scala.inline
    def withStackTrace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackTrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(js.undefined)
        ret
    }
  }
  
}

