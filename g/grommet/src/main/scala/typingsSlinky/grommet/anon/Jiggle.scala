package typingsSlinky.grommet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jiggle extends StObject {
  
  var duration: js.UndefOr[String] = js.native
  
  var jiggle: js.UndefOr[Duration] = js.native
}
object Jiggle {
  
  @scala.inline
  def apply(): Jiggle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jiggle]
  }
  
  @scala.inline
  implicit class JiggleMutableBuilder[Self <: Jiggle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setJiggle(value: Duration): Self = StObject.set(x, "jiggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJiggleUndefined: Self = StObject.set(x, "jiggle", js.undefined)
  }
}
