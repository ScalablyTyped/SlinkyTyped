package typingsSlinky.palx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PalxPalette
  extends /* name */ StringDictionary[String | js.Array[String]] {
  var base: String = js.native
  var black: String = js.native
  var blue: js.Array[String] = js.native
  var cyan: js.Array[String] = js.native
  var fuschia: js.Array[String] = js.native
  var gray: js.Array[String] = js.native
  var green: js.Array[String] = js.native
  var indigo: js.Array[String] = js.native
  var lime: js.Array[String] = js.native
  var orange: js.Array[String] = js.native
  var pink: js.Array[String] = js.native
  var red: js.Array[String] = js.native
  var teal: js.Array[String] = js.native
  var violet: js.Array[String] = js.native
  var yellow: js.Array[String] = js.native
}

object PalxPalette {
  @scala.inline
  def apply(
    base: String,
    black: String,
    blue: js.Array[String],
    cyan: js.Array[String],
    fuschia: js.Array[String],
    gray: js.Array[String],
    green: js.Array[String],
    indigo: js.Array[String],
    lime: js.Array[String],
    orange: js.Array[String],
    pink: js.Array[String],
    red: js.Array[String],
    teal: js.Array[String],
    violet: js.Array[String],
    yellow: js.Array[String]
  ): PalxPalette = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], fuschia = fuschia.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], indigo = indigo.asInstanceOf[js.Any], lime = lime.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], pink = pink.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], teal = teal.asInstanceOf[js.Any], violet = violet.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PalxPalette]
  }
  @scala.inline
  implicit class PalxPaletteOps[Self <: PalxPalette] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("black")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFuschia(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fuschia")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGray(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndigo(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indigo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLime(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrange(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPink(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTeal(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViolet(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("violet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellow(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

