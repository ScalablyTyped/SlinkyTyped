package typingsSlinky.pulumiAws.getAmiMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.GetAmiFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiArgs extends js.Object {
  /**
    * Limit search to users with *explicit* launch permission on
    * the image. Valid items are the numeric account ID or `self`.
    */
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-images in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetAmiFilter]] = js.native
  /**
    * If more than one result is returned, use the most
    * recent AMI.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * A regex string to apply to the AMI list returned
    * by AWS. This allows more advanced filtering not supported from the AWS API. This
    * filtering is done locally on what AWS returns, and could have a performance
    * impact if the result is large. It is recommended to combine this with other
    * options to narrow down the list AWS returns.
    */
  val nameRegex: js.UndefOr[String] = js.native
  /**
    * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
    */
  val owners: js.Array[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetAmiArgs {
  @scala.inline
  def apply(owners: js.Array[String]): GetAmiArgs = {
    val __obj = js.Dynamic.literal(owners = owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiArgs]
  }
  @scala.inline
  implicit class GetAmiArgsOps[Self <: GetAmiArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwners(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecutableUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecutableUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executableUsers")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetAmiFilter]): Self = {
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
    def withMostRecent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMostRecent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mostRecent")(js.undefined)
        ret
    }
    @scala.inline
    def withNameRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameRegex")(js.undefined)
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

