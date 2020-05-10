package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEtc1 extends js.Object {
  /**
    * etc1 compression format
    */
  var etc1: js.UndefOr[Boolean] = js.native
  /**
    * etc2 compression format
    */
  var etc2: js.UndefOr[Boolean] = js.native
  /**
    * pvrtc compression format
    */
  var pvrtc: js.UndefOr[Boolean] = js.native
  /**
    * s3tc compression format
    */
  var s3tc: js.UndefOr[Boolean] = js.native
}

object AnonEtc1 {
  @scala.inline
  def apply(): AnonEtc1 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEtc1]
  }
  @scala.inline
  implicit class AnonEtc1Ops[Self <: AnonEtc1] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEtc1(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtc1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc1")(js.undefined)
        ret
    }
    @scala.inline
    def withEtc2(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtc2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etc2")(js.undefined)
        ret
    }
    @scala.inline
    def withPvrtc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvrtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPvrtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pvrtc")(js.undefined)
        ret
    }
    @scala.inline
    def withS3tc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3tc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3tc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3tc")(js.undefined)
        ret
    }
  }
  
}

