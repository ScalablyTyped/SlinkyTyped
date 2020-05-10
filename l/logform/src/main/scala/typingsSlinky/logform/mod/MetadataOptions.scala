package typingsSlinky.logform.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataOptions extends js.Object {
  /**
    * An array of keys that should not be added to the metadata object.
    */
  var fillExcept: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of keys that will be added to the metadata object.
    */
  var fillWith: js.UndefOr[js.Array[String]] = js.native
  /**
    * The name of the key used for the metadata object. Defaults to `metadata`.
    */
  var key: js.UndefOr[String] = js.native
}

object MetadataOptions {
  @scala.inline
  def apply(): MetadataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataOptions]
  }
  @scala.inline
  implicit class MetadataOptionsOps[Self <: MetadataOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFillExcept(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillExcept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillExcept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillExcept")(js.undefined)
        ret
    }
    @scala.inline
    def withFillWith(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillWith")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
  }
  
}

