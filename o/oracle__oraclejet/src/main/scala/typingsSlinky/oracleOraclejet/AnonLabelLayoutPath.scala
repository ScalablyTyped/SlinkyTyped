package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContext
import typingsSlinky.oracleOraclejet.ojdiagramMod.DvtDiagramLayoutContextLink
import typingsSlinky.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLabelLayoutPath extends js.Object {
  def labelLayout(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): LabelLayout = js.native
  def path(context: DvtDiagramLayoutContext, link: DvtDiagramLayoutContextLink): String = js.native
}

object AnonLabelLayoutPath {
  @scala.inline
  def apply(
    labelLayout: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => LabelLayout,
    path: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String
  ): AnonLabelLayoutPath = {
    val __obj = js.Dynamic.literal(labelLayout = js.Any.fromFunction2(labelLayout), path = js.Any.fromFunction2(path))
    __obj.asInstanceOf[AnonLabelLayoutPath]
  }
  @scala.inline
  implicit class AnonLabelLayoutPathOps[Self <: AnonLabelLayoutPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelLayout(value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => LabelLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLayout")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPath(value: (DvtDiagramLayoutContext, DvtDiagramLayoutContextLink) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

