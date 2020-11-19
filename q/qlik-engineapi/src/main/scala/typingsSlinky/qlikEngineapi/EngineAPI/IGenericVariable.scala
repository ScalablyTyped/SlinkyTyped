package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.enigmaJS.IGeneratedAPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at generic variable level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the generic variable.
  */
@js.native
trait IGenericVariable extends IGeneratedAPI {
  
  /**
    * Applies a patch to the properties of a variable. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of NxPatch
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit] = js.native
  
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo] = js.native
  
  /**
    * Evaluates an object and displays its properties including the dynamic properties.
    * If the member delta is set to true in the request object, only the delta is evaluated.
    * @returns GenericVariableLayout Information on the object
    */
  def getLayout(): js.Promise[IGenericVariableLayout] = js.native
  
  /**
    * Shows the properties of an object.
    *
    * Note: If the member delta is set to true in the request, only the delta is retrieved.
    * @returns GenericVariableProperties Information about the generic object
    */
  def getProperties(): js.Promise[IGenericVariableProperties] = js.native
  
  /**
    * Sets the value of a dual variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qText - String representation of a dual value. Set this parameter to "",
    * if the string representation is to be Null.
    * >> This parameter is mandatory.
    * @param qNum - Numeric representation of a dual value.
    * >> This parameter is mandatory.
    */
  def setDualValue(qText: String, qNum: Double): js.Promise[Unit] = js.native
  
  /**
    * Sets a numerical value to a variable.
    *
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable.
    */
  def setNumValue(qVal: Double): js.Promise[Unit] = js.native
  
  /**
    * Sets some properties for a variable.
    *
    * Note: The identifier of a variable cannot be modified.
    * You cannot update the properties of a script-defined variable using the SetProperties method.
    * @param - Information about the variable.
    * >> This parameter is mandatory.
    */
  def setProperties(qProp: IGenericVariableProperties): js.Promise[Unit] = js.native
  
  /**
    * Sets a string value to a variable.
    * Note: These changes are not persistent. They only last the duration of the engine session.
    * @param qVal - Value of the variable. The string can contain an expression.
    */
  def setStringValue(qVal: String): js.Promise[Unit] = js.native
}
object IGenericVariable {
  
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericVariableLayout],
    getProperties: () => js.Promise[IGenericVariableProperties],
    setDualValue: (String, Double) => js.Promise[Unit],
    setNumValue: Double => js.Promise[Unit],
    setProperties: IGenericVariableProperties => js.Promise[Unit],
    setStringValue: String => js.Promise[Unit]
  ): IGenericVariable = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getProperties = js.Any.fromFunction0(getProperties), setDualValue = js.Any.fromFunction2(setDualValue), setNumValue = js.Any.fromFunction1(setNumValue), setProperties = js.Any.fromFunction1(setProperties), setStringValue = js.Any.fromFunction1(setStringValue))
    __obj.asInstanceOf[IGenericVariable]
  }
  
  @scala.inline
  implicit class IGenericVariableOps[Self <: IGenericVariable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = this.set("applyPatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[INxInfo]): Self = this.set("getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayout(value: () => js.Promise[IGenericVariableLayout]): Self = this.set("getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericVariableProperties]): Self = this.set("getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDualValue(value: (String, Double) => js.Promise[Unit]): Self = this.set("setDualValue", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetNumValue(value: Double => js.Promise[Unit]): Self = this.set("setNumValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetProperties(value: IGenericVariableProperties => js.Promise[Unit]): Self = this.set("setProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStringValue(value: String => js.Promise[Unit]): Self = this.set("setStringValue", js.Any.fromFunction1(value))
  }
}
