package typingsSlinky.officeUiFabricReact.resizeGroupOverflowSetExampleMod

import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOverflowData extends js.Object {
  var cacheKey: js.UndefOr[String] = js.native
  var overflow: js.Array[IContextualMenuItem] = js.native
  var primary: js.Array[IContextualMenuItem] = js.native
}

object IOverflowData {
  @scala.inline
  def apply(overflow: js.Array[IContextualMenuItem], primary: js.Array[IContextualMenuItem]): IOverflowData = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverflowData]
  }
  @scala.inline
  implicit class IOverflowDataOps[Self <: IOverflowData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverflow(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimary(value: js.Array[IContextualMenuItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKey")(js.undefined)
        ret
    }
  }
  
}

