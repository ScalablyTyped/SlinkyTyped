package typingsSlinky.ngTable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  var controller: String = js.native
  var controllerAs: String = js.native
  var replace: Boolean = js.native
  var restrict: String = js.native
  var scope: Boolean = js.native
  var templateUrl: js.Any = js.native
}

object Controller {
  @scala.inline
  def apply(
    controller: String,
    controllerAs: String,
    replace: Boolean,
    restrict: String,
    scope: Boolean,
    templateUrl: js.Any
  ): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], controllerAs = controllerAs.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], restrict = restrict.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], templateUrl = templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
  @scala.inline
  implicit class ControllerOps[Self <: Controller] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withController(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControllerAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controllerAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateUrl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

