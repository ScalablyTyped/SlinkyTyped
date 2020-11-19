package typingsSlinky.activexLibreoffice.com_.sun.star.form.component

import typingsSlinky.activexLibreoffice.com_.sun.star.form.DataAwareControlModel
import typingsSlinky.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This service specifies a formatted field model which is data-aware, and can be bound to a database field. */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
- typingsSlinky.activexLibreoffice.com_.sun.star.awt.UnoControlFormattedFieldModel because var conflicts: DefaultControl, Height, Name, PositionX, PositionY, Step, TabIndex, Tag, Width. Inlined Align, BackgroundColor, Border, BorderColor, EffectiveDefault, EffectiveMax, EffectiveMin, EffectiveValue, Enabled, FontDescriptor, FontEmphasisMark, FontRelief, FormatKey, FormatsSupplier, HelpText, HelpURL, HideInactiveSelection, MaxTextLen, MouseWheelBehavior, Printable, ReadOnly, Repeat, RepeatDelay, Spin, StrictFormat, Tabstop, Text, TextColor, TextLineColor, TreatAsNumber, VerticalAlign, WritingMode
- typingsSlinky.activexLibreoffice.com_.sun.star.form.component.FormattedField because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
trait DatabaseFormattedField extends DataAwareControlModel {
  
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  
  /** specifies the background color (RGB) of the control. */
  var BackgroundColor: Color = js.native
  
  /**
    * specifies the border style of the control.
    *
    * `; 0: No border; 1: 3D border; 2: simple border; `
    */
  var Border: Double = js.native
  
  /**
    * specifies the color of the border, if present
    *
    * Not every border style (see {@link Border} ) may support coloring. For instance, usually a border with 3D effect will ignore the BorderColor setting.
    * @since OOo 2.0
    */
  var BorderColor: Double = js.native
  
  /**
    * determines if an empty text should be treated as a `NULL` value.
    *
    * When the user enters text into a formatted field control, and after this, the control content is to be committed into the database field the control
    * is bound to, a decision must be made how to deal with empty strings. ;  This is controlled by {@link ConvertEmptyToNull} .
    *
    * If the property is set to `TRUE` , and an empty text is to be committed, this is converted into `NULL` , else it is written as empty string.
    */
  var ConvertEmptyToNull: Boolean = js.native
  
  /**
    * specifies the default value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveDefault: js.Any = js.native
  
  /**
    * specifies the maximum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMax: Double = js.native
  
  /**
    * specifies the minimum value that can be entered.
    *
    * This property is ignored if the format of the field is no numeric format.
    */
  var EffectiveMin: Double = js.native
  
  /**
    * specifies the current value of the formatted field.
    *
    * This may be a numeric value (double) or a string, depending on the formatting of the field.
    */
  var EffectiveValue: Double = js.native
  
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  
  /**
    * specifies the format to be used when formatting the field input and output.
    *
    * This value is meaningful relative to the FormatsSupplier property only.
    */
  var FormatKey: Double = js.native
  
  /** supplies the formats the field should work with. */
  var FormatsSupplier: XNumberFormatsSupplier = js.native
  
  /** specifies the help text of the control. */
  var HelpText: String = js.native
  
  /** specifies the help URL of the control. */
  var HelpURL: String = js.native
  
  /**
    * specifies whether the selection in the control should be hidden when the control is not active (focused).
    * @since OOo 2.0
    */
  var HideInactiveSelection: Boolean = js.native
  
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: Double = js.native
  
  /**
    * defines how the mouse wheel can be used to scroll through the control's content.
    *
    * Usually, the mouse wheel spins the numeric value displayed in the control. Using this property, and one of the {@link MouseWheelBehavior} constants,
    * you can control under which circumstances this is possible.
    */
  var MouseWheelBehavior: Double = js.native
  
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  
  /**
    * specifies whether the mouse should show repeating behavior, i.e. repeatedly trigger an action when keeping pressed.
    * @since OOo 2.0
    */
  var Repeat: Boolean = js.native
  
  /**
    * specifies the mouse repeat delay, in milliseconds.
    *
    * When the user presses a mouse in a control area where this triggers an action (such as spinning the value), then usual control implementations allow
    * to repeatedly trigger this action, without the need to release the mouse button and to press it again. The delay between two such triggers is
    * specified with this property.
    * @since OOo 2.0
    */
  var RepeatDelay: Double = js.native
  
  /** specifies that the control has a spin button. */
  var Spin: Boolean = js.native
  
  /**
    * specifies that the text is checked during the user input.
    *
    * This property is optional - not every component implementing this service is required to provide it, as real-time input checking on a formatted field
    * may be pretty expensive.
    */
  var StrictFormat: Boolean = js.native
  
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  
  /** specifies the text displayed in the control. */
  var Text: String = js.native
  
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  
  /** specifies that the text is treated as a number. */
  var TreatAsNumber: Boolean = js.native
  
  /**
    * specifies the vertical alignment of the text in the control.
    * @since OOo 3.3
    */
  var VerticalAlign: VerticalAlignment = js.native
  
  /**
    * denotes the writing mode used in the control, as specified in the {@link com.sun.star.text.WritingMode2} constants group.
    *
    * Only {@link com.sun.star.text.WritingMode2.LR_TB} and {@link com.sun.star.text.WritingMode2.RL_TB} are supported at the moment.
    * @since OOo 3.1
    */
  var WritingMode: Double = js.native
}
