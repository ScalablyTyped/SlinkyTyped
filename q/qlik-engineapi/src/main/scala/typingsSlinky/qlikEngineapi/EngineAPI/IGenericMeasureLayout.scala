package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is the layout for GenericMeasureProperties extend of GenericBaseLayout
  */
@js.native
trait IGenericMeasureLayout extends IGenericBaseLayout {
  
  /**
    * Information about the measure.
    */
  var qMeasure: INxLibraryMeasureDef = js.native
}
object IGenericMeasureLayout {
  
  @scala.inline
  def apply(qInfo: INxInfo, qMeasure: INxLibraryMeasureDef, qMeta: INxMeta): IGenericMeasureLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasure = qMeasure.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureLayout]
  }
  
  @scala.inline
  implicit class IGenericMeasureLayoutMutableBuilder[Self <: IGenericMeasureLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQMeasure(value: INxLibraryMeasureDef): Self = StObject.set(x, "qMeasure", value.asInstanceOf[js.Any])
  }
}
