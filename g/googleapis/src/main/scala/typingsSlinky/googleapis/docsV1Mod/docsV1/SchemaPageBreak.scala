package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A ParagraphElement representing a page break. A page break makes the
  * subsequent text start at the top of the next page.
  */
@js.native
trait SchemaPageBreak extends js.Object {
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A PageBreak may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested text style changes to this PageBreak, keyed by suggestion
    * ID.
    */
  var suggestedTextStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTextStyle]] = js.native
  /**
    * The text style of this PageBreak.  Similar to text content, like text
    * runs and footnote references, the text style of a page break can affect
    * content layout as well as the styling of text inserted adjacent to it.
    */
  var textStyle: js.UndefOr[SchemaTextStyle] = js.native
}

object SchemaPageBreak {
  @scala.inline
  def apply(): SchemaPageBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageBreak]
  }
  @scala.inline
  implicit class SchemaPageBreakOps[Self <: SchemaPageBreak] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withSuggestedTextStyleChanges(value: StringDictionary[SchemaSuggestedTextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedTextStyleChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedTextStyleChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedTextStyleChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: SchemaTextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
  }
  
}

