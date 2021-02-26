package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFACLEnforcingMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultExternalObjectOperations extends StObject {
  
  def PromoteObject(
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues,
    ACLEnforcingMode: MFACLEnforcingMode,
    pACLProvidedCBN: IAccessControlList
  ): IObjectVersionAndProperties = js.native
}
object IVaultExternalObjectOperations {
  
  @scala.inline
  def apply(
    PromoteObject: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
  ): IVaultExternalObjectOperations = {
    val __obj = js.Dynamic.literal(PromoteObject = js.Any.fromFunction4(PromoteObject))
    __obj.asInstanceOf[IVaultExternalObjectOperations]
  }
  
  @scala.inline
  implicit class IVaultExternalObjectOperationsMutableBuilder[Self <: IVaultExternalObjectOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPromoteObject(
      value: (IObjVer, IPropertyValues, MFACLEnforcingMode, IAccessControlList) => IObjectVersionAndProperties
    ): Self = StObject.set(x, "PromoteObject", js.Any.fromFunction4(value))
  }
}
