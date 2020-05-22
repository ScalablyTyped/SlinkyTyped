package typingsSlinky.babylonjs.highlightLayerMod.babylonjsAbstractSceneAugmentingMod

import typingsSlinky.babylonjs.highlightLayerMod.HighlightLayer
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractScene extends js.Object {
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  def getHighlightLayerByName(name: String): Nullable[HighlightLayer]
}

object AbstractScene {
  @scala.inline
  def apply(getHighlightLayerByName: String => Nullable[HighlightLayer]): AbstractScene = {
    val __obj = js.Dynamic.literal(getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName))
    __obj.asInstanceOf[AbstractScene]
  }
}

