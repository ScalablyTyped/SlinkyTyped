package typingsSlinky.reactCsv.downloadMod

import typingsSlinky.reactCsv.commonPropTypesMod.CommonPropTypes
import typingsSlinky.reactCsv.commonPropTypesMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPropTypes extends CommonPropTypes {
  var target: js.UndefOr[String] = js.native
}

object DownloadPropTypes {
  @scala.inline
  def apply(data: String | Data): DownloadPropTypes = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPropTypes]
  }
  @scala.inline
  implicit class DownloadPropTypesOps[Self <: DownloadPropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

