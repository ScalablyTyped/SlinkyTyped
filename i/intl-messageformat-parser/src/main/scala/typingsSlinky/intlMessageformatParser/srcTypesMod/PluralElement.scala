package typingsSlinky.intlMessageformatParser.srcTypesMod

import typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.plural
import typingsSlinky.std.Intl.PluralRuleType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluralElement
  extends BaseElement[plural]
     with _MessageFormatElement {
  
  var offset: Double = js.native
  
  var options: Record[ValidPluralRule, PluralOrSelectOption] = js.native
  
  var pluralType: js.UndefOr[PluralRuleType] = js.native
}
object PluralElement {
  
  @scala.inline
  def apply(
    offset: Double,
    options: Record[ValidPluralRule, PluralOrSelectOption],
    `type`: plural,
    value: String
  ): PluralElement = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluralElement]
  }
  
  @scala.inline
  implicit class PluralElementMutableBuilder[Self <: PluralElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Record[ValidPluralRule, PluralOrSelectOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralType(value: PluralRuleType): Self = StObject.set(x, "pluralType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluralTypeUndefined: Self = StObject.set(x, "pluralType", js.undefined)
  }
}
