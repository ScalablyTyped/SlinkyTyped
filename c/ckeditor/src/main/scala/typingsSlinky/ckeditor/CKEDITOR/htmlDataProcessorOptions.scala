package typingsSlinky.ckeditor.CKEDITOR

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait htmlDataProcessorOptions extends js.Object {
  var context: js.UndefOr[String] = js.native
  var dontFilter: js.UndefOr[Boolean] = js.native
  var enterMode: js.UndefOr[Double] = js.native
  var filter: js.UndefOr[typingsSlinky.ckeditor.CKEDITOR.filter] = js.native
  var fixForBody: js.UndefOr[Boolean] = js.native
  var protectedWhitespaces: js.UndefOr[Boolean] = js.native
}

object htmlDataProcessorOptions {
  @scala.inline
  def apply(): htmlDataProcessorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[htmlDataProcessorOptions]
  }
  @scala.inline
  implicit class htmlDataProcessorOptionsOps[Self <: htmlDataProcessorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDontFilter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDontFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dontFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterMode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnterMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterMode")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: filter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withFixForBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixForBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixForBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixForBody")(js.undefined)
        ret
    }
    @scala.inline
    def withProtectedWhitespaces(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedWhitespaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedWhitespaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedWhitespaces")(js.undefined)
        ret
    }
  }
  
}

