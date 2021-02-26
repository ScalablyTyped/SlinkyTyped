package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFBuiltInObjectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultClassGroupOperations extends StObject {
  
  def AddClassGroup(ClassGroup: IClassGroup): IClassGroup = js.native
  
  def GetClassGroup(ObjectType: Double, ClassGroupID: Double): IClassGroup = js.native
  def GetClassGroup(ObjectType: MFBuiltInObjectType, ClassGroupID: Double): IClassGroup = js.native
  
  def GetClassGroupIDByGUID(ClassGroupGUID: String): Double = js.native
  
  def GetClassGroups(ObjectType: Double): IClassGroups = js.native
  def GetClassGroups(ObjectType: MFBuiltInObjectType): IClassGroups = js.native
  
  def RemoveClassGroup(ClassGroupID: Double): Unit = js.native
  
  def UpdateClassGroup(ClassGroup: IClassGroup): Unit = js.native
}
