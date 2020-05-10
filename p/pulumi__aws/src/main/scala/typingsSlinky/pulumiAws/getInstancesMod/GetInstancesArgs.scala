package typingsSlinky.pulumiAws.getInstancesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetInstancesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstancesArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetInstancesFilter]] = js.native
  /**
    * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
    */
  val instanceStateNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A mapping of tags, each pair of which must
    * exactly match a pair on desired instances.
    */
  val instanceTags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInstancesArgs {
  @scala.inline
  def apply(): GetInstancesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstancesArgs]
  }
  @scala.inline
  implicit class GetInstancesArgsOps[Self <: GetInstancesArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withInstanceTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTags")(js.undefined)
        ret
    }
  }
  
}

