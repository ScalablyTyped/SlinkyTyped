package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeSymbolsSet extends /* index */ NumberDictionary[Icon] {
  var greenCheckSymbol: Icon = js.native
  var redCrossSymbol: Icon = js.native
  var yellowExclamationSymbol: Icon = js.native
}

object ThreeSymbolsSet {
  @scala.inline
  def apply(greenCheckSymbol: Icon, redCrossSymbol: Icon, yellowExclamationSymbol: Icon): ThreeSymbolsSet = {
    val __obj = js.Dynamic.literal(greenCheckSymbol = greenCheckSymbol.asInstanceOf[js.Any], redCrossSymbol = redCrossSymbol.asInstanceOf[js.Any], yellowExclamationSymbol = yellowExclamationSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbolsSet]
  }
  @scala.inline
  implicit class ThreeSymbolsSetOps[Self <: ThreeSymbolsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenCheckSymbol(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenCheckSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedCrossSymbol(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redCrossSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowExclamationSymbol(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowExclamationSymbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

