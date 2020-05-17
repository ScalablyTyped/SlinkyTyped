package typingsSlinky.googleAppsScript.global.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An enumeration that provides access to MIME-type declarations without typing the strings
  * explicitly. Methods that expect a MIME type rendered as a string (for example,
  * 'image/png') also accept any of the values below, so long as the method supports the
  * underlying MIME type.
  *
  *     // Use MimeType enum to log the name of every Google Doc in the user's Drive.
  *     var docs = DriveApp.getFilesByType(MimeType.GOOGLE_DOCS);
  *     while (docs.hasNext()) {
  *      var doc = docs.next();
  *      Logger.log(doc.getName())
  *     }
  *
  *     // Use plain string to log the size of every PNG in the user's Drive.
  *     var pngs = DriveApp.getFilesByType('image/png');
  *     while (pngs.hasNext()) {
  *      var png = pngs.next();
  *      Logger.log(png.getSize());
  *     }
  */
@JSGlobal("GoogleAppsScript.Base.MimeType")
@js.native
object MimeType extends js.Object {
  /* 8 */ val BMP: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.BMP with Double = js.native
  /* 14 */ val CSS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.CSS with Double = js.native
  /* 15 */ val CSV: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.CSV with Double = js.native
  /* 7 */ val FOLDER: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.FOLDER with Double = js.native
  /* 9 */ val GIF: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GIF with Double = js.native
  /* 0 */ val GOOGLE_APPS_SCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_APPS_SCRIPT with Double = js.native
  /* 2 */ val GOOGLE_DOCS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_DOCS with Double = js.native
  /* 1 */ val GOOGLE_DRAWINGS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_DRAWINGS with Double = js.native
  /* 3 */ val GOOGLE_FORMS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_FORMS with Double = js.native
  /* 4 */ val GOOGLE_SHEETS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_SHEETS with Double = js.native
  /* 5 */ val GOOGLE_SITES: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_SITES with Double = js.native
  /* 6 */ val GOOGLE_SLIDES: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.GOOGLE_SLIDES with Double = js.native
  /* 16 */ val HTML: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.HTML with Double = js.native
  /* 17 */ val JAVASCRIPT: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.JAVASCRIPT with Double = js.native
  /* 10 */ val JPEG: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.JPEG with Double = js.native
  /* 24 */ val MICROSOFT_EXCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL with Double = js.native
  /* 25 */ val MICROSOFT_EXCEL_LEGACY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_EXCEL_LEGACY with Double = js.native
  /* 26 */ val MICROSOFT_POWERPOINT: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT with Double = js.native
  /* 27 */ val MICROSOFT_POWERPOINT_LEGACY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_POWERPOINT_LEGACY with Double = js.native
  /* 28 */ val MICROSOFT_WORD: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD with Double = js.native
  /* 29 */ val MICROSOFT_WORD_LEGACY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.MICROSOFT_WORD_LEGACY with Double = js.native
  /* 20 */ val OPENDOCUMENT_GRAPHICS: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_GRAPHICS with Double = js.native
  /* 21 */ val OPENDOCUMENT_PRESENTATION: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_PRESENTATION with Double = js.native
  /* 22 */ val OPENDOCUMENT_SPREADSHEET: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_SPREADSHEET with Double = js.native
  /* 23 */ val OPENDOCUMENT_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.OPENDOCUMENT_TEXT with Double = js.native
  /* 13 */ val PDF: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.PDF with Double = js.native
  /* 18 */ val PLAIN_TEXT: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.PLAIN_TEXT with Double = js.native
  /* 11 */ val PNG: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.PNG with Double = js.native
  /* 19 */ val RTF: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.RTF with Double = js.native
  /* 12 */ val SVG: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.SVG with Double = js.native
  /* 30 */ val ZIP: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType.ZIP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType with Double] = js.native
}

