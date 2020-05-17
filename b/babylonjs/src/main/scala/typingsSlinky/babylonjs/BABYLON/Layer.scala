package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Layer extends js.Object {
  var _createIndexBuffer: js.Any = js.native
  var _effect: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _onAfterRenderObserver: js.Any = js.native
  var _onBeforeRenderObserver: js.Any = js.native
  var _onDisposeObserver: js.Any = js.native
  var _previousDefines: js.Any = js.native
  var _scene: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Define the alpha blending mode used in the layer in case the texture or color has an alpha.
    */
  var alphaBlendingMode: Double = js.native
  /**
    * Define if the layer should alpha test or alpha blend with the rest of the scene.
    * Alpha test will not mix with the background color in case of transparency.
    * It will either use the texture color or the background depending on the alpha value of the current pixel.
    */
  var alphaTest: Boolean = js.native
  /**
    * Define the color of the layer (instead of texture).
    */
  var color: Color4 = js.native
  /**
    * Is the layer in background or foreground.
    */
  var isBackground: Boolean = js.native
  /**
    * Define a mask to restrict the layer to only some of the scene cameras.
    */
  var layerMask: Double = js.native
  /**
    * Define the name of the layer.
    */
  var name: String = js.native
  /**
    * Define an offset for the layer in order to shift the texture.
    */
  var offset: Vector2 = js.native
  /**
    * An event triggered after rendering the scene
    */
  var onAfterRenderObservable: Observable[Layer] = js.native
  /**
    * An event triggered before rendering the scene
    */
  var onBeforeRenderObservable: Observable[Layer] = js.native
  /**
    * An event triggered when the layer is disposed.
    */
  var onDisposeObservable: Observable[Layer] = js.native
  /**
    * Define if the layer is only used in renderTarget or if it also
    * renders in the main frame buffer of the canvas.
    */
  var renderOnlyInRenderTargetTextures: Boolean = js.native
  /**
    * Define the list of render target the layer is visible into.
    */
  var renderTargetTextures: js.Array[RenderTargetTexture] = js.native
  /**
    * Define the scale of the layer in order to zoom in out of the texture.
    */
  var scale: Vector2 = js.native
  /**
    * Define the texture the layer should display.
    */
  var texture: Nullable[Texture] = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /**
    * Disposes and releases the associated ressources.
    */
  def dispose(): Unit = js.native
  /**
    * Back compatibility with callback before the onAfterRenderObservable existed.
    * The set callback will be triggered just after rendering the layer.
    */
  def onAfterRender(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Back compatibility with callback before the onBeforeRenderObservable existed.
    * The set callback will be triggered just before rendering the layer.
    */
  def onBeforeRender(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Back compatibility with callback before the onDisposeObservable existed.
    * The set callback will be triggered when the layer has been disposed.
    */
  def onDispose(callback: js.Function0[Unit]): js.Any = js.native
  /**
    * Renders the layer in the scene.
    */
  def render(): Unit = js.native
}

object Layer {
  @scala.inline
  def apply(
    _createIndexBuffer: js.Any,
    _effect: js.Any,
    _indexBuffer: js.Any,
    _onAfterRenderObserver: js.Any,
    _onBeforeRenderObserver: js.Any,
    _onDisposeObserver: js.Any,
    _previousDefines: js.Any,
    _rebuild: () => Unit,
    _scene: js.Any,
    _vertexBuffers: js.Any,
    alphaBlendingMode: Double,
    alphaTest: Boolean,
    color: Color4,
    dispose: () => Unit,
    isBackground: Boolean,
    layerMask: Double,
    name: String,
    offset: Vector2,
    onAfterRender: js.Function0[Unit] => js.Any,
    onAfterRenderObservable: Observable[Layer],
    onBeforeRender: js.Function0[Unit] => js.Any,
    onBeforeRenderObservable: Observable[Layer],
    onDispose: js.Function0[Unit] => js.Any,
    onDisposeObservable: Observable[Layer],
    render: () => Unit,
    renderOnlyInRenderTargetTextures: Boolean,
    renderTargetTextures: js.Array[RenderTargetTexture],
    scale: Vector2
  ): Layer = {
    val __obj = js.Dynamic.literal(_createIndexBuffer = _createIndexBuffer.asInstanceOf[js.Any], _effect = _effect.asInstanceOf[js.Any], _indexBuffer = _indexBuffer.asInstanceOf[js.Any], _onAfterRenderObserver = _onAfterRenderObserver.asInstanceOf[js.Any], _onBeforeRenderObserver = _onBeforeRenderObserver.asInstanceOf[js.Any], _onDisposeObserver = _onDisposeObserver.asInstanceOf[js.Any], _previousDefines = _previousDefines.asInstanceOf[js.Any], _rebuild = js.Any.fromFunction0(_rebuild), _scene = _scene.asInstanceOf[js.Any], _vertexBuffers = _vertexBuffers.asInstanceOf[js.Any], alphaBlendingMode = alphaBlendingMode.asInstanceOf[js.Any], alphaTest = alphaTest.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isBackground = isBackground.asInstanceOf[js.Any], layerMask = layerMask.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onAfterRender = js.Any.fromFunction1(onAfterRender), onAfterRenderObservable = onAfterRenderObservable.asInstanceOf[js.Any], onBeforeRender = js.Any.fromFunction1(onBeforeRender), onBeforeRenderObservable = onBeforeRenderObservable.asInstanceOf[js.Any], onDispose = js.Any.fromFunction1(onDispose), onDisposeObservable = onDisposeObservable.asInstanceOf[js.Any], render = js.Any.fromFunction0(render), renderOnlyInRenderTargetTextures = renderOnlyInRenderTargetTextures.asInstanceOf[js.Any], renderTargetTextures = renderTargetTextures.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Layer]
  }
  @scala.inline
  implicit class LayerOps[Self <: Layer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_createIndexBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_createIndexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_effect(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_effect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indexBuffer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indexBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onAfterRenderObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onAfterRenderObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onBeforeRenderObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onBeforeRenderObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_onDisposeObserver(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_onDisposeObserver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_previousDefines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_previousDefines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rebuild(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rebuild")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def with_scene(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vertexBuffers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vertexBuffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaBlendingMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaBlendingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlphaTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alphaTest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Color4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayerMask(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffset(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAfterRender(value: js.Function0[Unit] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAfterRenderObservable(value: Observable[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterRenderObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBeforeRender(value: js.Function0[Unit] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnBeforeRenderObservable(value: Observable[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeRenderObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnDispose(value: js.Function0[Unit] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnDisposeObservable(value: Observable[Layer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDisposeObservable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRender(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRenderOnlyInRenderTargetTextures(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOnlyInRenderTargetTextures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderTargetTextures(value: js.Array[RenderTargetTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTargetTextures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Vector2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTexture(value: Nullable[Texture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextureNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("texture")(null)
        ret
    }
  }
  
}

