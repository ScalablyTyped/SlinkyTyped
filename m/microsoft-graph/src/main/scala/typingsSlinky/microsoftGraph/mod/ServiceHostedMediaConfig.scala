package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceHostedMediaConfig extends MediaConfig {
  var preFetchMedia: js.UndefOr[js.Array[MediaInfo]] = js.native
}

object ServiceHostedMediaConfig {
  @scala.inline
  def apply(): ServiceHostedMediaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHostedMediaConfig]
  }
  @scala.inline
  implicit class ServiceHostedMediaConfigOps[Self <: ServiceHostedMediaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreFetchMedia(value: js.Array[MediaInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFetchMedia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreFetchMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFetchMedia")(js.undefined)
        ret
    }
  }
  
}

