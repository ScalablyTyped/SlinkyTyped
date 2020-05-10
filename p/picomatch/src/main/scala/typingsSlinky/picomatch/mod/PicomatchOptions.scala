package typingsSlinky.picomatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PicomatchOptions extends js.Object {
  var ignore: js.UndefOr[String] = js.native
  var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
  var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
  var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
}

object PicomatchOptions {
  @scala.inline
  def apply(): PicomatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicomatchOptions]
  }
  @scala.inline
  implicit class PicomatchOptionsOps[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnIgnore(value: /* result */ Result => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnore")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onIgnore")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMatch(value: /* result */ Result => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResult(value: /* result */ Result => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResult")(js.undefined)
        ret
    }
  }
  
}

