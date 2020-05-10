package typingsSlinky.fastMemoize.mod

import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[F /* <: Func */] extends js.Object {
  var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.native
  var serializer: js.UndefOr[Serializer] = js.native
  var strategy: js.UndefOr[MemoizeFunc] = js.native
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
    def withCache(value: Cache[String, ReturnType[F]]): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCache: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializer(value: /* args */ js.Array[js.Any] => String): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerializer: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => Func): Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStrategy: Self[F] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

