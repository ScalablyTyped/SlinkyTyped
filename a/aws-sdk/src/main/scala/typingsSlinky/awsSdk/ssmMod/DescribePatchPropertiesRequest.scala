package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePatchPropertiesRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
  /**
    * The operating system type for which to list patches.
    */
  var OperatingSystem: typingsSlinky.awsSdk.ssmMod.OperatingSystem = js.native
  /**
    * Indicates whether to list patches for the Windows operating system or for Microsoft applications. Not applicable for Linux operating systems.
    */
  var PatchSet: js.UndefOr[typingsSlinky.awsSdk.ssmMod.PatchSet] = js.native
  /**
    * The patch property for which you want to view patch details. 
    */
  var Property: PatchProperty = js.native
}

object DescribePatchPropertiesRequest {
  @scala.inline
  def apply(OperatingSystem: OperatingSystem, Property: PatchProperty): DescribePatchPropertiesRequest = {
    val __obj = js.Dynamic.literal(OperatingSystem = OperatingSystem.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchPropertiesRequest]
  }
  @scala.inline
  implicit class DescribePatchPropertiesRequestOps[Self <: DescribePatchPropertiesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperatingSystem(value: OperatingSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OperatingSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: PatchProperty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withPatchSet(value: PatchSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatchSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PatchSet")(js.undefined)
        ret
    }
  }
  
}

