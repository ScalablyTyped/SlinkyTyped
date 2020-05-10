package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostRule extends js.Object {
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  /**
    * The list of host patterns to match. They must be valid hostnames, except &#42; will match any string of ([a-z0-9-.]&#42;). In that case, &#42; must be the first
    * character and must be followed in the pattern by either - or ..
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  /** The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion. */
  var pathMatcher: js.UndefOr[String] = js.native
}

object HostRule {
  @scala.inline
  def apply(): HostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostRule]
  }
  @scala.inline
  implicit class HostRuleOps[Self <: HostRule] (val x: Self) extends AnyVal {
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
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withPathMatcher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathMatcher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathMatcher")(js.undefined)
        ret
    }
  }
  
}

