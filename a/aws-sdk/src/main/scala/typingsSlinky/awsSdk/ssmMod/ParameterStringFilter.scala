package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterStringFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: ParameterStringFilterKey = js.native
  /**
    * For all filters used with DescribeParameters, valid options include Equals and BeginsWith. The Name filter additionally supports the Contains option. (Exception: For filters using the key Path, valid options include Recursive and OneLevel.) For filters used with GetParametersByPath, valid options include Equals and BeginsWith. (Exception: For filters using the key Label, the only valid option is Equals.)
    */
  var Option: js.UndefOr[ParameterStringQueryOption] = js.native
  /**
    * The value you want to search for.
    */
  var Values: js.UndefOr[ParameterStringFilterValueList] = js.native
}

object ParameterStringFilter {
  @scala.inline
  def apply(Key: ParameterStringFilterKey): ParameterStringFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterStringFilter]
  }
  @scala.inline
  implicit class ParameterStringFilterOps[Self <: ParameterStringFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: ParameterStringFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOption(value: ParameterStringQueryOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Option")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: ParameterStringFilterValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Values")(js.undefined)
        ret
    }
  }
  
}

