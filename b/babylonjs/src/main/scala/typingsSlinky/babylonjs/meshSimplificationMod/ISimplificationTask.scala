package typingsSlinky.babylonjs.meshSimplificationMod

import typingsSlinky.babylonjs.meshMod.Mesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISimplificationTask extends js.Object {
  /**
    * Mesh to simplify
    */
  var mesh: Mesh = js.native
  /**
    * Defines if parallel processing can be used
    */
  var parallelProcessing: Boolean = js.native
  /**
    * Array of settings
    */
  var settings: js.Array[ISimplificationSettings] = js.native
  /**
    * Simplification type
    */
  var simplificationType: SimplificationType = js.native
  /**
    * Callback called on success
    */
  var successCallback: js.UndefOr[js.Function0[Unit]] = js.native
}

object ISimplificationTask {
  @scala.inline
  def apply(
    mesh: Mesh,
    parallelProcessing: Boolean,
    settings: js.Array[ISimplificationSettings],
    simplificationType: SimplificationType
  ): ISimplificationTask = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any], parallelProcessing = parallelProcessing.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], simplificationType = simplificationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimplificationTask]
  }
  @scala.inline
  implicit class ISimplificationTaskOps[Self <: ISimplificationTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMesh(value: Mesh): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParallelProcessing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parallelProcessing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[ISimplificationSettings]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSimplificationType(value: SimplificationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simplificationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSuccessCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successCallback")(js.undefined)
        ret
    }
  }
  
}

