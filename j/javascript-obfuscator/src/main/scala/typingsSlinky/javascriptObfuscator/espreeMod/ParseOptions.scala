package typingsSlinky.javascriptObfuscator.espreeMod

import typingsSlinky.javascriptObfuscator.anon.GlobalReturn
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`10`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`2015`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`2016`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`2017`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`2018`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`2019`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`3`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`5`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`6`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`7`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`8`
import typingsSlinky.javascriptObfuscator.javascriptObfuscatorNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseOptions extends js.Object {
  var comment: js.UndefOr[Boolean] = js.native
  var ecmaFeatures: js.UndefOr[GlobalReturn] = js.native
  var ecmaVersion: js.UndefOr[
    `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019`
  ] = js.native
  var loc: js.UndefOr[Boolean] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var sourceType: js.UndefOr[SourceType] = js.native
}

object ParseOptions {
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaFeatures(value: GlobalReturn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEcmaFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecmaFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withEcmaVersion(value: `3` | `5` | `6` | `7` | `8` | `9` | `10` | `2015` | `2016` | `2017` | `2018` | `2019`): Self = {
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
    def withLoc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loc")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: SourceType): Self = {
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

