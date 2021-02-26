package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.centerBottom
import typingsSlinky.devextreme.devextremeStrings.centerTop
import typingsSlinky.devextreme.devextremeStrings.full
import typingsSlinky.devextreme.devextremeStrings.leftBottom
import typingsSlinky.devextreme.devextremeStrings.leftCenter
import typingsSlinky.devextreme.devextremeStrings.leftTop
import typingsSlinky.devextreme.devextremeStrings.rightBottom
import typingsSlinky.devextreme.devextremeStrings.rightCenter
import typingsSlinky.devextreme.devextremeStrings.rightTop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationUrl extends StObject {
  
  var location: js.UndefOr[
    center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
  ] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object LocationUrl {
  
  @scala.inline
  def apply(): LocationUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationUrl]
  }
  
  @scala.inline
  implicit class LocationUrlMutableBuilder[Self <: LocationUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(
      value: center | centerBottom | centerTop | full | leftBottom | leftCenter | leftTop | rightBottom | rightCenter | rightTop
    ): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
