package typingsSlinky.catbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.catbox.mod.PolicyOptionVariants because Already inherited */ @js.native
trait DecoratedPolicyOptions[T] extends PolicyOptions[T] {
  /**
    * @default false
    */
  var getDecoratedValue: js.UndefOr[Boolean] = js.native
}

object DecoratedPolicyOptions {
  @scala.inline
  def apply[T](): DecoratedPolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratedPolicyOptions[T]]
  }
  @scala.inline
  implicit class DecoratedPolicyOptionsOps[Self[t] <: DecoratedPolicyOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetDecoratedValue(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecoratedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetDecoratedValue: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDecoratedValue")(js.undefined)
        ret
    }
  }
  
}

