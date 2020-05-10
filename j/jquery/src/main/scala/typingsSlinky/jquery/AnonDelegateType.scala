package typingsSlinky.jquery

import typingsSlinky.jquery.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelegateType
  extends _SpecialEventHook[js.Any, js.Any] {
  /**
    * When defined, these string properties specify that a special event should be handled like another event type until the event is delivered. The `bindType` is used if the event is attached directly, and the `delegateType` is used for delegated events. These types are generally DOM event types, and _should not_ be a special event themselves.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#bindtype-string-delegatetype-string }\`
    */
  var delegateType: String = js.native
}

object AnonDelegateType {
  @scala.inline
  def apply(delegateType: String): AnonDelegateType = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelegateType]
  }
  @scala.inline
  implicit class AnonDelegateTypeOps[Self <: AnonDelegateType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegateType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegateType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

