package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and
  * datasetUUID should be set. Flocker volumes do not support ownership management or SELinux
  * relabeling.
  */
@js.native
trait FlockerVolumeSource extends js.Object {
  /**
    * Name of the dataset stored as metadata -> name on the dataset for Flocker should be
    * considered as deprecated
    */
  val datasetName: String = js.native
  /**
    * UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  val datasetUUID: String = js.native
}

object FlockerVolumeSource {
  @scala.inline
  def apply(datasetName: String, datasetUUID: String): FlockerVolumeSource = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any], datasetUUID = datasetUUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlockerVolumeSource]
  }
  @scala.inline
  implicit class FlockerVolumeSourceOps[Self <: FlockerVolumeSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatasetUUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetUUID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

