package typingsSlinky.jqueryPnotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PNotifyStack extends StObject {
  
  var context: js.UndefOr[JQuery[HTMLElement]] = js.native
  
  var dir1: js.UndefOr[String] = js.native
  
  var dir2: js.UndefOr[String] = js.native
  
  var firstpos1: js.UndefOr[Double] = js.native
  
  var firstpos2: js.UndefOr[Double] = js.native
  
  var modal: js.UndefOr[Boolean] = js.native
  
  var push: js.UndefOr[String] = js.native
  
  var spacing1: js.UndefOr[Double] = js.native
  
  var spacing2: js.UndefOr[Double] = js.native
}
object PNotifyStack {
  
  @scala.inline
  def apply(): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStack]
  }
  
  @scala.inline
  implicit class PNotifyStackMutableBuilder[Self <: PNotifyStack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContext(value: JQuery[HTMLElement]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setDir1(value: String): Self = StObject.set(x, "dir1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir1Undefined: Self = StObject.set(x, "dir1", js.undefined)
    
    @scala.inline
    def setDir2(value: String): Self = StObject.set(x, "dir2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDir2Undefined: Self = StObject.set(x, "dir2", js.undefined)
    
    @scala.inline
    def setFirstpos1(value: Double): Self = StObject.set(x, "firstpos1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstpos1Undefined: Self = StObject.set(x, "firstpos1", js.undefined)
    
    @scala.inline
    def setFirstpos2(value: Double): Self = StObject.set(x, "firstpos2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstpos2Undefined: Self = StObject.set(x, "firstpos2", js.undefined)
    
    @scala.inline
    def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    @scala.inline
    def setPush(value: String): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
    
    @scala.inline
    def setSpacing1(value: Double): Self = StObject.set(x, "spacing1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing1Undefined: Self = StObject.set(x, "spacing1", js.undefined)
    
    @scala.inline
    def setSpacing2(value: Double): Self = StObject.set(x, "spacing2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing2Undefined: Self = StObject.set(x, "spacing2", js.undefined)
  }
}
