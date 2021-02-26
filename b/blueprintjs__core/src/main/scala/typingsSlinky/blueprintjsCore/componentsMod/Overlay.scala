package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.HasEverOpened
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
@js.native
class Overlay protected ()
  extends typingsSlinky.blueprintjsCore.overlayMod.Overlay {
  def this(props: IOverlayProps) = this()
  def this(props: IOverlayProps, context: js.Any) = this()
}
/* static members */
object Overlay {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay.defaultProps")
  @js.native
  def defaultProps: IOverlayProps = js.native
  @scala.inline
  def defaultProps_=(x: IOverlayProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(hasIsOpen: IOverlayProps): HasEverOpened | Null = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay.getLastOpened")
  @js.native
  def getLastOpened: js.Any = js.native
  @scala.inline
  def getLastOpened_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getLastOpened")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Overlay.openStack")
  @js.native
  def openStack: js.Any = js.native
  @scala.inline
  def openStack_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openStack")(x.asInstanceOf[js.Any])
}
