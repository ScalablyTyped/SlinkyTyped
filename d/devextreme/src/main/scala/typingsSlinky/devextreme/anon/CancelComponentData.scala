package typingsSlinky.devextreme.anon

import org.scalajs.dom.raw.Blob
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelComponentData[T] extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.native
  
  var component: js.UndefOr[T] = js.native
  
  var data: js.UndefOr[Blob] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var fileName: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
}
object CancelComponentData {
  
  @scala.inline
  def apply[T](): CancelComponentData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelComponentData[T]]
  }
  
  @scala.inline
  implicit class CancelComponentDataMutableBuilder[Self <: CancelComponentData[_], T] (val x: Self with CancelComponentData[T]) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
