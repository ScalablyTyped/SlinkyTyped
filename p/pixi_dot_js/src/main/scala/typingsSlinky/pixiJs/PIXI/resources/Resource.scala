package typingsSlinky.pixiJs.PIXI.resources

import typingsSlinky.pixiJs.PIXI.BaseTexture
import typingsSlinky.pixiJs.PIXI.GLTexture
import typingsSlinky.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base resource class for textures that manages validation and uploading, depending on its type.
  *
  * Uploading of a base texture to the GPU is required.
  *
  * @class
  * @memberof PIXI.resources
  */
@js.native
trait Resource extends js.Object {
  /**
    * Internal height of the resource
    * @member {number} PIXI.resources.Resource#_height
    * @protected
    */
  var _height: Double = js.native
  /**
    * Internal width of the resource
    * @member {number} PIXI.resources.Resource#_width
    * @protected
    */
  var _width: Double = js.native
  /**
    * If resource has been destroyed
    * @member {boolean} PIXI.resources.Resource#destroyed
    * @readonly
    * @default false
    */
  val destroyed: Boolean = js.native
  /**
    * The height of the resource.
    *
    * @member {number}
    * @readonly
    */
  val height: Double = js.native
  /**
    * `true` if resource is created by BaseTexture
    * useful for doing cleanup with BaseTexture destroy
    * and not cleaning up resources that were created
    * externally.
    * @member {boolean} PIXI.resources.Resource#internal
    * @protected
    */
  var internal: Boolean = js.native
  /**
    * Has been validated
    * @readonly
    * @member {boolean}
    */
  val valid: Boolean = js.native
  /**
    * The width of the resource.
    *
    * @member {number}
    * @readonly
    */
  val width: Double = js.native
  /**
    * Bind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  def bind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Call when destroying resource, unbind any BaseTexture object
    * before calling this method, as reference counts are maintained
    * internally.
    */
  def destroy(): Unit = js.native
  /**
    * Clean up anything, this happens when destroying is ready.
    *
    * @protected
    */
  /* protected */ def dispose(): Unit = js.native
  /**
    * This can be overridden to start preloading a resource
    * or do any other prepare step.
    * @protected
    * @return {Promise<void>} Handle the validate event
    */
  /* protected */ def load(): js.Promise[Unit] = js.native
  /**
    * Trigger a resize event
    * @param {number} width X dimension
    * @param {number} height Y dimension
    */
  def resize(width: Double, height: Double): Unit = js.native
  /**
    * Set the style, optional to override
    *
    * @param {PIXI.Renderer} renderer - yeah, renderer!
    * @param {PIXI.BaseTexture} baseTexture - the texture
    * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
    * @returns {boolean} `true` is success
    */
  def style(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
  /**
    * Unbind to a parent BaseTexture
    *
    * @param {PIXI.BaseTexture} baseTexture - Parent texture
    */
  def unbind(baseTexture: BaseTexture): Unit = js.native
  /**
    * Has been updated trigger event
    */
  def update(): Unit = js.native
  /**
    * Uploads the texture or returns false if it cant for some reason. Override this.
    *
    * @param {PIXI.Renderer} renderer - yeah, renderer!
    * @param {PIXI.BaseTexture} baseTexture - the texture
    * @param {PIXI.GLTexture} glTexture - texture instance for this webgl context
    * @returns {boolean} true is success
    */
  def upload(renderer: Renderer, baseTexture: BaseTexture, glTexture: GLTexture): Boolean = js.native
}

object Resource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
    bind: BaseTexture => Unit,
    destroy: () => Unit,
    destroyed: Boolean,
    dispose: () => Unit,
    height: Double,
    internal: Boolean,
    load: () => js.Promise[Unit],
    resize: (Double, Double) => Unit,
    style: (Renderer, BaseTexture, GLTexture) => Boolean,
    unbind: BaseTexture => Unit,
    update: () => Unit,
    upload: (Renderer, BaseTexture, GLTexture) => Boolean,
    valid: Boolean,
    width: Double
  ): Resource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_width(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBind(value: BaseTexture => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoad(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("load")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStyle(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withUnbind(value: BaseTexture => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unbind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUpload(value: (Renderer, BaseTexture, GLTexture) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

