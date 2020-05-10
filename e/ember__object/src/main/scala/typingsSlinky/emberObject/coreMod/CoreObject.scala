package typingsSlinky.emberObject.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoreObject extends js.Object {
  /**
    * Defines the properties that will be concatenated from the superclass (instead of overridden).
    * @default null
    */
  var concatenatedProperties: js.Array[_] = js.native
  /**
    * Destroyed object property flag. If this property is true the observers and bindings were
    * already removed by the effect of calling the destroy() method.
    * @default false
    */
  var isDestroyed: Boolean = js.native
  /**
    * Destruction scheduled flag. The destroy() method has been called. The object stays intact
    * until the end of the run loop at which point the isDestroyed flag is set.
    * @default false
    */
  var isDestroying: Boolean = js.native
  def _super(args: js.Any*): js.Any = js.native
  /**
    * Destroys an object by setting the `isDestroyed` flag and removing its
    * metadata, which effectively destroys observers and bindings.
    * If you try to set a property on a destroyed object, an exception will be
    * raised.
    * Note that destruction is scheduled for the end of the run loop and does not
    * happen immediately.  It will set an isDestroying flag immediately.
    * @return receiver
    */
  def destroy(): CoreObject = js.native
  /**
    * An overridable method called when objects are instantiated. By default,
    * does nothing unless it is overridden during class definition.
    */
  def init(): Unit = js.native
  /**
    * Override to implement teardown.
    */
  def willDestroy(): Unit = js.native
}

object CoreObject {
  @scala.inline
  def apply(
    _super: /* repeated */ js.Any => js.Any,
    concatenatedProperties: js.Array[_],
    destroy: () => CoreObject,
    init: () => Unit,
    isDestroyed: Boolean,
    isDestroying: Boolean,
    willDestroy: () => Unit
  ): CoreObject = {
    val __obj = js.Dynamic.literal(_super = js.Any.fromFunction1(_super), concatenatedProperties = concatenatedProperties.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init), isDestroyed = isDestroyed.asInstanceOf[js.Any], isDestroying = isDestroying.asInstanceOf[js.Any], willDestroy = js.Any.fromFunction0(willDestroy))
    __obj.asInstanceOf[CoreObject]
  }
  @scala.inline
  implicit class CoreObjectOps[Self <: CoreObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_super(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_super")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConcatenatedProperties(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concatenatedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestroy(value: () => CoreObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDestroying(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDestroying")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWillDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("willDestroy")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

