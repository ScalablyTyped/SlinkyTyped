package typingsSlinky.grommet.anon

import typingsSlinky.grommet.utilsMod.ColorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Heading extends StObject {
  
  var color: js.UndefOr[ColorType] = js.native
  
  // deprecated
  var heading: js.UndefOr[`3`] = js.native
}
object Heading {
  
  @scala.inline
  def apply(): Heading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Heading]
  }
  
  @scala.inline
  implicit class HeadingMutableBuilder[Self <: Heading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHeading(value: `3`): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
