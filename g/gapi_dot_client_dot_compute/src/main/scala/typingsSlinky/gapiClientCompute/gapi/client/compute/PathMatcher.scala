package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PathMatcher extends js.Object {
  /**
    * The full or partial URL to the BackendService resource. This will be used if none of the pathRules defined by this PathMatcher is matched by the URL's
    * path portion. For example, the following are all valid URLs to a BackendService resource:
    * - https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
    * - compute/v1/projects/project/global/backendServices/backendService
    * - global/backendServices/backendService
    */
  var defaultService: js.UndefOr[String] = js.native
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /** The name to which this PathMatcher is referred by the HostRule. */
  var name: js.UndefOr[String] = js.native
  /** The list of path rules. */
  var pathRules: js.UndefOr[js.Array[PathRule]] = js.native
}

object PathMatcher {
  @scala.inline
  def apply(): PathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathMatcher]
  }
  @scala.inline
  implicit class PathMatcherOps[Self <: PathMatcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultService")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPathRules(value: js.Array[PathRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathRules")(js.undefined)
        ret
    }
  }
  
}

