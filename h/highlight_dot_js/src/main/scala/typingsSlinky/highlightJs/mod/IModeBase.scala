package typingsSlinky.highlightJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IModeBase extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.native
  var begin: js.UndefOr[String | js.RegExp] = js.native
  var beginKeyword: js.UndefOr[String] = js.native
  var case_insensitive: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var end: js.UndefOr[String | js.RegExp] = js.native
  var endsWithParent: js.UndefOr[Boolean] = js.native
  var excludeBegin: js.UndefOr[Boolean] = js.native
  var excludeEnd: js.UndefOr[Boolean] = js.native
  var illegal: js.UndefOr[String] = js.native
  var lexems: js.UndefOr[String] = js.native
  var relevance: js.UndefOr[Double] = js.native
  var returnBegin: js.UndefOr[Boolean] = js.native
  var returnEnd: js.UndefOr[Boolean] = js.native
  var starts: js.UndefOr[String] = js.native
  var subLanguage: js.UndefOr[String] = js.native
  var subLanguageMode: js.UndefOr[String] = js.native
  var variants: js.UndefOr[js.Array[IMode]] = js.native
}

object IModeBase {
  @scala.inline
  def apply(): IModeBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IModeBase]
  }
  @scala.inline
  implicit class IModeBaseOps[Self <: IModeBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAliases(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAliases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aliases")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginKeyword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginKeyword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginKeyword")(js.undefined)
        ret
    }
    @scala.inline
    def withCase_insensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_insensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCase_insensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("case_insensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withEndRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndsWithParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWithParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndsWithParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endsWithParent")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeBegin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withIllegal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("illegal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIllegal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("illegal")(js.undefined)
        ret
    }
    @scala.inline
    def withLexems(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLexems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lexems")(js.undefined)
        ret
    }
    @scala.inline
    def withRelevance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelevance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relevance")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnBegin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBegin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnBegin")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnEnd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withStarts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStarts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("starts")(js.undefined)
        ret
    }
    @scala.inline
    def withSubLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withSubLanguageMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLanguageMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubLanguageMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLanguageMode")(js.undefined)
        ret
    }
    @scala.inline
    def withVariants(value: js.Array[IMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variants")(js.undefined)
        ret
    }
  }
  
}

