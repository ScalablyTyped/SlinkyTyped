package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedObservations extends js.Object {
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ObservationList] = js.native
}

object RelatedObservations {
  @scala.inline
  def apply(): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedObservations]
  }
  @scala.inline
  implicit class RelatedObservationsOps[Self <: RelatedObservations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObservationList(value: ObservationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObservationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObservationList")(js.undefined)
        ret
    }
  }
  
}

