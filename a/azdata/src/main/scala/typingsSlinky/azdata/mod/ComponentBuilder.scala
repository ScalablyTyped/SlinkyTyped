package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentBuilder[T /* <: Component */] extends js.Object {
  def component(): T = js.native
  def withProperties[U](properties: U): ComponentBuilder[T] = js.native
  def withValidation(validation: js.Function1[/* component */ T, Boolean]): ComponentBuilder[T] = js.native
}

object ComponentBuilder {
  @scala.inline
  def apply[T](
    component: () => T,
    withProperties: js.Any => ComponentBuilder[T],
    withValidation: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]
  ): ComponentBuilder[T] = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
    __obj.asInstanceOf[ComponentBuilder[T]]
  }
  @scala.inline
  implicit class ComponentBuilderOps[Self[t] <: ComponentBuilder[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withComponent(value: () => T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withWithProperties(value: js.Any => ComponentBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withProperties")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithValidation(value: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withValidation")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

