package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SearchBox/SearchBox.types.ISearchBoxProps, 'disableAnimation' | 'clearButtonProps'> */
@js.native
trait PickISearchBoxPropsdisabl extends js.Object {
  var clearButtonProps: js.UndefOr[IButtonProps] = js.native
  var disableAnimation: js.UndefOr[Boolean] = js.native
}

object PickISearchBoxPropsdisabl {
  @scala.inline
  def apply(): PickISearchBoxPropsdisabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickISearchBoxPropsdisabl]
  }
  @scala.inline
  implicit class PickISearchBoxPropsdisablOps[Self <: PickISearchBoxPropsdisabl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClearButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableAnimation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableAnimation")(js.undefined)
        ret
    }
  }
  
}

