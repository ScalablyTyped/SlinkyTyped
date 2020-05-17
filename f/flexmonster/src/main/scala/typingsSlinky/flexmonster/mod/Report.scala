package typingsSlinky.flexmonster.mod

import typingsSlinky.flexmonster.anon.Columns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Report extends js.Object {
  var conditions: js.UndefOr[js.Array[ConditionalFormat]] = js.native
  var creationDate: js.UndefOr[String] = js.native
  var dataSource: js.UndefOr[DataSource] = js.native
  var formats: js.UndefOr[js.Array[Format]] = js.native
  var localization: js.UndefOr[js.Object | String] = js.native
  var options: js.UndefOr[Options] = js.native
  var slice: js.UndefOr[Slice] = js.native
  var tableSizes: js.UndefOr[Columns] = js.native
  var version: js.UndefOr[String] = js.native
}

object Report {
  @scala.inline
  def apply(): Report = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Report]
  }
  @scala.inline
  implicit class ReportOps[Self <: Report] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[ConditionalFormat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSource(value: DataSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withFormats(value: js.Array[Format]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalization(value: js.Object | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localization")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withSlice(value: Slice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slice")(js.undefined)
        ret
    }
    @scala.inline
    def withTableSizes(value: Columns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableSizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableSizes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableSizes")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

