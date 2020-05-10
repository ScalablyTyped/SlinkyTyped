package typingsSlinky.dojo.dojox.widget.rotator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/widget/rotator/Wipe.html
  *
  *
  */
@js.native
trait Wipe extends js.Object {
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the top.
    *
    * @param args
    */
  def wipeDown(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the left.
    *
    * @param args
    */
  def wipeLeft(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the right.
    *
    * @param args
    */
  def wipeRight(args: js.Object): js.Any = js.native
  /**
    * Returns a dojo.Animation that wipes in the next rotator pane from the bottom.
    *
    * @param args
    */
  def wipeUp(args: js.Object): js.Any = js.native
}

object Wipe {
  @scala.inline
  def apply(
    wipeDown: js.Object => js.Any,
    wipeLeft: js.Object => js.Any,
    wipeRight: js.Object => js.Any,
    wipeUp: js.Object => js.Any
  ): Wipe = {
    val __obj = js.Dynamic.literal(wipeDown = js.Any.fromFunction1(wipeDown), wipeLeft = js.Any.fromFunction1(wipeLeft), wipeRight = js.Any.fromFunction1(wipeRight), wipeUp = js.Any.fromFunction1(wipeUp))
    __obj.asInstanceOf[Wipe]
  }
  @scala.inline
  implicit class WipeOps[Self <: Wipe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWipeDown(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWipeLeft(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWipeRight(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWipeUp(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeUp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

