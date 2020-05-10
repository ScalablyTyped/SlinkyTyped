package typingsSlinky.ngTable.ngTableSorterRowControllerMod

import typingsSlinky.angular.mod.IAngularEvent
import typingsSlinky.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAugmentedMouseEvent extends IAngularEvent {
  var ctrlKey: Boolean = js.native
  var metaKey: Boolean = js.native
}

object IAugmentedMouseEvent {
  @scala.inline
  def apply(
    ctrlKey: Boolean,
    currentScope: IScope,
    defaultPrevented: Boolean,
    metaKey: Boolean,
    name: String,
    preventDefault: () => Unit,
    targetScope: IScope
  ): IAugmentedMouseEvent = {
    val __obj = js.Dynamic.literal(ctrlKey = ctrlKey.asInstanceOf[js.Any], currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAugmentedMouseEvent]
  }
  @scala.inline
  implicit class IAugmentedMouseEventOps[Self <: IAugmentedMouseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCtrlKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrlKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetaKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

