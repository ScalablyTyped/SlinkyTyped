package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormat
import typingsSlinky.formatjsEcma402Abstract.relativeTimeMod.RelativeTimeFormatInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  def getInternalSlots(rtf: RelativeTimeFormat): RelativeTimeFormatInternal = js.native
}
object `2` {
  
  @scala.inline
  def apply(getInternalSlots: RelativeTimeFormat => RelativeTimeFormatInternal): `2` = {
    val __obj = js.Dynamic.literal(getInternalSlots = js.Any.fromFunction1(getInternalSlots))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetInternalSlots(value: RelativeTimeFormat => RelativeTimeFormatInternal): Self = StObject.set(x, "getInternalSlots", js.Any.fromFunction1(value))
  }
}
