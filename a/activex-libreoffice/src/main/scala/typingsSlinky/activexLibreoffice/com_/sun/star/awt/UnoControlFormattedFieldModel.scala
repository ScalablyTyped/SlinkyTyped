package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XObjectInputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.io.XObjectOutputStream
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.style.VerticalAlignment
import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsSlinky.activexLibreoffice.com_.sun.star.util.XNumberFormatsSupplier
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies the standard model of an {@link UnoControlFormattedField} . */
@js.native
trait UnoControlFormattedFieldModel extends UnoControlModel {
  
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
object UnoControlFormattedFieldModel {
  
  @scala.inline
  def apply(
    Align: Double,
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    EffectiveDefault: js.Any,
    EffectiveMax: Double,
    EffectiveMin: Double,
    EffectiveValue: Double,
    Enabled: Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    FormatKey: Double,
    FormatsSupplier: XNumberFormatsSupplier,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    HideInactiveSelection: Boolean,
    MaxTextLen: Double,
    MouseWheelBehavior: Double,
    Name: String,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    Repeat: Boolean,
    RepeatDelay: Double,
    ServiceName: String,
    Spin: Boolean,
    Step: Double,
    StrictFormat: Boolean,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Text: String,
    TextColor: Color,
    TextLineColor: Color,
    TreatAsNumber: Boolean,
    VerticalAlign: VerticalAlignment,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    createClone: () => XCloneable,
    dispose: () => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    getServiceName: () => String,
    queryInterface: `type` => js.Any,
    read: XObjectInputStream => Unit,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit,
    write: XObjectOutputStream => Unit
  ): UnoControlFormattedFieldModel = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], EffectiveDefault = EffectiveDefault.asInstanceOf[js.Any], EffectiveMax = EffectiveMax.asInstanceOf[js.Any], EffectiveMin = EffectiveMin.asInstanceOf[js.Any], EffectiveValue = EffectiveValue.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], FormatKey = FormatKey.asInstanceOf[js.Any], FormatsSupplier = FormatsSupplier.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], HideInactiveSelection = HideInactiveSelection.asInstanceOf[js.Any], MaxTextLen = MaxTextLen.asInstanceOf[js.Any], MouseWheelBehavior = MouseWheelBehavior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Repeat = Repeat.asInstanceOf[js.Any], RepeatDelay = RepeatDelay.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Spin = Spin.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], StrictFormat = StrictFormat.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], TreatAsNumber = TreatAsNumber.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlFormattedFieldModel]
  }
  
  @scala.inline
  implicit class UnoControlFormattedFieldModelOps[Self <: UnoControlFormattedFieldModel] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: Double): Self = this.set("Align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = this.set("BackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: Double): Self = this.set("Border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDefault(value: js.Any): Self = this.set("EffectiveDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMax(value: Double): Self = this.set("EffectiveMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveMin(value: Double): Self = this.set("EffectiveMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveValue(value: Double): Self = this.set("EffectiveValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDescriptor(value: FontDescriptor): Self = this.set("FontDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontEmphasisMark(value: Double): Self = this.set("FontEmphasisMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontRelief(value: Double): Self = this.set("FontRelief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatKey(value: Double): Self = this.set("FormatKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsSupplier(value: XNumberFormatsSupplier): Self = this.set("FormatsSupplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpText(value: String): Self = this.set("HelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpURL(value: String): Self = this.set("HelpURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideInactiveSelection(value: Boolean): Self = this.set("HideInactiveSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTextLen(value: Double): Self = this.set("MaxTextLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelBehavior(value: Double): Self = this.set("MouseWheelBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintable(value: Boolean): Self = this.set("Printable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeat(value: Boolean): Self = this.set("Repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDelay(value: Double): Self = this.set("RepeatDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpin(value: Boolean): Self = this.set("Spin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictFormat(value: Boolean): Self = this.set("StrictFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabstop(value: Boolean): Self = this.set("Tabstop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColor(value: Color): Self = this.set("TextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextLineColor(value: Color): Self = this.set("TextLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreatAsNumber(value: Boolean): Self = this.set("TreatAsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignment): Self = this.set("VerticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingMode(value: Double): Self = this.set("WritingMode", value.asInstanceOf[js.Any])
  }
}
