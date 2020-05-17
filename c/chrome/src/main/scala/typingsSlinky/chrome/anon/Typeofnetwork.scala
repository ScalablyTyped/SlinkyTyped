package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.devtools.network.HARLog
import typingsSlinky.chrome.chrome.devtools.network.NavigatedEvent
import typingsSlinky.chrome.chrome.devtools.network.RequestFinishedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnetwork extends js.Object {
  var onNavigated: NavigatedEvent = js.native
  var onRequestFinished: RequestFinishedEvent = js.native
  def getHAR(callback: js.Function1[/* harLog */ HARLog, Unit]): Unit = js.native
}

object Typeofnetwork {
  @scala.inline
  def apply(
    getHAR: js.Function1[/* harLog */ HARLog, Unit] => Unit,
    onNavigated: NavigatedEvent,
    onRequestFinished: RequestFinishedEvent
  ): Typeofnetwork = {
    val __obj = js.Dynamic.literal(getHAR = js.Any.fromFunction1(getHAR), onNavigated = onNavigated.asInstanceOf[js.Any], onRequestFinished = onRequestFinished.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofnetwork]
  }
  @scala.inline
  implicit class TypeofnetworkOps[Self <: Typeofnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetHAR(value: js.Function1[/* harLog */ HARLog, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHAR")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnNavigated(value: NavigatedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNavigated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnRequestFinished(value: RequestFinishedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestFinished")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

