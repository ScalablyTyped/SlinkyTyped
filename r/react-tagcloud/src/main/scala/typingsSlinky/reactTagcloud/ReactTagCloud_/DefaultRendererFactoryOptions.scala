package typingsSlinky.reactTagcloud.ReactTagCloud_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRendererFactoryOptions extends js.Object {
  var colorOptions: js.UndefOr[js.Any] = js.native
  var props: js.UndefOr[js.Any] = js.native
  var tagRenderer: js.UndefOr[js.Function] = js.native
}

object DefaultRendererFactoryOptions {
  @scala.inline
  def apply(): DefaultRendererFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRendererFactoryOptions]
  }
  @scala.inline
  implicit class DefaultRendererFactoryOptionsOps[Self <: DefaultRendererFactoryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withTagRenderer(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagRenderer")(js.undefined)
        ret
    }
  }
  
}

