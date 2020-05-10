package typingsSlinky.reactFa.components

import typingsSlinky.reactFa.mod.IconCls
import typingsSlinky.reactFa.mod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Icon {
  @JSImport("react-fa", "Icon")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1331641792[IconCls] = new SharedBuilder_IconProps1331641792[IconCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1331641792[IconCls] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1331641792[IconCls](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}

