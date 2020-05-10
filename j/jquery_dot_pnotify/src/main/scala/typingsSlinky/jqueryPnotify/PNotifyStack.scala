package typingsSlinky.jqueryPnotify

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PNotifyStack extends js.Object {
  var context: js.UndefOr[JQuery_[HTMLElement]] = js.native
  var dir1: js.UndefOr[String] = js.native
  var dir2: js.UndefOr[String] = js.native
  var firstpos1: js.UndefOr[Double] = js.native
  var firstpos2: js.UndefOr[Double] = js.native
  var modal: js.UndefOr[Boolean] = js.native
  var push: js.UndefOr[String] = js.native
  var spacing1: js.UndefOr[Double] = js.native
  var spacing2: js.UndefOr[Double] = js.native
}

object PNotifyStack {
  @scala.inline
  def apply(): PNotifyStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PNotifyStack]
  }
  @scala.inline
  implicit class PNotifyStackOps[Self <: PNotifyStack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: JQuery_[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDir1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir1")(js.undefined)
        ret
    }
    @scala.inline
    def withDir2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDir2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir2")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstpos1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstpos1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstpos1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstpos1")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstpos2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstpos2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstpos2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstpos2")(js.undefined)
        ret
    }
    @scala.inline
    def withModal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modal")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing1")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing2")(js.undefined)
        ret
    }
  }
  
}

