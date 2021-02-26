package typingsSlinky.consola.mod

import typingsSlinky.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONReporterOptions extends StObject {
  
  var stream: js.UndefOr[WritableStream] = js.native
}
object JSONReporterOptions {
  
  @scala.inline
  def apply(): JSONReporterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONReporterOptions]
  }
  
  @scala.inline
  implicit class JSONReporterOptionsMutableBuilder[Self <: JSONReporterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
