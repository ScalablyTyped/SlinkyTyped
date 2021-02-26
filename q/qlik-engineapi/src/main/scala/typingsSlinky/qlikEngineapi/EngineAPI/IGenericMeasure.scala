package typingsSlinky.qlikEngineapi.EngineAPI

import typingsSlinky.qlikEngineapi.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at measure level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the measure.
  */
@js.native
trait IGenericMeasure extends IGeneratedAPI {
  
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns -
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit] = js.native
  
  /**
    * Returns the type and identifier of the object.
    * @returns - A Promise of NxInfo
    */
  def getInfo(): js.Promise[INxInfo] = js.native
  
  /**
    * Evaluates a measure and displays its properties, including the dynamic properties.
    * @returns - A Promise of GenericMeasureLayout
    */
  def getLayout(): js.Promise[IGenericMeasureLayout] = js.native
  
  /**
    * Lists the linked objects to a generic object, a dimension or a measure.
    * @returns - Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[INxLinkedObjectInfo] = js.native
  
  /**
    * Returns the definition of a measure
    * @returns - Information about the measure.
    * >> This parameter is mandatory.
    */
  def getMeasure(): js.Promise[IGenericMeasureProperties] = js.native
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the measure.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    * @returns - A Promise GenericMeasureProperties
    * >> This parameter is mandatory.
    */
  def getProperties(): js.Promise[IGenericMeasureProperties] = js.native
  
  /**
    * Publishes a measure.
    */
  def publish(): js.Promise[Unit] = js.native
  
  /**
    * Sets some properties for a measure.
    * @param qProp - Information about the measure.
    * This parameter is mandatory.
    * @returns - A Promise of GenericMeasureProperties
    */
  def setProperties(qProp: IGenericMeasureProperties): js.Promise[Unit] = js.native
  
  /**
    * Unpublishes a measure.
    */
  def unPublish(): js.Promise[Unit] = js.native
}
object IGenericMeasure {
  
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericMeasureLayout],
    getLinkedObjects: () => js.Promise[INxLinkedObjectInfo],
    getMeasure: () => js.Promise[IGenericMeasureProperties],
    getProperties: () => js.Promise[IGenericMeasureProperties],
    publish: () => js.Promise[Unit],
    setProperties: IGenericMeasureProperties => js.Promise[Unit],
    unPublish: () => js.Promise[Unit]
  ): IGenericMeasure = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getLinkedObjects = js.Any.fromFunction0(getLinkedObjects), getMeasure = js.Any.fromFunction0(getMeasure), getProperties = js.Any.fromFunction0(getProperties), publish = js.Any.fromFunction0(publish), setProperties = js.Any.fromFunction1(setProperties), unPublish = js.Any.fromFunction0(unPublish))
    __obj.asInstanceOf[IGenericMeasure]
  }
  
  @scala.inline
  implicit class IGenericMeasureMutableBuilder[Self <: IGenericMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[INxInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayout(value: () => js.Promise[IGenericMeasureLayout]): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkedObjects(value: () => js.Promise[INxLinkedObjectInfo]): Self = StObject.set(x, "getLinkedObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMeasure(value: () => js.Promise[IGenericMeasureProperties]): Self = StObject.set(x, "getMeasure", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericMeasureProperties]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetProperties(value: IGenericMeasureProperties => js.Promise[Unit]): Self = StObject.set(x, "setProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "unPublish", js.Any.fromFunction0(value))
  }
}
