package typingsSlinky.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEmptyArray extends js.Object {
  def emptyArray(): js.Array[scala.Nothing] = js.native
  def `false`(): Boolean = js.native
  def `null`(): Null = js.native
  def `true`(): Boolean = js.native
  def undefined(): Unit = js.native
  def `use strict`(): String = js.native
}

object AnonEmptyArray {
  @scala.inline
  def apply(
    emptyArray: () => js.Array[scala.Nothing],
    `false`: () => Boolean,
    `null`: () => Null,
    `true`: () => Boolean,
    undefined: () => Unit,
    `use strict`: () => String
  ): AnonEmptyArray = {
    val __obj = js.Dynamic.literal(emptyArray = js.Any.fromFunction0(emptyArray), undefined = js.Any.fromFunction0(undefined))
    __obj.updateDynamic("false")(js.Any.fromFunction0(`false`))
    __obj.updateDynamic("null")(js.Any.fromFunction0(`null`))
    __obj.updateDynamic("true")(js.Any.fromFunction0(`true`))
    __obj.updateDynamic("use strict")(js.Any.fromFunction0(`use strict`))
    __obj.asInstanceOf[AnonEmptyArray]
  }
  @scala.inline
  implicit class AnonEmptyArrayOps[Self <: AnonEmptyArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmptyArray(value: () => js.Array[scala.Nothing]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyArray")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFalse(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("false")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNull(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrue(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("true")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUndefined(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def `withUse strict`(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use strict")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

