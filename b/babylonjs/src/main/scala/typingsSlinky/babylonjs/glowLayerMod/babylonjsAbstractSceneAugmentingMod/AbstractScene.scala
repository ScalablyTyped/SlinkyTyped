package typingsSlinky.babylonjs.glowLayerMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.glowLayerMod.GlowLayer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractScene extends js.Object {
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getGlowLayerByName(name: String): Nullable[GlowLayer] = js.native
}

object AbstractScene {
  @scala.inline
  def apply(getGlowLayerByName: String => Nullable[GlowLayer]): AbstractScene = {
    val __obj = js.Dynamic.literal(getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName))
    __obj.asInstanceOf[AbstractScene]
  }
  @scala.inline
  implicit class AbstractSceneOps[Self <: AbstractScene] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGlowLayerByName(value: String => Nullable[GlowLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGlowLayerByName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

