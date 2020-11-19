package typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextField_
import typingsSlinky.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XDependentTextField
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextRange
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies service of an expression text field.
  * @see com.sun.star.text.TextField
  */
@js.native
trait SetExpression
  extends TextField_
     with XDependentTextField {
  
  /** contains the textual content of the field. */
  var Content: String = js.native
  
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: String = js.native
  
  /** contains an informational text that is displayed at the user interface if it's an input field. */
  var Hint: String = js.native
  
  /**
    * determines whether changes in language attributes at the position the text field is located also change the number format as appropriate for this
    * language.
    * @since OOo 1.1.2
    */
  var IsFixedLanguage: Boolean = js.native
  
  /** determines whether this field is an input field. */
  var IsInput: Boolean = js.native
  
  /** determines whether the content is displayed or evaluated. */
  var IsShowFormula: Boolean = js.native
  
  /** determines whether the field is visible. */
  var IsVisible: Boolean = js.native
  
  /**
    * this is the number format for this field.
    * @see com.sun.star.util.NumberFormatter
    */
  var NumberFormat: Double = js.native
  
  /** specifies the type of the numbering as {@link com.sun.star.style.NumberingType} */
  var NumberingType: Double = js.native
  
  /** contains the sequence value when this field is used as sequence field. */
  var SequenceValue: Double = js.native
  
  /** determines the type of the variable as described in {@link com.sun.star.text.SetVariableType} */
  var SubType: Double = js.native
  
  /** contains the numerical value of the field. */
  var Value: Double = js.native
  
  /** contains the name of the set expression field master this field is connected to. */
  var VariableName: String = js.native
}
object SetExpression {
  
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Content: String,
    CurrentPresentation: String,
    Hint: String,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    IsFixedLanguage: Boolean,
    IsInput: Boolean,
    IsShowFormula: Boolean,
    IsVisible: Boolean,
    NumberFormat: Double,
    NumberingType: Double,
    PropertySetInfo: XPropertySetInfo,
    SequenceValue: Double,
    SubType: Double,
    TextFieldMaster: XPropertySet,
    TextWrap: WrapTextMode,
    Value: Double,
    VariableName: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    attachTextFieldMaster: XPropertySet => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getTextFieldMaster: () => XPropertySet,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SetExpression = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], Hint = Hint.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], IsFixedLanguage = IsFixedLanguage.asInstanceOf[js.Any], IsInput = IsInput.asInstanceOf[js.Any], IsShowFormula = IsShowFormula.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingType = NumberingType.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SequenceValue = SequenceValue.asInstanceOf[js.Any], SubType = SubType.asInstanceOf[js.Any], TextFieldMaster = TextFieldMaster.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], VariableName = VariableName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), attachTextFieldMaster = js.Any.fromFunction1(attachTextFieldMaster), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getTextFieldMaster = js.Any.fromFunction0(getTextFieldMaster), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SetExpression]
  }
  
  @scala.inline
  implicit class SetExpressionOps[Self <: SetExpression] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("Content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPresentation(value: String): Self = this.set("CurrentPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHint(value: String): Self = this.set("Hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedLanguage(value: Boolean): Self = this.set("IsFixedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInput(value: Boolean): Self = this.set("IsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsShowFormula(value: Boolean): Self = this.set("IsShowFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVisible(value: Boolean): Self = this.set("IsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberFormat(value: Double): Self = this.set("NumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingType(value: Double): Self = this.set("NumberingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceValue(value: Double): Self = this.set("SequenceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubType(value: Double): Self = this.set("SubType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableName(value: String): Self = this.set("VariableName", value.asInstanceOf[js.Any])
  }
}
