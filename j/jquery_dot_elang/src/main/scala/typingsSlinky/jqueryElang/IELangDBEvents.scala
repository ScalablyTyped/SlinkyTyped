package typingsSlinky.jqueryElang

import typingsSlinky.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IELangDBEvents extends js.Object {
  var insert: JQueryDeferred[_] = js.native
  var modify: JQueryDeferred[_] = js.native
  var remove: JQueryDeferred[_] = js.native
  var select: JQueryDeferred[_] = js.native
}

object IELangDBEvents {
  @scala.inline
  def apply(
    insert: JQueryDeferred[_],
    modify: JQueryDeferred[_],
    remove: JQueryDeferred[_],
    select: JQueryDeferred[_]
  ): IELangDBEvents = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], modify = modify.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.asInstanceOf[IELangDBEvents]
  }
  @scala.inline
  implicit class IELangDBEventsOps[Self <: IELangDBEvents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInsert(value: JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModify(value: JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelect(value: JQueryDeferred[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

