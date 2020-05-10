package typingsSlinky.ngDialog.mod.angularAugmentingMod.dialog

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod._Global_.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Options which are provided to open a dialog.
		 */
@js.native
trait IDialogOpenOptions extends IDialogOptions {
  var bindToController: js.UndefOr[Boolean] = js.native
  var controller: js.UndefOr[String | js.Array[_] | js.Any] = js.native
  var controllerAs: js.UndefOr[String] = js.native
  /**
  			 * Any serializable data that you want to be stored in the controller's dialog scope. ($scope.ngDialogData).
  			 * From version 0.3.6 $scope.ngDialogData keeps references to the objects instead of copying them.
  			 */
  var data: js.UndefOr[String | js.Object | js.Array[_]] = js.native
  /**
  			 * An optional map of dependencies which should be injected into the controller. If any of these dependencies
  			 * are promises, ngDialog will wait for them all to be resolved or one to be rejected before the controller
  			 * is instantiated.
  			 */
  var resolve: js.UndefOr[StringDictionary[String | Function]] = js.native
  /**
  			 * Scope object that will be passed to dialog. If you use controller with separate $scope service this object will be passed to $scope.$parent param.
  			 */
  var scope: js.UndefOr[IDialogScope] = js.native
  var template: String = js.native
}

object IDialogOpenOptions {
  @scala.inline
  def apply(template: String): IDialogOpenOptions = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogOpenOptions]
  }
  @scala.inline
  implicit class IDialogOpenOptionsOps[Self <: IDialogOpenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindToController(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindToController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToController")(js.undefined)
        ret
    }
    @scala.inline
    def withController(value: String | js.Array[_] | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(js.undefined)
        ret
    }
    @scala.inline
    def withControllerAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControllerAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String | js.Object | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withResolve(value: StringDictionary[String | Function]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: IDialogScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
  }
  
}

