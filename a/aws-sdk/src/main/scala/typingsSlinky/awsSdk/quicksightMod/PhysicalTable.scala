package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhysicalTable extends js.Object {
  /**
    * A physical table type built from the results of the custom SQL query.
    */
  var CustomSql: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.CustomSql] = js.native
  /**
    * A physical table type for relational data sources.
    */
  var RelationalTable: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.RelationalTable] = js.native
  /**
    * A physical table type for as S3 data source.
    */
  var S3Source: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.S3Source] = js.native
}

object PhysicalTable {
  @scala.inline
  def apply(): PhysicalTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhysicalTable]
  }
  @scala.inline
  implicit class PhysicalTableOps[Self <: PhysicalTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomSql(value: CustomSql): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomSql")(js.undefined)
        ret
    }
    @scala.inline
    def withRelationalTable(value: RelationalTable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationalTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationalTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RelationalTable")(js.undefined)
        ret
    }
    @scala.inline
    def withS3Source(value: S3Source): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3Source: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Source")(js.undefined)
        ret
    }
  }
  
}

