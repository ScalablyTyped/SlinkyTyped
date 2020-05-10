package typingsSlinky.dojo.dojox.mobile.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/bidi/common.html
  *
  *
  */
@js.native
trait common_ extends js.Object {
  /**
    *
    */
  var MARK: js.Object = js.native
  /**
    * Wraps by UCC (Unicode control characters) displayed text according to textDir.
    * There's a dir problem with some HTML elements. For some Android browsers Hebrew text is displayed right to left also
    * when dir is set to LTR.
    * Therefore the only solution is to use UCC to display the text in correct orientation.
    *
    * @param text The text to be wrapped.
    * @param textDir Text direction.
    */
  def enforceTextDirWithUcc(text: js.Any, textDir: js.Any): String = js.native
  /**
    * Removes UCC from input string.
    *
    * @param text The text to be stripped from UCC.
    */
  def removeUCCFromText(text: js.Any): js.Any = js.native
  /**
    * Sets textDir property to children.
    *
    * @param widget parent widget
    */
  def setTextDirForButtons(widget: js.Any): Unit = js.native
}

object common_ {
  @scala.inline
  def apply(
    MARK: js.Object,
    enforceTextDirWithUcc: (js.Any, js.Any) => String,
    removeUCCFromText: js.Any => js.Any,
    setTextDirForButtons: js.Any => Unit
  ): common_ = {
    val __obj = js.Dynamic.literal(MARK = MARK.asInstanceOf[js.Any], enforceTextDirWithUcc = js.Any.fromFunction2(enforceTextDirWithUcc), removeUCCFromText = js.Any.fromFunction1(removeUCCFromText), setTextDirForButtons = js.Any.fromFunction1(setTextDirForButtons))
    __obj.asInstanceOf[common_]
  }
  @scala.inline
  implicit class common_Ops[Self <: common_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMARK(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MARK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnforceTextDirWithUcc(value: (js.Any, js.Any) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceTextDirWithUcc")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveUCCFromText(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeUCCFromText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTextDirForButtons(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextDirForButtons")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

