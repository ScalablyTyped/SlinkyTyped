package typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.DescriptorProto

import typingsSlinky.googleCloudPubsub.protosMod.google.protobuf.IExtensionRangeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an ExtensionRange. */
@js.native
trait IExtensionRange extends js.Object {
  /** ExtensionRange end */
  var end: js.UndefOr[Double | Null] = js.native
  /** ExtensionRange options */
  var options: js.UndefOr[IExtensionRangeOptions | Null] = js.native
  /** ExtensionRange start */
  var start: js.UndefOr[Double | Null] = js.native
}

object IExtensionRange {
  @scala.inline
  def apply(): IExtensionRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtensionRange]
  }
  @scala.inline
  implicit class IExtensionRangeOps[Self <: IExtensionRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(null)
        ret
    }
    @scala.inline
    def withOptions(value: IExtensionRangeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(null)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStartNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(null)
        ret
    }
  }
  
}

