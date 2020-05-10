package typingsSlinky.acorn.mod

import typingsSlinky.acorn.acornNumbers.`2015`
import typingsSlinky.acorn.acornNumbers.`2016`
import typingsSlinky.acorn.acornNumbers.`2017`
import typingsSlinky.acorn.acornNumbers.`3`
import typingsSlinky.acorn.acornNumbers.`5`
import typingsSlinky.acorn.acornNumbers.`6`
import typingsSlinky.acorn.acornNumbers.`7`
import typingsSlinky.acorn.acornNumbers.`8`
import typingsSlinky.acorn.acornStrings.module
import typingsSlinky.acorn.acornStrings.script
import typingsSlinky.estree.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowHashBang: js.UndefOr[Boolean] = js.native
  var allowImportExportEverywhere: js.UndefOr[Boolean] = js.native
  var allowReserved: js.UndefOr[Boolean] = js.native
  var allowReturnOutsideFunction: js.UndefOr[Boolean] = js.native
  var directSourceFile: js.UndefOr[String] = js.native
  var ecmaVersion: js.UndefOr[`3` | `5` | `6` | `7` | `8` | `2015` | `2016` | `2017`] = js.native
  var locations: js.UndefOr[Boolean] = js.native
  var onComment: js.UndefOr[
    (js.Function6[
      /* isBlock */ Boolean, 
      /* text */ String, 
      /* start */ Double, 
      /* end */ Double, 
      /* startLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
      /* endLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
      Unit
    ]) | js.Array[Comment]
  ] = js.native
  var onInsertedSemicolon: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ Double, 
      /* lastTokEndLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
      Unit
    ]
  ] = js.native
  var onToken: js.UndefOr[(js.Function1[/* token */ Token, _]) | js.Array[Token]] = js.native
  var onTrailingComma: js.UndefOr[
    js.Function2[
      /* lastTokEnd */ Double, 
      /* lastTokEndLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
      Unit
    ]
  ] = js.native
  var plugins: js.UndefOr[PlainObject] = js.native
  var preserveParens: js.UndefOr[Boolean] = js.native
  var program: js.UndefOr[Program] = js.native
  var ranges: js.UndefOr[Boolean] = js.native
  var sourceFile: js.UndefOr[String] = js.native
  var sourceType: js.UndefOr[script | module] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowHashBang(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHashBang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHashBang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHashBang")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowImportExportEverywhere(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImportExportEverywhere: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImportExportEverywhere")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReserved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReserved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReserved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReserved")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowReturnOutsideFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowReturnOutsideFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowReturnOutsideFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectSourceFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directSourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directSourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaVersion(value: `3` | `5` | `6` | `7` | `8` | `2015` | `2016` | `2017`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCommentFunction6(
      value: (/* isBlock */ Boolean, /* text */ String, /* start */ Double, /* end */ Double, /* startLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], /* endLoc */ js.UndefOr[typingsSlinky.estree.mod.Position]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComment")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withOnComment(
      value: (js.Function6[
          /* isBlock */ Boolean, 
          /* text */ String, 
          /* start */ Double, 
          /* end */ Double, 
          /* startLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
          /* endLoc */ js.UndefOr[typingsSlinky.estree.mod.Position], 
          Unit
        ]) | js.Array[Comment]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComment")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInsertedSemicolon(
      value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[typingsSlinky.estree.mod.Position]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsertedSemicolon")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnInsertedSemicolon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInsertedSemicolon")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTokenFunction1(value: /* token */ Token => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToken")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnToken(value: (js.Function1[/* token */ Token, _]) | js.Array[Token]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTrailingComma(
      value: (/* lastTokEnd */ Double, /* lastTokEndLoc */ js.UndefOr[typingsSlinky.estree.mod.Position]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrailingComma")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTrailingComma: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrailingComma")(js.undefined)
        ret
    }
    @scala.inline
    def withPlugins(value: PlainObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugins")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveParens(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveParens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveParens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveParens")(js.undefined)
        ret
    }
    @scala.inline
    def withProgram(value: Program): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: script | module): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(js.undefined)
        ret
    }
  }
  
}

