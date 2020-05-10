package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.GaCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.McfCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Data.RealtimeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataCollection extends js.Object {
  var Ga: js.UndefOr[GaCollection] = js.native
  var Mcf: js.UndefOr[McfCollection] = js.native
  var Realtime: js.UndefOr[RealtimeCollection] = js.native
}

object DataCollection {
  @scala.inline
  def apply(): DataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataCollection]
  }
  @scala.inline
  implicit class DataCollectionOps[Self <: DataCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGa(value: GaCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ga")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ga")(js.undefined)
        ret
    }
    @scala.inline
    def withMcf(value: McfCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mcf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMcf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Mcf")(js.undefined)
        ret
    }
    @scala.inline
    def withRealtime(value: RealtimeCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Realtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRealtime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Realtime")(js.undefined)
        ret
    }
  }
  
}

