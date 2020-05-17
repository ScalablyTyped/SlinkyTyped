package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.listItemNativeMod.BriefProps
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Brief {
  @JSImport("antd-mobile-rn/lib/list/ListItem.native", "Brief")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.listItemNativeMod.Brief] {
    @scala.inline
    def style(value: StyleProp[ViewStyle]): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def styleNull: this.type = set("style", null)
    @scala.inline
    def styles(value: typingsSlinky.antdMobileRn.anon.Brief): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def wrap(value: Boolean): this.type = set("wrap", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BriefProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Brief.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

