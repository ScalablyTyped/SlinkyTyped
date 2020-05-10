package typingsSlinky.pulumiAws.getBundleMod

import typingsSlinky.pulumiAws.outputMod.workspaces.GetBundleComputeType
import typingsSlinky.pulumiAws.outputMod.workspaces.GetBundleRootStorage
import typingsSlinky.pulumiAws.outputMod.workspaces.GetBundleUserStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBundleResult extends js.Object {
  val bundleId: String = js.native
  /**
    * The compute type. See supported fields below.
    */
  val computeTypes: js.Array[GetBundleComputeType] = js.native
  /**
    * The description of the bundle.
    */
  val description: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the compute type.
    */
  val name: String = js.native
  /**
    * The owner of the bundle.
    */
  val owner: String = js.native
  /**
    * The root volume. See supported fields below.
    */
  val rootStorages: js.Array[GetBundleRootStorage] = js.native
  /**
    * The user storage. See supported fields below.
    */
  val userStorages: js.Array[GetBundleUserStorage] = js.native
}

object GetBundleResult {
  @scala.inline
  def apply(
    bundleId: String,
    computeTypes: js.Array[GetBundleComputeType],
    description: String,
    id: String,
    name: String,
    owner: String,
    rootStorages: js.Array[GetBundleRootStorage],
    userStorages: js.Array[GetBundleUserStorage]
  ): GetBundleResult = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any], computeTypes = computeTypes.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], rootStorages = rootStorages.asInstanceOf[js.Any], userStorages = userStorages.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBundleResult]
  }
  @scala.inline
  implicit class GetBundleResultOps[Self <: GetBundleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeTypes(value: js.Array[GetBundleComputeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootStorages(value: js.Array[GetBundleRootStorage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootStorages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserStorages(value: js.Array[GetBundleUserStorage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStorages")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

