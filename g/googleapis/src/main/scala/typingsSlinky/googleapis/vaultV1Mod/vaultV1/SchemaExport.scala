package typingsSlinky.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An export
  */
@js.native
trait SchemaExport extends js.Object {
  /**
    * Output only. Export sink for cloud storage files.
    */
  var cloudStorageSink: js.UndefOr[SchemaCloudStorageSink] = js.native
  /**
    * Output only. The time when the export was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Advanced options of the export.
    */
  var exportOptions: js.UndefOr[SchemaExportOptions] = js.native
  /**
    * Output only. The generated export ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Output only. The matter ID.
    */
  var matterId: js.UndefOr[String] = js.native
  /**
    * The export name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The search query being exported.
    */
  var query: js.UndefOr[SchemaQuery] = js.native
  /**
    * Output only. The requester of the export.
    */
  var requester: js.UndefOr[SchemaUserInfo] = js.native
  /**
    * Output only. Export statistics.
    */
  var stats: js.UndefOr[SchemaExportStats] = js.native
  /**
    * Output only. The export status.
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaExport {
  @scala.inline
  def apply(): SchemaExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExport]
  }
  @scala.inline
  implicit class SchemaExportOps[Self <: SchemaExport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudStorageSink(value: SchemaCloudStorageSink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageSink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloudStorageSink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudStorageSink")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExportOptions(value: SchemaExportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withMatterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matterId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: SchemaQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: SchemaUserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(js.undefined)
        ret
    }
    @scala.inline
    def withStats(value: SchemaExportStats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

