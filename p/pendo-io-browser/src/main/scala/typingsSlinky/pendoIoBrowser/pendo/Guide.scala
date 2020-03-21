package typingsSlinky.pendoIoBrowser.pendo

import typingsSlinky.pendoIoBrowser.AnonBadge
import typingsSlinky.pendoIoBrowser.AnonFilters
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.api
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.automatic
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.badge
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.disabled
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.dom
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.draft
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.launcher
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.published
import typingsSlinky.pendoIoBrowser.pendoIoBrowserStrings.staged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  var attributes: AnonBadge
  var audience: js.Array[_]
   // TODO
  var audienceUiHint: AnonFilters
  var createdAt: Double
  var createdByUser: User
  var id: String
  var isMultiStep: Boolean
  var kind: String
  var lastUpdatedAt: Double
  var lastUpdatedByUser: User
  var launchMethod: api | automatic | badge | dom | launcher
  var name: String
  var publishedAt: Double
   // TODO
  var resetAt: Double
  var rootVersionId: String
  var stableVersionId: String
  var state: published | staged | draft | disabled
  var steps: js.Array[GuideStep]
}

object Guide {
  @scala.inline
  def apply(
    attributes: AnonBadge,
    audience: js.Array[_],
    audienceUiHint: AnonFilters,
    createdAt: Double,
    createdByUser: User,
    id: String,
    isMultiStep: Boolean,
    kind: String,
    lastUpdatedAt: Double,
    lastUpdatedByUser: User,
    launchMethod: api | automatic | badge | dom | launcher,
    name: String,
    publishedAt: Double,
    resetAt: Double,
    rootVersionId: String,
    stableVersionId: String,
    state: published | staged | draft | disabled,
    steps: js.Array[GuideStep]
  ): Guide = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], audience = audience.asInstanceOf[js.Any], audienceUiHint = audienceUiHint.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], createdByUser = createdByUser.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isMultiStep = isMultiStep.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], lastUpdatedByUser = lastUpdatedByUser.asInstanceOf[js.Any], launchMethod = launchMethod.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publishedAt = publishedAt.asInstanceOf[js.Any], resetAt = resetAt.asInstanceOf[js.Any], rootVersionId = rootVersionId.asInstanceOf[js.Any], stableVersionId = stableVersionId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Guide]
  }
}

