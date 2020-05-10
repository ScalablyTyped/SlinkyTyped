package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var errors: js.UndefOr[Errors] = js.native
  var gmbAccounts: js.UndefOr[GmbAccounts] = js.native
  var kind: js.UndefOr[String] = js.native
  var liaSettings: js.UndefOr[LiaSettings] = js.native
  var posDataProviders: js.UndefOr[js.Array[PosDataProviders]] = js.native
}

object LiasettingsCustomBatchResponseEntry {
  @scala.inline
  def apply(): LiasettingsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class LiasettingsCustomBatchResponseEntryOps[Self <: LiasettingsCustomBatchResponseEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchId")(js.undefined)
        ret
    }
    @scala.inline
    def withErrors(value: Errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.undefined)
        ret
    }
    @scala.inline
    def withGmbAccounts(value: GmbAccounts): Self = {
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
    @scala.inline
    def withLiaSettings(value: LiaSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liaSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiaSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liaSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withPosDataProviders(value: js.Array[PosDataProviders]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(js.undefined)
        ret
    }
  }
  
}

