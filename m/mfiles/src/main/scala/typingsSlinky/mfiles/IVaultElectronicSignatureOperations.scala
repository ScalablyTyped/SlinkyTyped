package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultElectronicSignatureOperations extends js.Object {
  def AddEmptySignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  def AddEmptySignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  def DisconnectSignature(ObjVer: IObjVer, SignatureIdentifier: String): IObjectVersionAndProperties = js.native
  def DisconnectSignatureEx(ObjVer: IObjVer, SignatureIdentifier: String, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
  def DisconnectSignatures(ObjVer: IObjVer): IObjectVersionAndProperties = js.native
  def DisconnectSignaturesEx(ObjVer: IObjVer, InvalidateDisconnectedSignatures: Boolean): IObjectVersionAndProperties = js.native
}

object IVaultElectronicSignatureOperations {
  @scala.inline
  def apply(
    AddEmptySignature: (IObjVer, String) => IObjectVersionAndProperties,
    AddEmptySignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignature: (IObjVer, String) => IObjectVersionAndProperties,
    DisconnectSignatureEx: (IObjVer, String, Boolean) => IObjectVersionAndProperties,
    DisconnectSignatures: IObjVer => IObjectVersionAndProperties,
    DisconnectSignaturesEx: (IObjVer, Boolean) => IObjectVersionAndProperties
  ): IVaultElectronicSignatureOperations = {
    val __obj = js.Dynamic.literal(AddEmptySignature = js.Any.fromFunction2(AddEmptySignature), AddEmptySignatures = js.Any.fromFunction1(AddEmptySignatures), DisconnectSignature = js.Any.fromFunction2(DisconnectSignature), DisconnectSignatureEx = js.Any.fromFunction3(DisconnectSignatureEx), DisconnectSignatures = js.Any.fromFunction1(DisconnectSignatures), DisconnectSignaturesEx = js.Any.fromFunction2(DisconnectSignaturesEx))
    __obj.asInstanceOf[IVaultElectronicSignatureOperations]
  }
  @scala.inline
  implicit class IVaultElectronicSignatureOperationsOps[Self <: IVaultElectronicSignatureOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddEmptySignature(value: (IObjVer, String) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddEmptySignature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddEmptySignatures(value: IObjVer => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddEmptySignatures")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnectSignature(value: (IObjVer, String) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisconnectSignature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDisconnectSignatureEx(value: (IObjVer, String, Boolean) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisconnectSignatureEx")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDisconnectSignatures(value: IObjVer => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisconnectSignatures")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisconnectSignaturesEx(value: (IObjVer, Boolean) => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisconnectSignaturesEx")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

