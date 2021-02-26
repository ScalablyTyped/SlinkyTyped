package typingsSlinky.jqueryTypeahead

import typingsSlinky.jqueryTypeahead.RunningCoder.Typeahead.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def typeahead(options: Options): JQuery = js.native
}
object JQuery {
  
  @scala.inline
  def apply(typeahead: Options => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(typeahead = js.Any.fromFunction1(typeahead))
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTypeahead(value: Options => JQuery): Self = StObject.set(x, "typeahead", js.Any.fromFunction1(value))
  }
}
