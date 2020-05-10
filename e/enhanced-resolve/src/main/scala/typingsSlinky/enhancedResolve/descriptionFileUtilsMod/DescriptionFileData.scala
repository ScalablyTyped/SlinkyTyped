package typingsSlinky.enhancedResolve.descriptionFileUtilsMod

import typingsSlinky.enhancedResolve.concordMod.Concord
import typingsSlinky.enhancedResolve.concordMod.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescriptionFileData extends js.Object {
  var browser: js.UndefOr[Dictionary[String | Boolean]] = js.native
  var concord: js.UndefOr[Concord] = js.native
}

object DescriptionFileData {
  @scala.inline
  def apply(): DescriptionFileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescriptionFileData]
  }
  @scala.inline
  implicit class DescriptionFileDataOps[Self <: DescriptionFileData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrowser(value: Dictionary[String | Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("browser")(js.undefined)
        ret
    }
    @scala.inline
    def withConcord(value: Concord): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concord")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concord")(js.undefined)
        ret
    }
  }
  
}

