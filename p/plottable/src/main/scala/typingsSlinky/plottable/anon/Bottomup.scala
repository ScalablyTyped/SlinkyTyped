package typingsSlinky.plottable.anon

import typingsSlinky.plottable.plottableStrings.bottomup
import typingsSlinky.plottable.plottableStrings.topdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottomup extends StObject {
  
  var bottomup: typingsSlinky.plottable.plottableStrings.bottomup = js.native
  
  var topdown: typingsSlinky.plottable.plottableStrings.topdown = js.native
}
object Bottomup {
  
  @scala.inline
  def apply(bottomup: bottomup, topdown: topdown): Bottomup = {
    val __obj = js.Dynamic.literal(bottomup = bottomup.asInstanceOf[js.Any], topdown = topdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottomup]
  }
  
  @scala.inline
  implicit class BottomupMutableBuilder[Self <: Bottomup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomup(value: bottomup): Self = StObject.set(x, "bottomup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopdown(value: topdown): Self = StObject.set(x, "topdown", value.asInstanceOf[js.Any])
  }
}
