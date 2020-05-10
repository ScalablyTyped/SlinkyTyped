package typingsSlinky.pulumiAws.getInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetInstancesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesResult extends js.Object {
  val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * IDs of instances found through the filter
    */
  val ids: js.Array[String] = js.native
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
  val instanceTags: StringDictionary[js.Any] = js.native
  /**
    * Private IP addresses of instances found through the filter
    */
  val privateIps: js.Array[String] = js.native
  /**
    * Public IP addresses of instances found through the filter
    */
  val publicIps: js.Array[String] = js.native
}

object GetInstancesResult {
  @scala.inline
  def apply(
    id: String,
    ids: js.Array[String],
    instanceTags: StringDictionary[js.Any],
    privateIps: js.Array[String],
    publicIps: js.Array[String]
  ): GetInstancesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], instanceTags = instanceTags.asInstanceOf[js.Any], privateIps = privateIps.asInstanceOf[js.Any], publicIps = publicIps.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstancesResult]
  }
  @scala.inline
  implicit class GetInstancesResultOps[Self <: GetInstancesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIps(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetInstancesFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceStateNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStateNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceStateNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceStateNames")(js.undefined)
        ret
    }
  }
  
}

