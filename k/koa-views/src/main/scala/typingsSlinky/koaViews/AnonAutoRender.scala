package typingsSlinky.koaViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoRender extends js.Object {
  /*
    * autoRender the result into ctx.body, defaults to true
    */
  var autoRender: js.UndefOr[Boolean] = js.native
  /*
    * replace consolidate as default engine source
    */
  var engineSource: js.UndefOr[js.Any] = js.native
  /*
    * default extension for your views
    */
  var extension: js.UndefOr[String] = js.native
  /*
    * map a file extension to an engine
    */
  var map: js.UndefOr[js.Any] = js.native
  /*
    * these options will get passed to the view engine
    */
  var options: js.UndefOr[js.Any] = js.native
}

object AnonAutoRender {
  @scala.inline
  def apply(): AnonAutoRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAutoRender]
  }
  @scala.inline
  implicit class AnonAutoRenderOps[Self <: AnonAutoRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRender")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineSource(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("engineSource")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

