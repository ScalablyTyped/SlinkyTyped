package typingsSlinky.mocha.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MochaInstanceOptions extends MochaOptions {
  var files: js.UndefOr[js.Array[String]] = js.native
}

object MochaInstanceOptions {
  @scala.inline
  def apply(): MochaInstanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MochaInstanceOptions]
  }
  @scala.inline
  implicit class MochaInstanceOptionsOps[Self <: MochaInstanceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFiles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(js.undefined)
        ret
    }
  }
  
}

