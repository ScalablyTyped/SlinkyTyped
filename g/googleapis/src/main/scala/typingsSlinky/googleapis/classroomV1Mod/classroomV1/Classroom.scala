package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Classroom API
  *
  * Manages classes, rosters, and invitations in Google Classroom.
  *
  * @example
  * const {google} = require('googleapis');
  * const classroom = google.classroom('v1');
  *
  * @namespace classroom
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Classroom
  */
@JSImport("googleapis/build/src/apis/classroom/v1", "classroom_v1.Classroom")
@js.native
class Classroom protected () extends StObject {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var context: APIRequestContext = js.native
  
  var courses: ResourceCourses = js.native
  
  var invitations: ResourceInvitations = js.native
  
  var registrations: ResourceRegistrations = js.native
  
  var userProfiles: ResourceUserprofiles = js.native
}
