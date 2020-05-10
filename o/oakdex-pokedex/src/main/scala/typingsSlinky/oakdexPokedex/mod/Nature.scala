package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nature extends js.Object {
  var decreased_stat: String | Null = js.native
  var disliked_flavor: String | Null = js.native
  var favorite_flavor: String | Null = js.native
  var increased_stat: String | Null = js.native
  var names: Translations = js.native
}

object Nature {
  @scala.inline
  def apply(names: Translations): Nature = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nature]
  }
  @scala.inline
  implicit class NatureOps[Self <: Nature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNames(value: Translations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreased_stat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreased_stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecreased_statNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decreased_stat")(null)
        ret
    }
    @scala.inline
    def withDisliked_flavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disliked_flavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisliked_flavorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disliked_flavor")(null)
        ret
    }
    @scala.inline
    def withFavorite_flavor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite_flavor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFavorite_flavorNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("favorite_flavor")(null)
        ret
    }
    @scala.inline
    def withIncreased_stat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increased_stat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncreased_statNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("increased_stat")(null)
        ret
    }
  }
  
}

