package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgLoading
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  var cssClass: js.UndefOr[js.Any] = js.native
  
  var includeVerticalOffset: js.UndefOr[Boolean] = js.native
}
object IgLoading {
  
  @scala.inline
  def apply(): IgLoading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLoading]
  }
  
  @scala.inline
  implicit class IgLoadingMutableBuilder[Self <: IgLoading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCssClass(value: js.Any): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    @scala.inline
    def setIncludeVerticalOffset(value: Boolean): Self = StObject.set(x, "includeVerticalOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeVerticalOffsetUndefined: Self = StObject.set(x, "includeVerticalOffset", js.undefined)
  }
}
