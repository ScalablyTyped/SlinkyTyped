package typingsSlinky.reactTypist.mod.Typist

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTextProps extends js.Object {
  var charIdx: Double = js.native
  var character: String = js.native
  var line: String = js.native
  var lineIdx: Double = js.native
  def defDelayGenerator(mn: Double, st: Double): js.Function1[/* params */ js.Any, Double] = js.native
}

object CurrentTextProps {
  @scala.inline
  def apply(
    charIdx: Double,
    character: String,
    defDelayGenerator: (Double, Double) => js.Function1[/* params */ js.Any, Double],
    line: String,
    lineIdx: Double
  ): CurrentTextProps = {
    val __obj = js.Dynamic.literal(charIdx = charIdx.asInstanceOf[js.Any], character = character.asInstanceOf[js.Any], defDelayGenerator = js.Any.fromFunction2(defDelayGenerator), line = line.asInstanceOf[js.Any], lineIdx = lineIdx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTextProps]
  }
  @scala.inline
  implicit class CurrentTextPropsOps[Self <: CurrentTextProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charIdx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharacter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("character")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefDelayGenerator(value: (Double, Double) => js.Function1[/* params */ js.Any, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defDelayGenerator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineIdx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineIdx")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

