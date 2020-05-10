package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @OutputOnly A representation of the status of an ad in a specific context.
  * A context here relates to where something ultimately serves (for example, a
  * user or publisher geo, a platform, an HTTPS vs HTTP request, or the type of
  * auction).
  */
@js.native
trait SchemaServingRestriction extends js.Object {
  /**
    * The contexts for the restriction.
    */
  var contexts: js.UndefOr[js.Array[SchemaServingContext]] = js.native
  /**
    * Disapproval bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method.
    */
  var disapproval: js.UndefOr[SchemaDisapproval] = js.native
  /**
    * Any disapprovals bound to this restriction. Only present if
    * status=DISAPPROVED. Can be used to filter the response of the
    * creatives.list method. Deprecated; please use disapproval field instead.
    */
  var disapprovalReasons: js.UndefOr[js.Array[SchemaDisapproval]] = js.native
  /**
    * The status of the creative in this context (for example, it has been
    * explicitly disapproved or is pending review).
    */
  var status: js.UndefOr[String] = js.native
}

object SchemaServingRestriction {
  @scala.inline
  def apply(): SchemaServingRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServingRestriction]
  }
  @scala.inline
  implicit class SchemaServingRestrictionOps[Self <: SchemaServingRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContexts(value: js.Array[SchemaServingContext]): Self = {
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
    def withDisapproval(value: SchemaDisapproval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapproval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisapproval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disapproval")(js.undefined)
        ret
    }
    @scala.inline
    def withDisapprovalReasons(value: js.Array[SchemaDisapproval]): Self = {
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

