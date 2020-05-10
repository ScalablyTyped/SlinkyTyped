package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdCustomizerSourceBuilder[AdCustomizerSource] extends AdWordsBuilder[AdCustomizerSource] {
  def addAttribute(name: String, `type`: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  def addAttributes(attributes: js.Object): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
  def withName(name: String): AdCustomizerSourceBuilder[AdCustomizerSource] = js.native
}

object AdCustomizerSourceBuilder {
  @scala.inline
  def apply[AdCustomizerSource](
    addAttribute: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource],
    addAttributes: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource],
    build: () => AdWordsOperation[AdCustomizerSource],
    withName: String => AdCustomizerSourceBuilder[AdCustomizerSource]
  ): AdCustomizerSourceBuilder[AdCustomizerSource] = {
    val __obj = js.Dynamic.literal(addAttribute = js.Any.fromFunction2(addAttribute), addAttributes = js.Any.fromFunction1(addAttributes), build = js.Any.fromFunction0(build), withName = js.Any.fromFunction1(withName))
    __obj.asInstanceOf[AdCustomizerSourceBuilder[AdCustomizerSource]]
  }
  @scala.inline
  implicit class AdCustomizerSourceBuilderOps[Self[adcustomizersource] <: AdCustomizerSourceBuilder[adcustomizersource], AdCustomizerSource] (val x: Self[AdCustomizerSource]) extends AnyVal {
    @scala.inline
    def duplicate: Self[AdCustomizerSource] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[AdCustomizerSource]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[AdCustomizerSource] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[AdCustomizerSource] with Other]
    @scala.inline
    def withAddAttribute(value: (String, String) => AdCustomizerSourceBuilder[AdCustomizerSource]): Self[AdCustomizerSource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAddAttributes(value: js.Object => AdCustomizerSourceBuilder[AdCustomizerSource]): Self[AdCustomizerSource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAttributes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWithName(value: String => AdCustomizerSourceBuilder[AdCustomizerSource]): Self[AdCustomizerSource] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withName")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

