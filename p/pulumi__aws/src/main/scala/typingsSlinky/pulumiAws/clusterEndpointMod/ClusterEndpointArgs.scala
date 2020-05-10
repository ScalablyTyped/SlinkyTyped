package typingsSlinky.pulumiAws.clusterEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterEndpointArgs extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  val clusterEndpointIdentifier: Input[String] = js.native
  /**
    * The cluster identifier.
    */
  val clusterIdentifier: Input[String] = js.native
  /**
    * The type of the endpoint. One of: READER , ANY .
    */
  val customEndpointType: Input[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty. Conflicts with `staticMembers`.
    */
  val excludedMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group. Conflicts with `excludedMembers`.
    */
  val staticMembers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object ClusterEndpointArgs {
  @scala.inline
  def apply(
    clusterEndpointIdentifier: Input[String],
    clusterIdentifier: Input[String],
    customEndpointType: Input[String]
  ): ClusterEndpointArgs = {
    val __obj = js.Dynamic.literal(clusterEndpointIdentifier = clusterEndpointIdentifier.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], customEndpointType = customEndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterEndpointArgs]
  }
  @scala.inline
  implicit class ClusterEndpointArgsOps[Self <: ClusterEndpointArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterEndpointIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterEndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClusterIdentifier(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomEndpointType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludedMembers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticMembers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
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

