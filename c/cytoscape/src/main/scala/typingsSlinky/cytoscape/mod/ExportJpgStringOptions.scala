package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.base64
import typingsSlinky.cytoscape.cytoscapeStrings.base64uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.ExportOptions because Already inherited
- typingsSlinky.cytoscape.mod.ExportStringOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ @js.native
trait ExportJpgStringOptions extends ExportJpgOptions {
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[base64uri | base64] = js.native
}

object ExportJpgStringOptions {
  @scala.inline
  def apply(): ExportJpgStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgStringOptions]
  }
  @scala.inline
  implicit class ExportJpgStringOptionsOps[Self <: ExportJpgStringOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: base64uri | base64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(js.undefined)
        ret
    }
  }
  
}

