package typingsSlinky.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  var modificationTime: js.Date = js.native
}
object Metadata {
  
  @scala.inline
  def apply(modificationTime: js.Date): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModificationTime(value: js.Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
  }
}
