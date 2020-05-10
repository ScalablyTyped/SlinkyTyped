package typingsSlinky.pulumiAws.getInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetInstanceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetInstanceFilter]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[Boolean] = js.native
  /**
    * Retrieve Base64 encoded User Data contents into the `userDataBase64` attribute. A SHA-1 hash of the User Data contents will always be present in the `userData` attribute. Defaults to `false`.
    */
  val getUserData: js.UndefOr[Boolean] = js.native
  /**
    * Specify the exact Instance ID with which to populate the data source.
    */
  val instanceId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must
    * exactly match a pair on the desired Instance.
    */
  val instanceTags: js.UndefOr[StringDictionary[js.Any]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInstanceArgs {
  @scala.inline
  def apply(): GetInstanceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceArgs]
  }
  @scala.inline
  implicit class GetInstanceArgsOps[Self <: GetInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilters(value: js.Array[GetInstanceFilter]): Self = {
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
    def withGetPasswordData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetPasswordData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPasswordData")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUserData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetUserData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUserData")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
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

