package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.ImageSourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<ali-app.my.ChooseImageOptions> */
@js.native
trait PartialChooseImageOptions extends js.Object {
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var count: js.UndefOr[Double] = js.native
  var fail: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  var sourceType: js.UndefOr[js.Array[ImageSourceType]] = js.native
  var success: js.UndefOr[js.Function1[/* res */ ApFilePaths, Unit]] = js.native
}

object PartialChooseImageOptions {
  @scala.inline
  def apply(): PartialChooseImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChooseImageOptions]
  }
  @scala.inline
  implicit class PartialChooseImageOptionsOps[Self <: PartialChooseImageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplete(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: /* res */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: js.Array[ImageSourceType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ ApFilePaths => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

