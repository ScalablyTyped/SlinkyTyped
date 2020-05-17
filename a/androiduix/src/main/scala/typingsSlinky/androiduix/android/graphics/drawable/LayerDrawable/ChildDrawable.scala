package typingsSlinky.androiduix.android.graphics.drawable.LayerDrawable

import typingsSlinky.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildDrawable extends js.Object {
  var mDrawable: Drawable = js.native
  var mId: String = js.native
  var mInsetB: Double = js.native
  var mInsetL: Double = js.native
  var mInsetR: Double = js.native
  var mInsetT: Double = js.native
}

object ChildDrawable {
  @scala.inline
  def apply(
    mDrawable: Drawable,
    mId: String,
    mInsetB: Double,
    mInsetL: Double,
    mInsetR: Double,
    mInsetT: Double
  ): ChildDrawable = {
    val __obj = js.Dynamic.literal(mDrawable = mDrawable.asInstanceOf[js.Any], mId = mId.asInstanceOf[js.Any], mInsetB = mInsetB.asInstanceOf[js.Any], mInsetL = mInsetL.asInstanceOf[js.Any], mInsetR = mInsetR.asInstanceOf[js.Any], mInsetT = mInsetT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildDrawable]
  }
  @scala.inline
  implicit class ChildDrawableOps[Self <: ChildDrawable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMDrawable(value: Drawable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDrawable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInsetB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInsetB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInsetL(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInsetL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInsetR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInsetR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInsetT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInsetT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

