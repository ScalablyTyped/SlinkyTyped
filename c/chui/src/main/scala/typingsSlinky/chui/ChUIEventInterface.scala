package typingsSlinky.chui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChUIEventInterface extends js.Object {
  var doubletap: String = js.native
  var eventCancel: String = js.native
  var eventEnd: String = js.native
  var eventMove: String = js.native
  var eventStart: String = js.native
  var longtap: String = js.native
  var singletap: String = js.native
  var swipe: String = js.native
  var swipedown: String = js.native
  var swipeleft: String = js.native
  var swiperight: String = js.native
  var swipeup: String = js.native
  var tap: String = js.native
}

object ChUIEventInterface {
  @scala.inline
  def apply(
    doubletap: String,
    eventCancel: String,
    eventEnd: String,
    eventMove: String,
    eventStart: String,
    longtap: String,
    singletap: String,
    swipe: String,
    swipedown: String,
    swipeleft: String,
    swiperight: String,
    swipeup: String,
    tap: String
  ): ChUIEventInterface = {
    val __obj = js.Dynamic.literal(doubletap = doubletap.asInstanceOf[js.Any], eventCancel = eventCancel.asInstanceOf[js.Any], eventEnd = eventEnd.asInstanceOf[js.Any], eventMove = eventMove.asInstanceOf[js.Any], eventStart = eventStart.asInstanceOf[js.Any], longtap = longtap.asInstanceOf[js.Any], singletap = singletap.asInstanceOf[js.Any], swipe = swipe.asInstanceOf[js.Any], swipedown = swipedown.asInstanceOf[js.Any], swipeleft = swipeleft.asInstanceOf[js.Any], swiperight = swiperight.asInstanceOf[js.Any], swipeup = swipeup.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChUIEventInterface]
  }
  @scala.inline
  implicit class ChUIEventInterfaceOps[Self <: ChUIEventInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoubletap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventMove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongtap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longtap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSingletap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipe(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipedown(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipedown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeleft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeleft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwiperight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swiperight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

