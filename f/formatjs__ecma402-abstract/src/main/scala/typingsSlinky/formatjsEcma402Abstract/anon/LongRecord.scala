package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.displaynamesMod.CurrencyCode
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRecord extends StObject {
  
  var long: Record[CurrencyCode, String] = js.native
  
  var narrow: Record[CurrencyCode, String] = js.native
  
  var short: Record[CurrencyCode, String] = js.native
}
object LongRecord {
  
  @scala.inline
  def apply(
    long: Record[CurrencyCode, String],
    narrow: Record[CurrencyCode, String],
    short: Record[CurrencyCode, String]
  ): LongRecord = {
    val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongRecord]
  }
  
  @scala.inline
  implicit class LongRecordMutableBuilder[Self <: LongRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLong(value: Record[CurrencyCode, String]): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: Record[CurrencyCode, String]): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: Record[CurrencyCode, String]): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
