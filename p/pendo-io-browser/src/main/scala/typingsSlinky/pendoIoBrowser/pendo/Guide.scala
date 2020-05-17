package typingsSlinky.pendoIoBrowser.pendo

import typingsSlinky.pendoIoBrowser.anon.Badge
import typingsSlinky.pendoIoBrowser.anon.Filters
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

@js.native
trait Guide extends js.Object {
  var attributes: Badge = js.native
  var audience: js.Array[_] = js.native
   // TODO
  var audienceUiHint: Filters = js.native
  var createdAt: Double = js.native
  var createdByUser: User = js.native
  var id: String = js.native
  var isMultiStep: Boolean = js.native
  var kind: String = js.native
  var lastUpdatedAt: Double = js.native
  var lastUpdatedByUser: User = js.native
  var launchMethod: api | automatic | badge | dom | launcher = js.native
  var name: String = js.native
  var publishedAt: Double = js.native
   // TODO
  var resetAt: Double = js.native
  var rootVersionId: String = js.native
  var stableVersionId: String = js.native
  var state: published | staged | draft | disabled = js.native
  var steps: js.Array[GuideStep] = js.native
}

object Guide {
  @scala.inline
  def apply(
    attributes: Badge,
    audience: js.Array[_],
    audienceUiHint: Filters,
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
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: Badge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudience(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAudienceUiHint(value: Filters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceUiHint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreatedByUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMultiStep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastUpdatedByUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedByUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLaunchMethod(value: api | automatic | badge | dom | launcher): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublishedAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetAt(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStableVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stableVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: published | staged | draft | disabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSteps(value: js.Array[GuideStep]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

