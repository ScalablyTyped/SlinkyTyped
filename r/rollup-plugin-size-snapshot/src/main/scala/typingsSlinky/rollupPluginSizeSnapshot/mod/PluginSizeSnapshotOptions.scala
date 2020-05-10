package typingsSlinky.rollupPluginSizeSnapshot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginSizeSnapshotOptions extends js.Object {
  var matchSnapshot: js.UndefOr[Boolean] = js.native
  var printInfo: js.UndefOr[Boolean] = js.native
  var snapshotPath: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object PluginSizeSnapshotOptions {
  @scala.inline
  def apply(): PluginSizeSnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginSizeSnapshotOptions]
  }
  @scala.inline
  implicit class PluginSizeSnapshotOptionsOps[Self <: PluginSizeSnapshotOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchSnapshot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchSnapshot")(js.undefined)
        ret
    }
    @scala.inline
    def withPrintInfo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrintInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("printInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotPath")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
  }
  
}

