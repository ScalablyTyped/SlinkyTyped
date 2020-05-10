package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashTools extends js.Object {
  var activeTool: js.Any = js.native
  var altIsDown: js.Any = js.native
  var ctlIsDown: js.Any = js.native
  var mouseIsDown: js.Any = js.native
  var penDownLoc: js.Any = js.native
  var penLoc: js.Any = js.native
  var shiftIsDown: js.Any = js.native
  var toolObjs: js.Any = js.native
  def constraintPoint(): js.Any = js.native
  def getKeyDown(): js.Any = js.native
  def setCreatingBbox(): js.Any = js.native
  def setCursor(): js.Any = js.native
  def snapPoint(): js.Any = js.native
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
  implicit class FlashToolsOps[Self <: FlashTools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveTool(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeTool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAltIsDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altIsDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstraintPoint(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constraintPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCtlIsDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctlIsDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetKeyDown(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMouseIsDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseIsDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenDownLoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penDownLoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenLoc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("penLoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetCreatingBbox(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCreatingBbox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCursor(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCursor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withShiftIsDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftIsDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapPoint(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapPoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToolObjs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolObjs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

