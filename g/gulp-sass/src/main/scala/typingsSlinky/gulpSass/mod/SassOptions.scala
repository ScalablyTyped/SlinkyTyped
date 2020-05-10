package typingsSlinky.gulpSass.mod

import typingsSlinky.nodeSass.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SassOptions extends Options {
  var error: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
  var imagePaths: js.UndefOr[js.Array[String]] = js.native
  var success: js.UndefOr[js.Function1[/* results */ SassResults, _]] = js.native
}

object SassOptions {
  @scala.inline
  def apply(): SassOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SassOptions]
  }
  @scala.inline
  implicit class SassOptionsOps[Self <: SassOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: /* err */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withImagePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImagePaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePaths")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* results */ SassResults => _): Self = {
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

