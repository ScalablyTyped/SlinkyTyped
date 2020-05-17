package typingsSlinky.materialTabBar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ARROWLEFTKEY extends js.Object {
  var ARROW_LEFT_KEY: String = js.native
  var ARROW_RIGHT_KEY: String = js.native
  var END_KEY: String = js.native
  var ENTER_KEY: String = js.native
  var HOME_KEY: String = js.native
  var SPACE_KEY: String = js.native
  var TAB_ACTIVATED_EVENT: String = js.native
  var TAB_SCROLLER_SELECTOR: String = js.native
  var TAB_SELECTOR: String = js.native
}

object ARROWLEFTKEY {
  @scala.inline
  def apply(
    ARROW_LEFT_KEY: String,
    ARROW_RIGHT_KEY: String,
    END_KEY: String,
    ENTER_KEY: String,
    HOME_KEY: String,
    SPACE_KEY: String,
    TAB_ACTIVATED_EVENT: String,
    TAB_SCROLLER_SELECTOR: String,
    TAB_SELECTOR: String
  ): ARROWLEFTKEY = {
    val __obj = js.Dynamic.literal(ARROW_LEFT_KEY = ARROW_LEFT_KEY.asInstanceOf[js.Any], ARROW_RIGHT_KEY = ARROW_RIGHT_KEY.asInstanceOf[js.Any], END_KEY = END_KEY.asInstanceOf[js.Any], ENTER_KEY = ENTER_KEY.asInstanceOf[js.Any], HOME_KEY = HOME_KEY.asInstanceOf[js.Any], SPACE_KEY = SPACE_KEY.asInstanceOf[js.Any], TAB_ACTIVATED_EVENT = TAB_ACTIVATED_EVENT.asInstanceOf[js.Any], TAB_SCROLLER_SELECTOR = TAB_SCROLLER_SELECTOR.asInstanceOf[js.Any], TAB_SELECTOR = TAB_SELECTOR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ARROWLEFTKEY]
  }
  @scala.inline
  implicit class ARROWLEFTKEYOps[Self <: ARROWLEFTKEY] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARROW_LEFT_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARROW_RIGHT_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEND_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("END_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withENTER_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ENTER_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHOME_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOME_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSPACE_KEY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SPACE_KEY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB_ACTIVATED_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB_ACTIVATED_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB_SCROLLER_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB_SCROLLER_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTAB_SELECTOR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TAB_SELECTOR")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

