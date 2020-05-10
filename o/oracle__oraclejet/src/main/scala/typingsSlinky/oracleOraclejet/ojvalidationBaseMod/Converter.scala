package typingsSlinky.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.native
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.native
  def format(value: V): String | Null = js.native
  def parse(value: String): V | Null = js.native
}

object Converter {
  @scala.inline
  def apply[V](format: V => String | Null, parse: String => V | Null): Converter[V] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[Converter[V]]
  }
  @scala.inline
  implicit class ConverterOps[Self[v] <: Converter[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withFormat(value: V => String | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: String => V | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHint(value: () => String | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHint: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHint")(js.undefined)
        ret
    }
    @scala.inline
    def withGetOptions(value: () => js.Object): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetOptions: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedOptions(value: () => js.Object): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResolvedOptions: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedOptions")(js.undefined)
        ret
    }
  }
  
}

