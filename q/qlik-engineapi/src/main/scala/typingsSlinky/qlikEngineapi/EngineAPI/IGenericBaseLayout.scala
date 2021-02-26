package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBaseLayout...
  */
@js.native
trait IGenericBaseLayout extends StObject {
  
  var qInfo: INxInfo = js.native
  
  var qMeta: INxMeta = js.native
}
object IGenericBaseLayout {
  
  @scala.inline
  def apply(qInfo: INxInfo, qMeta: INxMeta): IGenericBaseLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBaseLayout]
  }
  
  @scala.inline
  implicit class IGenericBaseLayoutMutableBuilder[Self <: IGenericBaseLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
