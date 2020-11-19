package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.DisplayExpr
import typingsSlinky.devextreme.anon.FilterOperation
import typingsSlinky.devextreme.anon.Value
import typingsSlinky.devextreme.devextremeStrings.Equalssign
import typingsSlinky.devextreme.devextremeStrings.Greaterthansign
import typingsSlinky.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Lessthansign
import typingsSlinky.devextreme.devextremeStrings.LessthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.LessthansignGreaterthansign
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.between
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.endswith
import typingsSlinky.devextreme.devextremeStrings.isblank
import typingsSlinky.devextreme.devextremeStrings.isnotblank
import typingsSlinky.devextreme.devextremeStrings.notcontains
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxFilterBuilderField extends js.Object {
  
  /** @name dxFilterBuilderField.calculateFilterExpression */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  
  /** @name dxFilterBuilderField.caption */
  var caption: js.UndefOr[String] = js.native
  
  /** @name dxFilterBuilderField.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Value, String]] = js.native
  
  /** @name dxFilterBuilderField.dataField */
  var dataField: js.UndefOr[String] = js.native
  
  /** @name dxFilterBuilderField.dataType */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.native
  
  /** @name dxFilterBuilderField.editorOptions */
  var editorOptions: js.UndefOr[js.Any] = js.native
  
  /** @name dxFilterBuilderField.editorTemplate */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ FilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /** @name dxFilterBuilderField.falseText */
  var falseText: js.UndefOr[String] = js.native
  
  /** @name dxFilterBuilderField.filterOperations */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ]
  ] = js.native
  
  /** @name dxFilterBuilderField.format */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  
  /** @name dxFilterBuilderField.lookup */
  var lookup: js.UndefOr[DisplayExpr] = js.native
  
  /** @name dxFilterBuilderField.name */
  var name: js.UndefOr[String] = js.native
  
  /** @name dxFilterBuilderField.trueText */
  var trueText: js.UndefOr[String] = js.native
}
object dxFilterBuilderField {
  
  @scala.inline
  def apply(): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderField]
  }
  
  @scala.inline
  implicit class dxFilterBuilderFieldOps[Self <: dxFilterBuilderField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* selectedFilterOperation */ String) => String | js.Array[_] | js.Function
    ): Self = this.set("calculateFilterExpression", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalculateFilterExpression: Self = this.set("calculateFilterExpression", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    
    @scala.inline
    def setCustomizeText(value: /* fieldInfo */ Value => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    
    @scala.inline
    def setDataField(value: String): Self = this.set("dataField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataField: Self = this.set("dataField", js.undefined)
    
    @scala.inline
    def setDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setEditorOptions(value: js.Any): Self = this.set("editorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorOptions: Self = this.set("editorOptions", js.undefined)
    
    @scala.inline
    def setEditorTemplateFunction2(
      value: (/* conditionInfo */ FilterOperation, /* container */ dxElement) => String | Element | JQuery
    ): Self = this.set("editorTemplate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEditorTemplateElement(value: Element): Self = this.set("editorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* conditionInfo */ FilterOperation, 
          /* container */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("editorTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditorTemplate: Self = this.set("editorTemplate", js.undefined)
    
    @scala.inline
    def setFalseText(value: String): Self = this.set("falseText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalseText: Self = this.set("falseText", js.undefined)
    
    @scala.inline
    def setFilterOperationsVarargs(
      value: (Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String)*
    ): Self = this.set("filterOperations", js.Array(value :_*))
    
    @scala.inline
    def setFilterOperations(
      value: js.Array[
          Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
        ]
    ): Self = this.set("filterOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOperations: Self = this.set("filterOperations", js.undefined)
    
    @scala.inline
    def setFormatFunction1(value: /* value */ Double | js.Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: format): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setLookup(value: DisplayExpr): Self = this.set("lookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTrueText(value: String): Self = this.set("trueText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueText: Self = this.set("trueText", js.undefined)
  }
}
