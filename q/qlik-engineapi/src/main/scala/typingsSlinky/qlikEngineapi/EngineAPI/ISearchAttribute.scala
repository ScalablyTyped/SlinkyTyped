package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchAttribute...
  */
@js.native
trait ISearchAttribute extends StObject {
  
  /**
    * String corresponding to
    * SearchObjectOptions.qAttributes
    * It will be qProperty for SearchObjectOptions.
    */
  var qKey: String = js.native
  
  /**
    * String corresponding to qKey for the current SearchGroupItemMatch.
    * For example, if the match is Make by Price found in the title of a generic object, qValue will be qMetaDef/title.
    */
  var qValue: String = js.native
}
object ISearchAttribute {
  
  @scala.inline
  def apply(qKey: String, qValue: String): ISearchAttribute = {
    val __obj = js.Dynamic.literal(qKey = qKey.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchAttribute]
  }
  
  @scala.inline
  implicit class ISearchAttributeMutableBuilder[Self <: ISearchAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQKey(value: String): Self = StObject.set(x, "qKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: String): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
