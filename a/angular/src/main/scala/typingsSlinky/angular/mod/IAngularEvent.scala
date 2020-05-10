package typingsSlinky.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAngularEvent extends js.Object {
  /**
    * the scope that is currently handling the event. Once the event propagates through the scope hierarchy, this property is set to null.
    */
  var currentScope: IScope = js.native
  /**
    * true if preventDefault was called.
    */
  var defaultPrevented: Boolean = js.native
  /**
    * name of the event.
    */
  var name: String = js.native
  /**
    * calling stopPropagation function will cancel further event propagation (available only for events that were $emit-ed).
    */
  var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * the scope on which the event was $emit-ed or $broadcast-ed.
    */
  var targetScope: IScope = js.native
  /**
    * calling preventDefault sets defaultPrevented flag to true.
    */
  def preventDefault(): Unit = js.native
}

object IAngularEvent {
  @scala.inline
  def apply(
    currentScope: IScope,
    defaultPrevented: Boolean,
    name: String,
    preventDefault: () => Unit,
    targetScope: IScope
  ): IAngularEvent = {
    val __obj = js.Dynamic.literal(currentScope = currentScope.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), targetScope = targetScope.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAngularEvent]
  }
  @scala.inline
  implicit class IAngularEventOps[Self <: IAngularEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentScope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultPrevented(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultPrevented")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTargetScope(value: IScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
  }
  
}

