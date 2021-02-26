package typingsSlinky.jointjs.anon

import typingsSlinky.jointjs.jointjsStrings.bbox
import typingsSlinky.jointjs.jointjsStrings.bottomLeft
import typingsSlinky.jointjs.jointjsStrings.bottomMiddle
import typingsSlinky.jointjs.jointjsStrings.center
import typingsSlinky.jointjs.jointjsStrings.corner
import typingsSlinky.jointjs.jointjsStrings.leftMiddle
import typingsSlinky.jointjs.jointjsStrings.origin
import typingsSlinky.jointjs.jointjsStrings.rightMiddle
import typingsSlinky.jointjs.jointjsStrings.topMiddle
import typingsSlinky.jointjs.jointjsStrings.topRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchBy extends StObject {
  
  var searchBy: js.UndefOr[
    bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
  ] = js.native
}
object SearchBy {
  
  @scala.inline
  def apply(): SearchBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBy]
  }
  
  @scala.inline
  implicit class SearchByMutableBuilder[Self <: SearchBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearchBy(
      value: bottomLeft | bottomMiddle | center | corner | leftMiddle | origin | rightMiddle | topMiddle | topRight | bbox
    ): Self = StObject.set(x, "searchBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchByUndefined: Self = StObject.set(x, "searchBy", js.undefined)
  }
}
