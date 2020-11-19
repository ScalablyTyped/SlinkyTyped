package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterView extends js.Object {
  
  var criteria: js.UndefOr[js.Object] = js.native
  
  var filterViewId: js.UndefOr[Double] = js.native
  
  var namedRangeId: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[GridRange] = js.native
  
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object FilterView {
  
  @scala.inline
  def apply(): FilterView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterView]
  }
  
  @scala.inline
  implicit class FilterViewOps[Self <: FilterView] (val x: Self) extends AnyVal {
    
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
    def setCriteria(value: js.Object): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    
    @scala.inline
    def setFilterViewId(value: Double): Self = this.set("filterViewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterViewId: Self = this.set("filterViewId", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSortSpecsVarargs(value: SortSpec*): Self = this.set("sortSpecs", js.Array(value :_*))
    
    @scala.inline
    def setSortSpecs(value: js.Array[SortSpec]): Self = this.set("sortSpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortSpecs: Self = this.set("sortSpecs", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
