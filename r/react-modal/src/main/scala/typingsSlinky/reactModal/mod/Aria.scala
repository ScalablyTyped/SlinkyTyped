package typingsSlinky.reactModal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aria extends js.Object {
  /** Identifies the element (or elements) that describes the object. */
  var describedby: js.UndefOr[String] = js.native
  /** Defines a string value that labels the current element. */
  var labelledby: js.UndefOr[String] = js.native
  /** Indicates whether an element is modal when displayed. */
  var modal: js.UndefOr[Boolean] = js.native
}

object Aria {
  @scala.inline
  def apply(): Aria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aria]
  }
  @scala.inline
  implicit class AriaOps[Self <: Aria] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescribedby(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescribedby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("describedby")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelledby(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledby")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelledby: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelledby")(js.undefined)
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
  }
  
}

