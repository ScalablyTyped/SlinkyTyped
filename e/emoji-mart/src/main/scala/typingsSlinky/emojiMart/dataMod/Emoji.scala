package typingsSlinky.emojiMart.dataMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Emoji extends js.Object {
  var a: js.UndefOr[String] = js.native
  var added_in: js.UndefOr[Double] = js.native
  var b: js.UndefOr[String] = js.native
  var c: js.UndefOr[String] = js.native
  var d: js.UndefOr[Boolean] = js.native
  var e: js.UndefOr[Boolean] = js.native
  var emoticons: js.UndefOr[js.Array[String]] = js.native
  var f: js.UndefOr[Boolean] = js.native
  var g: js.UndefOr[Boolean] = js.native
  var h: js.UndefOr[Boolean] = js.native
  var has_img_apple: js.UndefOr[Boolean] = js.native
  var has_img_emojione: js.UndefOr[Boolean] = js.native
  var has_img_facebook: js.UndefOr[Boolean] = js.native
  var has_img_google: js.UndefOr[Boolean] = js.native
  var has_img_messenger: js.UndefOr[Boolean] = js.native
  var has_img_twitter: js.UndefOr[Boolean] = js.native
  var i: js.UndefOr[Boolean] = js.native
  var j: js.UndefOr[js.Array[String]] = js.native
  var k: js.UndefOr[js.Array[Double]] = js.native
  var keywords: js.UndefOr[js.Array[String]] = js.native
  var l: js.UndefOr[js.Array[String]] = js.native
  var m: js.UndefOr[String] = js.native
  var n: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var non_qualified: js.UndefOr[String] = js.native
  var o: js.UndefOr[Double] = js.native
  var obsoleted_by: js.UndefOr[String] = js.native
  var obsoletes: js.UndefOr[String] = js.native
  var sheet: js.UndefOr[js.Array[Double]] = js.native
  var sheet_x: js.UndefOr[Double] = js.native
  var sheet_y: js.UndefOr[Double] = js.native
  var short_names: js.UndefOr[js.Array[String]] = js.native
  var skin_variations: js.UndefOr[StringDictionary[SkinVariation]] = js.native
  var text: js.UndefOr[String] = js.native
  var unified: js.UndefOr[String] = js.native
}

object Emoji {
  @scala.inline
  def apply(): Emoji = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Emoji]
  }
  @scala.inline
  implicit class EmojiOps[Self <: Emoji] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withA(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(js.undefined)
        ret
    }
    @scala.inline
    def withAdded_in(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdded_in: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added_in")(js.undefined)
        ret
    }
    @scala.inline
    def withB(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withC(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("c")(js.undefined)
        ret
    }
    @scala.inline
    def withD(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withE(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("e")(js.undefined)
        ret
    }
    @scala.inline
    def withEmoticons(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmoticons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emoticons")(js.undefined)
        ret
    }
    @scala.inline
    def withF(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f")(js.undefined)
        ret
    }
    @scala.inline
    def withG(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutG: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_apple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_apple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_apple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_apple")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_emojione(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_emojione")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_emojione: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_emojione")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_facebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_facebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_facebook")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_google(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_google: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_google")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_messenger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_messenger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_messenger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_messenger")(js.undefined)
        ret
    }
    @scala.inline
    def withHas_img_twitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_twitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHas_img_twitter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_twitter")(js.undefined)
        ret
    }
    @scala.inline
    def withI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i")(js.undefined)
        ret
    }
    @scala.inline
    def withJ(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJ: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("j")(js.undefined)
        ret
    }
    @scala.inline
    def withK(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k")(js.undefined)
        ret
    }
    @scala.inline
    def withKeywords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeywords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keywords")(js.undefined)
        ret
    }
    @scala.inline
    def withL(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withN(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("n")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNon_qualified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_qualified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNon_qualified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_qualified")(js.undefined)
        ret
    }
    @scala.inline
    def withO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutO: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("o")(js.undefined)
        ret
    }
    @scala.inline
    def withObsoleted_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoleted_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObsoleted_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoleted_by")(js.undefined)
        ret
    }
    @scala.inline
    def withObsoletes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObsoletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoletes")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet_x: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_x")(js.undefined)
        ret
    }
    @scala.inline
    def withSheet_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSheet_y: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_y")(js.undefined)
        ret
    }
    @scala.inline
    def withShort_names(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShort_names: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short_names")(js.undefined)
        ret
    }
    @scala.inline
    def withSkin_variations(value: StringDictionary[SkinVariation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin_variations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkin_variations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skin_variations")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withUnified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unified")(js.undefined)
        ret
    }
  }
  
}

