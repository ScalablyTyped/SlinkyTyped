package typingsSlinky.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/space.SpaceProps, 'sys'> */
@js.native
trait OmitSpacePropssys extends StObject {
  
  var name: String = js.native
}
object OmitSpacePropssys {
  
  @scala.inline
  def apply(name: String): OmitSpacePropssys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitSpacePropssys]
  }
  
  @scala.inline
  implicit class OmitSpacePropssysMutableBuilder[Self <: OmitSpacePropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
