package typingsSlinky.pulumiKubernetes.outputMod.meta.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GroupVersion contains the "group/version" and "version" string of a version. It is made a
  * struct to keep extensibility.
  */
@js.native
trait GroupVersionForDiscovery extends js.Object {
  /**
    * groupVersion specifies the API group and version in the form "group/version"
    */
  val groupVersion: String = js.native
  /**
    * version specifies the version in the form of "version". This is to save the clients the
    * trouble of splitting the GroupVersion.
    */
  val version: String = js.native
}

object GroupVersionForDiscovery {
  @scala.inline
  def apply(groupVersion: String, version: String): GroupVersionForDiscovery = {
    val __obj = js.Dynamic.literal(groupVersion = groupVersion.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupVersionForDiscovery]
  }
  @scala.inline
  implicit class GroupVersionForDiscoveryOps[Self <: GroupVersionForDiscovery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

