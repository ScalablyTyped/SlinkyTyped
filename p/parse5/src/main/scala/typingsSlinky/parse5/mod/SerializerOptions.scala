package typingsSlinky.parse5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializerOptions extends js.Object {
  /***
    * Specifies input tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.native
}

object SerializerOptions {
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTreeAdapter(value: TreeAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTreeAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("treeAdapter")(js.undefined)
        ret
    }
  }
  
}

