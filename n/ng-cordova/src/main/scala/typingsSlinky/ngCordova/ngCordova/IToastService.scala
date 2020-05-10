package typingsSlinky.ngCordova.ngCordova

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastService extends js.Object {
  def show(message: String, duration: String, position: String): js.Any = js.native
  def showLongBottom(message: String): js.Any = js.native
  def showLongCenter(message: String): js.Any = js.native
  def showLongTop(message: String): js.Any = js.native
  def showShortBottom(message: String): js.Any = js.native
  def showShortCenter(message: String): js.Any = js.native
  def showShortTop(message: String): js.Any = js.native
}

object IToastService {
  @scala.inline
  def apply(
    show: (String, String, String) => js.Any,
    showLongBottom: String => js.Any,
    showLongCenter: String => js.Any,
    showLongTop: String => js.Any,
    showShortBottom: String => js.Any,
    showShortCenter: String => js.Any,
    showShortTop: String => js.Any
  ): IToastService = {
    val __obj = js.Dynamic.literal(show = js.Any.fromFunction3(show), showLongBottom = js.Any.fromFunction1(showLongBottom), showLongCenter = js.Any.fromFunction1(showLongCenter), showLongTop = js.Any.fromFunction1(showLongTop), showShortBottom = js.Any.fromFunction1(showShortBottom), showShortCenter = js.Any.fromFunction1(showShortCenter), showShortTop = js.Any.fromFunction1(showShortTop))
    __obj.asInstanceOf[IToastService]
  }
  @scala.inline
  implicit class IToastServiceOps[Self <: IToastService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShow(value: (String, String, String) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withShowLongBottom(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLongBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowLongCenter(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLongCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowLongTop(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLongTop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowShortBottom(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShortBottom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowShortCenter(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShortCenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowShortTop(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showShortTop")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

