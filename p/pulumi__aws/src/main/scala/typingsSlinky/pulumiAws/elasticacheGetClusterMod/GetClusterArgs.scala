package typingsSlinky.pulumiAws.elasticacheGetClusterMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterArgs extends js.Object {
  /**
    * Group identifier.
    */
  val clusterId: String = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetClusterArgs {
  @scala.inline
  def apply(clusterId: String): GetClusterArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterArgs]
  }
  @scala.inline
  implicit class GetClusterArgsOps[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

