package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnMetadata extends StObject {
  
  var defaultValue: String = js.native
  
  /// <summary>
  /// Escaped identifier for the name of the column
  /// </summary>
  var escapedName: String = js.native
  
  var hasExtendedProperties: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column is calculated on the server side. This could be a computed
  /// column or a identity column.
  /// </summary>
  var isCalculated: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column is computed
  /// </summary>
  var isComputed: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column is deterministically computed
  /// </summary>
  var isDeterministic: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column is an identity column
  /// </summary>
  var isIdentity: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column is used in a key to uniquely identify a row
  /// </summary>
  var isKey: Boolean = js.native
  
  /// <summary>
  /// Whether or not the column can be trusted for uniqueness
  /// </summary>
  var isTrustworthyForUniqueness: Boolean = js.native
  
  /// <summary>
  /// The ordinal ID of the column
  /// </summary>
  var ordinal: Double = js.native
}
object ColumnMetadata {
  
  @scala.inline
  def apply(
    defaultValue: String,
    escapedName: String,
    hasExtendedProperties: Boolean,
    isCalculated: Boolean,
    isComputed: Boolean,
    isDeterministic: Boolean,
    isIdentity: Boolean,
    isKey: Boolean,
    isTrustworthyForUniqueness: Boolean,
    ordinal: Double
  ): ColumnMetadata = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], escapedName = escapedName.asInstanceOf[js.Any], hasExtendedProperties = hasExtendedProperties.asInstanceOf[js.Any], isCalculated = isCalculated.asInstanceOf[js.Any], isComputed = isComputed.asInstanceOf[js.Any], isDeterministic = isDeterministic.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isKey = isKey.asInstanceOf[js.Any], isTrustworthyForUniqueness = isTrustworthyForUniqueness.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnMetadata]
  }
  
  @scala.inline
  implicit class ColumnMetadataMutableBuilder[Self <: ColumnMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapedName(value: String): Self = StObject.set(x, "escapedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasExtendedProperties(value: Boolean): Self = StObject.set(x, "hasExtendedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCalculated(value: Boolean): Self = StObject.set(x, "isCalculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsComputed(value: Boolean): Self = StObject.set(x, "isComputed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeterministic(value: Boolean): Self = StObject.set(x, "isDeterministic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentity(value: Boolean): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsKey(value: Boolean): Self = StObject.set(x, "isKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTrustworthyForUniqueness(value: Boolean): Self = StObject.set(x, "isTrustworthyForUniqueness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
  }
}
