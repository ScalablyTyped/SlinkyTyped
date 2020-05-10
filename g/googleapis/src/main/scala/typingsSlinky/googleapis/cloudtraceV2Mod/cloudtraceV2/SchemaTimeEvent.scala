package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time-stamped annotation or message event in the Span.
  */
@js.native
trait SchemaTimeEvent extends js.Object {
  /**
    * Text annotation with a set of attributes.
    */
  var annotation: js.UndefOr[SchemaAnnotation] = js.native
  /**
    * An event describing a message sent/received between Spans.
    */
  var messageEvent: js.UndefOr[SchemaMessageEvent] = js.native
  /**
    * The timestamp indicating the time the event occurred.
    */
  var time: js.UndefOr[String] = js.native
}

object SchemaTimeEvent {
  @scala.inline
  def apply(): SchemaTimeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeEvent]
  }
  @scala.inline
  implicit class SchemaTimeEventOps[Self <: SchemaTimeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: SchemaAnnotation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageEvent(value: SchemaMessageEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

