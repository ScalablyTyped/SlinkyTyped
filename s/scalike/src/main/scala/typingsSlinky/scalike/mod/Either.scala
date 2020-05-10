package typingsSlinky.scalike.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Either[A, B] extends js.Object {
  var isLeft: Boolean = js.native
  var isRight: Boolean = js.native
  var value: A | B = js.native
  def fold[X](fa: js.Function1[/* a */ A, X], fb: js.Function1[/* b */ B, X]): X = js.native
  def left(): LeftProjection[A, B] = js.native
  def right(): RightProjection[A, B] = js.native
  def swap(): Either[B, A] = js.native
}

object Either {
  @scala.inline
  def apply[A, B](
    fold: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any,
    isLeft: Boolean,
    isRight: Boolean,
    left: () => LeftProjection[A, B],
    right: () => RightProjection[A, B],
    swap: () => Either[B, A],
    value: A | B
  ): Either[A, B] = {
    val __obj = js.Dynamic.literal(fold = js.Any.fromFunction2(fold), isLeft = isLeft.asInstanceOf[js.Any], isRight = isRight.asInstanceOf[js.Any], left = js.Any.fromFunction0(left), right = js.Any.fromFunction0(right), swap = js.Any.fromFunction0(swap), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Either[A, B]]
  }
  @scala.inline
  implicit class EitherOps[Self[a, b] <: Either[a, b], A, B] (val x: Self[A, B]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A, B] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A, B]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[A, B]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[A, B]) with Other]
    @scala.inline
    def withFold(value: (js.Function1[/* a */ A, js.Any], js.Function1[/* b */ B, js.Any]) => js.Any): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fold")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withIsLeft(value: Boolean): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRight(value: Boolean): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: () => LeftProjection[A, B]): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRight(value: () => RightProjection[A, B]): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSwap(value: () => Either[B, A]): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: A | B): Self[A, B] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

