package typingsSlinky.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSProperty extends StObject {
  
  /**
    * Whether the property is disabled by the user (present for source-based properties only).
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the property is implicit (implies `false` if absent).
    */
  var `implicit`: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the property has "!important" annotation (implies `false` if absent).
    */
  var important: js.UndefOr[Boolean] = js.native
  
  /**
    * The property name.
    */
  var name: String = js.native
  
  /**
    * Whether the property is understood by the browser (implies `true` if absent).
    */
  var parsedOk: js.UndefOr[Boolean] = js.native
  
  /**
    * The entire property range in the enclosing style declaration (if available).
    */
  var range: js.UndefOr[SourceRange] = js.native
  
  /**
    * The full property text as specified in the style.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The property value.
    */
  var value: String = js.native
}
object CSSProperty {
  
  @scala.inline
  def apply(name: String, value: String): CSSProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  
  @scala.inline
  implicit class CSSPropertyMutableBuilder[Self <: CSSProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
    
    @scala.inline
    def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedOk(value: Boolean): Self = StObject.set(x, "parsedOk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedOkUndefined: Self = StObject.set(x, "parsedOk", js.undefined)
    
    @scala.inline
    def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
