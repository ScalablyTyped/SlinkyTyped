package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.OutputMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var data: IMimeBundle = js.native
  var metadata: OutputMetadata = js.native
  var transient: js.UndefOr[Displayid] = js.native
}

object Metadata {
  @scala.inline
  def apply(data: IMimeBundle, metadata: OutputMetadata): Metadata = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: IMimeBundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: OutputMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransient(value: Displayid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transient")(js.undefined)
        ret
    }
  }
  
}

