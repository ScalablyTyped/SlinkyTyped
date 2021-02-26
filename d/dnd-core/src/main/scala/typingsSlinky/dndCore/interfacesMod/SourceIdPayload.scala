package typingsSlinky.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceIdPayload extends StObject {
  
  var sourceId: Identifier = js.native
}
object SourceIdPayload {
  
  @scala.inline
  def apply(sourceId: Identifier): SourceIdPayload = {
    val __obj = js.Dynamic.literal(sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIdPayload]
  }
  
  @scala.inline
  implicit class SourceIdPayloadMutableBuilder[Self <: SourceIdPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceId(value: Identifier): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
