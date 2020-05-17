package typingsSlinky.giraffe.Giraffe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultOptions extends js.Object {
  var alwaysRender: js.UndefOr[Boolean] = js.native
  var disposeOnDetach: js.UndefOr[Boolean] = js.native
  var documentTitle: js.UndefOr[String] = js.native
  var saveScrollPosition: js.UndefOr[Boolean] = js.native
}

object DefaultOptions {
  @scala.inline
  def apply(): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultOptions]
  }
  @scala.inline
  implicit class DefaultOptionsOps[Self <: DefaultOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDisposeOnDetach(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeOnDetach")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisposeOnDetach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disposeOnDetach")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveScrollPosition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveScrollPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveScrollPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveScrollPosition")(js.undefined)
        ret
    }
  }
  
}

