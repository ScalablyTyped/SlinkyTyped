package typingsSlinky.dojo.dojox.charting.themes.PlotKit

import typingsSlinky.dojo.dojo.base.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/themes/PlotKit/base.html
  *
  *
  */
@js.native
trait base extends js.Object {
  /**
    *
    */
  var Adobebricks: js.Object = js.native
  /**
    *
    */
  var Algae: js.Object = js.native
  /**
    *
    */
  var Bahamation: js.Object = js.native
  /**
    *
    */
  var BlueDusk: js.Object = js.native
  /**
    *
    */
  var Charged: js.Object = js.native
  /**
    *
    */
  var Chris: js.Object = js.native
  /**
    *
    */
  var Claro: js.Object = js.native
  /**
    *
    */
  var CubanShirts: js.Object = js.native
  /**
    *
    */
  var Desert: js.Object = js.native
  /**
    *
    */
  var Distinctive: js.Object = js.native
  /**
    *
    */
  var Dollar: js.Object = js.native
  /**
    *
    */
  var Electric: js.Object = js.native
  /**
    *
    */
  var Grasshopper: js.Object = js.native
  /**
    *
    */
  var Grasslands: js.Object = js.native
  /**
    *
    */
  var GreySkies: js.Object = js.native
  /**
    *
    */
  var Harmony: js.Object = js.native
  /**
    *
    */
  var IndigoNation: js.Object = js.native
  /**
    *
    */
  var Ireland: js.Object = js.native
  /**
    *
    */
  var Julie: js.Object = js.native
  /**
    *
    */
  var MiamiNice: js.Object = js.native
  /**
    *
    */
  var Midwest: js.Object = js.native
  /**
    *
    */
  var Minty: js.Object = js.native
  /**
    *
    */
  var PrimaryColors: js.Object = js.native
  /**
    *
    */
  var PurpleRain: js.Object = js.native
  /**
    *
    */
  var Renkoo: js.Object = js.native
  /**
    *
    */
  var RoyalPurples: js.Object = js.native
  /**
    *
    */
  var SageToLime: js.Object = js.native
  /**
    *
    */
  var Shrooms: js.Object = js.native
  /**
    *
    */
  var Tom: js.Object = js.native
  /**
    *
    */
  var Tufte: js.Object = js.native
  /**
    *
    */
  var WatersEdge: js.Object = js.native
  /**
    *
    */
  var Wetland: js.Object = js.native
  /**
    *
    */
  var base: js.Object = js.native
  /**
    *
    */
  var blue: js.Object = js.native
  /**
    *
    */
  var cyan: js.Object = js.native
  /**
    *
    */
  var green: js.Object = js.native
  /**
    *
    */
  var orange: js.Object = js.native
  /**
    *
    */
  var purple: js.Object = js.native
  /**
    *
    */
  var red: js.Object = js.native
  /**
    * generates 2-color gradients using pure colors, a fill pattern, and two luminance values
    *
    * @param colors Array of colors to generate gradients for each.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    */
  def generateFills(colors: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double): Unit = js.native
  /**
    * generates gradient colors using an intensity map
    *
    * @param color Color to use to generate gradients.
    * @param intensityMap Array of tuples {o, i}, where o is a gradient offset (0-1),and i is an intensity (0-255).
    */
  def generateGradientByIntensity(color: Color, intensityMap: js.Array[_]): Unit = js.native
  /**
    * generates mini-themes with 2-color gradients using colors, a fill pattern, and three luminance values
    *
    * @param colors Array of colors to generate gradients for each.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    * @param lumStroke Stroke luminance value (0-100).
    */
  def generateMiniTheme(colors: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double, lumStroke: Double): Unit = js.native
  /**
    * transforms solid color fills into 2-color gradients using a fill pattern, and two luminance values
    *
    * @param themes Array of mini-themes (usually series themes or marker themes), which fill will be transformed.
    * @param fillPattern Gradient fill descriptor which colors list will be generated.
    * @param lumFrom Initial luminance value (0-100).
    * @param lumTo Final luminance value (0-100).
    */
  def updateFills(themes: js.Array[_], fillPattern: js.Object, lumFrom: Double, lumTo: Double): Unit = js.native
}

object base {
  @scala.inline
  def apply(
    Adobebricks: js.Object,
    Algae: js.Object,
    Bahamation: js.Object,
    BlueDusk: js.Object,
    Charged: js.Object,
    Chris: js.Object,
    Claro: js.Object,
    CubanShirts: js.Object,
    Desert: js.Object,
    Distinctive: js.Object,
    Dollar: js.Object,
    Electric: js.Object,
    Grasshopper: js.Object,
    Grasslands: js.Object,
    GreySkies: js.Object,
    Harmony: js.Object,
    IndigoNation: js.Object,
    Ireland: js.Object,
    Julie: js.Object,
    MiamiNice: js.Object,
    Midwest: js.Object,
    Minty: js.Object,
    PrimaryColors: js.Object,
    PurpleRain: js.Object,
    Renkoo: js.Object,
    RoyalPurples: js.Object,
    SageToLime: js.Object,
    Shrooms: js.Object,
    Tom: js.Object,
    Tufte: js.Object,
    WatersEdge: js.Object,
    Wetland: js.Object,
    base: js.Object,
    blue: js.Object,
    cyan: js.Object,
    generateFills: (js.Array[_], js.Object, Double, Double) => Unit,
    generateGradientByIntensity: (Color, js.Array[_]) => Unit,
    generateMiniTheme: (js.Array[_], js.Object, Double, Double, Double) => Unit,
    green: js.Object,
    orange: js.Object,
    purple: js.Object,
    red: js.Object,
    updateFills: (js.Array[_], js.Object, Double, Double) => Unit
  ): base = {
    val __obj = js.Dynamic.literal(Adobebricks = Adobebricks.asInstanceOf[js.Any], Algae = Algae.asInstanceOf[js.Any], Bahamation = Bahamation.asInstanceOf[js.Any], BlueDusk = BlueDusk.asInstanceOf[js.Any], Charged = Charged.asInstanceOf[js.Any], Chris = Chris.asInstanceOf[js.Any], Claro = Claro.asInstanceOf[js.Any], CubanShirts = CubanShirts.asInstanceOf[js.Any], Desert = Desert.asInstanceOf[js.Any], Distinctive = Distinctive.asInstanceOf[js.Any], Dollar = Dollar.asInstanceOf[js.Any], Electric = Electric.asInstanceOf[js.Any], Grasshopper = Grasshopper.asInstanceOf[js.Any], Grasslands = Grasslands.asInstanceOf[js.Any], GreySkies = GreySkies.asInstanceOf[js.Any], Harmony = Harmony.asInstanceOf[js.Any], IndigoNation = IndigoNation.asInstanceOf[js.Any], Ireland = Ireland.asInstanceOf[js.Any], Julie = Julie.asInstanceOf[js.Any], MiamiNice = MiamiNice.asInstanceOf[js.Any], Midwest = Midwest.asInstanceOf[js.Any], Minty = Minty.asInstanceOf[js.Any], PrimaryColors = PrimaryColors.asInstanceOf[js.Any], PurpleRain = PurpleRain.asInstanceOf[js.Any], Renkoo = Renkoo.asInstanceOf[js.Any], RoyalPurples = RoyalPurples.asInstanceOf[js.Any], SageToLime = SageToLime.asInstanceOf[js.Any], Shrooms = Shrooms.asInstanceOf[js.Any], Tom = Tom.asInstanceOf[js.Any], Tufte = Tufte.asInstanceOf[js.Any], WatersEdge = WatersEdge.asInstanceOf[js.Any], Wetland = Wetland.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], generateFills = js.Any.fromFunction4(generateFills), generateGradientByIntensity = js.Any.fromFunction2(generateGradientByIntensity), generateMiniTheme = js.Any.fromFunction5(generateMiniTheme), green = green.asInstanceOf[js.Any], orange = orange.asInstanceOf[js.Any], purple = purple.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], updateFills = js.Any.fromFunction4(updateFills))
    __obj.asInstanceOf[base]
  }
  @scala.inline
  implicit class baseOps[Self <: base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdobebricks(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Adobebricks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlgae(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Algae")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBahamation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Bahamation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlueDusk(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlueDusk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCharged(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Charged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChris(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Chris")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClaro(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Claro")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCubanShirts(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CubanShirts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDesert(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Desert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDistinctive(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Distinctive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDollar(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dollar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElectric(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Electric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrasshopper(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grasshopper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrasslands(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grasslands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreySkies(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GreySkies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHarmony(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Harmony")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndigoNation(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndigoNation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIreland(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ireland")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJulie(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Julie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiamiNice(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MiamiNice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMidwest(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Midwest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinty(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryColors(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrimaryColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurpleRain(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurpleRain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenkoo(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Renkoo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoyalPurples(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoyalPurples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSageToLime(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SageToLime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShrooms(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shrooms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTom(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTufte(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tufte")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatersEdge(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WatersEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWetland(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Wetland")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBase(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlue(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCyan(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cyan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateFills(value: (js.Array[_], js.Object, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateFills")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGenerateGradientByIntensity(value: (Color, js.Array[_]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateGradientByIntensity")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGenerateMiniTheme(value: (js.Array[_], js.Object, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateMiniTheme")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withGreen(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrange(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPurple(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateFills(value: (js.Array[_], js.Object, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateFills")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

