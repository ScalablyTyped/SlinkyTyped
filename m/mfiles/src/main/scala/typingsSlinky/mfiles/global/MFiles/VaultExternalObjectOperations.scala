package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAccessControlList
import typingsSlinky.mfiles.IObjVer
import typingsSlinky.mfiles.IObjectVersionAndProperties
import typingsSlinky.mfiles.IPropertyValues
import typingsSlinky.mfiles.IVaultExternalObjectOperations
import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
class VaultExternalObjectOperations () extends IVaultExternalObjectOperations {
  /* CompleteClass */
  override def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties = js.native
}

@JSGlobal("MFiles.VaultExternalObjectOperations")
@js.native
object VaultExternalObjectOperations extends Instantiable0[IVaultExternalObjectOperations]

