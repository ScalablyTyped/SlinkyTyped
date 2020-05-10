package typingsSlinky.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A KeyRing is a toplevel logical grouping of CryptoKeys.
  */
@js.native
trait SchemaKeyRing extends js.Object {
  /**
    * Output only. The time at which this KeyRing was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. The resource name for the KeyRing in the format
    * `projects/x/locations/x/keyRings/x.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaKeyRing {
  @scala.inline
  def apply(): SchemaKeyRing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaKeyRing]
  }
  @scala.inline
  implicit class SchemaKeyRingOps[Self <: SchemaKeyRing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

