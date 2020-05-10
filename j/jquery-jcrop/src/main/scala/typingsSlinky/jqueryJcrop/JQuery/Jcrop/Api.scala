package typingsSlinky.jqueryJcrop.JQuery.Jcrop

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Api extends js.Object {
  /** Animate selection to new selection, format: [ x,y,x2,y2 ] */
  def animateTo(selection: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  /** Disables Jcrop interactivity */
  def disable(): Unit = js.native
  /** Enables Jcrop interactivity */
  def enable(): Unit = js.native
  /** Release current selection */
  def release(): Unit = js.native
  /** Remove Jcrop entirely */
  def remove(): Unit = js.native
  /** Set selection, format: [ x,y,x2,y2 ] */
  def setSelect(selection: js.Tuple4[Double, Double, Double, Double]): Unit = js.native
  /** Query current selection values (interface)  */
  def tellScaled(): SelectionInfo = js.native
  /** Query current selection values (true size) */
  def tellSelect(): SelectionInfo = js.native
}

object Api {
  @scala.inline
  def apply(
    animateTo: js.Tuple4[Double, Double, Double, Double] => Unit,
    disable: () => Unit,
    enable: () => Unit,
    release: () => Unit,
    remove: () => Unit,
    setSelect: js.Tuple4[Double, Double, Double, Double] => Unit,
    tellScaled: () => SelectionInfo,
    tellSelect: () => SelectionInfo
  ): Api = {
    val __obj = js.Dynamic.literal(animateTo = js.Any.fromFunction1(animateTo), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction0(remove), setSelect = js.Any.fromFunction1(setSelect), tellScaled = js.Any.fromFunction0(tellScaled), tellSelect = js.Any.fromFunction0(tellSelect))
    __obj.asInstanceOf[Api]
  }
  @scala.inline
  implicit class ApiOps[Self <: Api] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateTo(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRelease(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("release")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetSelect(value: js.Tuple4[Double, Double, Double, Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTellScaled(value: () => SelectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tellScaled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTellSelect(value: () => SelectionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tellSelect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

