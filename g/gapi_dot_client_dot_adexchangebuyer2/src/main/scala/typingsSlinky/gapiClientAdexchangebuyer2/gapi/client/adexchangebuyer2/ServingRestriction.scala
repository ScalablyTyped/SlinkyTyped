package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServingRestriction extends js.Object {
  /** The contexts for the restriction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.native
  /**
    * Any disapprovals bound to this restriction.
    * Only present if status=DISAPPROVED.
    * Can be used to filter the response of the
    * creatives.list
    * method.
    */
  var disapprovalReasons: js.UndefOr[js.Array[Disapproval]] = js.native
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String] = js.native
}

object ServingRestriction {
  @scala.inline
  def apply(): ServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServingRestriction]
  }
  @scala.inline
  implicit class ServingRestrictionOps[Self <: ServingRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[ServingContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContexts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contexts")(js.undefined)
        ret
    }
    @scala.inline
    def withDisapprovalReasons(value: js.Array[Disapproval]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisapprovalReasons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapprovalReasons")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

