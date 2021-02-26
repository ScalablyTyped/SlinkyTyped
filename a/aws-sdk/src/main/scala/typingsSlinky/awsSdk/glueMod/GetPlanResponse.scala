package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPlanResponse extends StObject {
  
  /**
    * A Python script to perform the mapping.
    */
  var PythonScript: js.UndefOr[typingsSlinky.awsSdk.glueMod.PythonScript] = js.native
  
  /**
    * The Scala code to perform the mapping.
    */
  var ScalaCode: js.UndefOr[typingsSlinky.awsSdk.glueMod.ScalaCode] = js.native
}
object GetPlanResponse {
  
  @scala.inline
  def apply(): GetPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlanResponse]
  }
  
  @scala.inline
  implicit class GetPlanResponseMutableBuilder[Self <: GetPlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPythonScript(value: PythonScript): Self = StObject.set(x, "PythonScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPythonScriptUndefined: Self = StObject.set(x, "PythonScript", js.undefined)
    
    @scala.inline
    def setScalaCode(value: ScalaCode): Self = StObject.set(x, "ScalaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalaCodeUndefined: Self = StObject.set(x, "ScalaCode", js.undefined)
  }
}
