package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MappingEntry extends js.Object {
  /**
    * The source path.
    */
  var SourcePath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The name of the source table.
    */
  var SourceTable: js.UndefOr[TableName] = js.native
  /**
    * The source type.
    */
  var SourceType: js.UndefOr[FieldType] = js.native
  /**
    * The target path.
    */
  var TargetPath: js.UndefOr[SchemaPathString] = js.native
  /**
    * The target table.
    */
  var TargetTable: js.UndefOr[TableName] = js.native
  /**
    * The target type.
    */
  var TargetType: js.UndefOr[FieldType] = js.native
}

object MappingEntry {
  @scala.inline
  def apply(): MappingEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingEntry]
  }
  @scala.inline
  implicit class MappingEntryOps[Self <: MappingEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSourcePath(value: SchemaPathString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePath")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceTable(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceTable")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetPath(value: SchemaPathString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetTable(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetTable")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetType(value: FieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetType")(js.undefined)
        ret
    }
  }
  
}

