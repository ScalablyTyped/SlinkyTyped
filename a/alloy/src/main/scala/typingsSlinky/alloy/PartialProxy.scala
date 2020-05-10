package typingsSlinky.alloy

import typingsSlinky.titanium.Titanium.Event
import typingsSlinky.titanium.Titanium.UI.TabGroup
import typingsSlinky.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<titanium.Titanium.Proxy> */
@js.native
trait PartialProxy extends js.Object {
  var addEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.native
  var apiName: js.UndefOr[String] = js.native
  var applyProperties: js.UndefOr[js.Function1[/* props */ js.Any, Unit]] = js.native
  var bubbleParent: js.UndefOr[Boolean] = js.native
  var fireEvent: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var getApiName: js.UndefOr[js.Function0[String]] = js.native
  var getBubbleParent: js.UndefOr[js.Function0[Boolean]] = js.native
  var getLifecycleContainer: js.UndefOr[js.Function0[Window | TabGroup]] = js.native
  var id: js.UndefOr[String | Double] = js.native
  var lifecycleContainer: js.UndefOr[Window | TabGroup] = js.native
  var removeEventListener: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit], Unit]
  ] = js.native
  var setBubbleParent: js.UndefOr[js.Function1[/* bubbleParent */ Boolean, Unit]] = js.native
  var setLifecycleContainer: js.UndefOr[js.Function1[/* lifecycleContainer */ Window | TabGroup, Unit]] = js.native
}

object PartialProxy {
  @scala.inline
  def apply(): PartialProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialProxy]
  }
  @scala.inline
  implicit class PartialProxyOps[Self <: PartialProxy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withApiName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiName")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyProperties(value: /* props */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutApplyProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withBubbleParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBubbleParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bubbleParent")(js.undefined)
        ret
    }
    @scala.inline
    def withFireEvent(value: /* name */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFireEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fireEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetApiName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApiName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetApiName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getApiName")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBubbleParent(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleParent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBubbleParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBubbleParent")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLifecycleContainer(value: () => Window | TabGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLifecycleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLifecycleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String | Double): Self = {
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
    def withLifecycleContainer(value: Window | TabGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycleContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveEventListener(value: (/* name */ String, /* callback */ js.Function1[/* param0 */ Event, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withSetBubbleParent(value: /* bubbleParent */ Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleParent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetBubbleParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBubbleParent")(js.undefined)
        ret
    }
    @scala.inline
    def withSetLifecycleContainer(value: /* lifecycleContainer */ Window | TabGroup => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLifecycleContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetLifecycleContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setLifecycleContainer")(js.undefined)
        ret
    }
  }
  
}

