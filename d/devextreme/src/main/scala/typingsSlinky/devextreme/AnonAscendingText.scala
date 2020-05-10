package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAscendingText extends js.Object {
  var ascendingText: js.UndefOr[String] = js.native
  var clearText: js.UndefOr[String] = js.native
  var descendingText: js.UndefOr[String] = js.native
  var mode: js.UndefOr[multiple | none | single_] = js.native
  var showSortIndexes: js.UndefOr[Boolean] = js.native
}

object AnonAscendingText {
  @scala.inline
  def apply(): AnonAscendingText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAscendingText]
  }
  @scala.inline
  implicit class AnonAscendingTextOps[Self <: AnonAscendingText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscendingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascendingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscendingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascendingText")(js.undefined)
        ret
    }
    @scala.inline
    def withClearText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearText")(js.undefined)
        ret
    }
    @scala.inline
    def withDescendingText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendingText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescendingText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descendingText")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: multiple | none | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSortIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSortIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSortIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSortIndexes")(js.undefined)
        ret
    }
  }
  
}

