package typingsSlinky.reactPose.transitionTypesMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends /* key */ StringDictionary[js.Any] {
  var animateOnMount: js.UndefOr[Boolean] = js.native
  var children: TransitionChildren[_] = js.native
  var enterAfterExit: js.UndefOr[Boolean] = js.native
  var enterPose: js.UndefOr[String] = js.native
  var exitPose: js.UndefOr[String] = js.native
  var flipMove: js.UndefOr[Boolean] = js.native
  var onRest: js.UndefOr[js.Function0[Unit]] = js.native
  var preEnterPose: js.UndefOr[String] = js.native
}

object Props {
  @scala.inline
  def apply(children: TransitionChildren[_]): Props = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TransitionChildren[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateOnMount(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOnMount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateOnMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateOnMount")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAfterExit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterAfterExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAfterExit")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterPose")(js.undefined)
        ret
    }
    @scala.inline
    def withExitPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitPose")(js.undefined)
        ret
    }
    @scala.inline
    def withFlipMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRest(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRest")(js.undefined)
        ret
    }
    @scala.inline
    def withPreEnterPose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreEnterPose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preEnterPose")(js.undefined)
        ret
    }
  }
  
}

