package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitGetResponseResources extends js.Object {
  var core: RateLimitGetResponseResourcesCore = js.native
  var graphql: RateLimitGetResponseResourcesGraphql = js.native
  var integration_manifest: RateLimitGetResponseResourcesIntegrationManifest = js.native
  var search: RateLimitGetResponseResourcesSearch = js.native
}

object RateLimitGetResponseResources {
  @scala.inline
  def apply(
    core: RateLimitGetResponseResourcesCore,
    graphql: RateLimitGetResponseResourcesGraphql,
    integration_manifest: RateLimitGetResponseResourcesIntegrationManifest,
    search: RateLimitGetResponseResourcesSearch
  ): RateLimitGetResponseResources = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], graphql = graphql.asInstanceOf[js.Any], integration_manifest = integration_manifest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitGetResponseResources]
  }
  @scala.inline
  implicit class RateLimitGetResponseResourcesOps[Self <: RateLimitGetResponseResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCore(value: RateLimitGetResponseResourcesCore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("core")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGraphql(value: RateLimitGetResponseResourcesGraphql): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graphql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegration_manifest(value: RateLimitGetResponseResourcesIntegrationManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integration_manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: RateLimitGetResponseResourcesSearch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

