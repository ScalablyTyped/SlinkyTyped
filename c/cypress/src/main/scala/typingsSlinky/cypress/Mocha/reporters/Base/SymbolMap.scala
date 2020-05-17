package typingsSlinky.cypress.Mocha.reporters.Base

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default symbol map
  *
  * @see https://mochajs.org/api/module-base#.symbols
  */
@js.native
trait SymbolMap extends /* key */ StringDictionary[String] {
  var bang: String = js.native
  var comma: String = js.native
  var dot: String = js.native
  var err: String = js.native
  var ok: String = js.native
}

object SymbolMap {
  @scala.inline
  def apply(bang: String, comma: String, dot: String, err: String, ok: String): SymbolMap = {
    val __obj = js.Dynamic.literal(bang = bang.asInstanceOf[js.Any], comma = comma.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolMap]
  }
  @scala.inline
  implicit class SymbolMapOps[Self <: SymbolMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComma(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comma")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

