package typingsSlinky.reactNativeShare.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeShare.sheetMod.SheetProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sheet {
  
  @scala.inline
  def apply(visible: Boolean): Default[tag.type, typingsSlinky.reactNativeShare.mod.Sheet] = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeShare.mod.Sheet](js.Array(this.component, __props.asInstanceOf[SheetProps]))
  }
  
  @JSImport("react-native-share", "Sheet")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: SheetProps): Default[tag.type, typingsSlinky.reactNativeShare.mod.Sheet] = new Default[tag.type, typingsSlinky.reactNativeShare.mod.Sheet](js.Array(this.component, p.asInstanceOf[js.Any]))
}
