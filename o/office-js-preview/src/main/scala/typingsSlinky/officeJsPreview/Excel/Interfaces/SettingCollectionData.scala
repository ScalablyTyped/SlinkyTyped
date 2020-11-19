package typingsSlinky.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `settingCollection.toJSON()`. */
@js.native
trait SettingCollectionData extends js.Object {
  
  var items: js.UndefOr[js.Array[SettingData]] = js.native
}
object SettingCollectionData {
  
  @scala.inline
  def apply(): SettingCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingCollectionData]
  }
  
  @scala.inline
  implicit class SettingCollectionDataOps[Self <: SettingCollectionData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: SettingData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[SettingData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
