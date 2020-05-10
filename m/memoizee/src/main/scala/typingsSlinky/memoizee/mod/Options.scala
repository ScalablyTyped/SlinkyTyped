package typingsSlinky.memoizee.mod

import typingsSlinky.memoizee.memoizeeBooleans.`false`
import typingsSlinky.memoizee.memoizeeBooleans.`true`
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[F /* <: js.Function1[/* repeated */ js.Any, _] */] extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var dispose: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
  var length: js.UndefOr[Double | `false`] = js.native
  var max: js.UndefOr[Double] = js.native
  var maxAge: js.UndefOr[Double] = js.native
  var normalizer: js.UndefOr[js.Function1[/* args */ Parameters[F], String]] = js.native
  var preFetch: js.UndefOr[Double | `true`] = js.native
  var primitive: js.UndefOr[Boolean] = js.native
  var promise: js.UndefOr[Boolean] = js.native
  var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ _, _]]] = js.native
}

object Options {
  @scala.inline
  def apply[F](): Options[F] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[F]]
  }
  @scala.inline
  implicit class OptionsOps[Self[f] <: Options[f], F] (val x: Self[F]) extends AnyVal {
    @scala.inline
    def duplicate: Self[F] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[F]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[F] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[F] with Other]
    @scala.inline
    def withAsync(value: Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withDispose(value: /* value */ js.Any => Unit): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDispose: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double | `false`): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: Double): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: Double): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizer(value: /* args */ Parameters[F] => String): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalizer: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizer")(js.undefined)
        ret
    }
    @scala.inline
    def withPreFetch(value: Double | `true`): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFetch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreFetch: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preFetch")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimitive(value: Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimitive: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitive")(js.undefined)
        ret
    }
    @scala.inline
    def withPromise(value: Boolean): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromise: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promise")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvers(value: js.Array[js.Function1[/* arg */ _, _]]): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvers: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvers")(js.undefined)
        ret
    }
  }
  
}

