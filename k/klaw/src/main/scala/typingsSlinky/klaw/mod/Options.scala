package typingsSlinky.klaw.mod

import typingsSlinky.node.streamMod.ReadableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ReadableOptions {
  var depthLimit: js.UndefOr[Double] = js.native
  // fs or mock-fs
  var filter: js.UndefOr[js.Function1[/* path */ String, Boolean]] = js.native
  var fs: js.UndefOr[js.Any] = js.native
  var pathSorter: js.UndefOr[js.Function2[/* pathA */ String, /* pathB */ String, Double]] = js.native
  var preserveSymlinks: js.UndefOr[Boolean] = js.native
  var queueMethod: js.UndefOr[QueueMethod] = js.native
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
    def withDepthLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDepthLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("depthLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* path */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fs")(js.undefined)
        ret
    }
    @scala.inline
    def withPathSorter(value: (/* pathA */ String, /* pathB */ String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSorter")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPathSorter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathSorter")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveSymlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveSymlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveSymlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withQueueMethod(value: QueueMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueueMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queueMethod")(js.undefined)
        ret
    }
  }
  
}

