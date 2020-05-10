package typingsSlinky.cytoscape.mod

import typingsSlinky.cytoscape.cytoscapeStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.cytoscape.mod.ExportOptions because Already inherited
- typingsSlinky.cytoscape.mod.ExportBlobOptions because var conflicts: bg, full, maxHeight, maxWidth, scale. Inlined output */ @js.native
trait ExportJpgBlobOptions extends ExportJpgOptions {
  /**
    * output Whether the output should be 'base64uri' (default), 'base64', or 'blob'.
    */
  var output: js.UndefOr[blob] = js.native
}

object ExportJpgBlobOptions {
  @scala.inline
  def apply(): ExportJpgBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJpgBlobOptions]
  }
  @scala.inline
  implicit class ExportJpgBlobOptionsOps[Self <: ExportJpgBlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: blob): Self = {
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

