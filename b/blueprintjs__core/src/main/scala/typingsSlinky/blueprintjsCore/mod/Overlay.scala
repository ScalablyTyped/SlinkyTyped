package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.anon.HasEverOpened
import typingsSlinky.blueprintjsCore.overlayMod.IOverlayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Overlay")
@js.native
class Overlay ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Overlay {
  def this(props: IOverlayProps) = this()
  def this(props: js.UndefOr[scala.Nothing], context: js.Any) = this()
  def this(props: IOverlayProps, context: js.Any) = this()
}
/* static members */
@JSImport("@blueprintjs/core", "Overlay")
@js.native
object Overlay extends js.Object {
  
  var defaultProps: IOverlayProps = js.native
  
  var displayName: String = js.native
  
  def getDerivedStateFromProps(hasIsOpen: IOverlayProps): HasEverOpened = js.native
  
  var getLastOpened: js.Any = js.native
  
  var openStack: js.Any = js.native
}
