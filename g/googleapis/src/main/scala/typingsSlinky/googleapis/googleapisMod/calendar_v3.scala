package typingsSlinky.googleapis.googleapisMod

import typingsSlinky.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typingsSlinky.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis", "calendar_v3")
@js.native
object calendar_v3 extends js.Object {
  /**
    * Calendar API
    *
    * Manipulates events and other calendar data.
    *
    * @example
    * const {google} = require('googleapis');
    * const calendar = google.calendar('v3');
    *
    * @namespace calendar
    * @type {Function}
    * @version v3
    * @variation v3
    * @param {object=} options Options for Calendar
    */
  @js.native
  class Calendar protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Calendar {
    def this(options: GlobalOptions) = this()
    def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  }
  
  @js.native
  class Resource$Acl protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Acl {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Calendarlist protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Calendarlist {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Calendars protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Calendars {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Channels protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Channels {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Colors protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Colors {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Events protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Events {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Freebusy protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Freebusy {
    def this(context: APIRequestContext) = this()
  }
  
  @js.native
  class Resource$Settings protected ()
    extends typingsSlinky.googleapis.buildSrcApisCalendarV3Mod.calendar_v3.Resource$Settings {
    def this(context: APIRequestContext) = this()
  }
  
}

