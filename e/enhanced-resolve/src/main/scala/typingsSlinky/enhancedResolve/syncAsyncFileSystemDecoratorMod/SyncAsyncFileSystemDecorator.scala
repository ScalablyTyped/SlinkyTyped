package typingsSlinky.enhancedResolve.syncAsyncFileSystemDecoratorMod

import typingsSlinky.enhancedResolve.commonTypesMod.AbstractInputFileSystem
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncAsyncFileSystemDecorator extends js.Object {
  var fs: AbstractInputFileSystem = js.native
  var readFile: js.UndefOr[
    js.Function2[
      /* filename */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit], 
      Unit
    ]
  ] = js.native
  var readJson: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.native
  var readdir: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit], 
      Unit
    ]
  ] = js.native
  var readlink: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
  var stat: js.UndefOr[
    js.Function2[
      /* path */ String, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit], 
      Unit
    ]
  ] = js.native
}

object SyncAsyncFileSystemDecorator {
  @scala.inline
  def apply(fs: AbstractInputFileSystem): SyncAsyncFileSystemDecorator = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncAsyncFileSystemDecorator]
  }
  @scala.inline
  implicit class SyncAsyncFileSystemDecoratorOps[Self <: SyncAsyncFileSystemDecorator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFs(value: AbstractInputFileSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadFile(
      value: (/* filename */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[Buffer], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readFile")(js.undefined)
        ret
    }
    @scala.inline
    def withReadJson(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* data */ js.UndefOr[js.Any], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readJson")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readJson")(js.undefined)
        ret
    }
    @scala.inline
    def withReaddir(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* files */ js.UndefOr[js.Array[String]], Unit]) => Unit
    ): Self = {
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
    def withReadlink(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* linkString */ js.UndefOr[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readlink")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutReadlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readlink")(js.undefined)
        ret
    }
    @scala.inline
    def withStat(
      value: (/* path */ String, /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ js.UndefOr[Stats], Unit]) => Unit
    ): Self = {
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

