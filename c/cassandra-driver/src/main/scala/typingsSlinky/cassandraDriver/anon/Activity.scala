package typingsSlinky.cassandraDriver.anon

import typingsSlinky.cassandraDriver.typesMod.types.Uuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activity extends js.Object {
  var activity: js.Any = js.native
  var elapsed: js.Any = js.native
  var id: Uuid = js.native
  var source: js.Any = js.native
  var thread: js.Any = js.native
}

object Activity {
  @scala.inline
  def apply(activity: js.Any, elapsed: js.Any, id: Uuid, source: js.Any, thread: js.Any): Activity = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], elapsed = elapsed.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], thread = thread.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
  @scala.inline
  implicit class ActivityOps[Self <: Activity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElapsed(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Uuid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThread(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

