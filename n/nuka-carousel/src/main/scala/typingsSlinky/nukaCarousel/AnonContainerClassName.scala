package typingsSlinky.nukaCarousel

import typingsSlinky.nukaCarousel.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContainerClassName extends js.Object {
  var containerClassName: js.UndefOr[String] = js.native
  var nextButtonClassName: js.UndefOr[String] = js.native
  var nextButtonStyle: js.UndefOr[CSSProperties] = js.native
  var nextButtonText: js.UndefOr[String] = js.native
  var pagingDotsClassName: js.UndefOr[String] = js.native
  var pagingDotsContainerClassName: js.UndefOr[String] = js.native
  var pagingDotsStyle: js.UndefOr[CSSProperties] = js.native
  var prevButtonClassName: js.UndefOr[String] = js.native
  var prevButtonStyle: js.UndefOr[CSSProperties] = js.native
  var prevButtonText: js.UndefOr[String] = js.native
}

object AnonContainerClassName {
  @scala.inline
  def apply(): AnonContainerClassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonContainerClassName]
  }
  @scala.inline
  implicit class AnonContainerClassNameOps[Self <: AnonContainerClassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNextButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingDotsClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingDotsClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingDotsContainerClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsContainerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingDotsContainerClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsContainerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPagingDotsStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagingDotsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagingDotsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButtonStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButtonStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevButtonText")(js.undefined)
        ret
    }
  }
  
}

