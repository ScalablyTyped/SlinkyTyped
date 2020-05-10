package typingsSlinky.reactJsonschemaForm.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiSchema
  extends /* name */ StringDictionary[js.Any] {
  @JSName("ui:ArrayFieldTemplate")
  var uiColonArrayFieldTemplate: js.UndefOr[ReactComponentClass[ArrayFieldTemplateProps[_]]] = js.native
  @JSName("ui:FieldTemplate")
  var uiColonFieldTemplate: js.UndefOr[ReactComponentClass[FieldTemplateProps]] = js.native
  @JSName("ui:ObjectFieldTemplate")
  var uiColonObjectFieldTemplate: js.UndefOr[ReactComponentClass[ObjectFieldTemplateProps[_]]] = js.native
  @JSName("ui:field")
  var uiColonfield: js.UndefOr[Field | String] = js.native
  @JSName("ui:options")
  var uiColonoptions: js.UndefOr[StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]] = js.native
  @JSName("ui:order")
  var uiColonorder: js.UndefOr[js.Array[String]] = js.native
  @JSName("ui:widget")
  var uiColonwidget: js.UndefOr[Widget | String] = js.native
}

object UiSchema {
  @scala.inline
  def apply(): UiSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiSchema]
  }
  @scala.inline
  implicit class UiSchemaOps[Self <: UiSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUiColonArrayFieldTemplate(value: ReactComponentClass[ArrayFieldTemplateProps[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:ArrayFieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonArrayFieldTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:ArrayFieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonFieldTemplate(value: ReactComponentClass[FieldTemplateProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:FieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonFieldTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:FieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonObjectFieldTemplate(value: ReactComponentClass[ObjectFieldTemplateProps[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:ObjectFieldTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonObjectFieldTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:ObjectFieldTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonfieldFunctionComponent(value: ReactComponentClass[FieldProps[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiColonfieldComponentClass(value: ReactComponentClass[FieldProps[js.Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiColonfield(value: Field | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonfield: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:field")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonoptions(value: StringDictionary[Boolean | Double | String | js.Object | js.Array[_] | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonoptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:options")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonorder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:order")(js.undefined)
        ret
    }
    @scala.inline
    def withUiColonwidgetFunctionComponent(value: ReactComponentClass[WidgetProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiColonwidgetComponentClass(value: ReactComponentClass[WidgetProps]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUiColonwidget(value: Widget | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUiColonwidget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui:widget")(js.undefined)
        ret
    }
  }
  
}

