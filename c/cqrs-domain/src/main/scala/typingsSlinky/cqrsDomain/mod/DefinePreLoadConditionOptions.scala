package typingsSlinky.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// endregion
// region definePreCondition
@js.native
trait DefinePreLoadConditionOptions extends StObject {
  
  /**
    * optional
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * the command name
    * optional, default is file name without extension,
    * if name is '' it will handle all commands that matches the appropriate aggregate
    * if name is an array of strings it will handle all commands that matches the appropriate name
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * optional, if not defined it will use what is defined as default in aggregate or pass the whole command
    */
  var payload: js.UndefOr[String] = js.native
  
  /**
    * optional, default Infinity, all pre-conditions will be sorted by this value
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * optional, default 0
    */
  var version: js.UndefOr[Double] = js.native
}
object DefinePreLoadConditionOptions {
  
  @scala.inline
  def apply(): DefinePreLoadConditionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefinePreLoadConditionOptions]
  }
  
  @scala.inline
  implicit class DefinePreLoadConditionOptionsMutableBuilder[Self <: DefinePreLoadConditionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
