package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealmDto extends js.Object {
  var cdn: String = js.native
  var css: String = js.native
  var dd: String = js.native
  var l: String = js.native
  var lg: String = js.native
  var n: js.Array[StringDictionary[String]] = js.native
  var profileiconmax: Double = js.native
  var storage: String = js.native
  var v: String = js.native
}

object RealmDto {
  @scala.inline
  def apply(
    cdn: String,
    css: String,
    dd: String,
    l: String,
    lg: String,
    n: js.Array[StringDictionary[String]],
    profileiconmax: Double,
    storage: String,
    v: String
  ): RealmDto = {
    val __obj = js.Dynamic.literal(cdn = cdn.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], dd = dd.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], lg = lg.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], profileiconmax = profileiconmax.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmDto]
  }
  @scala.inline
  implicit class RealmDtoOps[Self <: RealmDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCss(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("css")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withN(value: js.Array[StringDictionary[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileiconmax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileiconmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withV(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("v")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

