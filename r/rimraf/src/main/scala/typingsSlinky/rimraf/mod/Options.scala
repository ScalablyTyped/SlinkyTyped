package typingsSlinky.rimraf.mod

import typingsSlinky.glob.mod.IOptions
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.rimraf.anon.Fn0
import typingsSlinky.rimraf.anon.FnCall
import typingsSlinky.rimraf.anon.FnCallPathOptions
import typingsSlinky.rimraf.anon.Typeofchmod
import typingsSlinky.rimraf.anon.Typeoflstat
import typingsSlinky.rimraf.anon.Typeofreaddir
import typingsSlinky.rimraf.anon.Typeofrmdir
import typingsSlinky.rimraf.anon.Typeofstat
import typingsSlinky.rimraf.anon.Typeofunlink
import typingsSlinky.rimraf.rimrafBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * see {@link https://github.com/isaacs/rimraf/blob/79b933fb362b2c51bedfa448be848e1d7ed32d7e/README.md#options}
  */
@js.native
trait Options extends js.Object {
  var chmod: js.UndefOr[Typeofchmod] = js.native
  var chmodSync: js.UndefOr[FnCall] = js.native
  /** @default false */
  var disableGlob: js.UndefOr[Boolean] = js.native
  var emfileWait: js.UndefOr[Double] = js.native
  var glob: js.UndefOr[IOptions | `false`] = js.native
  var lstat: js.UndefOr[Typeoflstat] = js.native
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  var maxBusyTries: js.UndefOr[Double] = js.native
  var readdir: js.UndefOr[Typeofreaddir] = js.native
  var readdirSync: js.UndefOr[Fn0] = js.native
  var rmdir: js.UndefOr[Typeofrmdir] = js.native
  var rmdirSync: js.UndefOr[FnCallPathOptions] = js.native
  var stat: js.UndefOr[Typeofstat] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  var unlink: js.UndefOr[Typeofunlink] = js.native
  var unlinkSync: js.UndefOr[js.Function1[/* path */ PathLike, Unit]] = js.native
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
    def withChmod(value: Typeofchmod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chmod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChmod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chmod")(js.undefined)
        ret
    }
    @scala.inline
    def withChmodSync(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chmodSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChmodSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chmodSync")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableGlob(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableGlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableGlob")(js.undefined)
        ret
    }
    @scala.inline
    def withEmfileWait(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emfileWait")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmfileWait: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emfileWait")(js.undefined)
        ret
    }
    @scala.inline
    def withGlob(value: IOptions | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(js.undefined)
        ret
    }
    @scala.inline
    def withLstat(value: Typeoflstat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLstat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(js.undefined)
        ret
    }
    @scala.inline
    def withLstatSync(value: /* path */ PathLike => Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstatSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLstatSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstatSync")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxBusyTries(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBusyTries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxBusyTries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBusyTries")(js.undefined)
        ret
    }
    @scala.inline
    def withReaddir(value: Typeofreaddir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaddir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(js.undefined)
        ret
    }
    @scala.inline
    def withReaddirSync(value: Fn0): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdirSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReaddirSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdirSync")(js.undefined)
        ret
    }
    @scala.inline
    def withRmdir(value: Typeofrmdir): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRmdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(js.undefined)
        ret
    }
    @scala.inline
    def withRmdirSync(value: FnCallPathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdirSync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRmdirSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdirSync")(js.undefined)
        ret
    }
    @scala.inline
    def withStat(value: Typeofstat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.undefined)
        ret
    }
    @scala.inline
    def withStatSync(value: /* path */ PathLike => Stats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStatSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statSync")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlink(value: Typeofunlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlinkSync(value: /* path */ PathLike => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkSync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnlinkSync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkSync")(js.undefined)
        ret
    }
  }
  
}

