package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFNamedValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultNamedValueStorageOperations extends js.Object {
  def GetNamedValues(NamedValueType: MFNamedValueType, Namespace: String): INamedValues = js.native
  def RemoveNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValueNames: IStrings): Unit = js.native
  def SetNamedValues(NamedValueType: MFNamedValueType, Namespace: String, NamedValues: INamedValues): Unit = js.native
}

object IVaultNamedValueStorageOperations {
  @scala.inline
  def apply(
    GetNamedValues: (MFNamedValueType, String) => INamedValues,
    RemoveNamedValues: (MFNamedValueType, String, IStrings) => Unit,
    SetNamedValues: (MFNamedValueType, String, INamedValues) => Unit
  ): IVaultNamedValueStorageOperations = {
    val __obj = js.Dynamic.literal(GetNamedValues = js.Any.fromFunction2(GetNamedValues), RemoveNamedValues = js.Any.fromFunction3(RemoveNamedValues), SetNamedValues = js.Any.fromFunction3(SetNamedValues))
    __obj.asInstanceOf[IVaultNamedValueStorageOperations]
  }
  @scala.inline
  implicit class IVaultNamedValueStorageOperationsOps[Self <: IVaultNamedValueStorageOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNamedValues(value: (MFNamedValueType, String) => INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetNamedValues")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveNamedValues(value: (MFNamedValueType, String, IStrings) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveNamedValues")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetNamedValues(value: (MFNamedValueType, String, INamedValues) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetNamedValues")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

