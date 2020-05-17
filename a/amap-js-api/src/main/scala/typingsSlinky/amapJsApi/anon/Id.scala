package typingsSlinky.amapJsApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Id extends js.Object {
  var id: Double = js.native
  var name: String = js.native
  var position: js.Tuple2[Double | String, Double | String] = js.native
  var rank: js.UndefOr[Double] = js.native
  var txt: js.UndefOr[String] = js.native
  var zooms: js.Tuple2[Double, Double] = js.native
}

object Id {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    position: js.Tuple2[Double | String, Double | String],
    zooms: js.Tuple2[Double, Double]
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], zooms = zooms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  @scala.inline
  implicit class IdOps[Self <: Id] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: js.Tuple2[Double | String, Double | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZooms(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRank(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRank: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rank")(js.undefined)
        ret
    }
    @scala.inline
    def withTxt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTxt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("txt")(js.undefined)
        ret
    }
  }
  
}

