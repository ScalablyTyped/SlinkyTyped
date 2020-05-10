package typingsSlinky.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentToc
  extends ContentBase
     with _Content {
  var toc: TableOfContent = js.native
}

object ContentToc {
  @scala.inline
  def apply(toc: TableOfContent): ContentToc = {
    val __obj = js.Dynamic.literal(toc = toc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentToc]
  }
  @scala.inline
  implicit class ContentTocOps[Self <: ContentToc] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToc(value: TableOfContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toc")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

