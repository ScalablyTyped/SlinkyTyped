package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.compact
import typingsSlinky.baseui.baseuiStrings.default_
import typingsSlinky.baseui.baseuiStrings.large_
import typingsSlinky.baseui.baseuiStrings.mini
import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clearable extends StObject {
  
  @JSName("$clearable")
  var $clearable: Boolean = js.native
  
  @JSName("$creatable")
  var $creatable: Boolean = js.native
  
  @JSName("$disabled")
  var $disabled: Boolean = js.native
  
  @JSName("$error")
  var $error: Boolean = js.native
  
  @JSName("$isFocused")
  var $isFocused: Boolean = js.native
  
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  
  @JSName("$isOpen")
  var $isOpen: Boolean = js.native
  
  @JSName("$isPseudoFocused")
  var $isPseudoFocused: Boolean = js.native
  
  @JSName("$multi")
  var $multi: Boolean = js.native
  
  @JSName("$positive")
  var $positive: Boolean = js.native
  
  @JSName("$required")
  var $required: Boolean = js.native
  
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  
  @JSName("$type")
  var $type: select | search = js.native
}
object Clearable {
  
  @scala.inline
  def apply(
    $clearable: Boolean,
    $creatable: Boolean,
    $disabled: Boolean,
    $error: Boolean,
    $isFocused: Boolean,
    $isLoading: Boolean,
    $isOpen: Boolean,
    $isPseudoFocused: Boolean,
    $multi: Boolean,
    $positive: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search
  ): Clearable = {
    val __obj = js.Dynamic.literal($clearable = $clearable.asInstanceOf[js.Any], $creatable = $creatable.asInstanceOf[js.Any], $disabled = $disabled.asInstanceOf[js.Any], $error = $error.asInstanceOf[js.Any], $isFocused = $isFocused.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $isOpen = $isOpen.asInstanceOf[js.Any], $isPseudoFocused = $isPseudoFocused.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $positive = $positive.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clearable]
  }
  
  @scala.inline
  implicit class ClearableMutableBuilder[Self <: Clearable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$clearable(value: Boolean): Self = StObject.set(x, "$clearable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$creatable(value: Boolean): Self = StObject.set(x, "$creatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isOpen(value: Boolean): Self = StObject.set(x, "$isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isPseudoFocused(value: Boolean): Self = StObject.set(x, "$isPseudoFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$multi(value: Boolean): Self = StObject.set(x, "$multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$positive(value: Boolean): Self = StObject.set(x, "$positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$searchable(value: Boolean): Self = StObject.set(x, "$searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$size(value: mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$type(value: select | search): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
  }
}
