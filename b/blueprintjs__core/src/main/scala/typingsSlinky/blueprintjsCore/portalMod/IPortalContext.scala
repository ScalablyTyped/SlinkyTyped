package typingsSlinky.blueprintjsCore.portalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPortalContext extends js.Object {
  /** Additional CSS classes to add to all `Portal` elements in this React context. */
  var blueprintPortalClassName: js.UndefOr[String] = js.native
}

object IPortalContext {
  @scala.inline
  def apply(): IPortalContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPortalContext]
  }
  @scala.inline
  implicit class IPortalContextOps[Self <: IPortalContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlueprintPortalClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintPortalClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlueprintPortalClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blueprintPortalClassName")(js.undefined)
        ret
    }
  }
  
}

