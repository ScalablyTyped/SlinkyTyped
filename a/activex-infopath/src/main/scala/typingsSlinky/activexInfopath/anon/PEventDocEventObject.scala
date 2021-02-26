package typingsSlinky.activexInfopath.anon

import typingsSlinky.activexInfopath.InfoPath.DocEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventDocEventObject extends StObject {
  
  val pEvent: DocEventObject = js.native
}
object PEventDocEventObject {
  
  @scala.inline
  def apply(pEvent: DocEventObject): PEventDocEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocEventObject]
  }
  
  @scala.inline
  implicit class PEventDocEventObjectMutableBuilder[Self <: PEventDocEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: DocEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
