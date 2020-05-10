package typingsSlinky.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhancedElementInstance[T] extends js.Object {
  /**
    * The locate strategy to be used with `selector` when finding the element within the DOM.
    */
  var locateStrategy: LocateStrategy = js.native
  /**
    * The name of the element as defined by its key in the parent section or the page object's `elements` definition.
    * This is the same name used with the `@` prefix in selector arguments for page object commands that refer to the element.
    */
  var name: String = js.native
  /**
    * A reference to the parent object instance.
    * This is the parent section or the page object that contained the definition for this object.
    */
  var parent: T = js.native
  /**
    * The selector string used to find the element in the DOM.
    */
  var selector: String = js.native
}

object EnhancedElementInstance {
  @scala.inline
  def apply[T](locateStrategy: LocateStrategy, name: String, parent: T, selector: String): EnhancedElementInstance[T] = {
    val __obj = js.Dynamic.literal(locateStrategy = locateStrategy.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedElementInstance[T]]
  }
  @scala.inline
  implicit class EnhancedElementInstanceOps[Self[t] <: EnhancedElementInstance[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withLocateStrategy(value: LocateStrategy): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locateStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelector(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

