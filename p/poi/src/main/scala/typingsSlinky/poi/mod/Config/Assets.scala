package typingsSlinky.poi.mod.Config

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assets extends js.Object {
  var inlineImageMaxSize: js.UndefOr[Double] = js.native
}

object Assets {
  @scala.inline
  def apply(): Assets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Assets]
  }
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineImageMaxSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImageMaxSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineImageMaxSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineImageMaxSize")(js.undefined)
        ret
    }
  }
  
}

