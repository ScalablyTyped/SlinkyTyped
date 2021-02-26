package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.base64
import typingsSlinky.cytoscape.cytoscapeStrings.base64uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportStringOptions extends ExportOptions {
  
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[base64uri | base64] = js.native
}
object ExportStringOptions {
  
  @scala.inline
  def apply(): ExportStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportStringOptions]
  }
  
  @scala.inline
  implicit class ExportStringOptionsMutableBuilder[Self <: ExportStringOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: base64uri | base64): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
  }
}
