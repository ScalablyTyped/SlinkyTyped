package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Model
  * @classdesc A model is a graphical object that can be added to or removed from a scene.
  * It contains a hierarchy and any number of mesh instances.
  * @description Creates a new model.
  * @example
  * // Create a new model
  * var model = new pc.Model();
  * @property {pc.GraphNode} graph The root node of the model's graph node hierarchy.
  * @property {pc.MeshInstance[]} meshInstances An array of MeshInstances contained in this model.
  * @property {pc.SkinInstance[]} skinInstances An array of SkinInstances contained in this model.
  * @property {pc.MorphInstance[]} morphInstances An array of MorphInstances contained in this model.
  */
@js.native
trait Model extends js.Object {
  /**
    * The root node of the model's graph node hierarchy.
    */
  var graph: GraphNode = js.native
  /**
    * An array of MeshInstances contained in this model.
    */
  var meshInstances: js.Array[MeshInstance] = js.native
  /**
    * An array of MorphInstances contained in this model.
    */
  var morphInstances: js.Array[MorphInstance] = js.native
  /**
    * An array of SkinInstances contained in this model.
    */
  var skinInstances: js.Array[SkinInstance] = js.native
  /**
    * @function
    * @name pc.Model#destroy
    * @description Destroys skinning texture and possibly deletes vertex/index buffers of a model.
    * Mesh is reference-counted, so buffers are only deleted if all models with referencing mesh instances were deleted.
    * That means all in-scene models + the "base" one (asset.resource) which is created when the model is parsed.
    * It is recommended to use asset.unload() instead, which will also remove the model from the scene.
    */
  def destroy(): Unit = js.native
  /**
    * @function
    * @name pc.Model#generateWireframe
    * @description Generates the necessary internal data for a model to be
    * renderable as wireframe. Once this function has been called, any mesh
    * instance in the model can have its renderStyle property set to
    * pc.RENDERSTYLE_WIREFRAME.
    * @example
    * model.generateWireframe();
    * for (var i = 0; i < model.meshInstances.length; i++) {
    *     model.meshInstances[i].renderStyle = pc.RENDERSTYLE_WIREFRAME;
    * }
    */
  def generateWireframe(): Unit = js.native
}

object Model {
  @scala.inline
  def apply(
    destroy: () => Unit,
    generateWireframe: () => Unit,
    graph: GraphNode,
    meshInstances: js.Array[MeshInstance],
    morphInstances: js.Array[MorphInstance],
    skinInstances: js.Array[SkinInstance]
  ): Model = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), generateWireframe = js.Any.fromFunction0(generateWireframe), graph = graph.asInstanceOf[js.Any], meshInstances = meshInstances.asInstanceOf[js.Any], morphInstances = morphInstances.asInstanceOf[js.Any], skinInstances = skinInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGenerateWireframe(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateWireframe")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGraph(value: GraphNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("graph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshInstances(value: js.Array[MeshInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMorphInstances(value: js.Array[MorphInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("morphInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkinInstances(value: js.Array[SkinInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skinInstances")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

