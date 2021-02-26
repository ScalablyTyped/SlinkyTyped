package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.displaynamesMod.ScriptCode
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongNarrowShort extends StObject {
  
  var long: Record[ScriptCode, String] = js.native
  
  var narrow: Record[ScriptCode, String] = js.native
  
  var short: Record[ScriptCode, String] = js.native
}
object LongNarrowShort {
  
  @scala.inline
  def apply(
    long: Record[ScriptCode, String],
    narrow: Record[ScriptCode, String],
    short: Record[ScriptCode, String]
  ): LongNarrowShort = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongNarrowShort]
  }
  
  @scala.inline
  implicit class LongNarrowShortMutableBuilder[Self <: LongNarrowShort] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: Record[ScriptCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[ScriptCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[ScriptCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
