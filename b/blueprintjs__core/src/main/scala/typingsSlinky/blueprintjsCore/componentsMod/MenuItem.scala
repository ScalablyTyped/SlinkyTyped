package typingsSlinky.blueprintjsCore.componentsMod

import org.scalajs.dom.raw.HTMLAnchorElement
import typingsSlinky.blueprintjsCore.menuItemMod.IMenuItemProps
import typingsSlinky.react.mod.AnchorHTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "MenuItem")
@js.native
class MenuItem protected ()
  extends typingsSlinky.blueprintjsCore.menuItemMod.MenuItem {
  def this(props: IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement]) = this()
  def this(props: IMenuItemProps with AnchorHTMLAttributes[HTMLAnchorElement], context: js.Any) = this()
}
/* static members */
object MenuItem {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem.defaultProps")
  @js.native
  def defaultProps: IMenuItemProps = js.native
  @scala.inline
  def defaultProps_=(x: IMenuItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "MenuItem.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
