package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInUserGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultUserGroupOperations extends StObject {
  
  def AddOrUndeleteUserGroup(UserGroup: IUserGroupAdmin): IUserGroupAdmin = js.native
  
  def AddUserGroupAdmin(UserGroup: IUserGroupAdmin): IUserGroupAdmin = js.native
  
  def GetGroupsOfUserOrGroup(UserOrGroupID: Double, IsGroup: Boolean): IUserGroups = js.native
  
  def GetUserGroup(UserGroupID: Double): IUserGroup = js.native
  def GetUserGroup(UserGroupID: MFBuiltInUserGroup): IUserGroup = js.native
  
  def GetUserGroupAdmin(UserGroupID: Double): IUserGroupAdmin = js.native
  def GetUserGroupAdmin(UserGroupID: MFBuiltInUserGroup): IUserGroupAdmin = js.native
  
  def GetUserGroupIDByAlias(Alias: String): Double = js.native
  
  def GetUserGroupIDByGUID(UserGroupGUID: String): Double = js.native
  
  def GetUserGroupList(): IKeyNamePairs = js.native
  
  def GetUserGroups(): IUserGroups = js.native
  
  def GetUserGroupsAdmin(): IUserGroupsAdmin = js.native
  
  def RemoveUserGroupAdmin(UserGroupID: Double): Unit = js.native
  def RemoveUserGroupAdmin(UserGroupID: MFBuiltInUserGroup): Unit = js.native
  
  def UpdateUserGroupAdmin(UserGroup: IUserGroupAdmin): Unit = js.native
}
