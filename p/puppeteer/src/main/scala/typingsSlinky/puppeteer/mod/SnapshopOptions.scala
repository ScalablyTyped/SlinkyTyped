package typingsSlinky.puppeteer.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshopOptions extends js.Object {
  /**
    * Prune uninteresting nodes from the tree.
    * @default true
    */
  var interestingOnly: js.UndefOr[Boolean] = js.native
  /**
    * The root DOM element for the snapshot.
    * @default document.body
    */
  var root: js.UndefOr[ElementHandle[Element]] = js.native
}

object SnapshopOptions {
  @scala.inline
  def apply(): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshopOptions]
  }
  @scala.inline
  implicit class SnapshopOptionsOps[Self <: SnapshopOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterestingOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interestingOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterestingOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interestingOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: ElementHandle[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

