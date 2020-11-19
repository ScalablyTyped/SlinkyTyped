package typingsSlinky.googleapis.v1managementMod.gamesManagementV1management

import typingsSlinky.googleapisCommon.apiMod.APIRequestContext
import typingsSlinky.googleapisCommon.apiMod.GlobalOptions
import typingsSlinky.googleapisCommon.apiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Google Play Game Services Management API
  *
  * The Management API for Google Play Game Services.
  *
  * @example
  * const {google} = require('googleapis');
  * const gamesManagement = google.gamesManagement('v1management');
  *
  * @namespace gamesManagement
  * @type {Function}
  * @version v1management
  * @variation v1management
  * @param {object=} options Options for Gamesmanagement
  */
@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Gamesmanagement")
@js.native
class Gamesmanagement protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  
  var achievements: ResourceAchievements = js.native
  
  var applications: ResourceApplications = js.native
  
  var context: APIRequestContext = js.native
  
  var events: ResourceEvents = js.native
  
  var players: ResourcePlayers = js.native
  
  var quests: ResourceQuests = js.native
  
  var rooms: ResourceRooms = js.native
  
  var scores: ResourceScores = js.native
  
  var turnBasedMatches: ResourceTurnbasedmatches = js.native
}
