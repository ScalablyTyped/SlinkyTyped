package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generics
@js.native
trait AdWordsEntity extends js.Object {
  var getEntityType: js.UndefOr[js.Function0[String]] = js.native
}

object AdWordsEntity {
  @scala.inline
  def apply(): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdWordsEntity]
  }
  @scala.inline
  implicit class AdWordsEntityOps[Self <: AdWordsEntity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEntityType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEntityType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEntityType")(js.undefined)
        ret
    }
  }
  
}

