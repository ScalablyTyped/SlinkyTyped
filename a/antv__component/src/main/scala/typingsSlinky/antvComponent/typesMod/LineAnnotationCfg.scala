package typingsSlinky.antvComponent.typesMod

import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import typingsSlinky.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineAnnotationCfg extends GroupComponentCfg {
  
  /**
    * 结束点
    * @type {Point}
    */
  var end: js.UndefOr[Point] = js.native
  
  /**
    * 起始点
    * @type {Point}
    */
  var start: js.UndefOr[Point] = js.native
  
  /**
    * 线的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
  
  /**
    * 线上的文本配置
    * @type {LineAnnotationTextCfg}
    */
  var text: js.UndefOr[LineAnnotationTextCfg] = js.native
}
object LineAnnotationCfg {
  
  @scala.inline
  def apply(container: IGroup): LineAnnotationCfg = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineAnnotationCfg]
  }
  
  @scala.inline
  implicit class LineAnnotationCfgMutableBuilder[Self <: LineAnnotationCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Point): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: LineAnnotationTextCfg): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
