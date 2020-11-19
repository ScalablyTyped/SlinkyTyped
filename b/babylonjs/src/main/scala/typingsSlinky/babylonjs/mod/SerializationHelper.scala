package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.animatableInterfaceMod.IAnimatable
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SerializationHelper")
@js.native
class SerializationHelper ()
  extends typingsSlinky.babylonjs.legacyMod.SerializationHelper
/* static members */
@JSImport("babylonjs", "SerializationHelper")
@js.native
object SerializationHelper extends js.Object {
  
  /**
    * Appends the serialized animations from the source animations
    * @param source Source containing the animations
    * @param destination Target to store the animations
    */
  def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): Unit = js.native
  
  /**
    * Clones an object
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the cloned object
    */
  def Clone[T](creationFunction: js.Function0[T], source: T): T = js.native
  
  /**
    * Instanciates a new object based on a source one (some data will be shared between both object)
    * @param creationFunction defines the function used to instanciate the new object
    * @param source defines the source object
    * @returns the new object
    */
  def Instanciate[T](creationFunction: js.Function0[T], source: T): T = js.native
  
  /**
    * Creates a new entity from a serialization data object
    * @param creationFunction defines a function used to instanciated the new entity
    * @param source defines the source serialization data
    * @param scene defines the hosting scene
    * @param rootUrl defines the root url for resources
    * @returns a new entity
    */
  def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene]
  ): T = js.native
  def Parse[T](
    creationFunction: js.Function0[T],
    source: js.Any,
    scene: Nullable[typingsSlinky.babylonjs.sceneMod.Scene],
    rootUrl: Nullable[String]
  ): T = js.native
  
  /**
    * Static function used to serialized a specific entity
    * @param entity defines the entity to serialize
    * @param serializationObject defines the optional target obecjt where serialization data will be stored
    * @returns a JSON compatible object representing the serialization of the entity
    */
  def Serialize[T](entity: T): js.Any = js.native
  def Serialize[T](entity: T, serializationObject: js.Any): js.Any = js.native
  
  /** @hidden */
  def _ColorCurvesParser(sourceProperty: js.Any): typingsSlinky.babylonjs.colorCurvesMod.ColorCurves = js.native
  
  /** @hidden */
  def _FresnelParametersParser(sourceProperty: js.Any): typingsSlinky.babylonjs.fresnelParametersMod.FresnelParameters = js.native
  
  /** @hidden */
  def _ImageProcessingConfigurationParser(sourceProperty: js.Any): typingsSlinky.babylonjs.imageProcessingConfigurationMod.ImageProcessingConfiguration = js.native
  
  /** @hidden */
  def _TextureParser(sourceProperty: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene, rootUrl: String): Nullable[typingsSlinky.babylonjs.baseTextureMod.BaseTexture] = js.native
}
