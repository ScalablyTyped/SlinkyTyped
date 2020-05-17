package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityAction extends IEnum {
  var AcceptChanges: EntityActionSymbol = js.native
  var Attach: EntityActionSymbol = js.native
  var AttachOnImport: EntityActionSymbol = js.native
  var AttachOnQuery: EntityActionSymbol = js.native
  var Clear: EntityActionSymbol = js.native
  var Detach: EntityActionSymbol = js.native
  var EntityStateChange: EntityActionSymbol = js.native
  var MergeOnImport: EntityActionSymbol = js.native
  var MergeOnQuery: EntityActionSymbol = js.native
  var MergeOnSave: EntityActionSymbol = js.native
  var PropertyChange: EntityActionSymbol = js.native
  var RejectChanges: EntityActionSymbol = js.native
}

object EntityAction {
  @scala.inline
  def apply(
    AcceptChanges: EntityActionSymbol,
    Attach: EntityActionSymbol,
    AttachOnImport: EntityActionSymbol,
    AttachOnQuery: EntityActionSymbol,
    Clear: EntityActionSymbol,
    Detach: EntityActionSymbol,
    EntityStateChange: EntityActionSymbol,
    MergeOnImport: EntityActionSymbol,
    MergeOnQuery: EntityActionSymbol,
    MergeOnSave: EntityActionSymbol,
    PropertyChange: EntityActionSymbol,
    RejectChanges: EntityActionSymbol,
    contains: js.Any => Boolean,
    fromName: String => EnumSymbol,
    getNames: () => js.Array[String],
    getSymbols: () => js.Array[EnumSymbol]
  ): EntityAction = {
    val __obj = js.Dynamic.literal(AcceptChanges = AcceptChanges.asInstanceOf[js.Any], Attach = Attach.asInstanceOf[js.Any], AttachOnImport = AttachOnImport.asInstanceOf[js.Any], AttachOnQuery = AttachOnQuery.asInstanceOf[js.Any], Clear = Clear.asInstanceOf[js.Any], Detach = Detach.asInstanceOf[js.Any], EntityStateChange = EntityStateChange.asInstanceOf[js.Any], MergeOnImport = MergeOnImport.asInstanceOf[js.Any], MergeOnQuery = MergeOnQuery.asInstanceOf[js.Any], MergeOnSave = MergeOnSave.asInstanceOf[js.Any], PropertyChange = PropertyChange.asInstanceOf[js.Any], RejectChanges = RejectChanges.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), fromName = js.Any.fromFunction1(fromName), getNames = js.Any.fromFunction0(getNames), getSymbols = js.Any.fromFunction0(getSymbols))
    __obj.asInstanceOf[EntityAction]
  }
  @scala.inline
  implicit class EntityActionOps[Self <: EntityAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptChanges(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AcceptChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttach(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachOnImport(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachOnImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachOnQuery(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachOnQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetach(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityStateChange(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityStateChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOnImport(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeOnImport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOnQuery(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeOnQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeOnSave(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeOnSave")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyChange(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRejectChanges(value: EntityActionSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RejectChanges")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

