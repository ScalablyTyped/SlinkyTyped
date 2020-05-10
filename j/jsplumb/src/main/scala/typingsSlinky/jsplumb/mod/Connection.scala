package typingsSlinky.jsplumb.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var endpoints: js.Tuple2[Endpoint, Endpoint] = js.native
  var id: ConnectionId = js.native
  var source: Element = js.native
  var sourceId: String = js.native
  var target: Element = js.native
  var targetId: String = js.native
  def getElement(): Connection = js.native
  def getLabelOverlay(): Overlay = js.native
  def getOverlay(s: String): Overlay = js.native
  def getOverlays(): js.Object = js.native
  def hideOverlay(s: String): Unit = js.native
  def repaint(): Unit = js.native
  def setDetachable(detachable: Boolean): Unit = js.native
  def setLabel(s: String): Unit = js.native
  def setParameter(name: String, value: js.Any): Unit = js.native
  def showOverlay(s: String): Unit = js.native
}

object Connection {
  @scala.inline
  def apply(
    endpoints: js.Tuple2[Endpoint, Endpoint],
    getElement: () => Connection,
    getLabelOverlay: () => Overlay,
    getOverlay: String => Overlay,
    getOverlays: () => js.Object,
    hideOverlay: String => Unit,
    id: ConnectionId,
    repaint: () => Unit,
    setDetachable: Boolean => Unit,
    setLabel: String => Unit,
    setParameter: (String, js.Any) => Unit,
    showOverlay: String => Unit,
    source: Element,
    sourceId: String,
    target: Element,
    targetId: String
  ): Connection = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], getElement = js.Any.fromFunction0(getElement), getLabelOverlay = js.Any.fromFunction0(getLabelOverlay), getOverlay = js.Any.fromFunction1(getOverlay), getOverlays = js.Any.fromFunction0(getOverlays), hideOverlay = js.Any.fromFunction1(hideOverlay), id = id.asInstanceOf[js.Any], repaint = js.Any.fromFunction0(repaint), setDetachable = js.Any.fromFunction1(setDetachable), setLabel = js.Any.fromFunction1(setLabel), setParameter = js.Any.fromFunction2(setParameter), showOverlay = js.Any.fromFunction1(showOverlay), source = source.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: js.Tuple2[Endpoint, Endpoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetElement(value: () => Connection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getElement")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLabelOverlay(value: () => Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabelOverlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOverlay(value: String => Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetOverlays(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlays")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHideOverlay(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOverlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: ConnectionId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepaint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repaint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDetachable(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDetachable")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLabel(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetParameter(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setParameter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withShowOverlay(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOverlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSource(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

