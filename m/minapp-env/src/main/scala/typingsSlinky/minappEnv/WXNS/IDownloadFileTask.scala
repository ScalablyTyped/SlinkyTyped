package typingsSlinky.minappEnv.WXNS

import typingsSlinky.minappEnv.AnyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDownloadFileTask extends StObject {
  
  def abort(args: js.Any*): js.Any = js.native
  @JSName("abort")
  var abort_Original: AnyFunction = js.native
  
  def onProgressUpdate(fn: js.Function1[/* event */ IProgressUpdateEvent, Unit]): Unit = js.native
}
