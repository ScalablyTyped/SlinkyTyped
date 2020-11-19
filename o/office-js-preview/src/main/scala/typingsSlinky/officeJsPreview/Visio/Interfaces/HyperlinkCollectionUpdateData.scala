package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the HyperlinkCollection object, for use in "hyperlinkCollection.set({ ... })". */
@js.native
trait HyperlinkCollectionUpdateData extends js.Object {
  
  var items: js.UndefOr[js.Array[HyperlinkData]] = js.native
}
object HyperlinkCollectionUpdateData {
  
  @scala.inline
  def apply(): HyperlinkCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionUpdateData]
  }
  
  @scala.inline
  implicit class HyperlinkCollectionUpdateDataOps[Self <: HyperlinkCollectionUpdateData] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: HyperlinkData*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[HyperlinkData]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
