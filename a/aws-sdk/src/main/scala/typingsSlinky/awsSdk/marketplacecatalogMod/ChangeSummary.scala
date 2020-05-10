package typingsSlinky.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeSummary extends js.Object {
  /**
    * The type of the change.
    */
  var ChangeType: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ChangeType] = js.native
  /**
    * The entity to be changed.
    */
  var Entity: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.Entity] = js.native
  /**
    * An array of ErrorDetail objects associated with the change.
    */
  var ErrorDetailList: js.UndefOr[typingsSlinky.awsSdk.marketplacecatalogMod.ErrorDetailList] = js.native
}

object ChangeSummary {
  @scala.inline
  def apply(): ChangeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSummary]
  }
  @scala.inline
  implicit class ChangeSummaryOps[Self <: ChangeSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeType(value: ChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeType")(js.undefined)
        ret
    }
    @scala.inline
    def withEntity(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entity")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorDetailList(value: ErrorDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetailList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorDetailList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorDetailList")(js.undefined)
        ret
    }
  }
  
}

