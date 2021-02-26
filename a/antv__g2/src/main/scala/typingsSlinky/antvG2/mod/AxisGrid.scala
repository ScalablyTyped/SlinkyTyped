package typingsSlinky.antvG2.mod

import typingsSlinky.antvG2.antvG2Strings.center
import typingsSlinky.antvG2.antvG2Strings.polygon
import typingsSlinky.antvG2.mod.Styles.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisGrid extends StObject {
  
  /**
    * 声明网格顶点从两个刻度中间开始，默认从刻度点开始
    */
  var align: js.UndefOr[center] = js.native
  
  /**
    * 当网格类型 type 为 polygon 时，使用 alternateColor 为网格设置交替的颜色。
    * 指定一个值则先渲染奇数层，两个值则交替渲染
    */
  var alternateColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  
  /**
    * 是否隐藏第一条网格线，默认为 false
    */
  var hideFirstLine: js.UndefOr[Boolean] = js.native
  
  /**
    * 是否隐藏最后一条网格线，默认为 false
    */
  var hideLastLine: js.UndefOr[Boolean] = js.native
  
  /**
    * 当网格类型 type 为 line 时，使用 lineStyle 设置样式
    */
  var lineStyle: js.UndefOr[line] = js.native
  
  /**
    * 声明网格的类型，line 表示线，polygon 表示矩形框
    */
  var `type`: js.UndefOr[typingsSlinky.antvG2.antvG2Strings.line | polygon] = js.native
}
object AxisGrid {
  
  @scala.inline
  def apply(): AxisGrid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisGrid]
  }
  
  @scala.inline
  implicit class AxisGridMutableBuilder[Self <: AxisGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlternateColor(value: String | (js.Tuple2[String, String])): Self = StObject.set(x, "alternateColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateColorUndefined: Self = StObject.set(x, "alternateColor", js.undefined)
    
    @scala.inline
    def setHideFirstLine(value: Boolean): Self = StObject.set(x, "hideFirstLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFirstLineUndefined: Self = StObject.set(x, "hideFirstLine", js.undefined)
    
    @scala.inline
    def setHideLastLine(value: Boolean): Self = StObject.set(x, "hideLastLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLastLineUndefined: Self = StObject.set(x, "hideLastLine", js.undefined)
    
    @scala.inline
    def setLineStyle(value: line): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.antvG2.antvG2Strings.line | polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
