package typingsSlinky.activexLibreoffice.com_.sun.star.text.textfield

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextContentAnchorType
import typingsSlinky.activexLibreoffice.com_.sun.star.text.TextField_
import typingsSlinky.activexLibreoffice.com_.sun.star.text.WrapTextMode
import typingsSlinky.activexLibreoffice.com_.sun.star.text.XTextRange
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies service of a conditional text field.
  * @see com.sun.star.text.TextField
  */
@js.native
trait ConditionalText extends TextField_ {
  /** contains the condition. */
  var Condition: String = js.native
  /**
    * contains the current content of the text field.
    *
    * This property is especially useful for import/export purposes.
    */
  var CurrentPresentation: String = js.native
  /** contains the text that is displayed if the condition evaluates to `FALSE` . */
  var FalseContent: String = js.native
  /**
    * contains the result of the last evaluation of the condition.
    *
    * This property has to be read/written in file export/import to save and restore the result without initiation of a new evaluation.
    */
  var IsConditionTrue: Boolean = js.native
  /** contains the text that is displayed if the condition evaluates to `TRUE` . */
  var TrueContent: String = js.native
}

object ConditionalText {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Condition: String,
    CurrentPresentation: String,
    FalseContent: String,
    IsConditionTrue: Boolean,
    IsFieldDisplayed: Boolean,
    IsFieldUsed: Boolean,
    PropertySetInfo: XPropertySetInfo,
    TextWrap: WrapTextMode,
    TrueContent: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getPresentation: Boolean => String,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ConditionalText = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], AnchorType = AnchorType.asInstanceOf[js.Any], AnchorTypes = AnchorTypes.asInstanceOf[js.Any], Condition = Condition.asInstanceOf[js.Any], CurrentPresentation = CurrentPresentation.asInstanceOf[js.Any], FalseContent = FalseContent.asInstanceOf[js.Any], IsConditionTrue = IsConditionTrue.asInstanceOf[js.Any], IsFieldDisplayed = IsFieldDisplayed.asInstanceOf[js.Any], IsFieldUsed = IsFieldUsed.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], TextWrap = TextWrap.asInstanceOf[js.Any], TrueContent = TrueContent.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getPresentation = js.Any.fromFunction1(getPresentation), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ConditionalText]
  }
  @scala.inline
  implicit class ConditionalTextOps[Self <: ConditionalText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPresentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPresentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FalseContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsConditionTrue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsConditionTrue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrueContent")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

