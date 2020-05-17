package typingsSlinky.pixiJs.PIXI.resources

import typingsSlinky.pixiJs.PIXI.BaseTexture
import typingsSlinky.pixiJs.PIXI.GLTexture
import typingsSlinky.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Buffer resource with data of typed array.
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  */
@js.native
trait BufferResource extends Resource {
  /**
    * Source array
    * Cannot be ClampedUint8Array because it cant be uploaded to WebGL
    *
    * @member {Float32Array|Uint8Array|Uint32Array} PIXI.resources.BufferResource#data
    */
  var data: js.typedarray.Float32Array | js.typedarray.Uint8Array | js.typedarray.Uint32Array = js.native
}

object BufferResource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
    bind: BaseTexture => Unit,
    data: js.typedarray.Float32Array | js.typedarray.Uint8Array | js.typedarray.Uint32Array,
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
  ): BufferResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], bind = js.Any.fromFunction1(bind), data = data.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferResource]
  }
  @scala.inline
  implicit class BufferResourceOps[Self <: BufferResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataFloat32Array(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataUint32Array(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.Float32Array | js.typedarray.Uint8Array | js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

