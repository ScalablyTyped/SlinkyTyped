package typingsSlinky.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMysqlExportOptions extends js.Object {
  var mysqlExportOptions: js.UndefOr[AnonMasterData] = js.native
  var schemaOnly: js.UndefOr[Boolean] = js.native
  var tables: js.UndefOr[js.Array[String]] = js.native
}

object AnonMysqlExportOptions {
  @scala.inline
  def apply(): AnonMysqlExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMysqlExportOptions]
  }
  @scala.inline
  implicit class AnonMysqlExportOptionsOps[Self <: AnonMysqlExportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMysqlExportOptions(value: AnonMasterData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysqlExportOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMysqlExportOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mysqlExportOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemaOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemaOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemaOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
  }
  
}

