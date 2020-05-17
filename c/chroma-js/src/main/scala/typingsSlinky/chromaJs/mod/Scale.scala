package typingsSlinky.chromaJs.mod

import typingsSlinky.chromaJs.chromaJsStrings.alpha
import typingsSlinky.chromaJs.chromaJsStrings.brighten
import typingsSlinky.chromaJs.chromaJsStrings.cmyk
import typingsSlinky.chromaJs.chromaJsStrings.darken
import typingsSlinky.chromaJs.chromaJsStrings.desaturate
import typingsSlinky.chromaJs.chromaJsStrings.gl
import typingsSlinky.chromaJs.chromaJsStrings.hcl
import typingsSlinky.chromaJs.chromaJsStrings.hex
import typingsSlinky.chromaJs.chromaJsStrings.hsi
import typingsSlinky.chromaJs.chromaJsStrings.hsl
import typingsSlinky.chromaJs.chromaJsStrings.hsv
import typingsSlinky.chromaJs.chromaJsStrings.lab
import typingsSlinky.chromaJs.chromaJsStrings.lch
import typingsSlinky.chromaJs.chromaJsStrings.luminance
import typingsSlinky.chromaJs.chromaJsStrings.name
import typingsSlinky.chromaJs.chromaJsStrings.rgb
import typingsSlinky.chromaJs.chromaJsStrings.rgba
import typingsSlinky.chromaJs.chromaJsStrings.saturate
import typingsSlinky.chromaJs.chromaJsStrings.temperature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scale[OutType] extends js.Object {
  def apply(c: js.Array[String]): Scale[Color] = js.native
  def apply(value: Double): OutType = js.native
  def cache(use: Boolean): Boolean = js.native
  def classes(c: js.Array[Double]): this.type = js.native
  /**
    * If you want the scale function to return a distinct set of colors instead of a continuous gradient, you can
    * use scale.classes. If you pass a number the scale will broken into equi-distant classes.
    * You can also define custom class breaks by passing them as array
    */
  def classes(c: Double): this.type = js.native
  /**
    * You can call scale.colors(n) to quickly grab `c` equi-distant colors from a color scale. If called with no
    * arguments, scale.colors returns the original array of colors used to create the scale.
    */
  def colors(): js.Array[Color] = js.native
  def colors(c: Double): js.Array[Color] = js.native
  @JSName("colors")
  def colors_alpha(c: Double, format: alpha): js.Array[Color] = js.native
  @JSName("colors")
  def colors_brighten(c: Double, format: brighten): js.Array[Color] = js.native
  @JSName("colors")
  def colors_cmyk(c: js.UndefOr[Double], format: cmyk): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_darken(c: Double, format: darken): js.Array[Color] = js.native
  @JSName("colors")
  def colors_desaturate(c: Double, format: desaturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_gl(c: js.UndefOr[Double], format: gl): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hcl(c: js.UndefOr[Double], format: hcl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hex(c: Double, format: hex): js.Array[String] = js.native
  @JSName("colors")
  def colors_hsi(c: js.UndefOr[Double], format: hsi): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsl(c: js.UndefOr[Double], format: hsl): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_hsv(c: js.UndefOr[Double], format: hsv): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lab(c: js.UndefOr[Double], format: lab): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_lch(c: js.UndefOr[Double], format: lch): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_luminance(c: js.UndefOr[Double], format: luminance): js.Array[Double] = js.native
  @JSName("colors")
  def colors_name(c: Double, format: name): js.Array[String] = js.native
  @JSName("colors")
  def colors_rgb(c: js.UndefOr[Double], format: rgb): js.Array[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_rgba(c: js.UndefOr[Double], format: rgba): js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("colors")
  def colors_saturate(c: Double, format: saturate): js.Array[Color] = js.native
  @JSName("colors")
  def colors_temperature(c: js.UndefOr[Double], format: temperature): js.Array[Double] = js.native
  def correctLightness(): this.type = js.native
  def correctLightness(enable: Boolean): this.type = js.native
  def domain(): this.type = js.native
  def domain(d: js.Array[Double]): this.type = js.native
  def domain(d: js.Array[Double], n: Double): this.type = js.native
  def domain(d: js.Array[Double], n: Double, mode: String): this.type = js.native
  def gamma(g: Double): this.type = js.native
  def mode(mode: InterpolationMode): this.type = js.native
  /**
    * Set out format for scale() call. Passing null will result in a scale which outputs colors.
    */
  def out(): Scale[Color] = js.native
  @JSName("out")
  def out_cmyk(format: cmyk): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("out")
  def out_gl(format: gl): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
  @JSName("out")
  def out_hcl(format: hcl): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_hex(format: hex): Scale[String] = js.native
  @JSName("out")
  def out_hsi(format: hsi): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_hsl(format: hsl): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_hsv(format: hsv): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_lab(format: lab): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_lch(format: lch): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_rgb(format: rgb): Scale[js.Tuple3[Double, Double, Double]] = js.native
  @JSName("out")
  def out_rgba(format: rgba): Scale[js.Tuple4[Double, Double, Double, Double]] = js.native
  def padding(p: js.Array[Double]): this.type = js.native
  def padding(p: Double): this.type = js.native
}

