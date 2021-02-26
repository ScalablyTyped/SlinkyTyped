package typingsSlinky.googleapis.mod

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sheetsV4 {
  
  @JSImport("googleapis", "sheets_v4.Resource$Spreadsheets")
  @js.native
  class ResourceSpreadsheets protected ()
    extends typingsSlinky.googleapis.sheetsV4Mod.sheetsV4.ResourceSpreadsheets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sheets_v4.Resource$Spreadsheets$Developermetadata")
  @js.native
  class ResourceSpreadsheetsDevelopermetadata protected ()
    extends typingsSlinky.googleapis.sheetsV4Mod.sheetsV4.ResourceSpreadsheetsDevelopermetadata {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sheets_v4.Resource$Spreadsheets$Sheets")
  @js.native
  class ResourceSpreadsheetsSheets protected ()
    extends typingsSlinky.googleapis.sheetsV4Mod.sheetsV4.ResourceSpreadsheetsSheets {
    def this(context: APIRequestContext) = this()
  }
  
  @JSImport("googleapis", "sheets_v4.Resource$Spreadsheets$Values")
  @js.native
  class ResourceSpreadsheetsValues protected ()
    extends typingsSlinky.googleapis.sheetsV4Mod.sheetsV4.ResourceSpreadsheetsValues {
    def this(context: APIRequestContext) = this()
  }
  
  /**
    * Google Sheets API
    *
    * Reads and writes Google Sheets.
    *
    * @example
    * const {google} = require('googleapis');
    * const sheets = google.sheets('v4');
    *
    * @namespace sheets
    * @type {Function}
    * @version v4
    * @variation v4
    * @param {object=} options Options for Sheets
    */
  @JSImport("googleapis", "sheets_v4.Sheets")
  @js.native
  class Sheets protected ()
    extends typingsSlinky.googleapis.sheetsV4Mod.sheetsV4.Sheets {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
}
