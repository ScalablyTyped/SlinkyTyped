package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.anon.TypeofMenuDivider
import typingsSlinky.blueprintjsCore.anon.TypeofMenuItem
import typingsSlinky.blueprintjsCore.menuMod.IMenuProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Menu")
@js.native
class Menu protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Menu {
  def this(props: IMenuProps) = this()
  def this(props: IMenuProps, context: js.Any) = this()
}
/* static members */
object Menu {
  
  @JSImport("@blueprintjs/core", "Menu")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Menu.Divider")
  @js.native
  def Divider: TypeofMenuDivider = js.native
  @scala.inline
  def Divider_=(x: TypeofMenuDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Menu.Item")
  @js.native
  def Item: TypeofMenuItem = js.native
  @scala.inline
  def Item_=(x: TypeofMenuItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Menu.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
