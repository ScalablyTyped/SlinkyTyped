package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents and style of a row in a Table.
  */
@js.native
trait SchemaTableRow extends js.Object {
  /**
    * The zero-based end index of this row, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based start index of this row, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A TableRow may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested style changes to this row, keyed by suggestion ID.
    */
  var suggestedTableRowStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTableRowStyle]] = js.native
  /**
    * The contents and style of each cell in this row.  It is possible for a
    * table to be non-rectangular, so some rows may have a different number of
    * cells than other rows in the same table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.native
  /**
    * The style of the table row.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  @scala.inline
  implicit class SchemaTableRowOps[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDeletionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDeletionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedInsertionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedInsertionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedTableRowStyleChanges(value: StringDictionary[SchemaSuggestedTableRowStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedTableRowStyleChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedTableRowStyleChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedTableRowStyleChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withTableCells(value: js.Array[SchemaTableCell]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableCells: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableCells")(js.undefined)
        ret
    }
    @scala.inline
    def withTableRowStyle(value: SchemaTableRowStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRowStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tableRowStyle")(js.undefined)
        ret
    }
  }
  
}

