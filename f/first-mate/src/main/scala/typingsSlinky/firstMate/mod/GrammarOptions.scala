package typingsSlinky.firstMate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrammarOptions extends js.Object {
  var fileTypes: js.UndefOr[js.Array[String]] = js.native
  var firstLineMatch: js.UndefOr[Boolean] = js.native
  var foldingStopMarker: js.UndefOr[String] = js.native
  var injectionSelector: js.UndefOr[ScopeSelector] = js.native
  var injections: js.UndefOr[js.Object] = js.native
  var maxLineLength: js.UndefOr[Double] = js.native
  var maxTokensPerLine: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var patterns: js.UndefOr[js.Array[js.Object]] = js.native
  var repository: js.UndefOr[js.Object] = js.native
  var scopeName: js.UndefOr[String] = js.native
}

object GrammarOptions {
  @scala.inline
  def apply(): GrammarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrammarOptions]
  }
  @scala.inline
  implicit class GrammarOptionsOps[Self <: GrammarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLineMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLineMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLineMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withFoldingStopMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingStopMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoldingStopMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foldingStopMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withInjectionSelector(value: ScopeSelector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectionSelector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectionSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectionSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withInjections(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injections")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxTokensPerLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokensPerLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTokensPerLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTokensPerLine")(js.undefined)
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
    def withPatterns(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPatterns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(js.undefined)
        ret
    }
    @scala.inline
    def withRepository(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepository: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repository")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScopeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeName")(js.undefined)
        ret
    }
  }
  
}

