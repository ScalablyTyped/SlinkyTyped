package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.standard
import typingsSlinky.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseNative extends js.Object {
  var mode: js.UndefOr[standard | virtual] = js.native
  var useNative: js.UndefOr[Boolean | auto] = js.native
}

object UseNative {
  @scala.inline
  def apply(): UseNative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseNative]
  }
  @scala.inline
  implicit class UseNativeOps[Self <: UseNative] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: standard | virtual): Self = {
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
    def withUseNative(value: Boolean | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseNative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNative")(js.undefined)
        ret
    }
  }
  
}

