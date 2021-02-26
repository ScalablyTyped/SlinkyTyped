package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericListProperties...
  */
@js.native
trait IGenericListProperties extends IGenericProperties {
  
  var qListObjectDef: IListObjectDef = js.native
}
object IGenericListProperties {
  
  @scala.inline
  def apply(qInfo: INxInfo, qListObjectDef: IListObjectDef): IGenericListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qListObjectDef = qListObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericListProperties]
  }
  
  @scala.inline
  implicit class IGenericListPropertiesMutableBuilder[Self <: IGenericListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQListObjectDef(value: IListObjectDef): Self = StObject.set(x, "qListObjectDef", value.asInstanceOf[js.Any])
  }
}
