package typingsSlinky.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.angularCompiler.i18nAstMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonI18nNodesByMsgId extends js.Object {
  var i18nNodesByMsgId: StringDictionary[js.Array[Node]] = js.native
  var locale: String | Null = js.native
}

object AnonI18nNodesByMsgId {
  @scala.inline
  def apply(i18nNodesByMsgId: StringDictionary[js.Array[Node]]): AnonI18nNodesByMsgId = {
    val __obj = js.Dynamic.literal(i18nNodesByMsgId = i18nNodesByMsgId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonI18nNodesByMsgId]
  }
  @scala.inline
  implicit class AnonI18nNodesByMsgIdOps[Self <: AnonI18nNodesByMsgId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withI18nNodesByMsgId(value: StringDictionary[js.Array[Node]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18nNodesByMsgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(null)
        ret
    }
  }
  
}

