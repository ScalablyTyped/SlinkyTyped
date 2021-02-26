package typingsSlinky.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aniamtion extends StObject {
  
  var aniamtion: Boolean = js.native
  
  var defaultIndex: Double = js.native
  
  var groupIndex: Double = js.native
  
  var height: Double = js.native
  
  var indicatorHeight: Double = js.native
  
  var indicatorTop: Double = js.native
  
  var itemHeight: Double = js.native
  
  var mapKeys: Label = js.native
}
object Aniamtion {
  
  @scala.inline
  def apply(
    aniamtion: Boolean,
    defaultIndex: Double,
    groupIndex: Double,
    height: Double,
    indicatorHeight: Double,
    indicatorTop: Double,
    itemHeight: Double,
    mapKeys: Label
  ): Aniamtion = {
    val __obj = js.Dynamic.literal(aniamtion = aniamtion.asInstanceOf[js.Any], defaultIndex = defaultIndex.asInstanceOf[js.Any], groupIndex = groupIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indicatorHeight = indicatorHeight.asInstanceOf[js.Any], indicatorTop = indicatorTop.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], mapKeys = mapKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aniamtion]
  }
  
  @scala.inline
  implicit class AniamtionMutableBuilder[Self <: Aniamtion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAniamtion(value: Boolean): Self = StObject.set(x, "aniamtion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultIndex(value: Double): Self = StObject.set(x, "defaultIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorHeight(value: Double): Self = StObject.set(x, "indicatorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorTop(value: Double): Self = StObject.set(x, "indicatorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapKeys(value: Label): Self = StObject.set(x, "mapKeys", value.asInstanceOf[js.Any])
  }
}
