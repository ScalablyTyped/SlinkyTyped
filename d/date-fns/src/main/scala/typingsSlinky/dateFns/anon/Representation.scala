package typingsSlinky.dateFns.anon

import typingsSlinky.dateFns.dateFnsStrings.basic
import typingsSlinky.dateFns.dateFnsStrings.complete
import typingsSlinky.dateFns.dateFnsStrings.date
import typingsSlinky.dateFns.dateFnsStrings.extended
import typingsSlinky.dateFns.dateFnsStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Representation extends StObject {
  
  var format: js.UndefOr[extended | basic] = js.native
  
  var representation: js.UndefOr[complete | date | time] = js.native
}
object Representation {
  
  @scala.inline
  def apply(): Representation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Representation]
  }
  
  @scala.inline
  implicit class RepresentationMutableBuilder[Self <: Representation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: extended | basic): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setRepresentation(value: complete | date | time): Self = StObject.set(x, "representation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresentationUndefined: Self = StObject.set(x, "representation", js.undefined)
  }
}
