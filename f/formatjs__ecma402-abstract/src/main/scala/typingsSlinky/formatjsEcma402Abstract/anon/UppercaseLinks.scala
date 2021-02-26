package typingsSlinky.formatjsEcma402Abstract.anon

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UppercaseLinks extends StObject {
  
  var tzData: Record[String, _] = js.native
  
  var uppercaseLinks: Record[String, _] = js.native
}
object UppercaseLinks {
  
  @scala.inline
  def apply(tzData: Record[String, _], uppercaseLinks: Record[String, _]): UppercaseLinks = {
    val __obj = js.Dynamic.literal(tzData = tzData.asInstanceOf[js.Any], uppercaseLinks = uppercaseLinks.asInstanceOf[js.Any])
    __obj.asInstanceOf[UppercaseLinks]
  }
  
  @scala.inline
  implicit class UppercaseLinksMutableBuilder[Self <: UppercaseLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTzData(value: Record[String, _]): Self = StObject.set(x, "tzData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUppercaseLinks(value: Record[String, _]): Self = StObject.set(x, "uppercaseLinks", value.asInstanceOf[js.Any])
  }
}
