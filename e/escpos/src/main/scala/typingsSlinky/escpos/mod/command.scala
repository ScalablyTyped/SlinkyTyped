package typingsSlinky.escpos.mod

import typingsSlinky.escpos.anon.BARCODEHEIGHTDEFAULT
import typingsSlinky.escpos.anon.`1`
import typingsSlinky.escpos.anon.`2`
import typingsSlinky.escpos.anon.`3`
import typingsSlinky.escpos.escposStrings.Backspace
import typingsSlinky.escpos.escposStrings.Cancel
import typingsSlinky.escpos.escposStrings.Carriagereturn
import typingsSlinky.escpos.escposStrings.Charactertabulation
import typingsSlinky.escpos.escposStrings.Datalinkescape
import typingsSlinky.escpos.escposStrings.Endoftransmission
import typingsSlinky.escpos.escposStrings.Escape
import typingsSlinky.escpos.escposStrings.Escape2
import typingsSlinky.escpos.escposStrings.Escape3
import typingsSlinky.escpos.escposStrings.Escape4
import typingsSlinky.escpos.escposStrings.Escape5
import typingsSlinky.escpos.escposStrings.EscapeAsteriskExclamationmark
import typingsSlinky.escpos.escposStrings.EscapeAsteriskNull
import typingsSlinky.escpos.escposStrings.EscapeAsteriskStartofheading
import typingsSlinky.escpos.escposStrings.EscapeB
import typingsSlinky.escpos.escposStrings.EscapeENull
import typingsSlinky.escpos.escposStrings.EscapeEStartofheading
import typingsSlinky.escpos.escposStrings.EscapeEqualssignStartofheading
import typingsSlinky.escpos.escposStrings.EscapeExclamationmark0
import typingsSlinky.escpos.escposStrings.EscapeExclamationmarkDatalinkescape
import typingsSlinky.escpos.escposStrings.EscapeExclamationmarkNull
import typingsSlinky.escpos.escposStrings.EscapeMNull
import typingsSlinky.escpos.escposStrings.EscapeMStartofheading
import typingsSlinky.escpos.escposStrings.EscapeMStartoftext
import typingsSlinky.escpos.escposStrings.EscapeO
import typingsSlinky.escpos.escposStrings.EscapeQ
import typingsSlinky.escpos.escposStrings.EscapeQuestionmarkLinefeedNull
import typingsSlinky.escpos.escposStrings.EscapeaNull
import typingsSlinky.escpos.escposStrings.EscapeaStartofheading
import typingsSlinky.escpos.escposStrings.EscapeaStartoftext
import typingsSlinky.escpos.escposStrings.Escapel
import typingsSlinky.escpos.escposStrings.EscapepNull
import typingsSlinky.escpos.escposStrings.EscapepStartofheading
import typingsSlinky.escpos.escposStrings.EscaperNull
import typingsSlinky.escpos.escposStrings.EscaperStartofheading
import typingsSlinky.escpos.escposStrings.Formfeed
import typingsSlinky.escpos.escposStrings.H
import typingsSlinky.escpos.escposStrings.Informationseparatorfour
import typingsSlinky.escpos.escposStrings.Informationseparatorone$
import typingsSlinky.escpos.escposStrings.InformationseparatoroneB
import typingsSlinky.escpos.escposStrings.InformationseparatoroneC
import typingsSlinky.escpos.escposStrings.InformationseparatoroneCarriagereturn
import typingsSlinky.escpos.escposStrings.InformationseparatoroneE
import typingsSlinky.escpos.escposStrings.InformationseparatoroneEndoftext
import typingsSlinky.escpos.escposStrings.InformationseparatoroneLinefeed
import typingsSlinky.escpos.escposStrings.InformationseparatoroneStartofheading
import typingsSlinky.escpos.escposStrings.InformationseparatoroneStartoftext
import typingsSlinky.escpos.escposStrings.InformationseparatoroneT
import typingsSlinky.escpos.escposStrings.InformationseparatoroneU
import typingsSlinky.escpos.escposStrings.InformationseparatoroneX
import typingsSlinky.escpos.escposStrings.Informationseparatoroner
import typingsSlinky.escpos.escposStrings.Informationseparatoronev
import typingsSlinky.escpos.escposStrings.Informationseparatorthree
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeHEndoftext
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeHNull
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeHStartofheading
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeHStartoftext
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeVA
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeVB
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeVNull
import typingsSlinky.escpos.escposStrings.InformationseparatorthreeVStartofheading
import typingsSlinky.escpos.escposStrings.InformationseparatorthreefNull
import typingsSlinky.escpos.escposStrings.InformationseparatorthreefStartofheading
import typingsSlinky.escpos.escposStrings.Informationseparatorthreehd
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekAcknowledge
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekEndoftext
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekEndoftransmission
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekEnquiry
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekH
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekI
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekNull
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekStartofheading
import typingsSlinky.escpos.escposStrings.InformationseparatorthreekStartoftext
import typingsSlinky.escpos.escposStrings.Informationseparatorthreev0Endoftext
import typingsSlinky.escpos.escposStrings.Informationseparatorthreev0Null
import typingsSlinky.escpos.escposStrings.Informationseparatorthreev0Startofheading
import typingsSlinky.escpos.escposStrings.Informationseparatorthreev0Startoftext
import typingsSlinky.escpos.escposStrings.InformationseparatorthreewStartofheading
import typingsSlinky.escpos.escposStrings.JNull
import typingsSlinky.escpos.escposStrings.L
import typingsSlinky.escpos.escposStrings.Linefeed
import typingsSlinky.escpos.escposStrings.Linetabulation
import typingsSlinky.escpos.escposStrings.M
import typingsSlinky.escpos.escposStrings.Null
import typingsSlinky.escpos.escposStrings.Q
import typingsSlinky.escpos.escposStrings.`Escape Null`
import typingsSlinky.escpos.escposStrings.`Escape `
import typingsSlinky.escpos.escposStrings.`Escape-Null`
import typingsSlinky.escpos.escposStrings.`Escape-Startofheading`
import typingsSlinky.escpos.escposStrings.`Escape-Startoftext`
import typingsSlinky.escpos.escposStrings.`Escape@`
import typingsSlinky.escpos.escposStrings.`EscapeAsterisk `
import typingsSlinky.escpos.escposStrings.`EscapeExclamationmark `
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("escpos", "command")
@js.native
object command extends js.Object {
  val BEEP: EscapeB = js.native
  val DLE: Datalinkescape = js.native
  val EOL: Linefeed = js.native
  val EOT: Endoftransmission = js.native
  val ESC: Escape = js.native
  val FF: Formfeed = js.native
  val FS: Informationseparatorfour = js.native
  val GS: Informationseparatorthree = js.native
  val LF: Linefeed = js.native
  val NUL: Null = js.native
  @js.native
  object BARCODE_FORMAT extends js.Object {
     // Barcode type CODE93
    var BARCODE_CODE128: InformationseparatorthreekI = js.native
     // Barcode type EAN8
    var BARCODE_CODE39: InformationseparatorthreekEndoftransmission = js.native
     // Barcode type NW7
    var BARCODE_CODE93: InformationseparatorthreekH = js.native
     // Barcode type UPC-E
    var BARCODE_EAN13: InformationseparatorthreekStartoftext = js.native
     // Barcode type EAN13
    var BARCODE_EAN8: InformationseparatorthreekEndoftext = js.native
     // HRI barcode chars both above and below
    var BARCODE_FONT_A: InformationseparatorthreefNull = js.native
     // Font type A for HRI barcode chars
    var BARCODE_FONT_B: InformationseparatorthreefStartofheading = js.native
    var BARCODE_HEIGHT_DEFAULT: Informationseparatorthreehd = js.native
     // Barcode type CODE39
    var BARCODE_ITF: InformationseparatorthreekEnquiry = js.native
     // Barcode type ITF
    var BARCODE_NW7: InformationseparatorthreekAcknowledge = js.native
     // HRI barcode chars OFF
    var BARCODE_TXT_ABV: InformationseparatorthreeHStartofheading = js.native
     // HRI barcode chars above
    var BARCODE_TXT_BLW: InformationseparatorthreeHStartoftext = js.native
     // HRI barcode chars below
    var BARCODE_TXT_BTH: InformationseparatorthreeHEndoftext = js.native
    var BARCODE_TXT_OFF: InformationseparatorthreeHNull = js.native
     // Barcode width default=1
    var BARCODE_UPC_A: InformationseparatorthreekNull = js.native
     // Barcode type UPC-A
    var BARCODE_UPC_E: InformationseparatorthreekStartofheading = js.native
     // Barcode Height [1-255]
    // Barcode Width  [2-6]
    var BARCODE_WIDTH: `3` = js.native
     // Barcode height default=100
    var BARCODE_WIDTH_DEFAULT: InformationseparatorthreewStartofheading = js.native
     // Font type B for HRI barcode chars
    def BARCODE_HEIGHT(height: js.Any): js.Any = js.native
  }
  
  @js.native
  object BITMAP_FORMAT extends js.Object {
    var BITMAP_D24: EscapeAsteriskExclamationmark = js.native
    var BITMAP_D8: EscapeAsteriskStartofheading = js.native
    var BITMAP_S24: `EscapeAsterisk ` = js.native
    var BITMAP_S8: EscapeAsteriskNull = js.native
  }
  
  @js.native
  object CASH_DRAWER extends js.Object {
    var CD_KICK_2: EscapepNull = js.native
     // Sends a pulse to pin 2 []
    var CD_KICK_5: EscapepStartofheading = js.native
  }
  
  @js.native
  object CHARACTER_SPACING extends js.Object {
    var CS_DEFAULT: `Escape Null` = js.native
    var CS_SET: `Escape ` = js.native
  }
  
  @js.native
  object CODE2D_FORMAT extends js.Object {
    var CODE2D: js.Any = js.native
     // correct level 25%
    var QR_LEVEL_H: H = js.native
    var QR_LEVEL_L: L = js.native
     // correct level 7%
    var QR_LEVEL_M: M = js.native
     // correct level 15%
    var QR_LEVEL_Q: Q = js.native
    var TYPE_DATAMATRIX: js.Any = js.native
    var TYPE_PDF417: js.Any = js.native
    var TYPE_QR: js.Any = js.native
  }
  
  @js.native
  object COLOR extends js.Object {
    var `0`: EscaperNull = js.native
     // black
    var `1`: EscaperStartofheading = js.native
  }
  
  @js.native
  object FEED_CONTROL_SEQUENCES extends js.Object {
     // Form feed
    var CTL_CR: Carriagereturn = js.native
     // Print and feed paper (without spaces between lines)
    var CTL_FF: Formfeed = js.native
     // Print and line feed
    var CTL_GLF: JNull = js.native
     // Carriage return
    var CTL_HT: Charactertabulation = js.native
    var CTL_LF: Linefeed = js.native
     // Horizontal tab
    var CTL_VT: Linetabulation = js.native
  }
  
  @js.native
  object GSV0_FORMAT extends js.Object {
    var GSV0_DH: Informationseparatorthreev0Startoftext = js.native
    var GSV0_DW: Informationseparatorthreev0Startofheading = js.native
    var GSV0_DWDH: Informationseparatorthreev0Endoftext = js.native
    var GSV0_NORMAL: Informationseparatorthreev0Null = js.native
  }
  
  @js.native
  object HARDWARE extends js.Object {
    var HW_INIT: `Escape@` = js.native
     // Printer select
    var HW_RESET: EscapeQuestionmarkLinefeedNull = js.native
     // Clear data in buffer and reset modes
    var HW_SELECT: EscapeEqualssignStartofheading = js.native
  }
  
  @js.native
  object IMAGE_FORMAT extends js.Object {
     // Set raster image double width
    var S_RASTER_2H: Informationseparatorthreev0Startoftext = js.native
     // Set raster image normal size
    var S_RASTER_2W: Informationseparatorthreev0Startofheading = js.native
    var S_RASTER_N: Informationseparatorthreev0Null = js.native
     // Set raster image double height
    var S_RASTER_Q: Informationseparatorthreev0Endoftext = js.native
  }
  
  @js.native
  object LINE_SPACING extends js.Object {
    var LS_DEFAULT: Escape2 = js.native
    var LS_SET: Escape3 = js.native
  }
  
  @js.native
  object MARGINS extends js.Object {
    var BOTTOM: EscapeO = js.native
     // Fix bottom size
    var LEFT: Escapel = js.native
     // Fix left size
    var RIGHT: EscapeQ = js.native
  }
  
  @js.native
  object MODEL extends js.Object {
    var QSPRINTER: BARCODEHEIGHTDEFAULT = js.native
  }
  
  @js.native
  object PAPER extends js.Object {
     // Partial cut paper
    var PAPER_CUT_A: InformationseparatorthreeVA = js.native
     // Partial cut paper
    var PAPER_CUT_B: InformationseparatorthreeVB = js.native
    var PAPER_FULL_CUT: InformationseparatorthreeVNull = js.native
     // Full cut paper
    var PAPER_PART_CUT: InformationseparatorthreeVStartofheading = js.native
  }
  
  @js.native
  object SCREEN extends js.Object {
    var BS: Backspace = js.native
     // Clears all displayed characters
    var CAN: Cancel = js.native
     // Moves the cursor to the nth position on the mth line
    var CLR: Formfeed = js.native
     // Moves the cursor to the left-most position on the upper line (home position)
    var CR: Carriagereturn = js.native
     // Moves the cursor up one line
    var HOM: Linetabulation = js.native
     // Moves the cursor one character position to the left
    var HT: Charactertabulation = js.native
     // Moves the cursor one character position to the right
    var LF: Linefeed = js.native
     // Moves the cursor to the bottom position
    @JSName("US_$")
    var US_$: Informationseparatorone$ = js.native
     // Moves the cursor to the right-most position on the current line
    var US_B: InformationseparatoroneB = js.native
     // Selects horizontal scroll mode as the display screen mode
    var US_C: InformationseparatoroneC = js.native
     // Moves the cursor to the left-most position on the current line
    var US_CR: InformationseparatoroneCarriagereturn = js.native
     // Turn cursor display mode on/off
    var US_E: InformationseparatoroneE = js.native
     // Moves the cursor down one line
    var US_LF: InformationseparatoroneLinefeed = js.native
     // Clears the line containing the cursor
    var US_MD1: InformationseparatoroneStartofheading = js.native
     // Selects overwrite mode as the screen display mode
    var US_MD2: InformationseparatoroneStartoftext = js.native
     // Selects vertical scroll mode as the screen display mode
    var US_MD3: InformationseparatoroneEndoftext = js.native
     // Sets or cancels the blink interval of the display screen
    var US_T: InformationseparatoroneT = js.native
     // Sets the counter time and displays it in the bottom right of the screen
    var US_U: InformationseparatoroneU = js.native
     // Displays the time counter at the right side of the bottom line
    var US_X: InformationseparatoroneX = js.native
     // Sets the brightness of the fluorescent character display tube
    var US_r: Informationseparatoroner = js.native
     // Selects or cancels reverse display of the characters received after this command
    var US_v: Informationseparatoronev = js.native
  }
  
  @js.native
  object TEXT_FORMAT extends js.Object {
     // Normal text
    var TXT_2HEIGHT: EscapeExclamationmarkDatalinkescape = js.native
     // Double height text
    var TXT_2WIDTH: `EscapeExclamationmark ` = js.native
     // Double width text
    var TXT_4SQUARE: EscapeExclamationmark0 = js.native
     // Left justification
    var TXT_ALIGN_CT: EscapeaStartofheading = js.native
     // Font type C
    var TXT_ALIGN_LT: EscapeaNull = js.native
     // Centering
    var TXT_ALIGN_RT: EscapeaStartoftext = js.native
     // Underline font 2-dot ON
    var TXT_BOLD_OFF: EscapeENull = js.native
     // Bold font OFF
    var TXT_BOLD_ON: EscapeEStartofheading = js.native
     // Italic font ON
    var TXT_FONT_A: EscapeMNull = js.native
     // Font type A
    var TXT_FONT_B: EscapeMStartofheading = js.native
     // Font type B
    var TXT_FONT_C: EscapeMStartoftext = js.native
    var TXT_HEIGHT: `1` = js.native
     // Bold font ON
    var TXT_ITALIC_OFF: Escape5 = js.native
     // Italic font ON
    var TXT_ITALIC_ON: Escape4 = js.native
    var TXT_NORMAL: EscapeExclamationmarkNull = js.native
     // Underline font 1-dot ON
    var TXT_UNDERL2_ON: `Escape-Startoftext` = js.native
    var TXT_UNDERL_OFF: `Escape-Null` = js.native
     // Underline font OFF
    var TXT_UNDERL_ON: `Escape-Startofheading` = js.native
    var TXT_WIDTH: `2` = js.native
     // Double width & height text
    def TXT_CUSTOM_SIZE(width: js.Any, height: js.Any): js.Any = js.native
  }
  
}

