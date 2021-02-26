package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTestFailure extends StObject {
  
  var actualService: js.UndefOr[String] = js.native
  
  var expectedService: js.UndefOr[String] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var path: js.UndefOr[String] = js.native
}
object SchemaTestFailure {
  
  @scala.inline
  def apply(): SchemaTestFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestFailure]
  }
  
  @scala.inline
  implicit class SchemaTestFailureMutableBuilder[Self <: SchemaTestFailure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualService(value: String): Self = StObject.set(x, "actualService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualServiceUndefined: Self = StObject.set(x, "actualService", js.undefined)
    
    @scala.inline
    def setExpectedService(value: String): Self = StObject.set(x, "expectedService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedServiceUndefined: Self = StObject.set(x, "expectedService", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
