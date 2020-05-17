package typingsSlinky.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var labelMapping: js.UndefOr[StringDictionary[String]] = js.native
  var sortIndex: js.UndefOr[Double] = js.native
}

object Ascending {
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelMapping(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelMapping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelMapping")(js.undefined)
        ret
    }
    @scala.inline
    def withSortIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortIndex")(js.undefined)
        ret
    }
  }
  
}

