package typingsSlinky.reactMapGl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLRedrawOptions extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  def project(lnglat: js.Array[Double]): js.Array[Double] = js.native
  def unproject(xy: js.Array[Double]): js.Array[Double] = js.native
}

object HTMLRedrawOptions {
  @scala.inline
  def apply(
    height: Double,
    project: js.Array[Double] => js.Array[Double],
    unproject: js.Array[Double] => js.Array[Double],
    width: Double
  ): HTMLRedrawOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], project = js.Any.fromFunction1(project), unproject = js.Any.fromFunction1(unproject), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLRedrawOptions]
  }
  @scala.inline
  implicit class HTMLRedrawOptionsOps[Self <: HTMLRedrawOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnproject(value: js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unproject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

