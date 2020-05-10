package typingsSlinky.arangodb.queuesMod

import typingsSlinky.arangodb.Foxx.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueItem extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ Double, Double]) | Double] = js.native
  var maxFailures: js.UndefOr[Double] = js.native
  var mount: String = js.native
  var name: String = js.native
  var preprocess: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  var schema: js.UndefOr[Schema] = js.native
}

object QueueItem {
  @scala.inline
  def apply(mount: String, name: String): QueueItem = {
    val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueItem]
  }
  @scala.inline
  implicit class QueueItemOps[Self <: QueueItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackOffFunction1(value: /* failureCount */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackOff(value: (js.Function1[/* failureCount */ Double, Double]) | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackOff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOff")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFailures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFailures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFailures")(js.undefined)
        ret
    }
    @scala.inline
    def withPreprocess(value: /* data */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreprocess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preprocess")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: Schema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

