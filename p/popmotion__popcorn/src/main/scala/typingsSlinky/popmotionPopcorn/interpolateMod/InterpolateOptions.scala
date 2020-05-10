package typingsSlinky.popmotionPopcorn.interpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InterpolateOptions[T] extends js.Object {
  var clamp: js.UndefOr[Boolean] = js.native
  var ease: js.UndefOr[MixEasing] = js.native
  var mixer: js.UndefOr[MixerFactory[T]] = js.native
}

object InterpolateOptions {
  @scala.inline
  def apply[T](): InterpolateOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolateOptions[T]]
  }
  @scala.inline
  implicit class InterpolateOptionsOps[Self[t] <: InterpolateOptions[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withClamp(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClamp: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clamp")(js.undefined)
        ret
    }
    @scala.inline
    def withEaseFunction1(value: /* v */ Double => Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEase(value: MixEasing): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
    @scala.inline
    def withMixer(value: (T, T) => Mix[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMixer: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixer")(js.undefined)
        ret
    }
  }
  
}

