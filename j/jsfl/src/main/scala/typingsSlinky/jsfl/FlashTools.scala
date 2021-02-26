package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashTools extends StObject {
  
  var activeTool: js.Any = js.native
  
  var altIsDown: js.Any = js.native
  
  def constraintPoint(): js.Any = js.native
  
  var ctlIsDown: js.Any = js.native
  
  def getKeyDown(): js.Any = js.native
  
  var mouseIsDown: js.Any = js.native
  
  var penDownLoc: js.Any = js.native
  
  var penLoc: js.Any = js.native
  
  def setCreatingBbox(): js.Any = js.native
  
  def setCursor(): js.Any = js.native
  
  var shiftIsDown: js.Any = js.native
  
  def snapPoint(): js.Any = js.native
  
  var toolObjs: js.Any = js.native
}
object FlashTools {
  
  @scala.inline
  def apply(
    activeTool: js.Any,
    altIsDown: js.Any,
    constraintPoint: () => js.Any,
    ctlIsDown: js.Any,
    getKeyDown: () => js.Any,
    mouseIsDown: js.Any,
    penDownLoc: js.Any,
    penLoc: js.Any,
    setCreatingBbox: () => js.Any,
    setCursor: () => js.Any,
    shiftIsDown: js.Any,
    snapPoint: () => js.Any,
    toolObjs: js.Any
  ): FlashTools = {
    val __obj = js.Dynamic.literal(activeTool = activeTool.asInstanceOf[js.Any], altIsDown = altIsDown.asInstanceOf[js.Any], constraintPoint = js.Any.fromFunction0(constraintPoint), ctlIsDown = ctlIsDown.asInstanceOf[js.Any], getKeyDown = js.Any.fromFunction0(getKeyDown), mouseIsDown = mouseIsDown.asInstanceOf[js.Any], penDownLoc = penDownLoc.asInstanceOf[js.Any], penLoc = penLoc.asInstanceOf[js.Any], setCreatingBbox = js.Any.fromFunction0(setCreatingBbox), setCursor = js.Any.fromFunction0(setCursor), shiftIsDown = shiftIsDown.asInstanceOf[js.Any], snapPoint = js.Any.fromFunction0(snapPoint), toolObjs = toolObjs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashTools]
  }
  
  @scala.inline
  implicit class FlashToolsMutableBuilder[Self <: FlashTools] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTool(value: js.Any): Self = StObject.set(x, "activeTool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltIsDown(value: js.Any): Self = StObject.set(x, "altIsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintPoint(value: () => js.Any): Self = StObject.set(x, "constraintPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCtlIsDown(value: js.Any): Self = StObject.set(x, "ctlIsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetKeyDown(value: () => js.Any): Self = StObject.set(x, "getKeyDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMouseIsDown(value: js.Any): Self = StObject.set(x, "mouseIsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenDownLoc(value: js.Any): Self = StObject.set(x, "penDownLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPenLoc(value: js.Any): Self = StObject.set(x, "penLoc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCreatingBbox(value: () => js.Any): Self = StObject.set(x, "setCreatingBbox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCursor(value: () => js.Any): Self = StObject.set(x, "setCursor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShiftIsDown(value: js.Any): Self = StObject.set(x, "shiftIsDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapPoint(value: () => js.Any): Self = StObject.set(x, "snapPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToolObjs(value: js.Any): Self = StObject.set(x, "toolObjs", value.asInstanceOf[js.Any])
  }
}
