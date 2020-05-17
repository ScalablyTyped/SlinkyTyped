package typingsSlinky.angularCompiler.anon

import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportAs extends js.Object {
  var importAs: StaticSymbol = js.native
  var symbol: StaticSymbol = js.native
}

object ImportAs {
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): ImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAs]
  }
  @scala.inline
  implicit class ImportAsOps[Self <: ImportAs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportAs(value: StaticSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: StaticSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

