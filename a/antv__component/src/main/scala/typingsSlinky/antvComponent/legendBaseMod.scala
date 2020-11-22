package typingsSlinky.antvComponent

import typingsSlinky.antvComponent.groupComponentMod.GroupComponent
import typingsSlinky.antvComponent.typesMod.GroupComponentCfg
import typingsSlinky.antvComponent.typesMod.LegendBaseCfg
import typingsSlinky.antvComponent.typesMod.PointLocationCfg
import typingsSlinky.antvGBase.interfacesMod.IGroup
import typingsSlinky.antvGBase.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/legend/base", JSImport.Namespace)
@js.native
object legendBaseMod extends js.Object {
  
  @js.native
  trait LegendBase[T /* <: LegendBaseCfg */] extends GroupComponent[GroupComponentCfg] {
    
    /* protected */ def drawBackground(group: IGroup): Unit = js.native
    
    /* protected */ def drawLegendContent(group: js.Any): js.Any = js.native
    
    /* protected */ def drawTitle(group: IGroup): Unit = js.native
    
    /* protected */ def getDrawPoint(): Point = js.native
    
    var resetDraw: js.Any = js.native
    
    /* protected */ def resetLocation(): Unit = js.native
    
    /* protected */ def setDrawPoint(point: Point): Unit = js.native
    
    def setLocation(cfg: PointLocationCfg): Unit = js.native
  }
  
  @js.native
  abstract class default[T /* <: LegendBaseCfg */] () extends LegendBase[T]
}
