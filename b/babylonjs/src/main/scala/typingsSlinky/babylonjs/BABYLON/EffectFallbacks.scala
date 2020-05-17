package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectFallbacks extends IEffectFallbacks {
  var _currentRank: js.Any = js.native
  var _defines: js.Any = js.native
  var _maxRank: js.Any = js.native
  var _mesh: js.Any = js.native
  /**
    * Sets the mesh to use CPU skinning when needing to fallback.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param mesh The mesh to use the fallbacks.
    */
  def addCPUSkinningFallback(rank: Double, mesh: AbstractMesh): Unit = js.native
  /**
    * Adds a fallback on the specified property.
    * @param rank The rank of the fallback (Lower ranks will be fallbacked to first)
    * @param define The name of the define in the shader
    */
  def addFallback(rank: Double, define: String): Unit = js.native
  /**
    * Checks to see if more fallbacks are still availible.
    */
  @JSName("hasMoreFallbacks")
  def hasMoreFallbacks_MEffectFallbacks: Boolean = js.native
}

object EffectFallbacks {
  @scala.inline
  def apply(
    _currentRank: js.Any,
    _defines: js.Any,
    _maxRank: js.Any,
    _mesh: js.Any,
    addCPUSkinningFallback: (Double, AbstractMesh) => Unit,
    addFallback: (Double, String) => Unit,
    hasMoreFallbacks: () => Boolean,
    reduce: (String, Effect) => String,
    unBindMesh: () => Unit
  ): EffectFallbacks = {
    val __obj = js.Dynamic.literal(_currentRank = _currentRank.asInstanceOf[js.Any], _defines = _defines.asInstanceOf[js.Any], _maxRank = _maxRank.asInstanceOf[js.Any], _mesh = _mesh.asInstanceOf[js.Any], addCPUSkinningFallback = js.Any.fromFunction2(addCPUSkinningFallback), addFallback = js.Any.fromFunction2(addFallback), hasMoreFallbacks = js.Any.fromFunction0(hasMoreFallbacks), reduce = js.Any.fromFunction2(reduce), unBindMesh = js.Any.fromFunction0(unBindMesh))
    __obj.asInstanceOf[EffectFallbacks]
  }
  @scala.inline
  implicit class EffectFallbacksOps[Self <: EffectFallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_currentRank(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_currentRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_defines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_defines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_maxRank(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_maxRank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_mesh(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddCPUSkinningFallback(value: (Double, AbstractMesh) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCPUSkinningFallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddFallback(value: (Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFallback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHasMoreFallbacks(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasMoreFallbacks")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

