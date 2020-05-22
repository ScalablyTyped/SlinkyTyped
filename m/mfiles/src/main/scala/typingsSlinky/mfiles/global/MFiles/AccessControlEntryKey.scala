package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IAccessControlEntryKey
import typingsSlinky.mfiles.IIndirectPropertyID
import typingsSlinky.mfiles.IUserOrUserGroupIDs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AccessControlEntryKey")
@js.native
class AccessControlEntryKey () extends IAccessControlEntryKey {
  /* CompleteClass */
  override val HasConcreteUserOrGroupID: Boolean = js.native
  /* CompleteClass */
  override val IsGroup: Boolean = js.native
  /* CompleteClass */
  override val IsPseudoUser: Boolean = js.native
  /* CompleteClass */
  override var PseudoUserID: IIndirectPropertyID = js.native
  /* CompleteClass */
  override val UserOrGroupID: Double = js.native
  /* CompleteClass */
  override def Clone(): IAccessControlEntryKey = js.native
  /* CompleteClass */
  override def GetResolvedPseudoUserOrGroupIDs(): IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override def ResetResolvedPseudoUserOrGroupIDs(): Unit = js.native
  /* CompleteClass */
  override def SetUserOrGroupID(UserOrGroupID: Double, IsGroup: Boolean): Unit = js.native
}

@JSGlobal("MFiles.AccessControlEntryKey")
@js.native
object AccessControlEntryKey extends Instantiable0[IAccessControlEntryKey]

