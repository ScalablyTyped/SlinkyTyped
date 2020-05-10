package typingsSlinky.angularPermission.mod.permission

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionProperties extends js.Object {
  var fromParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.native
  var fromState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.native
  var options: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
  ] = js.native
  var toParams: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
  ] = js.native
  var toState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
  ] = js.native
}

object TransitionProperties {
  @scala.inline
  def apply(): TransitionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionProperties]
  }
  @scala.inline
  implicit class TransitionPropertiesOps[Self <: TransitionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromParams")(js.undefined)
        ret
    }
    @scala.inline
    def withFromState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromState")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateOptions */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withToParams(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IStateParamsService */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toParams")(js.undefined)
        ret
    }
    @scala.inline
    def withToState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.ui.IState */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toState")(js.undefined)
        ret
    }
  }
  
}

