package typingsSlinky.readdirEnhanced

import typingsSlinky.node.fsMod.Stats
import typingsSlinky.readdirEnhanced.typesPublicMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<readdir-enhanced.readdir-enhanced/lib/types-public.FileSystem> */
@js.native
trait PartialFileSystem extends js.Object {
  var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.native
  var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.native
}

object PartialFileSystem {
  @scala.inline
  def apply(): PartialFileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFileSystem]
  }
  @scala.inline
  implicit class PartialFileSystemOps[Self <: PartialFileSystem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLstat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLstat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lstat")(js.undefined)
        ret
    }
    @scala.inline
    def withReaddir(value: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReaddir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readdir")(js.undefined)
        ret
    }
    @scala.inline
    def withStat(value: (/* path */ String, /* callback */ Callback[Stats]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stat")(js.undefined)
        ret
    }
  }
  
}

