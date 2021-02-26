package typingsSlinky.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHasOneAssociation
  extends typingsSlinky.extjs.Ext.data.association.IAssociation {
  
  /** [Config Option] (String) */
  var foreignKey: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var getterName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var setterName: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var `type`: js.UndefOr[String] = js.native
}
object IHasOneAssociation {
  
  @scala.inline
  def apply(): IHasOneAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHasOneAssociation]
  }
  
  @scala.inline
  implicit class IHasOneAssociationMutableBuilder[Self <: IHasOneAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForeignKey(value: String): Self = StObject.set(x, "foreignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeignKeyUndefined: Self = StObject.set(x, "foreignKey", js.undefined)
    
    @scala.inline
    def setGetterName(value: String): Self = StObject.set(x, "getterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetterNameUndefined: Self = StObject.set(x, "getterName", js.undefined)
    
    @scala.inline
    def setSetterName(value: String): Self = StObject.set(x, "setterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetterNameUndefined: Self = StObject.set(x, "setterName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
