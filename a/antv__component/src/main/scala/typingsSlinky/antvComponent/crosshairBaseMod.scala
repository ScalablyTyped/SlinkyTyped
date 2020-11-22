package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.groupComponentMod.GroupComponent
import typingsSlinky.antvComponent.typesMod.CrosshairBaseCfg
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/crosshair/base", JSImport.Namespace)
@js.native
object crosshairBaseMod extends js.Object {
  
  @js.native
  trait CrosshairBase[T /* <: CrosshairBaseCfg */] extends GroupComponent[GroupComponentCfg] {
    
    /* protected */ def getLinePath(): js.Array[_] = js.native
    
    /* protected */ def getRotateAngle(): Double = js.native
    
    /**
      * @protected
      * 获取文本点的位置
      * @return {Point} 文本的位置
      */
    /* protected */ def getTextPoint(): Point = js.native
    
    var renderBackground: js.Any = js.native
    
    /* protected */ def renderLine(group: IGroup): Unit = js.native
    
    /* protected */ def renderText(group: IGroup): Unit = js.native
  }
  
  @js.native
  abstract class default[T /* <: CrosshairBaseCfg */] () extends CrosshairBase[T]
}
