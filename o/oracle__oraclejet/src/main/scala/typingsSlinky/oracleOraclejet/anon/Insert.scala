package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insert extends StObject {
  
  var insert: org.scalajs.dom.raw.Element | String = js.native
}
object Insert {
  
  @scala.inline
  def apply(insert: org.scalajs.dom.raw.Element | String): Insert = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insert]
  }
  
  @scala.inline
  implicit class InsertMutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: org.scalajs.dom.raw.Element | String): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertElement(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
