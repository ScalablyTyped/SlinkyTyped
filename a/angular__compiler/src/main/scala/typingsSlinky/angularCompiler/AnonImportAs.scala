package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.staticSymbolMod.StaticSymbol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonImportAs extends js.Object {
  var importAs: StaticSymbol = js.native
  var symbol: StaticSymbol = js.native
}

object AnonImportAs {
  @scala.inline
  def apply(importAs: StaticSymbol, symbol: StaticSymbol): AnonImportAs = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImportAs]
  }
  @scala.inline
  implicit class AnonImportAsOps[Self <: AnonImportAs] (val x: Self) extends AnyVal {
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

