package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a projected volume source
  */
@js.native
trait ProjectedVolumeSource extends js.Object {
  /**
    * Mode bits to use on created files by default. Must be a value between 0 and 0777.
    * Directories within the path are not affected by this setting. This might be in conflict
    * with other options that affect the file mode, like fsGroup, and the result can be other
    * mode bits set.
    */
  val defaultMode: Double = js.native
  /**
    * list of volume projections
    */
  val sources: js.Array[VolumeProjection] = js.native
}

object ProjectedVolumeSource {
  @scala.inline
  def apply(defaultMode: Double, sources: js.Array[VolumeProjection]): ProjectedVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectedVolumeSource]
  }
  @scala.inline
  implicit class ProjectedVolumeSourceOps[Self <: ProjectedVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[VolumeProjection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

