package typingsSlinky.antDesignPro.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.avatarItemMod.SizeType
import typingsSlinky.antDesignPro.avatarListMod.AvatarListProps
import typingsSlinky.antDesignPro.avatarListMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AvatarList {
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def Item(value: ReactElement): this.type = set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def excessItemsStyle(value: CSSProperties): this.type = set("excessItemsStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: SizeType): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AvatarListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AvatarList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

