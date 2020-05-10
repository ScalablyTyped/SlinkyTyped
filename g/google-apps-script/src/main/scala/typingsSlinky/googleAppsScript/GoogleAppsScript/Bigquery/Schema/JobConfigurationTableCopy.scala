package typingsSlinky.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobConfigurationTableCopy extends js.Object {
  var createDisposition: js.UndefOr[String] = js.native
  var destinationEncryptionConfiguration: js.UndefOr[EncryptionConfiguration] = js.native
  var destinationTable: js.UndefOr[TableReference] = js.native
  var sourceTable: js.UndefOr[TableReference] = js.native
  var sourceTables: js.UndefOr[js.Array[TableReference]] = js.native
  var writeDisposition: js.UndefOr[String] = js.native
}

object JobConfigurationTableCopy {
  @scala.inline
  def apply(): JobConfigurationTableCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobConfigurationTableCopy]
  }
  @scala.inline
  implicit class JobConfigurationTableCopyOps[Self <: JobConfigurationTableCopy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDisposition")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationEncryptionConfiguration(value: EncryptionConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationEncryptionConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationEncryptionConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationEncryptionConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDestinationTable(value: TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTable(value: TableReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTables(value: js.Array[TableReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceTables")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteDisposition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDisposition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteDisposition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeDisposition")(js.undefined)
        ret
    }
  }
  
}

