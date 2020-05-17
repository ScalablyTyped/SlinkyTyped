package typingsSlinky.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BDCAdapterObject extends js.Object {
  val EntityName: String = js.native
  val EntityNamespace: String = js.native
  @JSName("InfoPath.BDCAdapterObject_typekey")
  var InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject = js.native
  val LOBSystemInstance: String = js.native
  val Name: String = js.native
  val QueryAllowed: Boolean = js.native
  val SpecificFinder: String = js.native
  val SubmitAdapterName: String = js.native
  val SubmitAllowed: Boolean = js.native
  def Query(): Unit = js.native
  def Submit(): Unit = js.native
}

object BDCAdapterObject {
  @scala.inline
  def apply(
    EntityName: String,
    EntityNamespace: String,
    InfoPathDotBDCAdapterObject_typekey: BDCAdapterObject,
    LOBSystemInstance: String,
    Name: String,
    Query: () => Unit,
    QueryAllowed: Boolean,
    SpecificFinder: String,
    Submit: () => Unit,
    SubmitAdapterName: String,
    SubmitAllowed: Boolean
  ): BDCAdapterObject = {
    val __obj = js.Dynamic.literal(EntityName = EntityName.asInstanceOf[js.Any], EntityNamespace = EntityNamespace.asInstanceOf[js.Any], LOBSystemInstance = LOBSystemInstance.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Query = js.Any.fromFunction0(Query), QueryAllowed = QueryAllowed.asInstanceOf[js.Any], SpecificFinder = SpecificFinder.asInstanceOf[js.Any], Submit = js.Any.fromFunction0(Submit), SubmitAdapterName = SubmitAdapterName.asInstanceOf[js.Any], SubmitAllowed = SubmitAllowed.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.BDCAdapterObject_typekey")(InfoPathDotBDCAdapterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BDCAdapterObject]
  }
  @scala.inline
  implicit class BDCAdapterObjectOps[Self <: BDCAdapterObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfoPathDotBDCAdapterObject_typekey(value: BDCAdapterObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InfoPath.BDCAdapterObject_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLOBSystemInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LOBSystemInstance")(value.asInstanceOf[js.Any])
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
    def withSpecificFinder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpecificFinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubmit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Submit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubmitAdapterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubmitAdapterName")(value.asInstanceOf[js.Any])
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

