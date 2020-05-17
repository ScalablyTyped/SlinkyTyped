package typingsSlinky.reactNativeGestureHandler.mod

import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactNativeGestureHandler.anon.Bottom
import typingsSlinky.reactNativeGestureHandler.anon.BottomHeight
import typingsSlinky.reactNativeGestureHandler.anon.Height
import typingsSlinky.reactNativeGestureHandler.anon.Left
import typingsSlinky.reactNativeGestureHandler.anon.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureHandlerProperties extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.native
  var id: js.UndefOr[String] = js.native
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.native
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.native
}

object GestureHandlerProperties {
  @scala.inline
  def apply(): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GestureHandlerProperties]
  }
  @scala.inline
  implicit class GestureHandlerPropertiesOps[Self <: GestureHandlerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHitSlop(value: Double | Bottom | Left | Right | Height | BottomHeight): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHitSlop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hitSlop")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
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
    def withShouldCancelWhenOutside(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelWhenOutside")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCancelWhenOutside: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCancelWhenOutside")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousHandlersRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimultaneousHandlersFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSimultaneousHandlers(value: Ref[_] | js.Array[Ref[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimultaneousHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(js.undefined)
        ret
    }
    @scala.inline
    def withSimultaneousHandlersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simultaneousHandlers")(null)
        ret
    }
    @scala.inline
    def withWaitForRefObject(value: ReactRef[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWaitForFunction1(value: /* instance */ _ | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWaitFor(value: Ref[_] | js.Array[Ref[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitFor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitForNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitFor")(null)
        ret
    }
  }
  
}

