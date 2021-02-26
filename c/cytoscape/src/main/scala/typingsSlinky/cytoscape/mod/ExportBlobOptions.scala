package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportBlobOptions extends ExportOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.native
}
object ExportBlobOptions {
  
  @scala.inline
  def apply(): ExportBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBlobOptions]
  }
  
  @scala.inline
  implicit class ExportBlobOptionsMutableBuilder[Self <: ExportBlobOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: blob): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
