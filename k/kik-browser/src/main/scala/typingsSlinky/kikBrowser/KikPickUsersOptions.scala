package typingsSlinky.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KikPickUsersOptions extends js.Object {
  var filterSelf: js.UndefOr[Boolean] = js.native
  var filtered: js.UndefOr[js.Array[String]] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var minResults: js.UndefOr[Double] = js.native
  var preselected: js.UndefOr[js.Array[AnonUsername]] = js.native
}

object KikPickUsersOptions {
  @scala.inline
  def apply(): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KikPickUsersOptions]
  }
  @scala.inline
  implicit class KikPickUsersOptionsOps[Self <: KikPickUsersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withFiltered(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFiltered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filtered")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withMinResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minResults")(js.undefined)
        ret
    }
    @scala.inline
    def withPreselected(value: js.Array[AnonUsername]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreselected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preselected")(js.undefined)
        ret
    }
  }
  
}

