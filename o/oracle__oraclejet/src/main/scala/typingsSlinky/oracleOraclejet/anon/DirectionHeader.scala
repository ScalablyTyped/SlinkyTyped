package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.ascending
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.descending
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionHeader
  extends /* key */ StringDictionary[js.Any] {
  
  var direction: ascending | descending = js.native
  
  var header: org.scalajs.dom.raw.Element = js.native
}
object DirectionHeader {
  
  @scala.inline
  def apply(direction: ascending | descending, header: org.scalajs.dom.raw.Element): DirectionHeader = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionHeader]
  }
  
  @scala.inline
  implicit class DirectionHeaderMutableBuilder[Self <: DirectionHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirection(value: ascending | descending): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
