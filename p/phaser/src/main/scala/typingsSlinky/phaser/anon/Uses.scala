package typingsSlinky.phaser.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.MatterJS.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.native
}

object Uses {
  @scala.inline
  def apply(): Uses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Uses]
  }
  @scala.inline
  implicit class UsesOps[Self <: Uses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUses(value: js.Array[Plugin | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uses")(js.undefined)
        ret
    }
  }
  
}

