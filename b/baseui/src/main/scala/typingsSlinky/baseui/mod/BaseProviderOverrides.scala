package typingsSlinky.baseui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseProviderOverrides extends js.Object {
  var AppContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var LayersContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object BaseProviderOverrides {
  @scala.inline
  def apply(): BaseProviderOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseProviderOverrides]
  }
  @scala.inline
  implicit class BaseProviderOverridesOps[Self <: BaseProviderOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withLayersContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayersContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayersContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LayersContainer")(js.undefined)
        ret
    }
  }
  
}

