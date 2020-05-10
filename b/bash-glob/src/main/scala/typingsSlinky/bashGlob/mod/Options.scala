package typingsSlinky.bashGlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cwd: js.UndefOr[String] = js.native
  var dot: js.UndefOr[Boolean] = js.native
  var dotglob: js.UndefOr[Boolean] = js.native
  var extglob: js.UndefOr[Boolean] = js.native
  var failglob: js.UndefOr[Boolean] = js.native
  var globstar: js.UndefOr[Boolean] = js.native
  var nocase: js.UndefOr[Boolean] = js.native
  var nocaseglob: js.UndefOr[Boolean] = js.native
  var nullglob: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCwd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCwd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cwd")(js.undefined)
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(js.undefined)
        ret
    }
    @scala.inline
    def withDotglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotglob")(js.undefined)
        ret
    }
    @scala.inline
    def withExtglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extglob")(js.undefined)
        ret
    }
    @scala.inline
    def withFailglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failglob")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobstar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globstar")(js.undefined)
        ret
    }
    @scala.inline
    def withNocase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocase")(js.undefined)
        ret
    }
    @scala.inline
    def withNocaseglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocaseglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocaseglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocaseglob")(js.undefined)
        ret
    }
    @scala.inline
    def withNullglob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullglob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullglob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullglob")(js.undefined)
        ret
    }
  }
  
}

