package typingsSlinky.cathoQuantum.anon

import typingsSlinky.cathoQuantum.cathoQuantumStrings.CardDotTitle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var displayName: CardDotTitle = js.native
}
object `10` {
  
  @scala.inline
  def apply(displayName: CardDotTitle): `10` = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: CardDotTitle): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
  }
}
