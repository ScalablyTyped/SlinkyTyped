package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.typesMod.CrosshairBaseCfg
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crosshairBaseMod {
  
  @JSImport("@antv/component/lib/crosshair/base", JSImport.Default)
  @js.native
  abstract class default[T /* <: CrosshairBaseCfg */] () extends CrosshairBase[T]
  
  @js.native
  trait CrosshairBase[T /* <: CrosshairBaseCfg */]
    extends typingsSlinky.antvComponent.groupComponentMod.default[GroupComponentCfg] {
    
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
}
