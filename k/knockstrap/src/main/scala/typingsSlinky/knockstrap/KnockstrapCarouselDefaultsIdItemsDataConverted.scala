package typingsSlinky.knockstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockstrapCarouselDefaultsIdItemsDataConverted extends KnockstrapCarouselDefaultsIdDataConverted {
  
  var items: js.Any = js.native
}
object KnockstrapCarouselDefaultsIdItemsDataConverted {
  
  @scala.inline
  def apply(
    id: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<string> */ js.Any,
    items: js.Any
  ): KnockstrapCarouselDefaultsIdItemsDataConverted = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockstrapCarouselDefaultsIdItemsDataConverted]
  }
  
  @scala.inline
  implicit class KnockstrapCarouselDefaultsIdItemsDataConvertedMutableBuilder[Self <: KnockstrapCarouselDefaultsIdItemsDataConverted] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
