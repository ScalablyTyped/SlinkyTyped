package typingsSlinky.ngTable.ngTableGroupRowControllerMod

import typingsSlinky.ngTable.groupingFuncMod.IGroupingFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScopeExtensions[T] extends js.Object {
  @JSName("$selGroup")
  var $selGroup: IGroupingFunc[_] | String = js.native
  @JSName("$selGroupTitle")
  var $selGroupTitle: String = js.native
}

object IScopeExtensions {
  @scala.inline
  def apply[T]($selGroup: IGroupingFunc[_] | String, $selGroupTitle: String): IScopeExtensions[T] = {
    val __obj = js.Dynamic.literal($selGroup = $selGroup.asInstanceOf[js.Any], $selGroupTitle = $selGroupTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScopeExtensions[T]]
  }
  @scala.inline
  implicit class IScopeExtensionsOps[Self[t] <: IScopeExtensions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def with$selGroup(value: IGroupingFunc[_] | String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$selGroupTitle(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$selGroupTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

