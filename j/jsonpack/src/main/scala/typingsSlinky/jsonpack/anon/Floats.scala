package typingsSlinky.jsonpack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Floats extends js.Object {
  var floats: js.Array[Double] = js.native
  var integers: js.Array[Double] = js.native
  var strings: js.Array[String] = js.native
}

object Floats {
  @scala.inline
  def apply(floats: js.Array[Double], integers: js.Array[Double], strings: js.Array[String]): Floats = {
    val __obj = js.Dynamic.literal(floats = floats.asInstanceOf[js.Any], integers = integers.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Floats]
  }
  @scala.inline
  implicit class FloatsOps[Self <: Floats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloats(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIntegers(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

