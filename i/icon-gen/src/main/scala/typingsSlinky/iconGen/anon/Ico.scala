package typingsSlinky.iconGen.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ico extends js.Object {
  var ico: js.Array[Double] = js.native
  var name: String = js.native
  var sizes: js.Array[Double] = js.native
}

object Ico {
  @scala.inline
  def apply(ico: js.Array[Double], name: String, sizes: js.Array[Double]): Ico = {
    val __obj = js.Dynamic.literal(ico = ico.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ico]
  }
  @scala.inline
  implicit class IcoOps[Self <: Ico] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIco(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ico")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

