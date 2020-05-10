package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTestGridUrlResult extends js.Object {
  /**
    * The number of seconds the URL from CreateTestGridUrlResult$url stays active.
    */
  var expires: js.UndefOr[js.Date] = js.native
  /**
    * A signed URL, expiring in CreateTestGridUrlRequest$expiresInSeconds seconds, to be passed to a RemoteWebDriver. 
    */
  var url: js.UndefOr[String] = js.native
}

object CreateTestGridUrlResult {
  @scala.inline
  def apply(): CreateTestGridUrlResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTestGridUrlResult]
  }
  @scala.inline
  implicit class CreateTestGridUrlResultOps[Self <: CreateTestGridUrlResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpires(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

