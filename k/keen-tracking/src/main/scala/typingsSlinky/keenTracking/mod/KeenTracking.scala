package typingsSlinky.keenTracking.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.keenTracking.anon.Created
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeenTracking extends js.Object {
  def recordEvent(collectionName: String, event: js.Object): js.Promise[Created] = js.native
  def recordEvents(events: StringDictionary[js.Array[js.Object]]): js.Promise[StringDictionary[js.Array[Boolean]]] = js.native
}

object KeenTracking {
  @scala.inline
  def apply(
    recordEvent: (String, js.Object) => js.Promise[Created],
    recordEvents: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]
  ): KeenTracking = {
    val __obj = js.Dynamic.literal(recordEvent = js.Any.fromFunction2(recordEvent), recordEvents = js.Any.fromFunction1(recordEvents))
    __obj.asInstanceOf[KeenTracking]
  }
  @scala.inline
  implicit class KeenTrackingOps[Self <: KeenTracking] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecordEvent(value: (String, js.Object) => js.Promise[Created]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordEvent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRecordEvents(value: StringDictionary[js.Array[js.Object]] => js.Promise[StringDictionary[js.Array[Boolean]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordEvents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

