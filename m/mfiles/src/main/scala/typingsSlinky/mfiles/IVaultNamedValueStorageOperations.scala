package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFNamedValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultNamedValueStorageOperations extends StObject {
  
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
  implicit class IVaultNamedValueStorageOperationsMutableBuilder[Self <: IVaultNamedValueStorageOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNamedValues(value: (MFNamedValueType, String) => INamedValues): Self = StObject.set(x, "GetNamedValues", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveNamedValues(value: (MFNamedValueType, String, IStrings) => Unit): Self = StObject.set(x, "RemoveNamedValues", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetNamedValues(value: (MFNamedValueType, String, INamedValues) => Unit): Self = StObject.set(x, "SetNamedValues", js.Any.fromFunction3(value))
  }
}
