package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsGetAccessibleGmbAccountsResponse extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var gmbAccounts: js.UndefOr[js.Array[GmbAccountsGmbAccount]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object LiasettingsGetAccessibleGmbAccountsResponse {
  @scala.inline
  def apply(): LiasettingsGetAccessibleGmbAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsGetAccessibleGmbAccountsResponse]
  }
  @scala.inline
  implicit class LiasettingsGetAccessibleGmbAccountsResponseOps[Self <: LiasettingsGetAccessibleGmbAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withGmbAccounts(value: js.Array[GmbAccountsGmbAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGmbAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gmbAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

