package typingsSlinky.phenomnomnominalTsquery.tsqueryTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQueryOptions extends js.Object {
  var visitAllChildren: js.UndefOr[Boolean] = js.native
}

object TSQueryOptions {
  @scala.inline
  def apply(): TSQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSQueryOptions]
  }
  @scala.inline
  implicit class TSQueryOptionsOps[Self <: TSQueryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVisitAllChildren(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAllChildren")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisitAllChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visitAllChildren")(js.undefined)
        ret
    }
  }
  
}

