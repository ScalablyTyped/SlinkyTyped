package typingsSlinky.nodelibFsStat

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nodelib/fs.stat.@nodelib/fs.stat/out/adapters/fs.FileSystemAdapter> */
@js.native
trait PartialFileSystemAdapter extends js.Object {
  var lstat: js.UndefOr[Typeoflstat] = js.native
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
  var stat: js.UndefOr[Typeofstat] = js.native
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.native
}

object PartialFileSystemAdapter {
  @scala.inline
  def apply(): PartialFileSystemAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileSystemAdapter]
  }
  @scala.inline
  implicit class PartialFileSystemAdapterOps[Self <: PartialFileSystemAdapter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

