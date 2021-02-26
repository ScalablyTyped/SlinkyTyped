package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericFieldListProperties width extend GenericProperties
  */
@js.native
trait IGenericFieldListProperties extends IGenericProperties {
  
  /**
    * FieldListDef...
    */
  var qFieldListDef: IFieldListDef = js.native
}
object IGenericFieldListProperties {
  
  @scala.inline
  def apply(qFieldListDef: IFieldListDef, qInfo: INxInfo): IGenericFieldListProperties = {
    val __obj = js.Dynamic.literal(qFieldListDef = qFieldListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericFieldListProperties]
  }
  
  @scala.inline
  implicit class IGenericFieldListPropertiesMutableBuilder[Self <: IGenericFieldListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQFieldListDef(value: IFieldListDef): Self = StObject.set(x, "qFieldListDef", value.asInstanceOf[js.Any])
  }
}
