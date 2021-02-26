package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.inside
import typingsSlinky.atom.atomStrings.never
import typingsSlinky.atom.atomStrings.overlap
import typingsSlinky.atom.atomStrings.surround
import typingsSlinky.atom.atomStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExclusiveInvalidate extends StObject {
  
  var exclusive: js.UndefOr[Boolean] = js.native
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
}
object ExclusiveInvalidate {
  
  @scala.inline
  def apply(): ExclusiveInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusiveInvalidate]
  }
  
  @scala.inline
  implicit class ExclusiveInvalidateMutableBuilder[Self <: ExclusiveInvalidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
  }
}
