package typingsSlinky.activexOutlook.Outlook

import typingsSlinky.activexStdole.stdole.OLE_COLOR
import typingsSlinky.activexStdole.stdole.StdFont
import typingsSlinky.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Outlook TextBox */
@js.native
trait OlkTextBox extends StObject {
  
  var AutoSize: Boolean = js.native
  
  var AutoTab: Boolean = js.native
  
  var AutoWordSelect: Boolean = js.native
  
  var BackColor: OLE_COLOR = js.native
  
  var BorderStyle: OlBorderStyle = js.native
  
  def Clear(): Unit = js.native
  
  def Copy(): Unit = js.native
  
  def Cut(): Unit = js.native
  
  var DragBehavior: OlDragBehavior = js.native
  
  var EnableRichText: Boolean = js.native
  
  var Enabled: Boolean = js.native
  
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  
  var EnterKeyBehavior: Boolean = js.native
  
  val Font: StdFont = js.native
  
  var ForeColor: OLE_COLOR = js.native
  
  var HideSelection: Boolean = js.native
  
  var IntegralHeight: Boolean = js.native
  
  var Locked: Boolean = js.native
  
  var MaxLength: Double = js.native
  
  var MouseIcon: StdPicture = js.native
  
  var MousePointer: OlMousePointer = js.native
  
  var MultiLine: Boolean = js.native
  
  @JSName("Outlook.OlkTextBox_typekey")
  var OutlookDotOlkTextBox_typekey: OlkTextBox = js.native
  
  var PasswordChar: String = js.native
  
  def Paste(): Unit = js.native
  
  var Scrollbars: OlScrollBars = js.native
  
  var SelLength: Double = js.native
  
  var SelStart: Double = js.native
  
  val SelText: String = js.native
  
  var SelectionMargin: Boolean = js.native
  
  var TabKeyBehavior: Boolean = js.native
  
  var Text: String = js.native
  
  var TextAlign: OlTextAlign = js.native
  
  var Value: js.Any = js.native
  
  var WordWrap: Boolean = js.native
}
object OlkTextBox {
  
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoTab: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BorderStyle: OlBorderStyle,
    Clear: () => Unit,
    Copy: () => Unit,
    Cut: () => Unit,
    DragBehavior: OlDragBehavior,
    EnableRichText: Boolean,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    EnterKeyBehavior: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntegralHeight: Boolean,
    Locked: Boolean,
    MaxLength: Double,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    MultiLine: Boolean,
    OutlookDotOlkTextBox_typekey: OlkTextBox,
    PasswordChar: String,
    Paste: () => Unit,
    Scrollbars: OlScrollBars,
    SelLength: Double,
    SelStart: Double,
    SelText: String,
    SelectionMargin: Boolean,
    TabKeyBehavior: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkTextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), DragBehavior = DragBehavior.asInstanceOf[js.Any], EnableRichText = EnableRichText.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), Scrollbars = Scrollbars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTextBox_typekey")(OutlookDotOlkTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTextBox]
  }
  
  @scala.inline
  implicit class OlkTextBoxMutableBuilder[Self <: OlkTextBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoTab(value: Boolean): Self = StObject.set(x, "AutoTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoWordSelect(value: Boolean): Self = StObject.set(x, "AutoWordSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStyle(value: OlBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDragBehavior(value: OlDragBehavior): Self = StObject.set(x, "DragBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRichText(value: Boolean): Self = StObject.set(x, "EnableRichText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = StObject.set(x, "EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterKeyBehavior(value: Boolean): Self = StObject.set(x, "EnterKeyBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: StdFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideSelection(value: Boolean): Self = StObject.set(x, "HideSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegralHeight(value: Boolean): Self = StObject.set(x, "IntegralHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLine(value: Boolean): Self = StObject.set(x, "MultiLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotOlkTextBox_typekey(value: OlkTextBox): Self = StObject.set(x, "Outlook.OlkTextBox_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordChar(value: String): Self = StObject.set(x, "PasswordChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollbars(value: OlScrollBars): Self = StObject.set(x, "Scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelLength(value: Double): Self = StObject.set(x, "SelLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelStart(value: Double): Self = StObject.set(x, "SelStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelText(value: String): Self = StObject.set(x, "SelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionMargin(value: Boolean): Self = StObject.set(x, "SelectionMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabKeyBehavior(value: Boolean): Self = StObject.set(x, "TabKeyBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
  }
}
