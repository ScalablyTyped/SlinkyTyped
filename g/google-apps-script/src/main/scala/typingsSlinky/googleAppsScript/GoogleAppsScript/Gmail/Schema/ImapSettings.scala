package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImapSettings extends js.Object {
  var autoExpunge: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var expungeBehavior: js.UndefOr[String] = js.native
  var maxFolderSize: js.UndefOr[Double] = js.native
}

object ImapSettings {
  @scala.inline
  def apply(): ImapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImapSettings]
  }
  @scala.inline
  implicit class ImapSettingsOps[Self <: ImapSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoExpunge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpunge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoExpunge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpunge")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungeBehavior(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungeBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungeBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungeBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFolderSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFolderSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFolderSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFolderSize")(js.undefined)
        ret
    }
  }
  
}

