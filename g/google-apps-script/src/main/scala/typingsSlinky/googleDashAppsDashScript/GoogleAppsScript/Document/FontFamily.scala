package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontFamily extends js.Object

/**
  *
  * Deprecated. The methods getFontFamily() and setFontFamily(String) now use string
  *     names for fonts instead of this enum. Although this enum is deprecated, it will remain
  *     available for compatibility with older scripts.
  * An enumeration of the supported fonts.
  *
  * Use the FontFamily enumeration to set the font for a range of text, element or
  * document.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Insert a paragraph at the start of the document.
  *     body.insertParagraph(0, "Hello, Apps Script!");
  *
  *     // Set the document font to Calibri.
  *     body.editAsText().setFontFamily(DocumentApp.FontFamily.CALIBRI);
  *
  *     // Set the first paragraph font to Arial.
  *     body.getParagraphs()[0].setFontFamily(DocumentApp.FontFamily.ARIAL);
  *
  *     // Set "Apps Script" to Comic Sans MS.
  *     var text = 'Apps Script';
  *     var a = body.getText().indexOf(text);
  *     var b = a + text.length - 1;
  *     body.editAsText().setFontFamily(a, b, DocumentApp.FontFamily.COMIC_SANS_MS);
  */
@JSGlobal("GoogleAppsScript.Document.FontFamily")
@js.native
object FontFamily extends js.Object {
  @js.native
  sealed trait AMARANTH extends FontFamily
  
  @js.native
  sealed trait ARIAL extends FontFamily
  
  @js.native
  sealed trait ARIAL_BLACK extends FontFamily
  
  @js.native
  sealed trait ARIAL_NARROW extends FontFamily
  
  @js.native
  sealed trait ARVO extends FontFamily
  
  @js.native
  sealed trait CALIBRI extends FontFamily
  
  @js.native
  sealed trait CAMBRIA extends FontFamily
  
  @js.native
  sealed trait COMIC_SANS_MS extends FontFamily
  
  @js.native
  sealed trait CONSOLAS extends FontFamily
  
  @js.native
  sealed trait CORSIVA extends FontFamily
  
  @js.native
  sealed trait COURIER_NEW extends FontFamily
  
  @js.native
  sealed trait DANCING_SCRIPT extends FontFamily
  
  @js.native
  sealed trait DROID_SANS extends FontFamily
  
  @js.native
  sealed trait DROID_SERIF extends FontFamily
  
  @js.native
  sealed trait GARAMOND extends FontFamily
  
  @js.native
  sealed trait GEORGIA extends FontFamily
  
  @js.native
  sealed trait GLORIA_HALLELUJAH extends FontFamily
  
  @js.native
  sealed trait GREAT_VIBES extends FontFamily
  
  @js.native
  sealed trait LOBSTER extends FontFamily
  
  @js.native
  sealed trait MERRIWEATHER extends FontFamily
  
  @js.native
  sealed trait PACIFICO extends FontFamily
  
  @js.native
  sealed trait PHILOSOPHER extends FontFamily
  
  @js.native
  sealed trait POIRET_ONE extends FontFamily
  
  @js.native
  sealed trait QUATTROCENTO extends FontFamily
  
  @js.native
  sealed trait ROBOTO extends FontFamily
  
  @js.native
  sealed trait SHADOWS_INTO_LIGHT extends FontFamily
  
  @js.native
  sealed trait SYNCOPATE extends FontFamily
  
  @js.native
  sealed trait TAHOMA extends FontFamily
  
  @js.native
  sealed trait TIMES_NEW_ROMAN extends FontFamily
  
  @js.native
  sealed trait TREBUCHET_MS extends FontFamily
  
  @js.native
  sealed trait UBUNTU extends FontFamily
  
  @js.native
  sealed trait VERDANA extends FontFamily
  
  /* 0 */ val AMARANTH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.AMARANTH with Double = js.native
  /* 1 */ val ARIAL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL with Double = js.native
  /* 2 */ val ARIAL_BLACK: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL_BLACK with Double = js.native
  /* 3 */ val ARIAL_NARROW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARIAL_NARROW with Double = js.native
  /* 4 */ val ARVO: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ARVO with Double = js.native
  /* 5 */ val CALIBRI: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CALIBRI with Double = js.native
  /* 6 */ val CAMBRIA: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CAMBRIA with Double = js.native
  /* 7 */ val COMIC_SANS_MS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.COMIC_SANS_MS with Double = js.native
  /* 8 */ val CONSOLAS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CONSOLAS with Double = js.native
  /* 9 */ val CORSIVA: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.CORSIVA with Double = js.native
  /* 10 */ val COURIER_NEW: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.COURIER_NEW with Double = js.native
  /* 11 */ val DANCING_SCRIPT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DANCING_SCRIPT with Double = js.native
  /* 12 */ val DROID_SANS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DROID_SANS with Double = js.native
  /* 13 */ val DROID_SERIF: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.DROID_SERIF with Double = js.native
  /* 14 */ val GARAMOND: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GARAMOND with Double = js.native
  /* 15 */ val GEORGIA: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GEORGIA with Double = js.native
  /* 16 */ val GLORIA_HALLELUJAH: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GLORIA_HALLELUJAH with Double = js.native
  /* 17 */ val GREAT_VIBES: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.GREAT_VIBES with Double = js.native
  /* 18 */ val LOBSTER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.LOBSTER with Double = js.native
  /* 19 */ val MERRIWEATHER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.MERRIWEATHER with Double = js.native
  /* 20 */ val PACIFICO: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.PACIFICO with Double = js.native
  /* 21 */ val PHILOSOPHER: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.PHILOSOPHER with Double = js.native
  /* 22 */ val POIRET_ONE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.POIRET_ONE with Double = js.native
  /* 23 */ val QUATTROCENTO: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.QUATTROCENTO with Double = js.native
  /* 24 */ val ROBOTO: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.ROBOTO with Double = js.native
  /* 25 */ val SHADOWS_INTO_LIGHT: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.SHADOWS_INTO_LIGHT with Double = js.native
  /* 26 */ val SYNCOPATE: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.SYNCOPATE with Double = js.native
  /* 27 */ val TAHOMA: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TAHOMA with Double = js.native
  /* 28 */ val TIMES_NEW_ROMAN: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TIMES_NEW_ROMAN with Double = js.native
  /* 29 */ val TREBUCHET_MS: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.TREBUCHET_MS with Double = js.native
  /* 30 */ val UBUNTU: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.UBUNTU with Double = js.native
  /* 31 */ val VERDANA: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Document.FontFamily.VERDANA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontFamily with Double] = js.native
}

