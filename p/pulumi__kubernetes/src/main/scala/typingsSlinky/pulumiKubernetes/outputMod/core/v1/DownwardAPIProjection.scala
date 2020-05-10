package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents downward API info for projecting into a projected volume. Note that this is
  * identical to a downwardAPI volume source without the default mode.
  */
@js.native
trait DownwardAPIProjection extends js.Object {
  /**
    * Items is a list of DownwardAPIVolume file
    */
  val items: js.Array[DownwardAPIVolumeFile] = js.native
}

object DownwardAPIProjection {
  @scala.inline
  def apply(items: js.Array[DownwardAPIVolumeFile]): DownwardAPIProjection = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIProjection]
  }
  @scala.inline
  implicit class DownwardAPIProjectionOps[Self <: DownwardAPIProjection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[DownwardAPIVolumeFile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

