package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.`null`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/null
  */
@js.native
trait NullLayoutOptions extends LayoutOptions {
  var name: `null` = js.native
}

object NullLayoutOptions {
  @scala.inline
  def apply(name: `null`): NullLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullLayoutOptions]
  }
  @scala.inline
  implicit class NullLayoutOptionsOps[Self <: NullLayoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: `null`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

