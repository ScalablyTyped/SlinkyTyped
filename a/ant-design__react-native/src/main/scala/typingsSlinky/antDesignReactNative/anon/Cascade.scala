package typingsSlinky.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascade extends js.Object {
  var cascade: Boolean = js.native
  var cols: Double = js.native
  var value: js.Array[scala.Nothing] = js.native
  def onChange(): Unit = js.native
}

object Cascade {
  @scala.inline
  def apply(cascade: Boolean, cols: Double, onChange: () => Unit, value: js.Array[scala.Nothing]): Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascade]
  }
  @scala.inline
  implicit class CascadeOps[Self <: Cascade] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCascade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cascade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCols(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cols")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValue(value: js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

