package typingsSlinky.forestExpressSequelize.mod

import typingsSlinky.forestExpressSequelize.anon.Attributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StatSerialized extends StObject {
  
  var data: Attributes = js.native
}
object StatSerialized {
  
  @scala.inline
  def apply(data: Attributes): StatSerialized = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatSerialized]
  }
  
  @scala.inline
  implicit class StatSerializedMutableBuilder[Self <: StatSerialized] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Attributes): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
