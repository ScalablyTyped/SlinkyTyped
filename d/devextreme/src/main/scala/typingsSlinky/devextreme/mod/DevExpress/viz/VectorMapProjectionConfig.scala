package typingsSlinky.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorMapProjectionConfig extends js.Object {
  /** Specifies the projection's ratio of the width to the height. */
  var aspectRatio: js.UndefOr[Double] = js.native
  /** Converts coordinates from [x, y] to [lon, lat]. */
  var from: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.native
  /** Converts coordinates from [lon, lat] to [x, y]. */
  var to: js.UndefOr[js.Function1[/* coordinates */ js.Array[Double], js.Array[Double]]] = js.native
}

object VectorMapProjectionConfig {
  @scala.inline
  def apply(): VectorMapProjectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VectorMapProjectionConfig]
  }
  @scala.inline
  implicit class VectorMapProjectionConfigOps[Self <: VectorMapProjectionConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAspectRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAspectRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: /* coordinates */ js.Array[Double] => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

