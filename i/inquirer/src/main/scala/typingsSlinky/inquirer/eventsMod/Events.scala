package typingsSlinky.inquirer.eventsMod

import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of events.
  */
@js.native
trait Events extends js.Object {
  /**
    * The event-flow of the `aKey`-event.
    */
  var aKey: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `iKey`-event.
    */
  var iKey: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `keypress`-event of the readline-object.
    */
  var keypress: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `line`-event of the readline-object.
    */
  var line: Observable_[String] = js.native
  /**
    * The event-flow of the `normalizedDownKey`-event.
    */
  var normalizedDownKey: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `normalizedUpKey`-event.
    */
  var normalizedUpKey: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `numberKey`-event.
    */
  var numberKey: Observable_[KeyDescriptor] = js.native
  /**
    * The event-flow of the `spaceKey`-event.
    */
  var spaceKey: Observable_[KeyDescriptor] = js.native
}

object Events {
  @scala.inline
  def apply(
    aKey: Observable_[KeyDescriptor],
    iKey: Observable_[KeyDescriptor],
    keypress: Observable_[KeyDescriptor],
    line: Observable_[String],
    normalizedDownKey: Observable_[KeyDescriptor],
    normalizedUpKey: Observable_[KeyDescriptor],
    numberKey: Observable_[KeyDescriptor],
    spaceKey: Observable_[KeyDescriptor]
  ): Events = {
    val __obj = js.Dynamic.literal(aKey = aKey.asInstanceOf[js.Any], iKey = iKey.asInstanceOf[js.Any], keypress = keypress.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], normalizedDownKey = normalizedDownKey.asInstanceOf[js.Any], normalizedUpKey = normalizedUpKey.asInstanceOf[js.Any], numberKey = numberKey.asInstanceOf[js.Any], spaceKey = spaceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  @scala.inline
  implicit class EventsOps[Self <: Events] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeypress(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keypress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Observable_[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedDownKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedDownKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNormalizedUpKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizedUpKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceKey(value: Observable_[KeyDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

