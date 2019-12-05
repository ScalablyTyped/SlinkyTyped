package typingsSlinky.rellax.rellaxMod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RellaxInstance extends js.Object {
  /**
    * Rellax elements
    */
  var elms: (NodeListOf[Element with Node]) | js.Array[Element]
  /**
    * Options
    */
  var options: RellaxOptions
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  def destroy(): Unit
  /**
    * Destroy and create again parallax with previous settings
    */
  def refresh(): Unit
}

object RellaxInstance {
  @scala.inline
  def apply(
    destroy: () => Unit,
    elms: (NodeListOf[Element with Node]) | js.Array[Element],
    options: RellaxOptions,
    refresh: () => Unit
  ): RellaxInstance = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), elms = elms.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[RellaxInstance]
  }
}

