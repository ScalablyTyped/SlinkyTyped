package typingsSlinky.devextreme.anon

import org.scalajs.dom.raw.Blob
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.ui.dxPivotGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileNameFormat extends js.Object {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[dxPivotGrid] = js.native
  
  var data: js.UndefOr[Blob] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
}
object FileNameFormat {
  
  @scala.inline
  def apply(): FileNameFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileNameFormat]
  }
  
  @scala.inline
  implicit class FileNameFormatOps[Self <: FileNameFormat] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxPivotGrid): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setData(value: Blob): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
