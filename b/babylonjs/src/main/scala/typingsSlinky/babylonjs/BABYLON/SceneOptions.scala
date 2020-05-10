package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneOptions extends js.Object {
  /**
    * Defines that each mesh of the scene should keep up-to-date a map of referencing cloned meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useClonedMeshMap: js.UndefOr[Boolean] = js.native
  /**
    * Defines that scene should keep up-to-date a map of geometry to enable fast look-up by uniqueId
    * It will improve performance when the number of geometries becomes important.
    */
  var useGeometryUniqueIdsMap: js.UndefOr[Boolean] = js.native
  /**
    * Defines that each material of the scene should keep up-to-date a map of referencing meshes for fast diposing
    * It will improve performance when the number of mesh becomes important, but might consume a bit more memory
    */
  var useMaterialMeshMap: js.UndefOr[Boolean] = js.native
  /** Defines if the creation of the scene should impact the engine (Eg. UtilityLayer's scene) */
  var virtual: js.UndefOr[Boolean] = js.native
}

object SceneOptions {
  @scala.inline
  def apply(): SceneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneOptions]
  }
  @scala.inline
  implicit class SceneOptionsOps[Self <: SceneOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUseClonedMeshMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClonedMeshMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseClonedMeshMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useClonedMeshMap")(js.undefined)
        ret
    }
    @scala.inline
    def withUseGeometryUniqueIdsMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGeometryUniqueIdsMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseGeometryUniqueIdsMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useGeometryUniqueIdsMap")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMaterialMeshMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaterialMeshMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaterialMeshMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaterialMeshMap")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtual(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtual: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtual")(js.undefined)
        ret
    }
  }
  
}

