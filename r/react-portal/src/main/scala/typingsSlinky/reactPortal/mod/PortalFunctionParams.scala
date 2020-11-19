package typingsSlinky.reactPortal.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalFunctionParams extends js.Object {
  
  def closePortal(): Unit = js.native
  
  var isOpen: Boolean = js.native
  
  def openPortal(): Unit = js.native
  def openPortal(event: js.Any): Unit = js.native
  
  def portal(children: ReactElement): ReactElement = js.native
}
