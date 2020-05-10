package typingsSlinky.phaser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.phaser.MatterJS.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonUses
  extends /* _ */ StringDictionary[js.Any] {
  var uses: js.UndefOr[js.Array[Plugin | String]] = js.native
}

object AnonUses {
  @scala.inline
  def apply(): AnonUses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonUses]
  }
  @scala.inline
  implicit class AnonUsesOps[Self <: AnonUses] (val x: Self) extends AnyVal {
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

