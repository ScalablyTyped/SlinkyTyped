package typingsSlinky.handsontable.mod.Handsontable

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import org.scalajs.dom.raw.HTMLTableCellElement
import typingsSlinky.handsontable.mod.Handsontable._editors.Autocomplete
import typingsSlinky.handsontable.mod.Handsontable._editors.Base
import typingsSlinky.handsontable.mod.Handsontable._editors.Checkbox
import typingsSlinky.handsontable.mod.Handsontable._editors.Date
import typingsSlinky.handsontable.mod.Handsontable._editors.Dropdown
import typingsSlinky.handsontable.mod.Handsontable._editors.Mobile
import typingsSlinky.handsontable.mod.Handsontable._editors.Numeric
import typingsSlinky.handsontable.mod.Handsontable._editors.Password
import typingsSlinky.handsontable.mod.Handsontable._editors.Select
import typingsSlinky.handsontable.mod.Handsontable._editors.Text
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editors extends js.Object {
  var AutocompleteEditor: Instantiable0[Autocomplete] = js.native
  var BaseEditor: Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ] = js.native
  var CheckboxEditor: Instantiable0[Checkbox] = js.native
  var DateEditor: Instantiable0[Date] = js.native
  var DropdownEditor: Instantiable0[Dropdown] = js.native
  var HandsontableEditor: Instantiable0[typingsSlinky.handsontable.mod.Handsontable._editors.Handsontable] = js.native
  var MobileEditor: Instantiable0[Mobile] = js.native
  var NumericEditor: Instantiable0[Numeric] = js.native
  var PasswordEditor: Instantiable0[Password] = js.native
  var SelectEditor: Instantiable0[Select] = js.native
  var TextEditor: Instantiable0[Text] = js.native
  var TimeEditor: Instantiable0[Text] = js.native
  def getEditor(editorName: String): Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ] = js.native
  def registerEditor(
    editorName: String,
    editorClass: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]
  ): Unit = js.native
}

object Editors {
  @scala.inline
  def apply(
    AutocompleteEditor: Instantiable0[Autocomplete],
    BaseEditor: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ],
    CheckboxEditor: Instantiable0[Checkbox],
    DateEditor: Instantiable0[Date],
    DropdownEditor: Instantiable0[Dropdown],
    HandsontableEditor: Instantiable0[typingsSlinky.handsontable.mod.Handsontable._editors.Handsontable],
    MobileEditor: Instantiable0[Mobile],
    NumericEditor: Instantiable0[Numeric],
    PasswordEditor: Instantiable0[Password],
    SelectEditor: Instantiable0[Select],
    TextEditor: Instantiable0[Text],
    TimeEditor: Instantiable0[Text],
    getEditor: String => Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ],
    registerEditor: (String, Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) => Unit
  ): Editors = {
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor.asInstanceOf[js.Any], BaseEditor = BaseEditor.asInstanceOf[js.Any], CheckboxEditor = CheckboxEditor.asInstanceOf[js.Any], DateEditor = DateEditor.asInstanceOf[js.Any], DropdownEditor = DropdownEditor.asInstanceOf[js.Any], HandsontableEditor = HandsontableEditor.asInstanceOf[js.Any], MobileEditor = MobileEditor.asInstanceOf[js.Any], NumericEditor = NumericEditor.asInstanceOf[js.Any], PasswordEditor = PasswordEditor.asInstanceOf[js.Any], SelectEditor = SelectEditor.asInstanceOf[js.Any], TextEditor = TextEditor.asInstanceOf[js.Any], TimeEditor = TimeEditor.asInstanceOf[js.Any], getEditor = js.Any.fromFunction1(getEditor), registerEditor = js.Any.fromFunction2(registerEditor))
    __obj.asInstanceOf[Editors]
  }
  @scala.inline
  implicit class EditorsOps[Self <: Editors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutocompleteEditor(value: Instantiable0[Autocomplete]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutocompleteEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseEditor(
      value: Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BaseEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckboxEditor(value: Instantiable0[Checkbox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckboxEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateEditor(value: Instantiable0[Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DateEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdownEditor(value: Instantiable0[Dropdown]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DropdownEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandsontableEditor(value: Instantiable0[typingsSlinky.handsontable.mod.Handsontable._editors.Handsontable]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HandsontableEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMobileEditor(value: Instantiable0[Mobile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MobileEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericEditor(value: Instantiable0[Numeric]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPasswordEditor(value: Instantiable0[Password]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PasswordEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectEditor(value: Instantiable0[Select]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextEditor(value: Instantiable0[Text]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeEditor(value: Instantiable0[Text]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeEditor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetEditor(
      value: String => Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRegisterEditor(
      value: (String, Instantiable6[
          /* hotInstance */ Core, 
          /* row */ Double, 
          /* col */ Double, 
          /* prop */ String | Double, 
          /* TD */ HTMLTableCellElement, 
          /* cellProperties */ CellProperties, 
          Base
        ]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerEditor")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

