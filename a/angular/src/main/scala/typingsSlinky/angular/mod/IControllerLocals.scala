package typingsSlinky.angular.mod

import typingsSlinky.angular.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// ControllerService
// see http://docs.angularjs.org/api/ng.$controller
// see http://docs.angularjs.org/api/ng.$controllerProvider
///////////////////////////////////////////////////////////////////////////
/**
  * The minimal local definitions required by $controller(ctrl, locals) calls.
  */
@js.native
trait IControllerLocals extends js.Object {
  @JSName("$element")
  var $element: JQuery = js.native
  @JSName("$scope")
  var $scope: IScope = js.native
}

object IControllerLocals {
  @scala.inline
  def apply($element: JQuery, $scope: IScope): IControllerLocals = {
    val __obj = js.Dynamic.literal($element = $element.asInstanceOf[js.Any], $scope = $scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControllerLocals]
  }
  @scala.inline
  implicit class IControllerLocalsOps[Self <: IControllerLocals] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$element(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$scope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

