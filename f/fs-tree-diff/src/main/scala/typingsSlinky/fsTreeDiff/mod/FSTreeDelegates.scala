package typingsSlinky.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in fs-tree-diff.fs-tree-diff.ChangeType ]:? (inputPath : string, outputPath : string, relativePath : string): void} */
@js.native
trait FSTreeDelegates extends js.Object {
  var change: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  var create: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  var mkdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  var rmdir: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
  var unlink: js.UndefOr[
    js.Function3[/* inputPath */ String, /* outputPath */ String, /* relativePath */ String, Unit]
  ] = js.native
}

object FSTreeDelegates {
  @scala.inline
  def apply(): FSTreeDelegates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSTreeDelegates]
  }
  @scala.inline
  implicit class FSTreeDelegatesOps[Self <: FSTreeDelegates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withMkdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutMkdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(js.undefined)
        ret
    }
    @scala.inline
    def withRmdir(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRmdir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rmdir")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlink(value: (/* inputPath */ String, /* outputPath */ String, /* relativePath */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnlink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlink")(js.undefined)
        ret
    }
  }
  
}

