package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCustomizerSource extends AdWordsEntity {
  def adCustomizerItemBuilder(): AdCustomizerItemBuilder[AdCustomizerItem] = js.native
  def getAttributes(): js.Object = js.native
  def getName(): String = js.native
  def items(): AdWordsSelector[AdCustomizerItem] = js.native
}

object AdCustomizerSource {
  @scala.inline
  def apply(
    adCustomizerItemBuilder: () => AdCustomizerItemBuilder[AdCustomizerItem],
    getAttributes: () => js.Object,
    getName: () => String,
    items: () => AdWordsSelector[AdCustomizerItem]
  ): AdCustomizerSource = {
    val __obj = js.Dynamic.literal(adCustomizerItemBuilder = js.Any.fromFunction0(adCustomizerItemBuilder), getAttributes = js.Any.fromFunction0(getAttributes), getName = js.Any.fromFunction0(getName), items = js.Any.fromFunction0(items))
    __obj.asInstanceOf[AdCustomizerSource]
  }
  @scala.inline
  implicit class AdCustomizerSourceOps[Self <: AdCustomizerSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdCustomizerItemBuilder(value: () => AdCustomizerItemBuilder[AdCustomizerItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adCustomizerItemBuilder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItems(value: () => AdWordsSelector[AdCustomizerItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

