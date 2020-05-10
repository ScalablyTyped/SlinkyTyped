package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashText extends js.Object {
  var accName: String = js.native
  var antiAliasSharpness: Double = js.native
  var antiAliasThickness: Double = js.native
  var autoExpand: Boolean = js.native
  var border: Boolean = js.native
  var description: String = js.native
  var embeddedCharacters: String = js.native
  def getTextAttr(): js.Any = js.native
  def getTextString(): js.Any = js.native
  def setTextAttr(): js.Any = js.native
  def setTextString(): js.Any = js.native
}

object FlashText {
  @scala.inline
  def apply(
    accName: String,
    antiAliasSharpness: Double,
    antiAliasThickness: Double,
    autoExpand: Boolean,
    border: Boolean,
    description: String,
    embeddedCharacters: String,
    getTextAttr: () => js.Any,
    getTextString: () => js.Any,
    setTextAttr: () => js.Any,
    setTextString: () => js.Any
  ): FlashText = {
    val __obj = js.Dynamic.literal(accName = accName.asInstanceOf[js.Any], antiAliasSharpness = antiAliasSharpness.asInstanceOf[js.Any], antiAliasThickness = antiAliasThickness.asInstanceOf[js.Any], autoExpand = autoExpand.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], embeddedCharacters = embeddedCharacters.asInstanceOf[js.Any], getTextAttr = js.Any.fromFunction0(getTextAttr), getTextString = js.Any.fromFunction0(getTextString), setTextAttr = js.Any.fromFunction0(setTextAttr), setTextString = js.Any.fromFunction0(setTextString))
    __obj.asInstanceOf[FlashText]
  }
  @scala.inline
  implicit class FlashTextOps[Self <: FlashText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAntiAliasSharpness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antiAliasSharpness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAntiAliasThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("antiAliasThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoExpand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmbeddedCharacters(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetTextAttr(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextAttr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTextAttr(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextAttr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetTextString(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTextString")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

