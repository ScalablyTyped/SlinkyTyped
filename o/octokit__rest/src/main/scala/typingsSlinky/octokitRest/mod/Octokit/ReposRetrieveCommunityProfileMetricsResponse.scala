package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposRetrieveCommunityProfileMetricsResponse extends js.Object {
  var description: String = js.native
  var documentation: Boolean = js.native
  var files: ReposRetrieveCommunityProfileMetricsResponseFiles = js.native
  var health_percentage: Double = js.native
  var updated_at: String = js.native
}

object ReposRetrieveCommunityProfileMetricsResponse {
  @scala.inline
  def apply(
    description: String,
    documentation: Boolean,
    files: ReposRetrieveCommunityProfileMetricsResponseFiles,
    health_percentage: Double,
    updated_at: String
  ): ReposRetrieveCommunityProfileMetricsResponse = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], health_percentage = health_percentage.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRetrieveCommunityProfileMetricsResponse]
  }
  @scala.inline
  implicit class ReposRetrieveCommunityProfileMetricsResponseOps[Self <: ReposRetrieveCommunityProfileMetricsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFiles(value: ReposRetrieveCommunityProfileMetricsResponseFiles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHealth_percentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("health_percentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_at")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

