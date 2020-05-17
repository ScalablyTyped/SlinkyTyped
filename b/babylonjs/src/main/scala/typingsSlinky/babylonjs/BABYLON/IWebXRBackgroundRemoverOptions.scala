package typingsSlinky.babylonjs.BABYLON

import typingsSlinky.babylonjs.anon.Ground
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebXRBackgroundRemoverOptions extends js.Object {
  /**
    * Further background meshes to disable when entering AR
    */
  var backgroundMeshes: js.UndefOr[js.Array[AbstractMesh]] = js.native
  /**
    * flags to configure the removal of the environment helper.
    * If not set, the entire background will be removed. If set, flags should be set as well.
    */
  var environmentHelperRemovalFlags: js.UndefOr[Ground] = js.native
  /**
    * don't disable the environment helper
    */
  var ignoreEnvironmentHelper: js.UndefOr[Boolean] = js.native
}

object IWebXRBackgroundRemoverOptions {
  @scala.inline
  def apply(): IWebXRBackgroundRemoverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWebXRBackgroundRemoverOptions]
  }
  @scala.inline
  implicit class IWebXRBackgroundRemoverOptionsOps[Self <: IWebXRBackgroundRemoverOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundMeshes(value: js.Array[AbstractMesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundMeshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundMeshes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundMeshes")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentHelperRemovalFlags(value: Ground): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentHelperRemovalFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentHelperRemovalFlags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentHelperRemovalFlags")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreEnvironmentHelper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEnvironmentHelper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreEnvironmentHelper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreEnvironmentHelper")(js.undefined)
        ret
    }
  }
  
}

