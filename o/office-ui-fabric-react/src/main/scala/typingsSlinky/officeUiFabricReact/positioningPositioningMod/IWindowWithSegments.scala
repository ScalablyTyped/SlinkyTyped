package typingsSlinky.officeUiFabricReact.positioningPositioningMod

import typingsSlinky.std.DOMRect
import typingsSlinky.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Window with typings for experimental features regarding Dual Screen devices.
  */
@js.native
trait IWindowWithSegments extends Window {
  
  var getWindowSegments: js.UndefOr[js.Function0[js.Array[DOMRect]]] = js.native
}
