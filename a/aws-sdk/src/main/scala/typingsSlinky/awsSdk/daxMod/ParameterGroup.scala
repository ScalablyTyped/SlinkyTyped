package typingsSlinky.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterGroup extends js.Object {
  /**
    * A description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
}

object ParameterGroup {
  @scala.inline
  def apply(): ParameterGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterGroup]
  }
  @scala.inline
  implicit class ParameterGroupOps[Self <: ParameterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroupName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterGroupName")(js.undefined)
        ret
    }
  }
  
}

