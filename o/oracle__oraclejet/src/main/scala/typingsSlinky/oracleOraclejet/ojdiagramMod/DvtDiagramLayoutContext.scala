package typingsSlinky.oracleOraclejet.ojdiagramMod

import typingsSlinky.oracleOraclejet.anon.H
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvtDiagramLayoutContext extends js.Object {
  def getCommonContainer(nodeId1: js.Any, nodeId2: js.Any): js.Any = js.native
  def getComponentSize(): H = js.native
  def getCurrentViewport(): H = js.native
  def getEventData(): js.Object = js.native
  def getLinkById(id: js.Any): DvtDiagramLayoutContextLink = js.native
  def getLinkByIndex(index: Double): DvtDiagramLayoutContextLink = js.native
  def getLinkCount(): Double = js.native
  def getNodeById(id: js.Any): DvtDiagramLayoutContextNode = js.native
  def getNodeByIndex(index: Double): DvtDiagramLayoutContextNode = js.native
  def getNodeCount(): Double = js.native
  def getViewport(): H = js.native
  def isLocaleR2L(): Boolean = js.native
  def setViewport(viewport: H): Unit = js.native
}

object DvtDiagramLayoutContext {
  @scala.inline
  def apply(
    getCommonContainer: (js.Any, js.Any) => js.Any,
    getComponentSize: () => H,
    getCurrentViewport: () => H,
    getEventData: () => js.Object,
    getLinkById: js.Any => DvtDiagramLayoutContextLink,
    getLinkByIndex: Double => DvtDiagramLayoutContextLink,
    getLinkCount: () => Double,
    getNodeById: js.Any => DvtDiagramLayoutContextNode,
    getNodeByIndex: Double => DvtDiagramLayoutContextNode,
    getNodeCount: () => Double,
    getViewport: () => H,
    isLocaleR2L: () => Boolean,
    setViewport: H => Unit
  ): DvtDiagramLayoutContext = {
    val __obj = js.Dynamic.literal(getCommonContainer = js.Any.fromFunction2(getCommonContainer), getComponentSize = js.Any.fromFunction0(getComponentSize), getCurrentViewport = js.Any.fromFunction0(getCurrentViewport), getEventData = js.Any.fromFunction0(getEventData), getLinkById = js.Any.fromFunction1(getLinkById), getLinkByIndex = js.Any.fromFunction1(getLinkByIndex), getLinkCount = js.Any.fromFunction0(getLinkCount), getNodeById = js.Any.fromFunction1(getNodeById), getNodeByIndex = js.Any.fromFunction1(getNodeByIndex), getNodeCount = js.Any.fromFunction0(getNodeCount), getViewport = js.Any.fromFunction0(getViewport), isLocaleR2L = js.Any.fromFunction0(isLocaleR2L), setViewport = js.Any.fromFunction1(setViewport))
    __obj.asInstanceOf[DvtDiagramLayoutContext]
  }
  @scala.inline
  implicit class DvtDiagramLayoutContextOps[Self <: DvtDiagramLayoutContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCommonContainer(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCommonContainer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetComponentSize(value: () => H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getComponentSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentViewport(value: () => H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentViewport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventData(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLinkById(value: js.Any => DvtDiagramLayoutContextLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinkByIndex(value: Double => DvtDiagramLayoutContextLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetLinkCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLinkCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNodeById(value: js.Any => DvtDiagramLayoutContextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeByIndex(value: Double => DvtDiagramLayoutContextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewport(value: () => H): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewport")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsLocaleR2L(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocaleR2L")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetViewport(value: H => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewport")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

