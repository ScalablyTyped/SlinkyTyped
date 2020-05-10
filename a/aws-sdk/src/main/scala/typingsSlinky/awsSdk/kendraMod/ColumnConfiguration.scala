package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnConfiguration extends js.Object {
  /**
    * One to five columns that indicate when a document in the database has changed.
    */
  var ChangeDetectingColumns: typingsSlinky.awsSdk.kendraMod.ChangeDetectingColumns = js.native
  /**
    * The column that contains the contents of the document.
    */
  var DocumentDataColumnName: ColumnName = js.native
  /**
    * The column that provides the document's unique identifier.
    */
  var DocumentIdColumnName: ColumnName = js.native
  /**
    * The column that contains the title of the document.
    */
  var DocumentTitleColumnName: js.UndefOr[ColumnName] = js.native
  /**
    * An array of objects that map database column names to the corresponding fields in an index. You must first create the fields in the index using the UpdateIndex operation.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}

object ColumnConfiguration {
  @scala.inline
  def apply(
    ChangeDetectingColumns: ChangeDetectingColumns,
    DocumentDataColumnName: ColumnName,
    DocumentIdColumnName: ColumnName
  ): ColumnConfiguration = {
    val __obj = js.Dynamic.literal(ChangeDetectingColumns = ChangeDetectingColumns.asInstanceOf[js.Any], DocumentDataColumnName = DocumentDataColumnName.asInstanceOf[js.Any], DocumentIdColumnName = DocumentIdColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfiguration]
  }
  @scala.inline
  implicit class ColumnConfigurationOps[Self <: ColumnConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeDetectingColumns(value: ChangeDetectingColumns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeDetectingColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentDataColumnName(value: ColumnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentDataColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentIdColumnName(value: ColumnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentIdColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentTitleColumnName(value: ColumnName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitleColumnName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTitleColumnName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentTitleColumnName")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldMappings(value: DataSourceToIndexFieldMappingList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldMappings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldMappings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldMappings")(js.undefined)
        ret
    }
  }
  
}

