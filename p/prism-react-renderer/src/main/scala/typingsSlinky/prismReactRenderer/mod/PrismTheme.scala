package typingsSlinky.prismReactRenderer.mod

import typingsSlinky.prismReactRenderer.anon.Languages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrismTheme extends js.Object {
  var plain: PrismThemeEntry = js.native
  var styles: js.Array[Languages] = js.native
}

object PrismTheme {
  @scala.inline
  def apply(plain: PrismThemeEntry, styles: js.Array[Languages]): PrismTheme = {
    val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrismTheme]
  }
  @scala.inline
  implicit class PrismThemeOps[Self <: PrismTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlain(value: PrismThemeEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[Languages]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

