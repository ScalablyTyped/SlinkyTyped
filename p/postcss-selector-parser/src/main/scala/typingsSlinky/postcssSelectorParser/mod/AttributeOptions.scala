package typingsSlinky.postcssSelectorParser.mod

import typingsSlinky.postcssSelectorParser.anon.After
import typingsSlinky.postcssSelectorParser.anon.Insensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeOptions
  extends NamespaceOptions[js.UndefOr[String]] {
  
  var attribute: String = js.native
  
  var insensitive: js.UndefOr[Boolean] = js.native
  
  var operator: js.UndefOr[AttributeOperator] = js.native
  
  var quoteMark: js.UndefOr[QuoteMark] = js.native
  
  /** @deprecated Use quoteMark instead. */
  var quoted: js.UndefOr[Boolean] = js.native
  
  var raws: Insensitive = js.native
  
  @JSName("spaces")
  var spaces_AttributeOptions: js.UndefOr[After] = js.native
}
object AttributeOptions {
  
  @scala.inline
  def apply(attribute: String, raws: Insensitive): AttributeOptions = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], raws = raws.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeOptions]
  }
  
  @scala.inline
  implicit class AttributeOptionsMutableBuilder[Self <: AttributeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsensitive(value: Boolean): Self = StObject.set(x, "insensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsensitiveUndefined: Self = StObject.set(x, "insensitive", js.undefined)
    
    @scala.inline
    def setOperator(value: AttributeOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setQuoteMark(value: QuoteMark): Self = StObject.set(x, "quoteMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteMarkNull: Self = StObject.set(x, "quoteMark", null)
    
    @scala.inline
    def setQuoteMarkUndefined: Self = StObject.set(x, "quoteMark", js.undefined)
    
    @scala.inline
    def setQuoted(value: Boolean): Self = StObject.set(x, "quoted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotedUndefined: Self = StObject.set(x, "quoted", js.undefined)
    
    @scala.inline
    def setRaws(value: Insensitive): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaces(value: After): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
  }
}
