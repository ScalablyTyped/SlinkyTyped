package typingsSlinky.chromaJs.mod

import typingsSlinky.chromaJs.anon.Accent
import typingsSlinky.chromaJs.anon.Call
import typingsSlinky.chromaJs.chromaJsStrings.burn
import typingsSlinky.chromaJs.chromaJsStrings.cmyk
import typingsSlinky.chromaJs.chromaJsStrings.darken
import typingsSlinky.chromaJs.chromaJsStrings.dodge
import typingsSlinky.chromaJs.chromaJsStrings.e
import typingsSlinky.chromaJs.chromaJsStrings.gl
import typingsSlinky.chromaJs.chromaJsStrings.hcl
import typingsSlinky.chromaJs.chromaJsStrings.hsi
import typingsSlinky.chromaJs.chromaJsStrings.hsl
import typingsSlinky.chromaJs.chromaJsStrings.hsv
import typingsSlinky.chromaJs.chromaJsStrings.k
import typingsSlinky.chromaJs.chromaJsStrings.l
import typingsSlinky.chromaJs.chromaJsStrings.lab
import typingsSlinky.chromaJs.chromaJsStrings.lch
import typingsSlinky.chromaJs.chromaJsStrings.lighten
import typingsSlinky.chromaJs.chromaJsStrings.multiply
import typingsSlinky.chromaJs.chromaJsStrings.overlay
import typingsSlinky.chromaJs.chromaJsStrings.q
import typingsSlinky.chromaJs.chromaJsStrings.rgb
import typingsSlinky.chromaJs.chromaJsStrings.rgba
import typingsSlinky.chromaJs.chromaJsStrings.screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromaStatic extends js.Object {
  
  /**
    * Create a color in the specified color space using a, b and c as values.
    *
    * @param colorSpace The color space to use. Defaults to "rgb".
    * @return the color object.
    */
  def apply(a: Double, b: Double, c: Double): Color = js.native
  def apply(
    a: Double,
    b: Double,
    c: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def apply(a: Double, b: Double, c: Double, d: Double): Color = js.native
  def apply(
    a: Double,
    b: Double,
    c: Double,
    d: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  /**
    * Creates a color from a string representation (as supported in CSS).
    * Creates a color from a number representation [0; 16777215]
    *
    * @param color The string to convert to a color.
    * @return the color object.
    */
  def apply(color: String): Color = js.native
  def apply(color: Double): Color = js.native
  /**
    * Create a color in the specified color space using values.
    *
    * @param values An array of values (e.g. [r, g, b, a?]).
    * @param colorSpace The color space to use. Defaults to "rgb".
    * @return the color object.
    */
  def apply(values: js.Array[Double]): Color = js.native
  def apply(values: js.Array[Double], colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl): Color = js.native
  
  /**
    * Similar to {@link mix}, but accepts more than two colors. Simple averaging of R,G,B components and the alpha
    * channel.
    */
  def average(colors: js.Array[String | Color]): Color = js.native
  def average(
    colors: js.Array[String | Color],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  
  /**
    * Returns a function that
    * [bezier-interpolates]{@link https://www.vis4.net/blog/posts/mastering-multi-hued-color-scales/} between
    * colors in Lab space. The input range of the function is [0..1].
    * You can convert it to a scale instance by calling <code>chroma.bezier(...).scale()</code>
    */
  def bezier(colors: js.Array[String]): Call = js.native
  
  @JSName("blend")
  def blend_burn(color1: String, color2: String, blendMode: burn): Color = js.native
  @JSName("blend")
  def blend_burn(color1: String, color2: Color, blendMode: burn): Color = js.native
  @JSName("blend")
  def blend_burn(color1: Color, color2: String, blendMode: burn): Color = js.native
  @JSName("blend")
  def blend_burn(color1: Color, color2: Color, blendMode: burn): Color = js.native
  @JSName("blend")
  def blend_darken(color1: String, color2: String, blendMode: darken): Color = js.native
  @JSName("blend")
  def blend_darken(color1: String, color2: Color, blendMode: darken): Color = js.native
  @JSName("blend")
  def blend_darken(color1: Color, color2: String, blendMode: darken): Color = js.native
  @JSName("blend")
  def blend_darken(color1: Color, color2: Color, blendMode: darken): Color = js.native
  @JSName("blend")
  def blend_dodge(color1: String, color2: String, blendMode: dodge): Color = js.native
  @JSName("blend")
  def blend_dodge(color1: String, color2: Color, blendMode: dodge): Color = js.native
  @JSName("blend")
  def blend_dodge(color1: Color, color2: String, blendMode: dodge): Color = js.native
  @JSName("blend")
  def blend_dodge(color1: Color, color2: Color, blendMode: dodge): Color = js.native
  @JSName("blend")
  def blend_lighten(color1: String, color2: String, blendMode: lighten): Color = js.native
  @JSName("blend")
  def blend_lighten(color1: String, color2: Color, blendMode: lighten): Color = js.native
  @JSName("blend")
  def blend_lighten(color1: Color, color2: String, blendMode: lighten): Color = js.native
  @JSName("blend")
  def blend_lighten(color1: Color, color2: Color, blendMode: lighten): Color = js.native
  /**
    * Blends two colors using RGB channel-wise blend functions.
    */
  @JSName("blend")
  def blend_multiply(color1: String, color2: String, blendMode: multiply): Color = js.native
  @JSName("blend")
  def blend_multiply(color1: String, color2: Color, blendMode: multiply): Color = js.native
  @JSName("blend")
  def blend_multiply(color1: Color, color2: String, blendMode: multiply): Color = js.native
  @JSName("blend")
  def blend_multiply(color1: Color, color2: Color, blendMode: multiply): Color = js.native
  @JSName("blend")
  def blend_overlay(color1: String, color2: String, blendMode: overlay): Color = js.native
  @JSName("blend")
  def blend_overlay(color1: String, color2: Color, blendMode: overlay): Color = js.native
  @JSName("blend")
  def blend_overlay(color1: Color, color2: String, blendMode: overlay): Color = js.native
  @JSName("blend")
  def blend_overlay(color1: Color, color2: Color, blendMode: overlay): Color = js.native
  @JSName("blend")
  def blend_screen(color1: String, color2: String, blendMode: screen): Color = js.native
  @JSName("blend")
  def blend_screen(color1: String, color2: Color, blendMode: screen): Color = js.native
  @JSName("blend")
  def blend_screen(color1: Color, color2: String, blendMode: screen): Color = js.native
  @JSName("blend")
  def blend_screen(color1: Color, color2: Color, blendMode: screen): Color = js.native
  
  /**
    * chroma.brewer is an map of ColorBrewer scales that are included in chroma.js for convenience.
    * chroma.scale uses the colors to construct.
    */
  var brewer: Accent = js.native
  
  def cmyk(c: Double, m: Double, y: Double, k: Double): Color = js.native
  
  /**
    * Computes the WCAG contrast ratio between two colors.
    * A minimum contrast of 4.5:1 is recommended {@link https://www.w3.org/TR/WCAG20-TECHS/G18.html}
    * to ensure that text is still readable against a background color.
    */
  def contrast(color1: String, color2: String): Double = js.native
  def contrast(color1: String, color2: Color): Double = js.native
  def contrast(color1: Color, color2: String): Double = js.native
  def contrast(color1: Color, color2: Color): Double = js.native
  
  def css(col: String): Color = js.native
  
  def cubehelix(): Cubehelix = js.native
  
  /**
    * Computes color difference {@link https://en.wikipedia.org/wiki/Color_difference#CMC_l:c_.281984.29} as
    * developed by the Colour Measurement Committee of the Society of Dyers and Colourists (CMC) in 1984.
    * The implementation is adapted from Bruce Lindbloom.
    * {@link https://web.archive.org/web/20160306044036/http://www.brucelindbloom.com/javascript/ColorDiff.js}
    * The parameters L (default 1) and C (default 1) are weighting factors for lightness and chromacity.
    */
  def deltaE(color1: String, color2: String): Double = js.native
  def deltaE(color1: String, color2: String, L: js.UndefOr[scala.Nothing], C: Double): Double = js.native
  def deltaE(color1: String, color2: String, L: Double): Double = js.native
  def deltaE(color1: String, color2: String, L: Double, C: Double): Double = js.native
  def deltaE(color1: String, color2: Color): Double = js.native
  def deltaE(color1: String, color2: Color, L: js.UndefOr[scala.Nothing], C: Double): Double = js.native
  def deltaE(color1: String, color2: Color, L: Double): Double = js.native
  def deltaE(color1: String, color2: Color, L: Double, C: Double): Double = js.native
  def deltaE(color1: Color, color2: String): Double = js.native
  def deltaE(color1: Color, color2: String, L: js.UndefOr[scala.Nothing], C: Double): Double = js.native
  def deltaE(color1: Color, color2: String, L: Double): Double = js.native
  def deltaE(color1: Color, color2: String, L: Double, C: Double): Double = js.native
  def deltaE(color1: Color, color2: Color): Double = js.native
  def deltaE(color1: Color, color2: Color, L: js.UndefOr[scala.Nothing], C: Double): Double = js.native
  def deltaE(color1: Color, color2: Color, L: Double): Double = js.native
  def deltaE(color1: Color, color2: Color, L: Double, C: Double): Double = js.native
  
  /**
    * Computes the eucledian distance between two colors in a given color space (default is 'lab').
    * {@link https://en.wikipedia.org/wiki/Euclidean_distance#Three_dimensions}
    */
  def distance(color1: String, color2: String): Double = js.native
  def distance(
    color1: String,
    color2: String,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Double = js.native
  def distance(color1: String, color2: Color): Double = js.native
  def distance(
    color1: String,
    color2: Color,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Double = js.native
  def distance(color1: Color, color2: String): Double = js.native
  def distance(
    color1: Color,
    color2: String,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Double = js.native
  def distance(color1: Color, color2: Color): Double = js.native
  def distance(
    color1: Color,
    color2: Color,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Double = js.native
  
  /**
    * GL is a variant of RGB(A), with the only difference that the components are normalized to the range of 0..1.
    */
  def gl(red: Double, green: Double, blue: Double): Color = js.native
  def gl(red: Double, green: Double, blue: Double, alpha: Double): Color = js.native
  
  /**
    * Create a color from a hex or string representation (as supported in CSS).
    *
    * This is an alias of chroma.css().
    *
    * @param color The string to convert to a color.
    * @return the color object.
    */
  def hex(color: String): Color = js.native
  
  def hsl(h: Double, s: Double, l: Double): Color = js.native
  
  def hsv(h: Double, s: Double, v: Double): Color = js.native
  
  /**
    * Alias for {@see mix}.
    */
  def interpolate(color1: String, color2: String): Color = js.native
  def interpolate(
    color1: String,
    color2: String,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: String, color2: String, f: Double): Color = js.native
  def interpolate(
    color1: String,
    color2: String,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: String, color2: Color): Color = js.native
  def interpolate(
    color1: String,
    color2: Color,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: String, color2: Color, f: Double): Color = js.native
  def interpolate(
    color1: String,
    color2: Color,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: Color, color2: String): Color = js.native
  def interpolate(
    color1: Color,
    color2: String,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: Color, color2: String, f: Double): Color = js.native
  def interpolate(
    color1: Color,
    color2: String,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: Color, color2: Color): Color = js.native
  def interpolate(
    color1: Color,
    color2: Color,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def interpolate(color1: Color, color2: Color, f: Double): Color = js.native
  def interpolate(
    color1: Color,
    color2: Color,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  
  def lab(lightness: Double, a: Double, b: Double): Color = js.native
  def lab(lightness: Double, a: Double, b: Double, alpha: Double): Color = js.native
  
  def lch(l: Double, c: Double, h: Double): Color = js.native
  
  /**
    * Helper function that computes class breaks based on data.
    * Mode:
    *  <li>equidistant <code>'e'</code> breaks are computed by dividing the total range of the data into n groups
    *  of equal size.
    *  <li>quantile <code>'q'</code> input domain is divided by quantile ranges.
    *  <li>logarithmic <code>'l'</code> breaks are equidistant breaks but on a logarithmic scale.
    *  <li>k-means <code>'k'</code> breaks use the 1-dimensional
    *  [k-means clustering algorithm]{@link https://en.wikipedia.org/wiki/K-means_clustering} to find (roughly) n
    *  groups of "similar" values. Note that this k-means implementation does not guarantee to find exactly n groups.
    */
  @JSName("limits")
  def limits_e(data: js.Array[Double], mode: e, c: Double): js.Array[Double] = js.native
  @JSName("limits")
  def limits_k(data: js.Array[Double], mode: k, c: Double): js.Array[Double] = js.native
  @JSName("limits")
  def limits_l(data: js.Array[Double], mode: l, c: Double): js.Array[Double] = js.native
  @JSName("limits")
  def limits_q(data: js.Array[Double], mode: q, c: Double): js.Array[Double] = js.native
  
  /**
    * Mixes two colors. The mix ratio is a value between 0 and 1.
    * The color mixing produces different results based the color space used for interpolation.
    * @example chroma.mix('red', 'blue', 0.25) // => #bf0040
    * @example chroma.mix('red', 'blue', 0.5, 'hsl') // => #ff00ff
    */
  def mix(color1: String, color2: String): Color = js.native
  def mix(
    color1: String,
    color2: String,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: String, color2: String, f: Double): Color = js.native
  def mix(
    color1: String,
    color2: String,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: String, color2: Color): Color = js.native
  def mix(
    color1: String,
    color2: Color,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: String, color2: Color, f: Double): Color = js.native
  def mix(
    color1: String,
    color2: Color,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: Color, color2: String): Color = js.native
  def mix(
    color1: Color,
    color2: String,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: Color, color2: String, f: Double): Color = js.native
  def mix(
    color1: Color,
    color2: String,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: Color, color2: Color): Color = js.native
  def mix(
    color1: Color,
    color2: Color,
    f: js.UndefOr[scala.Nothing],
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  def mix(color1: Color, color2: Color, f: Double): Color = js.native
  def mix(
    color1: Color,
    color2: Color,
    f: Double,
    colorSpace: rgb | rgba | hsl | hsv | hsi | lab | lch | hcl | cmyk | gl
  ): Color = js.native
  
  /**
    * Returns a random color.
    */
  def random(): Color = js.native
  
  def rgb(r: Double, g: Double, b: Double): Color = js.native
  
  def scale(): Scale[Color] = js.native
  def scale(colors: js.Array[String | Color]): Scale[Color] = js.native
  def scale(name: String): Scale[Color] = js.native
  def scale(name: Color): Scale[Color] = js.native
  
  /**
    * Returns a color from the color temperature scale.
    * light 2000K, bright sunlight 6000K.
    * Based on Neil Bartlett's implementation.
    * https://github.com/neilbartlett/color-temperature
    */
  def temperature(t: Double): Color = js.native
  
  def valid(color: js.Any): Boolean = js.native
  def valid(color: js.Any, mode: String): Boolean = js.native
}
