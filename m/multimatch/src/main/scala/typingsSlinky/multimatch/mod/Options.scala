package typingsSlinky.multimatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<minimatch.minimatch.IOptions> */
@js.native
trait Options extends js.Object {
  val debug: js.UndefOr[Boolean] = js.native
  val dot: js.UndefOr[Boolean] = js.native
  val flipNegate: js.UndefOr[Boolean] = js.native
  val matchBase: js.UndefOr[Boolean] = js.native
  val nobrace: js.UndefOr[Boolean] = js.native
  val nocase: js.UndefOr[Boolean] = js.native
  val nocomment: js.UndefOr[Boolean] = js.native
  val noext: js.UndefOr[Boolean] = js.native
  val noglobstar: js.UndefOr[Boolean] = js.native
  val nonegate: js.UndefOr[Boolean] = js.native
  val nonull: js.UndefOr[Boolean] = js.native
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
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
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
    def withFlipNegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipNegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlipNegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipNegate")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchBase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchBase")(js.undefined)
        ret
    }
    @scala.inline
    def withNobrace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNobrace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nobrace")(js.undefined)
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
    def withNocomment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocomment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNocomment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nocomment")(js.undefined)
        ret
    }
    @scala.inline
    def withNoext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noext")(js.undefined)
        ret
    }
    @scala.inline
    def withNoglobstar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoglobstar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noglobstar")(js.undefined)
        ret
    }
    @scala.inline
    def withNonegate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonegate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonegate")(js.undefined)
        ret
    }
    @scala.inline
    def withNonull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonull")(js.undefined)
        ret
    }
  }
  
}

