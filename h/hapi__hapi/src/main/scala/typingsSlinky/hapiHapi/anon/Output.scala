package typingsSlinky.hapiHapi.anon

import typingsSlinky.hapiHapi.hapiHapiStrings.annotated
import typingsSlinky.hapiHapi.mod.PayloadOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Output extends StObject {
  
  var output: PayloadOutput | annotated = js.native
}
object Output {
  
  @scala.inline
  def apply(output: PayloadOutput | annotated): Output = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutput(value: PayloadOutput | annotated): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
