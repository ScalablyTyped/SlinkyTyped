package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFinalizable extends IFinalizableToString {
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): js.Any = js.native
}

object IFinalizable {
  @scala.inline
  def apply(ToCamlQuery: () => js.Any, ToString: () => String): IFinalizable = {
    val __obj = js.Dynamic.literal(ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizable]
  }
  @scala.inline
  implicit class IFinalizableOps[Self <: IFinalizable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToCamlQuery(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToCamlQuery")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

