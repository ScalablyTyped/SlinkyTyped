package typingsSlinky.reactHotkeys.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.KeyboardEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHotKeysProps extends HTMLAttributes[HotKeys] {
  /**
    * Whether the keyMap or handlers are permitted to change after the
    * component mounts. If false, changes to the keyMap and handlers
    * props will be ignored
    */
  var allowChanges: js.UndefOr[Boolean] = js.native
  /**
    * A map from action names to event handler functions
    */
  var handlers: js.UndefOr[StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]] = js.native
  /**
    * A map from action names to Mousetrap or Browser key sequences
    */
  var keyMap: js.UndefOr[KeyMap] = js.native
}

object GlobalHotKeysProps {
  @scala.inline
  def apply(): GlobalHotKeysProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalHotKeysProps]
  }
  @scala.inline
  implicit class GlobalHotKeysPropsOps[Self <: GlobalHotKeysProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withHandlers(value: StringDictionary[js.Function1[/* keyEvent */ js.UndefOr[KeyboardEvent], Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandlers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlers")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyMap(value: KeyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyMap")(js.undefined)
        ret
    }
  }
  
}

