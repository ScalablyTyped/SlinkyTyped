package typingsSlinky.handsontable.mod.Handsontable.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GhostTableNestedHeaders extends js.Object {
  var container: js.Any = js.native
  var nestedHeaders: NestedHeaders = js.native
  var widthsCache: js.Array[_] = js.native
  def clear(): Unit = js.native
}

object GhostTableNestedHeaders {
  @scala.inline
  def apply(clear: () => Unit, container: js.Any, nestedHeaders: NestedHeaders, widthsCache: js.Array[_]): GhostTableNestedHeaders = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), container = container.asInstanceOf[js.Any], nestedHeaders = nestedHeaders.asInstanceOf[js.Any], widthsCache = widthsCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[GhostTableNestedHeaders]
  }
  @scala.inline
  implicit class GhostTableNestedHeadersOps[Self <: GhostTableNestedHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClear(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContainer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNestedHeaders(value: NestedHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nestedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthsCache(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthsCache")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

