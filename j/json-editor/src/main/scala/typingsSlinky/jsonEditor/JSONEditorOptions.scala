package typingsSlinky.jsonEditor

import typingsSlinky.jsonEditor.jsonEditorStrings.always
import typingsSlinky.jsonEditor.jsonEditorStrings.barebones
import typingsSlinky.jsonEditor.jsonEditorStrings.bootstrap2
import typingsSlinky.jsonEditor.jsonEditorStrings.bootstrap3
import typingsSlinky.jsonEditor.jsonEditorStrings.bootstrap4
import typingsSlinky.jsonEditor.jsonEditorStrings.change
import typingsSlinky.jsonEditor.jsonEditorStrings.fontawesome3
import typingsSlinky.jsonEditor.jsonEditorStrings.fontawesome4
import typingsSlinky.jsonEditor.jsonEditorStrings.foundation2
import typingsSlinky.jsonEditor.jsonEditorStrings.foundation3
import typingsSlinky.jsonEditor.jsonEditorStrings.foundation4
import typingsSlinky.jsonEditor.jsonEditorStrings.foundation5
import typingsSlinky.jsonEditor.jsonEditorStrings.foundation6
import typingsSlinky.jsonEditor.jsonEditorStrings.html
import typingsSlinky.jsonEditor.jsonEditorStrings.interaction
import typingsSlinky.jsonEditor.jsonEditorStrings.jqueryui
import typingsSlinky.jsonEditor.jsonEditorStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONEditorOptions[TValue] extends js.Object {
  /**
    * If true, JSON Editor will load external URLs in $ref via ajax.
    */
  var ajax: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all "add row" buttons from arrays.
    */
  var disable_array_add: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all "delete row" buttons from arrays.
    */
  var disable_array_delete: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all "move up" and "move down" buttons from arrays.
    */
  var disable_array_reorder: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all collapse buttons from objects and arrays.
    */
  var disable_collapse: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all Edit JSON buttons from objects.
    */
  var disable_edit_json: js.UndefOr[Boolean] = js.native
  /**
    * If true, remove all Edit Properties buttons from objects.
    */
  var disable_properties: js.UndefOr[Boolean] = js.native
  /**
    * If true, only required properties will be included by default.
    */
  var display_required_only: js.UndefOr[Boolean] = js.native
  /**
    * The first part of the `name` attribute of form inputs in the editor. An full example name is `root[person][name]` where "root" is the form_name_root.
    */
  var form_name_root: js.UndefOr[String] = js.native
  /**
    * The icon library to use for the editor.
    */
  var iconlib: js.UndefOr[
    bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
  ] = js.native
  /**
    * If true, makes oneOf copy properties over when switching.
    */
  var keep_oneof_values: js.UndefOr[Boolean] = js.native
  /**
    * If true, objects can only contain properties defined with the properties keyword.
    */
  var no_additional_properties: js.UndefOr[Boolean] = js.native
  /**
    * An object containing schema definitions for URLs. Allows you to pre-define external schemas.
    */
  var refs: js.UndefOr[js.Any] = js.native
  /**
    * If true, all schemas that don't explicitly set the required property will be required.
    */
  var required_by_default: js.UndefOr[Boolean] = js.native
  /**
    * A valid JSON Schema to use for the editor. Version 3 and Version 4 of the draft specification are supported.
    */
  var schema: js.UndefOr[js.Any] = js.native
  /**
    * When to show validation errors in the UI. Valid values are interaction, change, always, and never.
    */
  var show_errors: js.UndefOr[interaction | change | always | never] = js.native
  /**
    * Seed the editor with an initial value. This should be valid against the editor's schema.
    */
  var startval: js.UndefOr[TValue] = js.native
  /**
    * The JS template engine to use.
    */
  var template: js.UndefOr[String | AnonCompile] = js.native
  /**
    * The CSS theme to use.
    */
  var theme: js.UndefOr[
    barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
  ] = js.native
}

object JSONEditorOptions {
  @scala.inline
  def apply[TValue](): JSONEditorOptions[TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONEditorOptions[TValue]]
  }
  @scala.inline
  implicit class JSONEditorOptionsOps[Self[tvalue] <: JSONEditorOptions[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withAjax(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjax: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajax")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_add(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_add: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_add")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_delete(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_delete: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_array_reorder(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_reorder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_array_reorder: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_array_reorder")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_collapse(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_collapse: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_edit_json(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_edit_json: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_edit_json")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_properties(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_properties: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_properties")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplay_required_only(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_required_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplay_required_only: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display_required_only")(js.undefined)
        ret
    }
    @scala.inline
    def withForm_name_root(value: String): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form_name_root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForm_name_root: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("form_name_root")(js.undefined)
        ret
    }
    @scala.inline
    def withIconlib(
      value: bootstrap2 | bootstrap3 | foundation2 | foundation3 | jqueryui | fontawesome3 | fontawesome4
    ): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconlib")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconlib: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconlib")(js.undefined)
        ret
    }
    @scala.inline
    def withKeep_oneof_values(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_oneof_values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeep_oneof_values: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keep_oneof_values")(js.undefined)
        ret
    }
    @scala.inline
    def withNo_additional_properties(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_additional_properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNo_additional_properties: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no_additional_properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRefs(value: js.Any): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefs: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired_by_default(value: Boolean): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_by_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired_by_default: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required_by_default")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: js.Any): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
    @scala.inline
    def withShow_errors(value: interaction | change | always | never): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShow_errors: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show_errors")(js.undefined)
        ret
    }
    @scala.inline
    def withStartval(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartval: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startval")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | AnonCompile): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(
      value: barebones | html | bootstrap2 | bootstrap3 | bootstrap4 | foundation3 | foundation4 | foundation5 | foundation6 | jqueryui
    ): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

