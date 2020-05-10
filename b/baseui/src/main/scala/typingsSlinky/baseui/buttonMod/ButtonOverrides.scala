package typingsSlinky.baseui.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonOverrides extends js.Object {
  var BaseButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var EndEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var LoadingSpinner: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var LoadingSpinnerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var StartEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object ButtonOverrides {
  @scala.inline
  def apply(): ButtonOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonOverrides]
  }
  @scala.inline
  implicit class ButtonOverridesOps[Self <: ButtonOverrides] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBaseButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withEndEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndEnhancer")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinner(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingSpinner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpinner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingSpinner")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingSpinnerContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingSpinnerContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingSpinnerContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadingSpinnerContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartEnhancer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartEnhancer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartEnhancer")(js.undefined)
        ret
    }
  }
  
}

