package typingsSlinky.forgeApis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterExtensionTypeFilterId extends js.Object {
  var filterExtensionType: js.UndefOr[js.Array[String]] = js.native
  var filterId: js.UndefOr[js.Array[String]] = js.native
}

object AnonFilterExtensionTypeFilterId {
  @scala.inline
  def apply(): AnonFilterExtensionTypeFilterId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFilterExtensionTypeFilterId]
  }
  @scala.inline
  implicit class AnonFilterExtensionTypeFilterIdOps[Self <: AnonFilterExtensionTypeFilterId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterExtensionType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExtensionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterExtensionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterExtensionType")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterId")(js.undefined)
        ret
    }
  }
  
}

