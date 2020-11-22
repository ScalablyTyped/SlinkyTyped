package typingsSlinky.convertExcelToJson.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.convertExcelToJson.anon.Rows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetConfig extends js.Object {
  
  var columnToKey: js.UndefOr[StringDictionary[String]] = js.native
  
  var header: js.UndefOr[Rows] = js.native
  
  var includeEmptyLines: js.UndefOr[Boolean] = js.native
  
  var range: js.UndefOr[String] = js.native
  
  var sheetStubs: js.UndefOr[Boolean] = js.native
}
object SheetConfig {
  
  @scala.inline
  def apply(): SheetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetConfig]
  }
  
  @scala.inline
  implicit class SheetConfigOps[Self <: SheetConfig] (val x: Self) extends AnyVal {
    
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
    def setColumnToKey(value: StringDictionary[String]): Self = this.set("columnToKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnToKey: Self = this.set("columnToKey", js.undefined)
    
    @scala.inline
    def setHeader(value: Rows): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setIncludeEmptyLines(value: Boolean): Self = this.set("includeEmptyLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeEmptyLines: Self = this.set("includeEmptyLines", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSheetStubs(value: Boolean): Self = this.set("sheetStubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetStubs: Self = this.set("sheetStubs", js.undefined)
  }
}
