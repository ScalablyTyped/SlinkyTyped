package typingsSlinky.oracleOraclejet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericSetter[SP] extends js.Object {
  def set[K /* <: /* keyof SP */ String */](
    propertyName: K,
    propertyValue: /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any
  ): Unit = js.native
  def unset(propertyName: /* keyof SP */ String): Unit = js.native
}

object GenericSetter {
  @scala.inline
  def apply[SP](
    set: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit,
    unset: /* keyof SP */ String => Unit
  ): GenericSetter[SP] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[GenericSetter[SP]]
  }
  @scala.inline
  implicit class GenericSetterOps[Self[sp] <: GenericSetter[sp], SP] (val x: Self[SP]) extends AnyVal {
    @scala.inline
    def duplicate: Self[SP] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[SP]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[SP] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[SP] with Other]
    @scala.inline
    def withSet(
      value: (js.Any, /* import warning: importer.ImportType#apply Failed type conversion: SP[K] */ js.Any) => Unit
    ): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUnset(value: /* keyof SP */ String => Unit): Self[SP] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unset")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

