package typingsSlinky.moment.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EraSpec extends StObject {
  
  var abbr: String = js.native
  
  var name: String = js.native
  
  var narrow: String = js.native
  
  var offset: Double = js.native
  
  var since: String | Double = js.native
  
  var until: String | Double = js.native
}
object EraSpec {
  
  @scala.inline
  def apply(
    abbr: String,
    name: String,
    narrow: String,
    offset: Double,
    since: String | Double,
    until: String | Double
  ): EraSpec = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[EraSpec]
  }
  
  @scala.inline
  implicit class EraSpecMutableBuilder[Self <: EraSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSince(value: String | Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUntil(value: String | Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
  }
}
