package typingsSlinky.nextgenEvents.anon

import typingsSlinky.nextgenEvents.mod.AddListenerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Async extends AddListenerOptions {
  var async: js.Any = js.native
  var context: js.UndefOr[String] = js.native
  var eventObject: js.Any = js.native
  var fn: js.Any = js.native
  var id: js.UndefOr[js.Any] = js.native
  var nice: js.UndefOr[Double] = js.native
  var once: js.Any = js.native
}

object Async {
  @scala.inline
  def apply(async: js.Any, eventObject: js.Any, fn: js.Any, once: js.Any): Async = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], eventObject = eventObject.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any])
    __obj.asInstanceOf[Async]
  }
  @scala.inline
  implicit class AsyncOps[Self <: Async] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventObject(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFn(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnce(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("once")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withNice(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nice")(js.undefined)
        ret
    }
  }
  
}

