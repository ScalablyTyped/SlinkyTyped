package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewabilityConfigCallbackPair extends js.Object {
  var onViewableItemsChanged: (js.Function1[/* info */ Changed, Unit]) | Null = js.native
  var viewabilityConfig: ViewabilityConfig = js.native
}

object ViewabilityConfigCallbackPair {
  @scala.inline
  def apply(viewabilityConfig: ViewabilityConfig): ViewabilityConfigCallbackPair = {
    val __obj = js.Dynamic.literal(viewabilityConfig = viewabilityConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewabilityConfigCallbackPair]
  }
  @scala.inline
  implicit class ViewabilityConfigCallbackPairOps[Self <: ViewabilityConfigCallbackPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withViewabilityConfig(value: ViewabilityConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewabilityConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnViewableItemsChanged(value: /* info */ Changed => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewableItemsChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnViewableItemsChangedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewableItemsChanged")(null)
        ret
    }
  }
  
}

