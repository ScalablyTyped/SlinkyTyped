package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.TypeofNavbarDivider
import typingsSlinky.blueprintjsCore.anon.TypeofNavbarGroup
import typingsSlinky.blueprintjsCore.anon.TypeofNavbarHeading
import typingsSlinky.blueprintjsCore.navbarMod.INavbarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Navbar")
@js.native
class Navbar protected ()
  extends typingsSlinky.blueprintjsCore.navbarMod.Navbar {
  def this(props: INavbarProps) = this()
  def this(props: INavbarProps, context: js.Any) = this()
}
/* static members */
object Navbar {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Navbar")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Navbar.Divider")
  @js.native
  def Divider: TypeofNavbarDivider = js.native
  @scala.inline
  def Divider_=(x: TypeofNavbarDivider): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Divider")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Navbar.Group")
  @js.native
  def Group: TypeofNavbarGroup = js.native
  @scala.inline
  def Group_=(x: TypeofNavbarGroup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Navbar.Heading")
  @js.native
  def Heading: TypeofNavbarHeading = js.native
  @scala.inline
  def Heading_=(x: TypeofNavbarHeading): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Heading")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Navbar.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
