package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLinkDefaults extends js.Object {
  var linkDefaults: AnonLabelLayoutPath = js.native
  var links: AnonCoordinateSpace = js.native
  var nodeDefaults: Anon4 = js.native
  var nodes: AnonLabelLayout = js.native
  var viewport: AnonH = js.native
}

object AnonLinkDefaults {
  @scala.inline
  def apply(
    linkDefaults: AnonLabelLayoutPath,
    links: AnonCoordinateSpace,
    nodeDefaults: Anon4,
    nodes: AnonLabelLayout,
    viewport: AnonH
  ): AnonLinkDefaults = {
    val __obj = js.Dynamic.literal(linkDefaults = linkDefaults.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLinkDefaults]
  }
  @scala.inline
  implicit class AnonLinkDefaultsOps[Self <: AnonLinkDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkDefaults(value: AnonLabelLayoutPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: AnonCoordinateSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDefaults(value: Anon4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: AnonLabelLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewport(value: AnonH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

