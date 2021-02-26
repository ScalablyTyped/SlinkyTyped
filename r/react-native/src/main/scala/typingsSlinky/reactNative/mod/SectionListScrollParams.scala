package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SectionListScrollParams extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.native
  
  var itemIndex: Double = js.native
  
  var sectionIndex: Double = js.native
  
  var viewOffset: js.UndefOr[Double] = js.native
  
  var viewPosition: js.UndefOr[Double] = js.native
}
object SectionListScrollParams {
  
  @scala.inline
  def apply(itemIndex: Double, sectionIndex: Double): SectionListScrollParams = {
    val __obj = js.Dynamic.literal(itemIndex = itemIndex.asInstanceOf[js.Any], sectionIndex = sectionIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionListScrollParams]
  }
  
  @scala.inline
  implicit class SectionListScrollParamsMutableBuilder[Self <: SectionListScrollParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setItemIndex(value: Double): Self = StObject.set(x, "itemIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionIndex(value: Double): Self = StObject.set(x, "sectionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOffset(value: Double): Self = StObject.set(x, "viewOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewOffsetUndefined: Self = StObject.set(x, "viewOffset", js.undefined)
    
    @scala.inline
    def setViewPosition(value: Double): Self = StObject.set(x, "viewPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewPositionUndefined: Self = StObject.set(x, "viewPosition", js.undefined)
  }
}
