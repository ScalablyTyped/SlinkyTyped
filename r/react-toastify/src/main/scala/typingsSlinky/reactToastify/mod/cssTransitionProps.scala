package typingsSlinky.reactToastify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait cssTransitionProps extends js.Object {
  /**
    * Append current toast position to the classname.
    * For instance `myclass--top-center`...
    * `Default: false`
    */
  var appendPosition: js.UndefOr[Boolean] = js.native
  /**
    * Define the duration of the transition in ms
    * `Default: 750`
    */
  var duration: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * Css class to apply when toast enter
    */
  var enter: String = js.native
  /**
    * Css class to apply when toast leave
    */
  var exit: String = js.native
}

object cssTransitionProps {
  @scala.inline
  def apply(enter: String, exit: String): cssTransitionProps = {
    val __obj = js.Dynamic.literal(enter = enter.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[cssTransitionProps]
  }
  @scala.inline
  implicit class cssTransitionPropsOps[Self <: cssTransitionProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppendPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
  }
  
}

