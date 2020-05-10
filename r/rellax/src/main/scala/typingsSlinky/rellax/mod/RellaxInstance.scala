package typingsSlinky.rellax.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RellaxInstance extends js.Object {
  /**
    * Rellax elements
    */
  var elms: (NodeListOf[Element with Node]) | js.Array[Element] = js.native
  /**
    * Options
    */
  var options: RellaxOptions = js.native
  /**
    * End Rellax and reset parallax elements to their original positions
    */
  def destroy(): Unit = js.native
  /**
    * Destroy and create again parallax with previous settings
    */
  def refresh(): Unit = js.native
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
  @scala.inline
  implicit class RellaxInstanceOps[Self <: RellaxInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withElmsNodeListOf(value: NodeListOf[Element with Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElms(value: (NodeListOf[Element with Node]) | js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: RellaxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefresh(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refresh")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

