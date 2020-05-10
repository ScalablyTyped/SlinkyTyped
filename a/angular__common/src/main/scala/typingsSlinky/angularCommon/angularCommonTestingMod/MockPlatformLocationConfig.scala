package typingsSlinky.angularCommon.angularCommonTestingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MockPlatformLocationConfig extends js.Object {
  var appBaseHref: js.UndefOr[String] = js.native
  var startUrl: js.UndefOr[String] = js.native
}

object MockPlatformLocationConfig {
  @scala.inline
  def apply(): MockPlatformLocationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MockPlatformLocationConfig]
  }
  @scala.inline
  implicit class MockPlatformLocationConfigOps[Self <: MockPlatformLocationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBaseHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBaseHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppBaseHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBaseHref")(js.undefined)
        ret
    }
    @scala.inline
    def withStartUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startUrl")(js.undefined)
        ret
    }
  }
  
}

