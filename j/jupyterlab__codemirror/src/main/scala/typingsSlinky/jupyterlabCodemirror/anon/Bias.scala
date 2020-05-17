package typingsSlinky.jupyterlabCodemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bias extends js.Object {
  var bias: js.UndefOr[Double] = js.native
  var origin: js.UndefOr[String] = js.native
  var scroll: js.UndefOr[Boolean] = js.native
}

object Bias {
  @scala.inline
  def apply(): Bias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bias]
  }
  @scala.inline
  implicit class BiasOps[Self <: Bias] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
  }
  
}

