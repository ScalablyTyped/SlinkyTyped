package typingsSlinky.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ModelComponent.
  * @property type - The type of the model. Can be one of the following:
  * * "asset": The component will render a model asset
  * * "box": The component will render a box (1 unit in each dimension)
  * * "capsule": The component will render a capsule (radius 0.5, height 2)
  * * "cone": The component will render a cone (radius 0.5, height 1)
  * * "cylinder": The component will render a cylinder (radius 0.5, height 1)
  * * "plane": The component will render a plane (1 unit in each dimension)
  * * "sphere": The component will render a sphere (radius 0.5)
  * @property asset - The asset for the model (only applies to models of type 'asset') - can also be an asset id.
  * @property castShadows - If true, this model will cast shadows for lights that have shadow casting enabled.
  * @property receiveShadows - If true, shadows will be cast on this model.
  * @property material - The material {@link pc.Material} that will be used to render the model (not used on models of type 'asset').
  * @property materialAsset - The material {@link pc.Asset} that will be used to render the model (not used on models of type 'asset').
  * @property model - The model that is added to the scene graph. It can be not set or loaded, so will return null.
  * @property mapping - A dictionary that holds material overrides for each mesh instance. Only applies to model
  * components of type 'asset'. The mapping contains pairs of mesh instance index - material asset id.
  * @property castShadowsLightmap - If true, this model will cast shadows when rendering lightmaps.
  * @property lightmapped - If true, this model will be lightmapped after using lightmapper.bake().
  * @property lightmapSizeMultiplier - Lightmap resolution multiplier.
  * @property isStatic - Mark model as non-movable (optimization).
  * @property aabb - If set, the bounding box is used as a bounding box for visibility culling of attached mesh instances. This is an optimization,
  * allowing oversized bounding box to be specified for skinned characters in order to avoid per frame bounding box computations based on bone positions.
  * @property meshInstances - An array of meshInstances contained in the component's model. If model is not set or loaded for component it will return null.
  * @property batchGroupId - Assign model to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this model should belong.
  * Don't push/pop/splice or modify this array, if you want to change it - set a new one instead.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "ModelComponent")
@js.native
class ModelComponent protected ()
  extends typingsSlinky.playcanvas.pc.ModelComponent {
  def this(
    system: typingsSlinky.playcanvas.pc.ModelComponentSystem,
    entity: typingsSlinky.playcanvas.pc.Entity
  ) = this()
}
