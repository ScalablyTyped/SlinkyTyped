package typingsSlinky.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxSecurity Class */
@js.native
trait FaxSecurity extends js.Object {
  /** Security descriptor */
  var Descriptor: js.Any = js.native
  @JSName("FAXCOMEXLib.FaxSecurity_typekey")
  var FAXCOMEXLibDotFaxSecurity_typekey: FaxSecurity = js.native
  /** Granted rights, a bit-wise combination of FAX_ACCESS_RIGHTS values */
  val GrantedRights: FAX_ACCESS_RIGHTS_ENUM = js.native
  /** Security Information Type */
  var InformationType: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

object FaxSecurity {
  @scala.inline
  def apply(
    Descriptor: js.Any,
    FAXCOMEXLibDotFaxSecurity_typekey: FaxSecurity,
    GrantedRights: FAX_ACCESS_RIGHTS_ENUM,
    InformationType: Double,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxSecurity = {
    val __obj = js.Dynamic.literal(Descriptor = Descriptor.asInstanceOf[js.Any], GrantedRights = GrantedRights.asInstanceOf[js.Any], InformationType = InformationType.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxSecurity_typekey")(FAXCOMEXLibDotFaxSecurity_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxSecurity]
  }
  @scala.inline
  implicit class FaxSecurityOps[Self <: FaxSecurity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescriptor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAXCOMEXLibDotFaxSecurity_typekey(value: FaxSecurity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FAXCOMEXLib.FaxSecurity_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrantedRights(value: FAX_ACCESS_RIGHTS_ENUM): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GrantedRights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInformationType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InformationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Refresh")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSave(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Save")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

