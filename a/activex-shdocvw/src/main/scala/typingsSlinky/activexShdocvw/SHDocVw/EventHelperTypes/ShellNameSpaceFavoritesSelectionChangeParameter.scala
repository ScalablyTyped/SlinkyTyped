package typingsSlinky.activexShdocvw.SHDocVw.EventHelperTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShellNameSpaceFavoritesSelectionChangeParameter extends js.Object {
  val cItems: Double = js.native
  val cVisits: Double = js.native
  val fAvailableOffline: Double = js.native
  val hItem: Double = js.native
  val strDate: String = js.native
  val strName: String = js.native
  val strUrl: String = js.native
}

object ShellNameSpaceFavoritesSelectionChangeParameter {
  @scala.inline
  def apply(
    cItems: Double,
    cVisits: Double,
    fAvailableOffline: Double,
    hItem: Double,
    strDate: String,
    strName: String,
    strUrl: String
  ): ShellNameSpaceFavoritesSelectionChangeParameter = {
    val __obj = js.Dynamic.literal(cItems = cItems.asInstanceOf[js.Any], cVisits = cVisits.asInstanceOf[js.Any], fAvailableOffline = fAvailableOffline.asInstanceOf[js.Any], hItem = hItem.asInstanceOf[js.Any], strDate = strDate.asInstanceOf[js.Any], strName = strName.asInstanceOf[js.Any], strUrl = strUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShellNameSpaceFavoritesSelectionChangeParameter]
  }
  @scala.inline
  implicit class ShellNameSpaceFavoritesSelectionChangeParameterOps[Self <: ShellNameSpaceFavoritesSelectionChangeParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCVisits(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cVisits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFAvailableOffline(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fAvailableOffline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

