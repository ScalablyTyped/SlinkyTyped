package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridUpdatingRowEditDialogOptions
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the animation duration for the opening and closing operations.
  	 *
  	 */
  var animationDuration: js.UndefOr[Double] = js.native
  /**
  	 * Controls the containment of the dialog's drag operation.
  	 *
  	 *
  	 * Valid values:
  	 * "owner" The row edit dialog will be draggable only in the grid area.
  	 * "window" The row edit dialog will be draggable in the whole window area.
  	 */
  var containment: js.UndefOr[String] = js.native
  /**
  	 * Specifies a template to be rendered against the currently edited record (or up-to-date key-value pairs in the case of not yet created records). It may contain an element decorated with the 'data-render-tmpl' attribute to specify where the control should render the editors template specified in the [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) option. For custom dialogs, the elements can be decorated with 'data-editor-for-<columnKey>' attributes where columnKey is the key of the column that editor or input will be used to edit. If both dialogTemplate and [dialogTemplateSelector](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplateSelector) are specified, dialogTemplateSelector will be used.The default template is '<table><colgroup><col></col><col></col></colgroup><tbody data-render-tmpl></tbody></table>'.
  	 *
  	 */
  var dialogTemplate: js.UndefOr[String] = js.native
  /**
  	 * Specifies a selector to a template rendered against the currently edited record (or up-to-date key-value pairs in the case of not yet created records). It may contain an element decorated with the 'data-render-tmpl' attribute to specify where the control should render the editors template specified in the [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) option. For custom dialogs, the elements can be decorated with 'data-editor-for-<columnKey>' attributes where columnKey is the key of the column that editor or input will be used to edit. If both [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) and dialogTemplateSelector are specified, dialogTemplateSelector will be used.The default template is '<table><colgroup><col></col><col></col></colgroup><tbody data-render-tmpl></tbody></table>'.
  	 *
  	 */
  var dialogTemplateSelector: js.UndefOr[String] = js.native
  /**
  	 * Controls the width of the column containing the editors in the default row edit dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width of the column in pixels (100px) or percents (20%).
  	 * "number" The width of the column as a number (100) in pixels.
  	 * "null" The width of the column will be left empty for the browser to size automatically.
  	 */
  var editorsColumnWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Specifies a template to be executed for each column in the grid's column collection (or just the read-write columns if [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) is false). Decorate the element to be used as an editor with 'data-editor-for-${key}'. The ${key} template tag should be replaced with the chosen templating engine's syntax for rendering values. If any editors for columns are specified in the dialog markup they will be exluded from the data the template will be rendered for. This property is ignored if [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) does not include an element with the 'data-render-tmpl' attribute. If both editorsTemplate and [editorsTemplateSelector](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplateSelector) are specified, editorsTemplateSelector will be used.
  	 * The default template is '<tr><td>${headerText}</td><td><input data-editor-for-${key} /></td></tr>'
  	 *
  	 */
  var editorsTemplate: js.UndefOr[String] = js.native
  /**
  	 * Specifies a selector to a template to be executed for each column in the grid's column collection (or just the read-write columns if [showReadonlyEditors](ui.iggridupdating#options:rowEditDialogOptions.showReadonlyEditors) is false). Decorate the element to be used as an editor with 'data-editor-for-${key}'. The ${key} template tag should be replaced with the chosen templating engine's syntax for rendering values. If any editors for columns are specified in the dialog markup they will be exluded from the data the template will be rendered for. This property is ignored if [dialogTemplate](ui.iggridupdating#options:rowEditDialogOptions.dialogTemplate) does not include an element with the 'data-render-tmpl' attribute. If both [editorsTemplate](ui.iggridupdating#options:rowEditDialogOptions.editorsTemplate) and editorsTemplateSelector are specified, editorsTemplateSelector will be used.
  	 * The default template is '<tr><td>${headerText}</td><td><input data-editor-for-${key} /></td></tr>'
  	 *
  	 */
  var editorsTemplateSelector: js.UndefOr[String] = js.native
  /**
  	 * Controls the default row edit dialog height.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window height in pixels (350px).
  	 * "number" The dialog window height as a number (350).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Controls the width of the column containing the column names in the default row edit dialog.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The width of the column in pixels (100px) or percents (20%).
  	 * "number" The width of the column as a number (100) in pixels.
  	 * "null" The width of the column will be left empty for the browser to size automatically.
  	 */
  var namesColumnWidth: js.UndefOr[String | Double] = js.native
  /**
  	 * Controls the visibility of the done and cancel buttons for the dialog.
  	 * If disabled the end-user will be able to stop editing only with the Enter and Esc keys.
  	 *
  	 */
  var showDoneCancelButtons: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls if editors should be rendered for hidden columns.
  	 *
  	 */
  var showEditorsForHiddenColumns: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls if editors should be rendered for read-only columns. If rendered, these editors will be disabled.
  	 *
  	 */
  var showReadonlyEditors: js.UndefOr[Boolean] = js.native
  /**
  	 * Controls the default row edit dialog width.
  	 *
  	 *
  	 * Valid values:
  	 * "string" The dialog window width in pixels (400px).
  	 * "number" The dialog window width as a number (400).
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgGridUpdatingRowEditDialogOptions {
  @scala.inline
  def apply(): IgGridUpdatingRowEditDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingRowEditDialogOptions]
  }
  @scala.inline
  implicit class IgGridUpdatingRowEditDialogOptionsOps[Self <: IgGridUpdatingRowEditDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withContainment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containment")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDialogTemplateSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTemplateSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialogTemplateSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogTemplateSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorsColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorsColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorsTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorsTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorsTemplateSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsTemplateSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorsTemplateSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorsTemplateSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withNamesColumnWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namesColumnWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamesColumnWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namesColumnWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDoneCancelButtons(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneCancelButtons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDoneCancelButtons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDoneCancelButtons")(js.undefined)
        ret
    }
    @scala.inline
    def withShowEditorsForHiddenColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditorsForHiddenColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowEditorsForHiddenColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showEditorsForHiddenColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withShowReadonlyEditors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReadonlyEditors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowReadonlyEditors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showReadonlyEditors")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

