package typingsSlinky.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadProcessConfig extends js.Object {
  var sampleInterval: js.UndefOr[Double] = js.native
}

object LoadProcessConfig {
  @scala.inline
  def apply(): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadProcessConfig]
  }
  @scala.inline
  implicit class LoadProcessConfigOps[Self <: LoadProcessConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSampleInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSampleInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleInterval")(js.undefined)
        ret
    }
  }
  
}

