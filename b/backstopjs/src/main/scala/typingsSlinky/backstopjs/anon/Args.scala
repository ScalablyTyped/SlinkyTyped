package typingsSlinky.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Args extends js.Object {
  var args: js.Array[String] = js.native
  var chromeFlags: js.UndefOr[js.Array[String]] = js.native
  var chromePath: js.UndefOr[String] = js.native
  var ignoreHTTPSErrors: js.UndefOr[Boolean] = js.native
  var waitTimeout: js.UndefOr[Double] = js.native
}

object Args {
  @scala.inline
  def apply(args: js.Array[String]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  @scala.inline
  implicit class ArgsOps[Self <: Args] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChromeFlags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromeFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromeFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withChromePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChromePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chromePath")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreHTTPSErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreHTTPSErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitTimeout")(js.undefined)
        ret
    }
  }
  
}

