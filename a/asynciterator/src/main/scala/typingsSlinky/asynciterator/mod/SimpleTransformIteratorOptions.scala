package typingsSlinky.asynciterator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimpleTransformIteratorOptions[S, T] extends TransformIteratorOptions[S] {
  var append: js.UndefOr[js.Array[T]] = js.native
  var filter: js.UndefOr[js.Function1[/* item */ S, Boolean]] = js.native
  var limit: js.UndefOr[Double] = js.native
  var map: js.UndefOr[js.Function1[/* item */ S, T]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var prepend: js.UndefOr[js.Array[T]] = js.native
  var transform: js.UndefOr[
    js.Function2[/* item */ S, /* callback */ js.Function1[/* result */ js.UndefOr[T], Unit], Unit]
  ] = js.native
}

object SimpleTransformIteratorOptions {
  @scala.inline
  def apply[S, T](): SimpleTransformIteratorOptions[S, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleTransformIteratorOptions[S, T]]
  }
  @scala.inline
  implicit class SimpleTransformIteratorOptionsOps[Self[s, t] <: SimpleTransformIteratorOptions[s, t], S, T] (val x: Self[S, T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S, T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S, T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[S, T]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[S, T]) with Other]
    @scala.inline
    def withAppend(value: js.Array[T]): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* item */ S => Boolean): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: /* item */ S => T): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMap: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPrepend(value: js.Array[T]): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrepend: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prepend")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* item */ S, /* callback */ js.Function1[/* result */ js.UndefOr[T], Unit]) => Unit): Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[S, T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

