package typingsSlinky.pixiJs.PIXI.resources

import typingsSlinky.pixiJs.PIXI.BaseTexture
import typingsSlinky.pixiJs.PIXI.GLTexture
import typingsSlinky.pixiJs.PIXI.Renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that contains a number of sources.
  *
  * @class
  * @extends PIXI.resources.Resource
  * @memberof PIXI.resources
  * @param {number|Array<*>} source - Number of items in array or the collection
  *        of image URLs to use. Can also be resources, image elements, canvas, etc.
  * @param {object} [options] Options to apply to {@link PIXI.resources.autoDetectResource}
  * @param {number} [options.width] - Width of the resource
  * @param {number} [options.height] - Height of the resource
  */
@js.native
trait ArrayResource extends Resource {
  /**
    * Dirty IDs for each part
    * @member {Array<number>} PIXI.resources.ArrayResource#itemDirtyIds
    * @readonly
    */
  val itemDirtyIds: js.Array[Double] = js.native
  /**
    * Collection of resources.
    * @member {Array<PIXI.BaseTexture>} PIXI.resources.ArrayResource#items
    * @readonly
    */
  val items: js.Array[BaseTexture] = js.native
  /**
    * Number of elements in array
    *
    * @member {number} PIXI.resources.ArrayResource#length
    * @readonly
    */
  val length: Double = js.native
  /**
    * Set a resource by ID
    *
    * @param {PIXI.resources.Resource} resource
    * @param {number} index - Zero-based index of resource to set
    * @return {PIXI.resources.ArrayResource} Instance for chaining
    */
  def addResourceAt(resource: Resource, index: Double): ArrayResource = js.native
}

object ArrayResource {
  @scala.inline
  def apply(
    _height: Double,
    _width: Double,
    addResourceAt: (Resource, Double) => ArrayResource,
    bind: BaseTexture => Unit,
    destroy: () => Unit,
    destroyed: Boolean,
    dispose: () => Unit,
    height: Double,
    internal: Boolean,
    itemDirtyIds: js.Array[Double],
    items: js.Array[BaseTexture],
    length: Double,
    load: () => js.Promise[Unit],
    resize: (Double, Double) => Unit,
    style: (Renderer, BaseTexture, GLTexture) => Boolean,
    unbind: BaseTexture => Unit,
    update: () => Unit,
    upload: (Renderer, BaseTexture, GLTexture) => Boolean,
    valid: Boolean,
    width: Double
  ): ArrayResource = {
    val __obj = js.Dynamic.literal(_height = _height.asInstanceOf[js.Any], _width = _width.asInstanceOf[js.Any], addResourceAt = js.Any.fromFunction2(addResourceAt), bind = js.Any.fromFunction1(bind), destroy = js.Any.fromFunction0(destroy), destroyed = destroyed.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), height = height.asInstanceOf[js.Any], internal = internal.asInstanceOf[js.Any], itemDirtyIds = itemDirtyIds.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), resize = js.Any.fromFunction2(resize), style = js.Any.fromFunction3(style), unbind = js.Any.fromFunction1(unbind), update = js.Any.fromFunction0(update), upload = js.Any.fromFunction3(upload), valid = valid.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayResource]
  }
  @scala.inline
  implicit class ArrayResourceOps[Self <: ArrayResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddResourceAt(value: (Resource, Double) => ArrayResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addResourceAt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItemDirtyIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDirtyIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[BaseTexture]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

