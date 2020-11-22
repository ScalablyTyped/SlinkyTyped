package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.PreviousValue
import typingsSlinky.devextreme.devextremeStrings.always
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.invalid
import typingsSlinky.devextreme.devextremeStrings.pending
import typingsSlinky.devextreme.devextremeStrings.valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorOptions[T] extends WidgetOptions[T] {
  
  /**
    * [descr:Editor.Options.isValid]
    */
  var isValid: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Editor.Options.onValueChanged]
    */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ PreviousValue[T], _]] = js.native
  
  /**
    * [descr:Editor.Options.readOnly]
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:Editor.Options.validationError]
    */
  var validationError: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:Editor.Options.validationErrors]
    */
  var validationErrors: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:Editor.Options.validationMessageMode]
    */
  var validationMessageMode: js.UndefOr[always | auto] = js.native
  
  /**
    * [descr:Editor.Options.validationStatus]
    */
  var validationStatus: js.UndefOr[valid | invalid | pending] = js.native
  
  /**
    * [descr:Editor.Options.value]
    */
  var value: js.UndefOr[js.Any] = js.native
}
object EditorOptions {
  
  @scala.inline
  def apply[T](): EditorOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions[T]]
  }
  
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions[_], T] (val x: Self with EditorOptions[T]) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    
    @scala.inline
    def setOnValueChanged(value: /* e */ PreviousValue[T] => _): Self = this.set("onValueChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChanged: Self = this.set("onValueChanged", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setValidationError(value: js.Any): Self = this.set("validationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationError: Self = this.set("validationError", js.undefined)
    
    @scala.inline
    def setValidationErrorsVarargs(value: js.Any*): Self = this.set("validationErrors", js.Array(value :_*))
    
    @scala.inline
    def setValidationErrors(value: js.Array[_]): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
    
    @scala.inline
    def setValidationMessageMode(value: always | auto): Self = this.set("validationMessageMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationMessageMode: Self = this.set("validationMessageMode", js.undefined)
    
    @scala.inline
    def setValidationStatus(value: valid | invalid | pending): Self = this.set("validationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationStatus: Self = this.set("validationStatus", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
