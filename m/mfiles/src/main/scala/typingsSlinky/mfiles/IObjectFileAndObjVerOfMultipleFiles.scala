package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObjectFileAndObjVerOfMultipleFiles extends StObject {
  
  def Add(Index: Double, ObjectFileAndObjVer: IObjectFileAndObjVer): Unit = js.native
  
  def Clone(): IObjectFileAndObjVerOfMultipleFiles = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IObjectFileAndObjVer = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IObjectFileAndObjVerOfMultipleFiles {
  
  @scala.inline
  def apply(
    Add: (Double, IObjectFileAndObjVer) => Unit,
    Clone: () => IObjectFileAndObjVerOfMultipleFiles,
    Count: Double,
    Item: Double => IObjectFileAndObjVer,
    Remove: Double => Unit
  ): IObjectFileAndObjVerOfMultipleFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IObjectFileAndObjVerOfMultipleFiles]
  }
  
  @scala.inline
  implicit class IObjectFileAndObjVerOfMultipleFilesMutableBuilder[Self <: IObjectFileAndObjVerOfMultipleFiles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IObjectFileAndObjVer) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IObjectFileAndObjVerOfMultipleFiles): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IObjectFileAndObjVer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
