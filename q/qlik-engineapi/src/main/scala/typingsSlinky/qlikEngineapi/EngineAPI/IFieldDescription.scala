package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldDescription...
  */
@js.native
trait IFieldDescription extends StObject {
  
  /**
    * If set to true, it means that the field has one and only one selection (not 0 and not more than 1).
    * If this property is set to true, the field cannot be cleared anymore and no more selections can be
    * performed in that field.
    * >> The default value is false.
    */
  var qAlwaysOneSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true a logical AND (instead of a logical OR) is used when making selections in a field.
    * >> The default value is false.
    */
  var qAndMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Number of distinct field values.
    */
  var qCardinal: Double = js.native
  
  /**
    * Field comment.
    */
  var qComment: String = js.native
  
  /**
    * If set to true, only distinct field values are shown.
    * >> The default value is false.
    */
  var qDistinctOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Internal number of the field.
    */
  var qInternalNumber: Double = js.native
  
  /**
    * If set to true, it means that the field is a field on the fly.
    * >> The default value is false.
    */
  var qIsDefinitionOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is hidden.
    * >> The default value is false.
    */
  var qIsHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is locked.
    * >> The default value is false.
    */
  var qIsLocked: js.UndefOr[Boolean] = js.native
  
  /**
    * Is set to true if the value is a numeric.
    * >> The default value is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is a semantic.
    * >> The default value is false.
    */
  var qIsSemantic: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, it means that the field is a system field.
    * >> The default value is false.
    */
  var qIsSystem: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the field.
    */
  var qName: String = js.native
  
  /**
    * List of table names.
    */
  var qSrcTables: js.Array[String] = js.native
  
  /**
    * Gives information on a field. For example, it can return the type of the field.
    * Examples: key, text, ASCII
    */
  var qTags: js.Array[String] = js.native
  
  /**
    * Total number of field values.
    */
  var qTotalCount: Double = js.native
}
object IFieldDescription {
  
  @scala.inline
  def apply(
    qCardinal: Double,
    qComment: String,
    qInternalNumber: Double,
    qName: String,
    qSrcTables: js.Array[String],
    qTags: js.Array[String],
    qTotalCount: Double
  ): IFieldDescription = {
    val __obj = js.Dynamic.literal(qCardinal = qCardinal.asInstanceOf[js.Any], qComment = qComment.asInstanceOf[js.Any], qInternalNumber = qInternalNumber.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qSrcTables = qSrcTables.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any], qTotalCount = qTotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldDescription]
  }
  
  @scala.inline
  implicit class IFieldDescriptionMutableBuilder[Self <: IFieldDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAlwaysOneSelected(value: Boolean): Self = StObject.set(x, "qAlwaysOneSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAlwaysOneSelectedUndefined: Self = StObject.set(x, "qAlwaysOneSelected", js.undefined)
    
    @scala.inline
    def setQAndMode(value: Boolean): Self = StObject.set(x, "qAndMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAndModeUndefined: Self = StObject.set(x, "qAndMode", js.undefined)
    
    @scala.inline
    def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQComment(value: String): Self = StObject.set(x, "qComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDistinctOnly(value: Boolean): Self = StObject.set(x, "qDistinctOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDistinctOnlyUndefined: Self = StObject.set(x, "qDistinctOnly", js.undefined)
    
    @scala.inline
    def setQInternalNumber(value: Double): Self = StObject.set(x, "qInternalNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsDefinitionOnly(value: Boolean): Self = StObject.set(x, "qIsDefinitionOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsDefinitionOnlyUndefined: Self = StObject.set(x, "qIsDefinitionOnly", js.undefined)
    
    @scala.inline
    def setQIsHidden(value: Boolean): Self = StObject.set(x, "qIsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsHiddenUndefined: Self = StObject.set(x, "qIsHidden", js.undefined)
    
    @scala.inline
    def setQIsLocked(value: Boolean): Self = StObject.set(x, "qIsLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsLockedUndefined: Self = StObject.set(x, "qIsLocked", js.undefined)
    
    @scala.inline
    def setQIsNumeric(value: Boolean): Self = StObject.set(x, "qIsNumeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsNumericUndefined: Self = StObject.set(x, "qIsNumeric", js.undefined)
    
    @scala.inline
    def setQIsSemantic(value: Boolean): Self = StObject.set(x, "qIsSemantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsSemanticUndefined: Self = StObject.set(x, "qIsSemantic", js.undefined)
    
    @scala.inline
    def setQIsSystem(value: Boolean): Self = StObject.set(x, "qIsSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIsSystemUndefined: Self = StObject.set(x, "qIsSystem", js.undefined)
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSrcTables(value: js.Array[String]): Self = StObject.set(x, "qSrcTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSrcTablesVarargs(value: String*): Self = StObject.set(x, "qSrcTables", js.Array(value :_*))
    
    @scala.inline
    def setQTags(value: js.Array[String]): Self = StObject.set(x, "qTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTagsVarargs(value: String*): Self = StObject.set(x, "qTags", js.Array(value :_*))
    
    @scala.inline
    def setQTotalCount(value: Double): Self = StObject.set(x, "qTotalCount", value.asInstanceOf[js.Any])
  }
}
