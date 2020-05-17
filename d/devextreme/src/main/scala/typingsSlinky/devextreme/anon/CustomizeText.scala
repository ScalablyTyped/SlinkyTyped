package typingsSlinky.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomizeText[T] extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* e */ FilterValue[T], String]] = js.native
  var filterEnabled: js.UndefOr[Boolean] = js.native
  var texts: js.UndefOr[ClearFilter] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object CustomizeText {
  @scala.inline
  def apply[T](): CustomizeText[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomizeText[T]]
  }
  @scala.inline
  implicit class CustomizeTextOps[Self[t] <: CustomizeText[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCustomizeText(value: /* e */ FilterValue[T] => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterEnabled(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterEnabled: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withTexts(value: ClearFilter): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTexts: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texts")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

