package typingsSlinky.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fragment extends js.Object {
  var fragment: js.UndefOr[String] = js.native
  var geometryClass: js.UndefOr[js.Any] = js.native
  var vertex: js.UndefOr[String] = js.native
  var vertexSize: js.UndefOr[Double] = js.native
}

object Fragment {
  @scala.inline
  def apply(): Fragment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fragment]
  }
  @scala.inline
  implicit class FragmentOps[Self <: Fragment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometryClass(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometryClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometryClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVertex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(js.undefined)
        ret
    }
    @scala.inline
    def withVertexSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertexSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertexSize")(js.undefined)
        ret
    }
  }
  
}

