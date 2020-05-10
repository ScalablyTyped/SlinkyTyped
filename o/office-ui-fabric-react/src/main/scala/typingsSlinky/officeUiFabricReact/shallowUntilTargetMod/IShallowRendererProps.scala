package typingsSlinky.officeUiFabricReact.shallowUntilTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShallowRendererProps extends js.Object {
  var disableLifecycleMethods: js.UndefOr[Boolean] = js.native
  var lifecycleExperimental: js.UndefOr[Boolean] = js.native
}

object IShallowRendererProps {
  @scala.inline
  def apply(): IShallowRendererProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShallowRendererProps]
  }
  @scala.inline
  implicit class IShallowRendererPropsOps[Self <: IShallowRendererProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableLifecycleMethods(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableLifecycleMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableLifecycleMethods")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycleExperimental(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleExperimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleExperimental")(js.undefined)
        ret
    }
  }
  
}

