package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.N
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataOptions extends StObject {
  
  var frequencyMode: V | P | R | N = js.native
  
  var rows: Double = js.native
}
object GetDataOptions {
  
  @scala.inline
  def apply(frequencyMode: V | P | R | N, rows: Double): GetDataOptions = {
    val __obj = js.Dynamic.literal(frequencyMode = frequencyMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataOptions]
  }
  
  @scala.inline
  implicit class GetDataOptionsMutableBuilder[Self <: GetDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequencyMode(value: V | P | R | N): Self = StObject.set(x, "frequencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
  }
}
