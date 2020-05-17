package typingsSlinky.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeatKey extends js.Object {
  var repeatKey: js.UndefOr[String] = js.native
  var replaceStrings: js.UndefOr[js.Array[Replace]] = js.native
}

object RepeatKey {
  @scala.inline
  def apply(): RepeatKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatKey]
  }
  @scala.inline
  implicit class RepeatKeyOps[Self <: RepeatKey] (val x: Self) extends AnyVal {
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
    def withReplaceStrings(value: js.Array[Replace]): Self = {
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

