package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.EventSyntheticEvent
import typingsSlinky.gestalt.gestaltNumbers.`0`
import typingsSlinky.gestalt.gestaltNumbers.`1`
import typingsSlinky.gestalt.gestaltNumbers.`2`
import typingsSlinky.gestalt.gestaltNumbers.`3`
import typingsSlinky.gestalt.gestaltNumbers.`4`
import typingsSlinky.gestalt.gestaltNumbers.`5`
import typingsSlinky.gestalt.gestaltNumbers.`6`
import typingsSlinky.gestalt.gestaltNumbers.`7`
import typingsSlinky.gestalt.gestaltNumbers.`8`
import typingsSlinky.gestalt.gestaltStrings.circle
import typingsSlinky.gestalt.gestaltStrings.copy
import typingsSlinky.gestalt.gestaltStrings.grab
import typingsSlinky.gestalt.gestaltStrings.grabbing
import typingsSlinky.gestalt.gestaltStrings.move
import typingsSlinky.gestalt.gestaltStrings.noDrop
import typingsSlinky.gestalt.gestaltStrings.pill
import typingsSlinky.gestalt.gestaltStrings.pointer
import typingsSlinky.gestalt.gestaltStrings.zoomIn
import typingsSlinky.gestalt.gestaltStrings.zoomOut
import typingsSlinky.gestalt.mod.TouchableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Touchable {
  @JSImport("gestalt", "Touchable")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.Touchable] {
    @scala.inline
    def fullHeight(value: Boolean): this.type = set("fullHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def mouseCursor(value: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut): this.type = set("mouseCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def onMouseEnter(value: /* args */ EventSyntheticEvent => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: /* args */ EventSyntheticEvent => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def rounding(value: pill | circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): this.type = set("rounding", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TouchableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onTouch: typingsSlinky.gestalt.anon.`3` => Unit): Builder = {
    val __props = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    new Builder(js.Array(this.component, __props.asInstanceOf[TouchableProps]))
  }
}

