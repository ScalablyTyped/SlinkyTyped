package typingsSlinky.officeUiFabricReact.indexBundleMod

import typingsSlinky.fluentuiReactFocus.focusZoneTypesMod.IFocusZoneProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone")
@js.native
class FocusZone protected ()
  extends typingsSlinky.officeUiFabricReact.mod.FocusZone {
  def this(props: IFocusZoneProps) = this()
}
/* static members */
@JSImport("office-ui-fabric-react/lib/index.bundle", "FocusZone")
@js.native
object FocusZone extends js.Object {
  
  /**
    * Handle global tab presses so that we can patch tabindexes on the fly.
    * HEADS UP: This must not be an arrow function in order to be referentially equal among instances
    * for ref counting to work correctly!
    */
  var _onKeyDownCapture: js.Any = js.native
  
  var defaultProps: IFocusZoneProps = js.native
  
  /** Used for testing purposes only. */
  def getOuterZones(): Double = js.native
}
