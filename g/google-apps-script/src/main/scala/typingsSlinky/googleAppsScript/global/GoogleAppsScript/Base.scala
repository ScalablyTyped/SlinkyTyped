package typingsSlinky.googleAppsScript.global.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.Base.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Base {
  
  /**
    * An enum representing predetermined, localized dialog buttons returned by an alert or PromptResponse.getSelectedButton() to indicate
    * which button in a dialog the user clicked. These values cannot be set; to add buttons to an
    * alert or prompt, use ButtonSet instead.
    *
    *     // Display a dialog box with a message and "Yes" and "No" buttons.
    *     var ui = DocumentApp.getUi();
    *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
    *
    *     // Process the user's response.
    *     if (response == ui.Button.YES) {
    *       Logger.log('The user clicked "Yes."');
    *     } else {
    *       Logger.log('The user clicked "No" or the dialog\'s close button.');
    *     }
    */
  @JSGlobal("GoogleAppsScript.Base.Button")
  @js.native
  object Button extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button with Double] = js.native
    
    /* 2 */ val CANCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button.CANCEL with Double = js.native
    
    /* 0 */ val CLOSE: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button.CLOSE with Double = js.native
    
    /* 4 */ val NO: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button.NO with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button.OK with Double = js.native
    
    /* 3 */ val YES: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Button.YES with Double = js.native
  }
  
  /**
    * An enum representing predetermined, localized sets of one or more dialog buttons that can be
    * added to an alert or a prompt. To determine which button the user clicked,
    * use Button.
    *
    *     // Display a dialog box with a message and "Yes" and "No" buttons.
    *     var ui = DocumentApp.getUi();
    *     var response = ui.alert('Are you sure you want to continue?', ui.ButtonSet.YES_NO);
    *
    *     // Process the user's response.
    *     if (response == ui.Button.YES) {
    *       Logger.log('The user clicked "Yes."');
    *     } else {
    *       Logger.log('The user clicked "No" or the dialog\'s close button.');
    *     }
    */
  @JSGlobal("GoogleAppsScript.Base.ButtonSet")
  @js.native
  object ButtonSet extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet with Double] = js.native
    
    /* 0 */ val OK: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK with Double = js.native
    
    /* 1 */ val OK_CANCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.OK_CANCEL with Double = js.native
    
    /* 2 */ val YES_NO: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO with Double = js.native
    
    /* 3 */ val YES_NO_CANCEL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ButtonSet.YES_NO_CANCEL with Double = js.native
  }
  
  /**
    * The types of Colors
    */
  @JSGlobal("GoogleAppsScript.Base.ColorType")
  @js.native
  object ColorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType with Double] = js.native
    
    /* 1 */ val RGB: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType.RGB with Double = js.native
    
    /* 2 */ val THEME: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType.THEME with Double = js.native
    
    /* 0 */ val UNSUPPORTED: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.ColorType.UNSUPPORTED with Double = js.native
  }
  
  @JSGlobal("GoogleAppsScript.Base.Date")
  @js.native
  val Date: DateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("GoogleAppsScript.Base.Date")
  @js.native
  class DateCls ()
    extends typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Date {
    def this(value: String) = this()
    def this(value: Double) = this()
    def this(year: Double, month: Double) = this()
    def this(year: Double, month: Double, date: Double) = this()
    def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: Double
    ) = this()
    def this(year: Double, month: Double, date: js.UndefOr[scala.Nothing], hours: Double, minutes: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: js.UndefOr[scala.Nothing], minutes: Double) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: Double,
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double
    ) = this()
    def this(year: Double, month: Double, date: Double, hours: Double, minutes: Double, seconds: Double) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: js.UndefOr[scala.Nothing],
      hours: Double,
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: js.UndefOr[scala.Nothing],
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: js.UndefOr[scala.Nothing],
      seconds: Double,
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: Double,
      seconds: js.UndefOr[scala.Nothing],
      ms: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      date: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      ms: Double
    ) = this()
  }
  
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
  object MimeType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.MimeType with Double] = js.native
    
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
  }
  
  /**
    * An enum representing the months of the year.
    */
  @JSGlobal("GoogleAppsScript.Base.Month")
  @js.native
  object Month extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month with Double] = js.native
    
    /* 3 */ val APRIL: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.APRIL with Double = js.native
    
    /* 7 */ val AUGUST: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.AUGUST with Double = js.native
    
    /* 11 */ val DECEMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.DECEMBER with Double = js.native
    
    /* 1 */ val FEBRUARY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.FEBRUARY with Double = js.native
    
    /* 0 */ val JANUARY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.JANUARY with Double = js.native
    
    /* 6 */ val JULY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.JULY with Double = js.native
    
    /* 5 */ val JUNE: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.JUNE with Double = js.native
    
    /* 2 */ val MARCH: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.MARCH with Double = js.native
    
    /* 4 */ val MAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.MAY with Double = js.native
    
    /* 10 */ val NOVEMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.NOVEMBER with Double = js.native
    
    /* 9 */ val OCTOBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.OCTOBER with Double = js.native
    
    /* 8 */ val SEPTEMBER: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Month.SEPTEMBER with Double = js.native
  }
  
  /**
    * An enum representing the days of the week.
    */
  @JSGlobal("GoogleAppsScript.Base.Weekday")
  @js.native
  object Weekday extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday with Double] = js.native
    
    /* 5 */ val FRIDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.FRIDAY with Double = js.native
    
    /* 1 */ val MONDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.MONDAY with Double = js.native
    
    /* 6 */ val SATURDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.SATURDAY with Double = js.native
    
    /* 0 */ val SUNDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.SUNDAY with Double = js.native
    
    /* 4 */ val THURSDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.THURSDAY with Double = js.native
    
    /* 2 */ val TUESDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.TUESDAY with Double = js.native
    
    /* 3 */ val WEDNESDAY: typingsSlinky.googleAppsScript.GoogleAppsScript.Base.Weekday.WEDNESDAY with Double = js.native
  }
}
