package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A report of an event in a worker&#39;s lifecycle. The proto contains one
  * event, because the worker is expected to asynchronously send each message
  * immediately after the event. Due to this asynchrony, messages may arrive
  * out of order (or missing), and it is up to the consumer to interpret. The
  * timestamp of the event is in the enclosing WorkerMessage proto.
  */
@js.native
trait SchemaWorkerLifecycleEvent extends js.Object {
  /**
    * The start time of this container. All events will report this so that
    * events can be grouped together across container/VM restarts.
    */
  var containerStartTime: js.UndefOr[String] = js.native
  /**
    * The event being reported.
    */
  var event: js.UndefOr[String] = js.native
  /**
    * Other stats that can accompany an event. E.g. {
    * &quot;downloaded_bytes&quot; : &quot;123456&quot; }
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaWorkerLifecycleEvent {
  @scala.inline
  def apply(): SchemaWorkerLifecycleEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerLifecycleEvent]
  }
  @scala.inline
  implicit class SchemaWorkerLifecycleEventOps[Self <: SchemaWorkerLifecycleEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
  }
  
}

