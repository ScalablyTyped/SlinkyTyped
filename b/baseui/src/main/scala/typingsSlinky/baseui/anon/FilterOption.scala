package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.any
import typingsSlinky.baseui.baseuiStrings.label
import typingsSlinky.baseui.baseuiStrings.start
import typingsSlinky.baseui.baseuiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterOption extends StObject {
  
  var filterOption: js.UndefOr[
    js.Function2[
      /* option */ typingsSlinky.baseui.selectMod.Option, 
      /* filterValue */ String, 
      Boolean
    ]
  ] = js.native
  
  var ignoreCase: js.UndefOr[Boolean] = js.native
  
  var labelKey: js.UndefOr[String] = js.native
  
  var matchPos: js.UndefOr[any | start] = js.native
  
  var matchProp: js.UndefOr[any | label | value] = js.native
  
  var trimFilter: js.UndefOr[Boolean] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
}
object FilterOption {
  
  @scala.inline
  def apply(): FilterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOption]
  }
  
  @scala.inline
  implicit class FilterOptionMutableBuilder[Self <: FilterOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterOption(value: (/* option */ typingsSlinky.baseui.selectMod.Option, /* filterValue */ String) => Boolean): Self = StObject.set(x, "filterOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFilterOptionUndefined: Self = StObject.set(x, "filterOption", js.undefined)
    
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
    
    @scala.inline
    def setLabelKey(value: String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelKeyUndefined: Self = StObject.set(x, "labelKey", js.undefined)
    
    @scala.inline
    def setMatchPos(value: any | start): Self = StObject.set(x, "matchPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPosUndefined: Self = StObject.set(x, "matchPos", js.undefined)
    
    @scala.inline
    def setMatchProp(value: any | label | value): Self = StObject.set(x, "matchProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchPropUndefined: Self = StObject.set(x, "matchProp", js.undefined)
    
    @scala.inline
    def setTrimFilter(value: Boolean): Self = StObject.set(x, "trimFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimFilterUndefined: Self = StObject.set(x, "trimFilter", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = StObject.set(x, "valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueKeyUndefined: Self = StObject.set(x, "valueKey", js.undefined)
  }
}
