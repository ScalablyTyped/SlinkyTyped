package typingsSlinky.reactLazylog.scrollFollowMod

import typingsSlinky.reactLazylog.anon.ClientHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollFollowRenderProps extends js.Object {
  var follow: Boolean = js.native
  def onScroll(args: ClientHeight): Unit = js.native
  def startFollowing(): Unit = js.native
  def stopFollowing(): Unit = js.native
}

object ScrollFollowRenderProps {
  @scala.inline
  def apply(
    follow: Boolean,
    onScroll: ClientHeight => Unit,
    startFollowing: () => Unit,
    stopFollowing: () => Unit
  ): ScrollFollowRenderProps = {
    val __obj = js.Dynamic.literal(follow = follow.asInstanceOf[js.Any], onScroll = js.Any.fromFunction1(onScroll), startFollowing = js.Any.fromFunction0(startFollowing), stopFollowing = js.Any.fromFunction0(stopFollowing))
    __obj.asInstanceOf[ScrollFollowRenderProps]
  }
  @scala.inline
  implicit class ScrollFollowRenderPropsOps[Self <: ScrollFollowRenderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("follow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnScroll(value: ClientHeight => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStartFollowing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFollowing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopFollowing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopFollowing")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

