package typingsSlinky.atom.anon

import typingsSlinky.atom.atomStrings.backward
import typingsSlinky.atom.atomStrings.closest
import typingsSlinky.atom.atomStrings.forward
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
trait ClipDirectionInvalidate extends StObject {
  
  var clipDirection: js.UndefOr[backward | forward | closest] = js.native
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
}
object ClipDirectionInvalidate {
  
  @scala.inline
  def apply(): ClipDirectionInvalidate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipDirectionInvalidate]
  }
  
  @scala.inline
  implicit class ClipDirectionInvalidateMutableBuilder[Self <: ClipDirectionInvalidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
    
    @scala.inline
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
  }
}
