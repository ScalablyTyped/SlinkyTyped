package typingsSlinky.pouchdbFind.PouchDB.Find

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selector
  extends CombinationOperators
     with /* field */ StringDictionary[Selector | js.Array[Selector] | ConditionOperators | js.Any] {
  var _id: js.UndefOr[ConditionOperators] = js.native
}

object Selector {
  @scala.inline
  def apply(): Selector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selector]
  }
  @scala.inline
  implicit class SelectorOps[Self <: Selector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: ConditionOperators): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
  }
  
}

