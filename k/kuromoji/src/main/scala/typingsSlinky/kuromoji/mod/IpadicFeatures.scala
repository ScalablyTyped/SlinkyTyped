package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpadicFeatures extends js.Object {
  var basic_form: String = js.native
  var conjugated_form: String = js.native
  var conjugated_type: String = js.native
  var pos: String = js.native
  var pos_detail_1: String = js.native
  var pos_detail_2: String = js.native
  var pos_detail_3: String = js.native
  var pronunciation: js.UndefOr[String] = js.native
  var reading: js.UndefOr[String] = js.native
  var surface_form: String = js.native
  var word_id: Double = js.native
  var word_position: Double = js.native
  var word_type: String = js.native
}

object IpadicFeatures {
  @scala.inline
  def apply(
    basic_form: String,
    conjugated_form: String,
    conjugated_type: String,
    pos: String,
    pos_detail_1: String,
    pos_detail_2: String,
    pos_detail_3: String,
    surface_form: String,
    word_id: Double,
    word_position: Double,
    word_type: String
  ): IpadicFeatures = {
    val __obj = js.Dynamic.literal(basic_form = basic_form.asInstanceOf[js.Any], conjugated_form = conjugated_form.asInstanceOf[js.Any], conjugated_type = conjugated_type.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], pos_detail_1 = pos_detail_1.asInstanceOf[js.Any], pos_detail_2 = pos_detail_2.asInstanceOf[js.Any], pos_detail_3 = pos_detail_3.asInstanceOf[js.Any], surface_form = surface_form.asInstanceOf[js.Any], word_id = word_id.asInstanceOf[js.Any], word_position = word_position.asInstanceOf[js.Any], word_type = word_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpadicFeatures]
  }
  @scala.inline
  implicit class IpadicFeaturesOps[Self <: IpadicFeatures] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic_form(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic_form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConjugated_form(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjugated_form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConjugated_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conjugated_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos_detail_1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos_detail_1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos_detail_2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos_detail_2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos_detail_3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos_detail_3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSurface_form(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surface_form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_position(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWord_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("word_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPronunciation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPronunciation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pronunciation")(js.undefined)
        ret
    }
    @scala.inline
    def withReading(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reading")(js.undefined)
        ret
    }
  }
  
}

