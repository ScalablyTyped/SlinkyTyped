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
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the standard model of an {@link UnoControlEdit} . */
@js.native
trait UnoControlEditModel extends UnoControlModel {
  /**
    * specifies the horizontal alignment of the text in the control.
    *
    * `; 0: left; 1: center; 2: right; `
    */
  var Align: Double = js.native
  /**
    * If set to true an horizontal scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoHScroll: Boolean = js.native
  /**
    * If set to true an vertical scrollbar will be added automatically when needed.
    * @since OOo 2.3
    */
  var AutoVScroll: Boolean = js.native
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
  /** specifies the echo character for a password edit field. */
  var EchoChar: Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: Boolean = js.native
  /** specifies the font attributes of the text in the control. */
  var FontDescriptor: typingsSlinky.activexLibreoffice.com_.sun.star.awt.FontDescriptor = js.native
  /** specifies the {@link com.sun.star.text.FontEmphasis} value of the text in the control. */
  var FontEmphasisMark: Double = js.native
  /** specifies the {@link com.sun.star.text.FontRelief} value of the text in the control. */
  var FontRelief: Double = js.native
  /** specifies if the content of the control can be scrolled in the horizontal direction. */
  var HScroll: Boolean = js.native
  /** specifies if hard line breaks will be returned in the {@link XTextComponent.getText()} method. */
  var HardLineBreaks: Boolean = js.native
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
    * specifies which line end type should be used for multi line text
    *
    * Controls working with this model care for this setting when the user enters text. Every line break entered into the control will be treated according
    * to this setting, so that the {@link Text} property always contains only line ends in the format specified.
    *
    * Possible values are all constants from the {@link LineEndFormat} group.
    *
    * Note that this setting is usually not relevant when you set new text via the API. No matter which line end format is used in this new text then, usual
    * control implementations should recognize all line end formats and display them properly.
    * @since OOo 2.0
    */
  var LineEndFormat: Double = js.native
  /**
    * specifies the maximum character count.
    *
    * There's no limitation, if set to 0.
    */
  var MaxTextLen: Double = js.native
  /** specifies that the control may have more than one line. */
  var MultiLine: Boolean = js.native
  /**
    * specifies whether the control paints it background or not.
    * @since OOo 2.3
    */
  var PaintTransparent: Boolean = js.native
  /** specifies that the control will be printed with the document. */
  var Printable: Boolean = js.native
  /** specifies that the content of the control cannot be modified by the user. */
  var ReadOnly: Boolean = js.native
  /** specifies that the control can be reached with the TAB key. */
  var Tabstop: Boolean = js.native
  /** specifies the text displayed in the control. */
  var Text: String = js.native
  /** specifies the text color (RGB) of the control. */
  var TextColor: Color = js.native
  /** specifies the text line color (RGB) of the control. */
  var TextLineColor: Color = js.native
  /** specifies if the content of the control can be scrolled in the vertical direction. */
  var VScroll: Boolean = js.native
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

object UnoControlEditModel {
  @scala.inline
  def apply(
    Align: Double,
    AutoHScroll: Boolean,
    AutoVScroll: Boolean,
    BackgroundColor: Color,
    Border: Double,
    BorderColor: Double,
    DefaultControl: String,
    EchoChar: Double,
    Enabled: Boolean,
    FontDescriptor: FontDescriptor,
    FontEmphasisMark: Double,
    FontRelief: Double,
    HScroll: Boolean,
    HardLineBreaks: Boolean,
    Height: Double,
    HelpText: String,
    HelpURL: String,
    HideInactiveSelection: Boolean,
    LineEndFormat: Double,
    MaxTextLen: Double,
    MultiLine: Boolean,
    Name: String,
    PaintTransparent: Boolean,
    PositionX: String,
    PositionY: String,
    Printable: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ReadOnly: Boolean,
    ServiceName: String,
    Step: Double,
    TabIndex: Double,
    Tabstop: Boolean,
    Tag: String,
    Text: String,
    TextColor: Color,
    TextLineColor: Color,
    VScroll: Boolean,
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
  ): UnoControlEditModel = {
    val __obj = js.Dynamic.literal(Align = Align.asInstanceOf[js.Any], AutoHScroll = AutoHScroll.asInstanceOf[js.Any], AutoVScroll = AutoVScroll.asInstanceOf[js.Any], BackgroundColor = BackgroundColor.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], DefaultControl = DefaultControl.asInstanceOf[js.Any], EchoChar = EchoChar.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FontDescriptor = FontDescriptor.asInstanceOf[js.Any], FontEmphasisMark = FontEmphasisMark.asInstanceOf[js.Any], FontRelief = FontRelief.asInstanceOf[js.Any], HScroll = HScroll.asInstanceOf[js.Any], HardLineBreaks = HardLineBreaks.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], HelpText = HelpText.asInstanceOf[js.Any], HelpURL = HelpURL.asInstanceOf[js.Any], HideInactiveSelection = HideInactiveSelection.asInstanceOf[js.Any], LineEndFormat = LineEndFormat.asInstanceOf[js.Any], MaxTextLen = MaxTextLen.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PaintTransparent = PaintTransparent.asInstanceOf[js.Any], PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], Printable = Printable.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any], Step = Step.asInstanceOf[js.Any], TabIndex = TabIndex.asInstanceOf[js.Any], Tabstop = Tabstop.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextColor = TextColor.asInstanceOf[js.Any], TextLineColor = TextLineColor.asInstanceOf[js.Any], VScroll = VScroll.asInstanceOf[js.Any], VerticalAlign = VerticalAlign.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any], WritingMode = WritingMode.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), createClone = js.Any.fromFunction0(createClone), dispose = js.Any.fromFunction0(dispose), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), getServiceName = js.Any.fromFunction0(getServiceName), queryInterface = js.Any.fromFunction1(queryInterface), read = js.Any.fromFunction1(read), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[UnoControlEditModel]
  }
  @scala.inline
  implicit class UnoControlEditModelOps[Self <: UnoControlEditModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoHScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoHScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoVScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoVScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackgroundColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorderColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEchoChar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EchoChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontDescriptor(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontEmphasisMark(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontEmphasisMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontRelief(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FontRelief")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHardLineBreaks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HardLineBreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideInactiveSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HideInactiveSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineEndFormat(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineEndFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxTextLen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxTextLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMultiLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MultiLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPaintTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PaintTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrintable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Printable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabstop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tabstop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLineColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextLineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerticalAlign(value: VerticalAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VerticalAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWritingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WritingMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

