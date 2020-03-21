package typingsSlinky.paper.paperCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "Layer")
@js.native
/** 
  * Creates a new Layer item and places it at the end of the
  * {@link Project#layers} array. The newly created layer will be activated,
  * so all newly created items will be placed within it.
  * 
  * @param children - An array of items that will be added to the
  * newly created layer
  */
class Layer ()
  extends typingsSlinky.paper.paper.Layer {
  def this(children: js.Array[typingsSlinky.paper.paper.Item]) = this()
}

