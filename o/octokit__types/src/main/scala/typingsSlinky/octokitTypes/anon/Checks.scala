package typingsSlinky.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checks extends StObject {
  
  var checks: String = js.native
  
  var contents: String = js.native
  
  var metadata: String = js.native
}
object Checks {
  
  @scala.inline
  def apply(checks: String, contents: String, metadata: String): Checks = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checks]
  }
  
  @scala.inline
  implicit class ChecksMutableBuilder[Self <: Checks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecks(value: String): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
