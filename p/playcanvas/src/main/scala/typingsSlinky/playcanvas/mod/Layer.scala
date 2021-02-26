package typingsSlinky.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new layer.
  * @property enabled - Enable the layer. Disabled layers are skipped. Defaults to true.
  * @property name - Name of the layer. Can be used in {@link pc.LayerComposition#getLayerByName}.
  * @property opaqueSortMode - Defines the method used for sorting opaque (that is, not semi-transparent) mesh instances before rendering.
  * Possible values are:
  *
  * * {@link pc.SORTMODE_NONE}
  * * {@link pc.SORTMODE_MANUAL}
  * * {@link pc.SORTMODE_MATERIALMESH}
  * * {@link pc.SORTMODE_BACK2FRONT}
  * * {@link pc.SORTMODE_FRONT2BACK}
  *
  * Defaults to pc.SORTMODE_MATERIALMESH.
  * @property transparentSortMode - Defines the method used for sorting semi-transparent mesh instances before rendering.
  * Possible values are:
  *
  * * {@link pc.SORTMODE_NONE}
  * * {@link pc.SORTMODE_MANUAL}
  * * {@link pc.SORTMODE_MATERIALMESH}
  * * {@link pc.SORTMODE_BACK2FRONT}
  * * {@link pc.SORTMODE_FRONT2BACK}
  *
  * Defaults to pc.SORTMODE_BACK2FRONT.
  * @property renderTarget - Render target to which rendering is performed. If not set, will render simply to the screen.
  * @property shaderPass - A type of shader to use during rendering. Possible values are:
  *
  * * {@link pc.SHADER_FORWARD}
  * * {@link pc.SHADER_FORWARDHDR}
  * * {@link pc.SHADER_DEPTH}
  * * Your own custom value. Should be in 19 - 31 range. Use {@link pc.StandardMaterial#onUpdateShader} to apply shader modifications based on this value.
  *
  * Defaults to pc.SHADER_FORWARD.
  * @property passThrough - Tells that this layer is simple and needs to just render a bunch of mesh instances without lighting, skinning and morphing (faster).
  * @property overrideClear - Defines if layer should use camera clear parameters (true) or ignore them and use {@link pc.Layer#clearColor}, {@link pc.Layer#clearColorBuffer},
  * {@link pc.Layer#clearDepthBuffer} and {@link pc.Layer#clearStencilBuffer}.
  * @property clearColor - The color used to clear the canvas to before each camera starts to render.
  * @property clearColorBuffer - If true cameras will clear the color buffer to the color set in clearColor.
  * @property clearDepthBuffer - If true cameras will clear the depth buffer.
  * @property clearStencilBuffer - If true cameras will clear the stencil buffer.
  * @property layerReference - Make this layer render the same mesh instances that another layer does instead of having its own mesh instance list.
  * Both layers must share cameras. Frustum culling is only performed for one layer.
  * @property cullingMask - Visibility mask that interacts with {@link pc.MeshInstance#mask}.
  * @property onEnable - Custom function that is called after the layer has been enabled.
  * This happens when:
  *
  * * The layer is created with {@link pc.Layer#enabled} set to true (which is the default value).
  * * {@link pc.Layer#enabled} was changed from false to true
  * * {@link pc.Layer#incrementCounter} was called and incremented the counter above zero.
  *
  * Useful for allocating resources this layer will use (e.g. creating render targets).
  * @property onDisable - Custom function that is called after the layer has been disabled.
  * This happens when:
  *
  * * {@link pc.Layer#enabled} was changed from true to false
  * * {@link pc.Layer#decrementCounter} was called and set the counter to zero.
  * @property onPreCull - Custom function that is called before visibility culling is performed for this layer.
  * Useful, for example, if you want to modify camera projection while still using the same camera and make frustum culling work correctly with it
  * (see {@link pc.CameraComponent#calculateTransform} and {@link pc.CameraComponent#calculateProjection}).
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPostCull - Custom function that is called after visibility culling is performed for this layer.
  * Useful for reverting changes done in {@link pc.Layer#onPreCull} and determining final mesh instance visibility (see {@link pc.MeshInstance#visibleThisFrame}).
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPreRender - Custom function that is called before this layer is rendered.
  * Useful, for example, for reacting on screen size changes.
  * This function is called before the first occurrence of this layer in {@link pc.LayerComposition}.
  * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPreRenderOpaque - Custom function that is called before opaque mesh instances (not semi-transparent) in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPreRenderTransparent - Custom function that is called before semi-transparent mesh instances in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPostRender - Custom function that is called after this layer is rendered.
  * Useful to revert changes made in {@link pc.Layer#onPreRender} or performing some processing on {@link pc.Layer#renderTarget}.
  * This function is called after the last occurrence of this layer in {@link pc.LayerComposition}.
  * It will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPostRenderOpaque - Custom function that is called after opaque mesh instances (not semi-transparent) in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onPostRenderTransparent - Custom function that is called after semi-transparent mesh instances in this layer are rendered.
  * This function will receive camera index as the only argument. You can get the actual camera being used by looking up {@link pc.LayerComposition#cameras} with this index.
  * @property onDrawCall - Custom function that is called before every mesh instance in this layer is rendered.
  * It is not recommended to set this function when rendering many objects every frame due to performance reasons.
  * @property id - A unique ID of the layer.
  * Layer IDs are stored inside {@link pc.ModelComponent#layers}, {@link pc.CameraComponent#layers}, {@link pc.LightComponent#layers} and {@link pc.ElementComponent#layers} instead of names.
  * Can be used in {@link pc.LayerComposition#getLayerById}.
  * @param options - Object for passing optional arguments. These arguments are the same as properties of the Layer.
  */
@JSImport("playcanvas", "Layer")
@js.native
class Layer protected ()
  extends typingsSlinky.playcanvas.pc.Layer {
  def this(options: js.Any) = this()
}
