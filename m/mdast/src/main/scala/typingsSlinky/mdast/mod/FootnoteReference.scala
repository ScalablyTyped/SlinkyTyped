package typingsSlinky.mdast.mod

import typingsSlinky.mdast.mdastStrings.footnoteReference
import typingsSlinky.unist.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FootnoteReference
  extends StaticPhrasingContent
     with Node
     with Association {
  @JSName("type")
  var type_FootnoteReference: footnoteReference = js.native
}

object FootnoteReference {
  @scala.inline
  def apply(identifier: String, `type`: footnoteReference): FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteReference]
  }
  @scala.inline
  implicit class FootnoteReferenceOps[Self <: FootnoteReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: footnoteReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

