package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disable
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Row extends StObject {
  
  var row: enable | disable = js.native
}
object Row {
  
  @scala.inline
  def apply(row: enable | disable): Row = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit class RowMutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRow(value: enable | disable): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
