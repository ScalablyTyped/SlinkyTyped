package typingsSlinky.frctlFractal.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.frctlFractal.anon.Format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliThemeConfig extends js.Object {
  var delimiter: js.UndefOr[Format] = js.native
  @JSName("delimiter.format")
  var delimiterDotformat: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  @JSName("delimiter.text")
  var delimiterDottext: js.UndefOr[String] = js.native
  var styles: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object CliThemeConfig {
  @scala.inline
  def apply(): CliThemeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CliThemeConfig]
  }
  @scala.inline
  implicit class CliThemeConfigOps[Self <: CliThemeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelimiter(value: Format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterDotformat(value: /* str */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter.format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDelimiterDotformat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter.format")(js.undefined)
        ret
    }
    @scala.inline
    def withDelimiterDottext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter.text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiterDottext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter.text")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
  }
  
}

