package typingsSlinky.aframe.mod

import typingsSlinky.aframe.anon.GetMeshMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AFrame extends js.Object {
  var AComponent: Component[_, System[_]] = js.native
  var AEntity: Entity[ObjectMap[Component[_, System[_]]]] = js.native
  var ANode: typingsSlinky.aframe.mod.ANode = js.native
  var AScene: Scene = js.native
  var THREE: ThreeLib = js.native
  var TWEEN: TweenLib = js.native
  var components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]] = js.native
  var geometries: ObjectMap[GeometryDescriptor[Geometry[_]]] = js.native
  var primitives: GetMeshMixin = js.native
  var scenes: js.Array[Scene] = js.native
  var schema: SchemaUtils = js.native
  var shaders: ObjectMap[ShaderDescriptor[Shader]] = js.native
  var systems: ObjectMap[SystemConstructor[js.Object]] = js.native
  var utils: Utils_ = js.native
  var version: String = js.native
  def registerComponent[T /* <: js.Object */](name: String, component: ComponentDefinition[T]): ComponentConstructor[T] = js.native
  def registerElement(name: String, element: js.Object): Unit = js.native
  def registerGeometry[T /* <: js.Object */](name: String, geometry: GeometryDefinition[T, _]): GeometryConstructor[T] = js.native
  def registerPrimitive(name: String, primitive: PrimitiveDefinition): Unit = js.native
  def registerShader[T /* <: MinimalShaderDefinition with js.Object */](name: String, shader: ShaderDefinition[T]): ShaderConstructor[T] = js.native
  def registerSystem[T /* <: js.Object */](name: String, definition: SystemDefinition[T]): SystemConstructor[T] = js.native
}

object AFrame {
  @scala.inline
  def apply(
    AComponent: Component[_, System[_]],
    AEntity: Entity[ObjectMap[Component[_, System[_]]]],
    ANode: ANode,
    AScene: Scene,
    THREE: ThreeLib,
    TWEEN: TweenLib,
    components: ObjectMap[ComponentDescriptor[Component[_, System[_]]]],
    geometries: ObjectMap[GeometryDescriptor[Geometry[_]]],
    primitives: GetMeshMixin,
    registerComponent: (String, ComponentDefinition[js.Any]) => ComponentConstructor[js.Any],
    registerElement: (String, js.Object) => Unit,
    registerGeometry: (String, GeometryDefinition[js.Any, _]) => GeometryConstructor[js.Any],
    registerPrimitive: (String, PrimitiveDefinition) => Unit,
    registerShader: (String, ShaderDefinition[js.Any]) => ShaderConstructor[js.Any],
    registerSystem: (String, SystemDefinition[js.Any]) => SystemConstructor[js.Any],
    scenes: js.Array[Scene],
    schema: SchemaUtils,
    shaders: ObjectMap[ShaderDescriptor[Shader]],
    systems: ObjectMap[SystemConstructor[js.Object]],
    utils: Utils_,
    version: String
  ): AFrame = {
    val __obj = js.Dynamic.literal(AComponent = AComponent.asInstanceOf[js.Any], AEntity = AEntity.asInstanceOf[js.Any], ANode = ANode.asInstanceOf[js.Any], AScene = AScene.asInstanceOf[js.Any], THREE = THREE.asInstanceOf[js.Any], TWEEN = TWEEN.asInstanceOf[js.Any], components = components.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], primitives = primitives.asInstanceOf[js.Any], registerComponent = js.Any.fromFunction2(registerComponent), registerElement = js.Any.fromFunction2(registerElement), registerGeometry = js.Any.fromFunction2(registerGeometry), registerPrimitive = js.Any.fromFunction2(registerPrimitive), registerShader = js.Any.fromFunction2(registerShader), registerSystem = js.Any.fromFunction2(registerSystem), scenes = scenes.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], shaders = shaders.asInstanceOf[js.Any], systems = systems.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFrame]
  }
  @scala.inline
  implicit class AFrameOps[Self <: AFrame] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAComponent(value: Component[_, System[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAEntity(value: Entity[ObjectMap[Component[_, System[_]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AEntity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANode(value: ANode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AScene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTHREE(value: ThreeLib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("THREE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTWEEN(value: TweenLib): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TWEEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponents(value: ObjectMap[ComponentDescriptor[Component[_, System[_]]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeometries(value: ObjectMap[GeometryDescriptor[Geometry[_]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimitives(value: GetMeshMixin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegisterComponent(value: (String, ComponentDefinition[js.Any]) => ComponentConstructor[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerComponent")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterElement(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerElement")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterGeometry(value: (String, GeometryDefinition[js.Any, _]) => GeometryConstructor[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerGeometry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterPrimitive(value: (String, PrimitiveDefinition) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerPrimitive")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterShader(value: (String, ShaderDefinition[js.Any]) => ShaderConstructor[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerShader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRegisterSystem(value: (String, SystemDefinition[js.Any]) => SystemConstructor[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerSystem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withScenes(value: js.Array[Scene]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scenes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: SchemaUtils): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShaders(value: ObjectMap[ShaderDescriptor[Shader]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystems(value: ObjectMap[SystemConstructor[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtils(value: Utils_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utils")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

