package typingsSlinky.pulumiKubernetes.outputMod.policy.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AllowedHostPath defines the host volume conditions that will be enabled by a policy for pods
  * to use. It requires the path prefix to be defined.
  */
@js.native
trait AllowedHostPath extends js.Object {
  /**
    * pathPrefix is the path prefix that the host volume must match. It does not support `*`.
    * Trailing slashes are trimmed when validating the path prefix with a host path.
    *
    * Examples: `/foo` would allow `/foo`, `/foo/` and `/foo/bar` `/foo` would not allow `/food`
    * or `/etc/foo`
    */
  val pathPrefix: String = js.native
  /**
    * when set to true, will allow host volumes matching the pathPrefix only if all volume mounts
    * are readOnly.
    */
  val readOnly: Boolean = js.native
}

object AllowedHostPath {
  @scala.inline
  def apply(pathPrefix: String, readOnly: Boolean): AllowedHostPath = {
    val __obj = js.Dynamic.literal(pathPrefix = pathPrefix.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedHostPath]
  }
  @scala.inline
  implicit class AllowedHostPathOps[Self <: AllowedHostPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPathPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

