package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyParameter extends js.Object {
  /**
    *  Name of the parameter from the list of Review Polices. 
    */
  var Key: js.UndefOr[String] = js.native
  /**
    *  List of ParameterMapEntry objects. 
    */
  var MapEntries: js.UndefOr[ParameterMapEntryList] = js.native
  /**
    *  The list of values of the Parameter
    */
  var Values: js.UndefOr[StringList] = js.native
}

object PolicyParameter {
  @scala.inline
  def apply(): PolicyParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyParameter]
  }
  @scala.inline
  implicit class PolicyParameterOps[Self <: PolicyParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(js.undefined)
        ret
    }
    @scala.inline
    def withMapEntries(value: ParameterMapEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MapEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withValues(value: StringList): Self = {
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

