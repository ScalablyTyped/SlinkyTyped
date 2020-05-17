package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharepointListAdapterObject extends js.Object {
  @JSName("InfoPath.SharepointListAdapterObject_typekey")
  var InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SiteUrl: String = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object SharepointListAdapterObject {
  @scala.inline
  def apply(
    InfoPathDotSharepointListAdapterObject_typekey: SharepointListAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SiteUrl: String,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): SharepointListAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SiteUrl = SiteUrl.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SharepointListAdapterObject_typekey")(InfoPathDotSharepointListAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharepointListAdapterObject]
  }
  @scala.inline
  implicit class SharepointListAdapterObjectOps[Self <: SharepointListAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotSharepointListAdapterObject_typekey(value: SharepointListAdapterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.SharepointListAdapterObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Query")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQueryAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSiteUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SiteUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitAllowed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

