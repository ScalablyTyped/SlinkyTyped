package typingsSlinky.prettier.mod

import typingsSlinky.prettier.prettierBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseSupportOption[Type /* <: SupportOptionType */] extends StObject {
  
  var category: String = js.native
  
  /**
    * Indicate that the option is deprecated.
    *
    * Use a string to add an extra message to --help for the option,
    * for example to suggest a replacement option.
    */
  var deprecated: js.UndefOr[`true` | String] = js.native
  
  /**
    * Description to be displayed in --help. If omitted, the option won't be
    * shown at all in --help.
    */
  var description: js.UndefOr[String] = js.native
  
  var since: String = js.native
  
  /**
    * The type of the option.
    *
    * When passing a type other than the ones listed below, the option is
    * treated as taking any string as argument, and `--option <${type}>` will
    * be displayed in --help.
    */
  var `type`: Type = js.native
}
object BaseSupportOption {
  
  @scala.inline
  def apply[Type /* <: SupportOptionType */](category: String, since: String, `type`: Type): BaseSupportOption[Type] = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseSupportOption[Type]]
  }
  
  @scala.inline
  implicit class BaseSupportOptionMutableBuilder[Self <: BaseSupportOption[_], Type /* <: SupportOptionType */] (val x: Self with BaseSupportOption[Type]) extends AnyVal {
    
    @scala.inline
    def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecated(value: `true` | String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setSince(value: String): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
