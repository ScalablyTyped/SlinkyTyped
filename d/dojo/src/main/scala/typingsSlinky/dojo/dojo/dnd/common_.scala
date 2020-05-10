package typingsSlinky.dojo.dojo.dnd

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/common.html
  *
  * TODOC
  *
  */
@js.native
trait common_ extends js.Object {
  /**
    *
    * @param evt
    */
  def getCopyKeyState(evt: js.Any): js.Any = js.native
  /**
    * returns a unique string for use with any DOM element
    *
    */
  def getUniqueId(): String = js.native
  /**
    * returns true if user clicked on a form element
    *
    * @param e
    */
  def isFormElement(e: Event_): Unit = js.native
  /**
    * Returns the current DnD manager.  Creates one if it is not created yet.
    *
    */
  def manager(): js.Any = js.native
}

object common_ {
  @scala.inline
  def apply(
    getCopyKeyState: js.Any => js.Any,
    getUniqueId: () => String,
    isFormElement: Event_ => Unit,
    manager: () => js.Any
  ): common_ = {
    val __obj = js.Dynamic.literal(getCopyKeyState = js.Any.fromFunction1(getCopyKeyState), getUniqueId = js.Any.fromFunction0(getUniqueId), isFormElement = js.Any.fromFunction1(isFormElement), manager = js.Any.fromFunction0(manager))
    __obj.asInstanceOf[common_]
  }
  @scala.inline
  implicit class common_Ops[Self <: common_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCopyKeyState(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCopyKeyState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetUniqueId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUniqueId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFormElement(value: Event_ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFormElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withManager(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manager")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

