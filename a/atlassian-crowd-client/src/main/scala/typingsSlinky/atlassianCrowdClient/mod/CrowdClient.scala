package typingsSlinky.atlassianCrowdClient.mod

import typingsSlinky.atlassianCrowdClient.AnonAttributes
import typingsSlinky.atlassianCrowdClient.AnonAuthenticate
import typingsSlinky.atlassianCrowdClient.AnonChildren
import typingsSlinky.atlassianCrowdClient.AnonCookie
import typingsSlinky.atlassianCrowdClient.AnonCreate
import typingsSlinky.atlassianCrowdClient.AnonGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdClient
  extends typingsSlinky.atlassianCrowdClient.apiMod.^ {
  var authentication: AnonAuthenticate = js.native
  var config: AnonCookie = js.native
  var group: AnonChildren = js.native
  var search: AnonGroup = js.native
  var session: AnonCreate = js.native
  var user: AnonAttributes = js.native
}

