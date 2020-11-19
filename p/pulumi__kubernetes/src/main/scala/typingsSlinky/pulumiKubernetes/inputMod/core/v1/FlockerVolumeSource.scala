package typingsSlinky.pulumiKubernetes.inputMod.core.v1

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Flocker volume mounted by the Flocker agent. One and only one of datasetName and datasetUUID should be set. Flocker volumes do not support ownership management or SELinux relabeling.
  */
@js.native
trait FlockerVolumeSource extends js.Object {
  
  /**
    * Name of the dataset stored as metadata -> name on the dataset for Flocker should be considered as deprecated
    */
  var datasetName: js.UndefOr[Input[String]] = js.native
  
  /**
    * UUID of the dataset. This is unique identifier of a Flocker dataset
    */
  var datasetUUID: js.UndefOr[Input[String]] = js.native
}
object FlockerVolumeSource {
  
  @scala.inline
  def apply(): FlockerVolumeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlockerVolumeSource]
  }
  
  @scala.inline
  implicit class FlockerVolumeSourceOps[Self <: FlockerVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDatasetName(value: Input[String]): Self = this.set("datasetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetName: Self = this.set("datasetName", js.undefined)
    
    @scala.inline
    def setDatasetUUID(value: Input[String]): Self = this.set("datasetUUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatasetUUID: Self = this.set("datasetUUID", js.undefined)
  }
}
