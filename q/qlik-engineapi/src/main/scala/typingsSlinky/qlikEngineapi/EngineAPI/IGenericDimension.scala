package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class describes all the methods that apply at dimension level.
  * The handle member in the JSON request for all methods listed in this section is the handle of the dimension.
  */
@js.native
trait IGenericDimension extends StObject {
  
  /**
    * Applies a patch to the properties of an object. Allows an update to some of the properties.
    *
    * Note: Applying a patch takes less time than resetting all the properties.
    * @param qPatches - Array of patches.
    * @returns - A promise of a Qlik engine reply.
    */
  def applyPatches(qPatches: js.Array[INxPatch]): js.Promise[Unit] = js.native
  
  /**
    * Returns the definition of a dimension.
    *
    * @returns - A promise GenericDimension.
    */
  def getDimension(): js.Promise[IGenericDimensionProperties] = js.native
  
  /**
    * Returns the type and identifier of the object.
    */
  def getInfo(): js.Promise[INxInfo] = js.native
  
  /**
    * Evaluates a dimension and displays its properties, including the dynamic properties.
    *
    * @returns - A promise GenericDimensionLayout.
    */
  def getLayout(): js.Promise[IGenericDimensionLayout] = js.native
  
  /**
    * Return a lists the linked objects to a generic object, a dimension or a measure.
    * @returns - A promise Array of NxLinkedObjectInfo
    */
  def getLinkedObjects(): js.Promise[js.Array[INxLinkedObjectInfo]] = js.native
  
  /**
    * Shows the properties of an object.
    * Returns the identifier and the definition of the dimension.
    *
    * Note: If the member delta is set to true in the request object, only the delta is retrieved.
    */
  def getProperties(): js.Promise[IGenericDimensionProperties] = js.native
  
  /**
    * Publishes a dimension.
    */
  def publish(): js.Promise[Unit] = js.native
  
  /**
    * Sets some properties for a dimension.
    */
  def setProperties(): js.Promise[IGenericDimensionProperties] = js.native
  
  /**
    * Unpublishes a dimension.
    */
  def unPublish(): js.Promise[Unit] = js.native
}
object IGenericDimension {
  
  @scala.inline
  def apply(
    applyPatches: js.Array[INxPatch] => js.Promise[Unit],
    getDimension: () => js.Promise[IGenericDimensionProperties],
    getInfo: () => js.Promise[INxInfo],
    getLayout: () => js.Promise[IGenericDimensionLayout],
    getLinkedObjects: () => js.Promise[js.Array[INxLinkedObjectInfo]],
    getProperties: () => js.Promise[IGenericDimensionProperties],
    publish: () => js.Promise[Unit],
    setProperties: () => js.Promise[IGenericDimensionProperties],
    unPublish: () => js.Promise[Unit]
  ): IGenericDimension = {
    val __obj = js.Dynamic.literal(applyPatches = js.Any.fromFunction1(applyPatches), getDimension = js.Any.fromFunction0(getDimension), getInfo = js.Any.fromFunction0(getInfo), getLayout = js.Any.fromFunction0(getLayout), getLinkedObjects = js.Any.fromFunction0(getLinkedObjects), getProperties = js.Any.fromFunction0(getProperties), publish = js.Any.fromFunction0(publish), setProperties = js.Any.fromFunction0(setProperties), unPublish = js.Any.fromFunction0(unPublish))
    __obj.asInstanceOf[IGenericDimension]
  }
  
  @scala.inline
  implicit class IGenericDimensionMutableBuilder[Self <: IGenericDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyPatches(value: js.Array[INxPatch] => js.Promise[Unit]): Self = StObject.set(x, "applyPatches", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDimension(value: () => js.Promise[IGenericDimensionProperties]): Self = StObject.set(x, "getDimension", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInfo(value: () => js.Promise[INxInfo]): Self = StObject.set(x, "getInfo", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLayout(value: () => js.Promise[IGenericDimensionLayout]): Self = StObject.set(x, "getLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLinkedObjects(value: () => js.Promise[js.Array[INxLinkedObjectInfo]]): Self = StObject.set(x, "getLinkedObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProperties(value: () => js.Promise[IGenericDimensionProperties]): Self = StObject.set(x, "getProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "publish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetProperties(value: () => js.Promise[IGenericDimensionProperties]): Self = StObject.set(x, "setProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnPublish(value: () => js.Promise[Unit]): Self = StObject.set(x, "unPublish", js.Any.fromFunction0(value))
  }
}
