package typingsSlinky.jsoneditor.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ajv.mod.ErrorObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Node extends BaseNode {
  
  var append: js.UndefOr[BaseNode] = js.native
  
  var childs: js.UndefOr[js.Array[Node]] = js.native
  
  var enum: js.UndefOr[Null | js.Array[String]] = js.native
  
  var error: js.UndefOr[ErrorObject] = js.native
  
  var errorChild: js.UndefOr[Node] = js.native
  
  var expanded: js.UndefOr[Boolean] = js.native
  
  var field: String = js.native
  
  var fieldEditable: Boolean = js.native
  
  var fieldInnerText: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var previousField: String = js.native
  
  var previousValue: NodeValue = js.native
  
  var schema: js.UndefOr[js.Object] = js.native
  
  var showMore: js.UndefOr[BaseNode] = js.native
  
  var `type`: NodeType = js.native
  
  var value: NodeValue = js.native
  
  var valueFieldHTML: js.UndefOr[String] = js.native
  
  var valueInnerText: js.UndefOr[String] = js.native
  
  var visibleChilds: Double = js.native
}
object Node {
  
  @scala.inline
  def apply(
    dom: StringDictionary[HTMLElement],
    editor: JSONEditor,
    field: String,
    fieldEditable: Boolean,
    previousField: String,
    `type`: NodeType,
    visibleChilds: Double
  ): Node = {
    val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], fieldEditable = fieldEditable.asInstanceOf[js.Any], previousField = previousField.asInstanceOf[js.Any], visibleChilds = visibleChilds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppend(value: BaseNode): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    @scala.inline
    def setChilds(value: js.Array[Node]): Self = StObject.set(x, "childs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildsUndefined: Self = StObject.set(x, "childs", js.undefined)
    
    @scala.inline
    def setChildsVarargs(value: Node*): Self = StObject.set(x, "childs", js.Array(value :_*))
    
    @scala.inline
    def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumNull: Self = StObject.set(x, "enum", null)
    
    @scala.inline
    def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    @scala.inline
    def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
    
    @scala.inline
    def setError(value: ErrorObject): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorChild(value: Node): Self = StObject.set(x, "errorChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorChildUndefined: Self = StObject.set(x, "errorChild", js.undefined)
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldEditable(value: Boolean): Self = StObject.set(x, "fieldEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInnerText(value: String): Self = StObject.set(x, "fieldInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldInnerTextUndefined: Self = StObject.set(x, "fieldInnerText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPreviousField(value: String): Self = StObject.set(x, "previousField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValue(value: NodeValue): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousValueNull: Self = StObject.set(x, "previousValue", null)
    
    @scala.inline
    def setSchema(value: js.Object): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setShowMore(value: BaseNode): Self = StObject.set(x, "showMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMoreUndefined: Self = StObject.set(x, "showMore", js.undefined)
    
    @scala.inline
    def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: NodeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldHTML(value: String): Self = StObject.set(x, "valueFieldHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFieldHTMLUndefined: Self = StObject.set(x, "valueFieldHTML", js.undefined)
    
    @scala.inline
    def setValueInnerText(value: String): Self = StObject.set(x, "valueInnerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInnerTextUndefined: Self = StObject.set(x, "valueInnerText", js.undefined)
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setVisibleChilds(value: Double): Self = StObject.set(x, "visibleChilds", value.asInstanceOf[js.Any])
  }
}
