package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A range along a single dimension on a sheet. All indexes are zero-based.
  * Indexes are half open: the start index is inclusive and the end index is
  * exclusive. Missing indexes indicate the range is unbounded on that side.
  */
@js.native
trait SchemaDimensionRange extends js.Object {
  
  /**
    * The dimension of the span.
    */
  var dimension: js.UndefOr[String] = js.native
  
  /**
    * The end (exclusive) of the span, or not set if unbounded.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * The sheet this span is on.
    */
  var sheetId: js.UndefOr[Double] = js.native
  
  /**
    * The start (inclusive) of the span, or not set if unbounded.
    */
  var startIndex: js.UndefOr[Double] = js.native
}
object SchemaDimensionRange {
  
  @scala.inline
  def apply(): SchemaDimensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDimensionRange]
  }
  
  @scala.inline
  implicit class SchemaDimensionRangeOps[Self <: SchemaDimensionRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setSheetId(value: Double): Self = this.set("sheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetId: Self = this.set("sheetId", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
  }
}
