package typingsSlinky.klawSync.mod

import typingsSlinky.klawSync.anon.ReaddirSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * @description The number of times to recurse before stopping.
    *              -1 for unlimited.
    * @default -1
    * @since v5.0.0
    */
  var depthLimit: js.UndefOr[Double] = js.native
  /**
    * @description function that gets one argument fn({path: '', stats: {}}) and returns true to include
    *              or false to exclude the item
    * @since v2.0.0
    */
  var filter: js.UndefOr[Filter] = js.native
  /**
    * @description Custom fs, useful when mocking fs object.
    * @default graceful-fs
    * @since v4.0.0
    */
  var fs: js.UndefOr[ReaddirSync] = js.native
  /**
    * @description True to only return files (ignore directories).
    *              Defaults to false if not specified.
    * @default false
    */
  var nodir: js.UndefOr[Boolean] = js.native
  /**
    * @description True to only return directories (ignore files).
    *              Defaults to false if not specified.
    * @default false
    */
  var nofile: js.UndefOr[Boolean] = js.native
  /**
    * @description traverse all subdirectories, regardless of `filter` option.
    *
    * When set to true, traverseAll produces similar behavior to the default
    * behavior prior to `v4.0.0`. The current default of `traverseAll: false`
    * is equivalent to the old `noRecurseOnFailedFilter: true`).
    *
    * @since v6.0.0
    */
  var traverseAll: js.UndefOr[Boolean] = js.native
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
    def withFilter(value: /* item */ Item => Boolean): Self = {
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
    def withFs(value: ReaddirSync): Self = {
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
    def withNodir(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodir")(js.undefined)
        ret
    }
    @scala.inline
    def withNofile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nofile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNofile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nofile")(js.undefined)
        ret
    }
    @scala.inline
    def withTraverseAll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseAll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraverseAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traverseAll")(js.undefined)
        ret
    }
  }
  
}

