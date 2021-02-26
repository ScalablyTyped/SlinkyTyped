package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IUserOrUserGroupIDExs extends StObject {
  
  def Add(Index: Double, UserOrUserGroupIDEx: IUserOrUserGroupIDEx): Unit = js.native
  
  def Clone(): IUserOrUserGroupIDExs = js.native
  
  val Count: Double = js.native
  
  def GetUserOrUserGroupIDEx(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupIDEx = js.native
  
  def GetUserOrUserGroupIDExIndex(UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): Double = js.native
  
  def Item(Index: Double): IUserOrUserGroupIDEx = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IUserOrUserGroupIDExs {
  
  @scala.inline
  def apply(
    Add: (Double, IUserOrUserGroupIDEx) => Unit,
    Clone: () => IUserOrUserGroupIDExs,
    Count: Double,
    GetUserOrUserGroupIDEx: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx,
    GetUserOrUserGroupIDExIndex: (Double, MFUserOrUserGroupType) => Double,
    Item: Double => IUserOrUserGroupIDEx,
    Remove: Double => Unit
  ): IUserOrUserGroupIDExs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetUserOrUserGroupIDEx = js.Any.fromFunction2(GetUserOrUserGroupIDEx), GetUserOrUserGroupIDExIndex = js.Any.fromFunction2(GetUserOrUserGroupIDExIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IUserOrUserGroupIDExs]
  }
  
  @scala.inline
  implicit class IUserOrUserGroupIDExsMutableBuilder[Self <: IUserOrUserGroupIDExs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IUserOrUserGroupIDEx) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IUserOrUserGroupIDExs): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUserOrUserGroupIDEx(value: (Double, MFUserOrUserGroupType) => IUserOrUserGroupIDEx): Self = StObject.set(x, "GetUserOrUserGroupIDEx", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUserOrUserGroupIDExIndex(value: (Double, MFUserOrUserGroupType) => Double): Self = StObject.set(x, "GetUserOrUserGroupIDExIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItem(value: Double => IUserOrUserGroupIDEx): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
