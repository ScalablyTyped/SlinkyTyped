package typingsSlinky.jqueryTools.JQueryTools.overlay

import typingsSlinky.jqueryTools.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  /** Closes the overlay. */
  def close(): Overlay = js.native
  /** Returns the closing element(s) as a jQuery object. */
  def getClosers(): JQuery = js.native
  /** Returns the configuration for the overlay. */
  def getConf(): OverlayOptions = js.native
  /** Returns the overlayed element as a jQuery object. */
  def getOverlay(): JQuery = js.native
  /** Returns the triggering element as a jQuery object. */
  def getTrigger(): JQuery = js.native
  /** Returns `true` if the overlay is opened. */
  def isOpened(): Boolean = js.native
  /** Opens the overlay. */
  def load(): Overlay = js.native
}

object Overlay {
  @scala.inline
  def apply(
    close: () => Overlay,
    getClosers: () => JQuery,
    getConf: () => OverlayOptions,
    getOverlay: () => JQuery,
    getTrigger: () => JQuery,
    isOpened: () => Boolean,
    load: () => Overlay
  ): Overlay = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getClosers = js.Any.fromFunction0(getClosers), getConf = js.Any.fromFunction0(getConf), getOverlay = js.Any.fromFunction0(getOverlay), getTrigger = js.Any.fromFunction0(getTrigger), isOpened = js.Any.fromFunction0(isOpened), load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetClosers(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getClosers")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetConf(value: () => OverlayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOverlay(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOverlay")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTrigger(value: () => JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrigger")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOpened(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpened")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoad(value: () => Overlay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

