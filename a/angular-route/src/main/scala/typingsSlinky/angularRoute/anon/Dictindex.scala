package typingsSlinky.angularRoute.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictindex
  extends /* index */ StringDictionary[js.Any] {
  @JSName("$scope")
  var $scope: IScope = js.native
  @JSName("$template")
  var $template: String = js.native
}

object Dictindex {
  @scala.inline
  def apply($scope: IScope, $template: String): Dictindex = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], $template = $template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictindex]
  }
  @scala.inline
  implicit class DictindexOps[Self <: Dictindex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$scope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$template(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$template")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

