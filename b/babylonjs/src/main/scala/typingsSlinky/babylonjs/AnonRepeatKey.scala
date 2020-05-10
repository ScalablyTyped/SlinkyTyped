package typingsSlinky.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRepeatKey extends js.Object {
  var repeatKey: js.UndefOr[String] = js.native
  var replaceStrings: js.UndefOr[js.Array[AnonReplace]] = js.native
}

object AnonRepeatKey {
  @scala.inline
  def apply(): AnonRepeatKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonRepeatKey]
  }
  @scala.inline
  implicit class AnonRepeatKeyOps[Self <: AnonRepeatKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRepeatKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepeatKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatKey")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceStrings(value: js.Array[AnonReplace]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceStrings")(js.undefined)
        ret
    }
  }
  
}

