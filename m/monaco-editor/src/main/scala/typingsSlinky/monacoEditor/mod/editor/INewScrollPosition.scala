package typingsSlinky.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INewScrollPosition extends StObject {
  
  var scrollLeft: js.UndefOr[Double] = js.native
  
  var scrollTop: js.UndefOr[Double] = js.native
}
object INewScrollPosition {
  
  @scala.inline
  def apply(): INewScrollPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INewScrollPosition]
  }
  
  @scala.inline
  implicit class INewScrollPositionMutableBuilder[Self <: INewScrollPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
    
    @scala.inline
    def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
  }
}
