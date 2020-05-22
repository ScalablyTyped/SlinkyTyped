package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAccessControlList
import typingsSlinky.mfiles.IAccessControlListComponent
import typingsSlinky.mfiles.INamedACL
import typingsSlinky.mfiles.INamedACLAdmin
import typingsSlinky.mfiles.INamedACLs
import typingsSlinky.mfiles.INamedACLsAdmin
import typingsSlinky.mfiles.IVaultNamedACLOperations
import typingsSlinky.mfiles.MFiles.MFNamedACLType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultNamedACLOperations")
@js.native
class VaultNamedACLOperations () extends IVaultNamedACLOperations {
  /* CompleteClass */
  override def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin = js.native
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  /* CompleteClass */
  override def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACL(NamedACLID: Double): INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin = js.native
  /* CompleteClass */
  override def GetNamedACLIDByAlias(Alias: String): Double = js.native
  /* CompleteClass */
  override def GetNamedACLIDByGUID(NamedACLGUID: String): Double = js.native
  /* CompleteClass */
  override def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL = js.native
  /* CompleteClass */
  override def GetNamedACLs(): INamedACLs = js.native
  /* CompleteClass */
  override def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin = js.native
  /* CompleteClass */
  override def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs = js.native
  /* CompleteClass */
  override def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean = js.native
  /* CompleteClass */
  override def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit = js.native
  /* CompleteClass */
  override def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  /* CompleteClass */
  override def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit = js.native
}

@JSGlobal("MFiles.VaultNamedACLOperations")
@js.native
object VaultNamedACLOperations extends Instantiable0[IVaultNamedACLOperations]

