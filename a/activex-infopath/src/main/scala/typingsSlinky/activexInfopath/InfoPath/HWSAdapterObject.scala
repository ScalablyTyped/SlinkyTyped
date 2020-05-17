package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HWSAdapterObject extends js.Object {
  @JSName("InfoPath.HWSAdapterObject_typekey")
  var InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object HWSAdapterObject {
  @scala.inline
  def apply(
    InfoPathDotHWSAdapterObject_typekey: HWSAdapterObject,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    Submit: () => Unit,
    SubmitAllowed: Boolean
  ): HWSAdapterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.HWSAdapterObject_typekey")(InfoPathDotHWSAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HWSAdapterObject]
  }
  @scala.inline
  implicit class HWSAdapterObjectOps[Self <: HWSAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoPathDotHWSAdapterObject_typekey(value: HWSAdapterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.HWSAdapterObject_typekey")(value.asInstanceOf[js.Any])
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

