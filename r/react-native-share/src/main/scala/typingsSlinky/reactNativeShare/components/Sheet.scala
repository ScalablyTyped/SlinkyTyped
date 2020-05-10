package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeShare.sheetMod.SheetProps
import typingsSlinky.reactNativeShare.sheetMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sheet {
  @JSImport("react-native-share/Sheet", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SheetProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(visible: Boolean): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[SheetProps]))
  }
}

