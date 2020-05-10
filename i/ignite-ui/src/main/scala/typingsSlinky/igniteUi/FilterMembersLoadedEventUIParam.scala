package typingsSlinky.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterMembersLoadedEventUIParam extends js.Object {
  /**
  	 * A collection with the newly loaded filter members.
  	 */
  var filterMembers: js.UndefOr[js.Array[_]] = js.native
  /**
  	 * Gets the parent node or the igTree instance in the initial load.
  	 */
  var parent: js.UndefOr[String] = js.native
  /**
  	 * A collection with the root filter members .
  	 */
  var rootFilterMembers: js.UndefOr[js.Array[_]] = js.native
}

object FilterMembersLoadedEventUIParam {
  @scala.inline
  def apply(): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
  @scala.inline
  implicit class FilterMembersLoadedEventUIParamOps[Self <: FilterMembersLoadedEventUIParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterMembers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFilterMembers(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFilterMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFilterMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFilterMembers")(js.undefined)
        ret
    }
  }
  
}

