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
trait Error extends StObject {
  
  @JSName("$error")
  var $error: Boolean = js.native
  
  @JSName("$isLoading")
  var $isLoading: Boolean = js.native
  
  @JSName("$multi")
  var $multi: Boolean = js.native
  
  @JSName("$required")
  var $required: Boolean = js.native
  
  @JSName("$searchable")
  var $searchable: Boolean = js.native
  
  @JSName("$size")
  var $size: mini | default_ | compact | large_ = js.native
  
  @JSName("$type")
  var $type: select | search = js.native
  
  @JSName("$width")
  var $width: Double = js.native
}
object Error {
  
  @scala.inline
  def apply(
    $error: Boolean,
    $isLoading: Boolean,
    $multi: Boolean,
    $required: Boolean,
    $searchable: Boolean,
    $size: mini | default_ | compact | large_,
    $type: select | search,
    $width: Double
  ): Error = {
    val __obj = js.Dynamic.literal($error = $error.asInstanceOf[js.Any], $isLoading = $isLoading.asInstanceOf[js.Any], $multi = $multi.asInstanceOf[js.Any], $required = $required.asInstanceOf[js.Any], $searchable = $searchable.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], $width = $width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  @scala.inline
  implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$error(value: Boolean): Self = StObject.set(x, "$error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$multi(value: Boolean): Self = StObject.set(x, "$multi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$required(value: Boolean): Self = StObject.set(x, "$required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$searchable(value: Boolean): Self = StObject.set(x, "$searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$size(value: mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$type(value: select | search): Self = StObject.set(x, "$type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$width(value: Double): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
  }
}
