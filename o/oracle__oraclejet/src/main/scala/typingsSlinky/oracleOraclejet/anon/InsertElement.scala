package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertElement extends StObject {
  
  var insert: org.scalajs.dom.raw.Element = js.native
}
object InsertElement {
  
  @scala.inline
  def apply(insert: org.scalajs.dom.raw.Element): InsertElement = {
    val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertElement]
  }
  
  @scala.inline
  implicit class InsertElementMutableBuilder[Self <: InsertElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsert(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
  }
}
