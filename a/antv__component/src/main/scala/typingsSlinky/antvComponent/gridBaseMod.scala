package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.groupComponentMod.GroupComponent
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/grid/base", JSImport.Namespace)
@js.native
object gridBaseMod extends js.Object {
  
  @js.native
  trait GridBase[T /* <: GroupComponentCfg */] extends GroupComponent[T] {
    
    var drawAlternateRegion: js.Any = js.native
    
    var drawGrid: js.Any = js.native
    
    /* protected */ def getAlternatePath(prePoints: js.Array[Point], points: js.Array[Point]): js.Array[_] = js.native
    
    /**
      * 获取栅格线的路径
      * @param  {Point[]} points   栅格线的点集合
      * @param  {boolean} reversed 顺序是否相反
      * @return {any[]}            路径
      */
    /* protected */ def getGridPath(points: js.Array[Point]): js.Array[_] = js.native
    /* protected */ def getGridPath(points: js.Array[Point], reversed: Boolean): js.Array[_] = js.native
    
    /**
      * 获取栅格线的类型
      * @return {string} 栅格线类型
      */
    /* protected */ def getLineType(): String = js.native
    
    var getPathStyle: js.Any = js.native
  }
  
  @js.native
  abstract class default[T /* <: GroupComponentCfg */] () extends GridBase[T]
}
