package typingsSlinky.mendixmodelsdk.anon

import typingsSlinky.mendixmodelsdk.commonMod.common.IErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleError extends js.Object {
  
  def handleError(message: String): Unit = js.native
  def handleError(message: String, errorCallback: IErrorCallback): Unit = js.native
}
