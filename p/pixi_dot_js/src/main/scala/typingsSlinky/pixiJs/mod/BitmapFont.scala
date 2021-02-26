package typingsSlinky.pixiJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pixiJs.PIXI.IBitmapFontOptions
import typingsSlinky.pixiJs.anon.Chars
import typingsSlinky.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BitmapFont represents a typeface available for use with the BitmapText class. Use the `install`
  * method for adding a font to be used.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "BitmapFont")
@js.native
class BitmapFont protected ()
  extends typingsSlinky.pixiJs.PIXI.BitmapFont {
  def this(
    data: typingsSlinky.pixiJs.PIXI.BitmapFontData,
    textures: js.Array[typingsSlinky.pixiJs.PIXI.Texture]
  ) = this()
  def this(
    data: typingsSlinky.pixiJs.PIXI.BitmapFontData,
    textures: StringDictionary[typingsSlinky.pixiJs.PIXI.Texture]
  ) = this()
}
object BitmapFont {
  
  /**
    * This character set includes all the letters in the alphabet (both lower- and upper- case).
    * @readonly
    * @static
    * @member {string[][]}
    * @example
    * BitmapFont.from("ExampleFont", style, { chars: BitmapFont.ALPHA })
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.ALPHA")
  @js.native
  val ALPHA: js.Array[js.Array[String]] = js.native
  
  /**
    * This character set is the union of `BitmapFont.ALPHA` and `BitmapFont.NUMERIC`.
    * @readonly
    * @static
    * @member {string[][]}
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.ALPHANUMERIC")
  @js.native
  val ALPHANUMERIC: js.Array[js.Array[String]] = js.native
  
  /**
    * This character set consists of all the ASCII table.
    * @readonly
    * @static
    * @member {string[][]}
    * @see http://www.asciitable.com/
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.ASCII")
  @js.native
  val ASCII: js.Array[js.Array[String]] = js.native
  
  /**
    * This character set includes all decimal digits (from 0 to 9).
    * @readonly
    * @static
    * @member {string[][]}
    * @example
    * BitmapFont.from("ExampleFont", style, { chars: BitmapFont.NUMERIC })
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.NUMERIC")
  @js.native
  val NUMERIC: js.Array[js.Array[String]] = js.native
  
  /**
    * Collection of default options when using `BitmapFont.from`.
    *
    * @readonly
    * @static
    * @member {PIXI.IBitmapFontOptions}
    * @property {number} resolution=1
    * @property {number} textureWidth=512
    * @property {number} textureHeight=512
    * @property {number} padding=4
    * @property {string|string[]|string[][]} chars=PIXI.BitmapFont.ALPHANUMERIC
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.defaultOptions")
  @js.native
  val defaultOptions: IBitmapFontOptions = js.native
  
  /**
    * Generates a bitmap-font for the given style and character set. This does not support
    * kernings yet. With `style` properties, only the following non-layout properties are used:
    *
    * - {@link PIXI.TextStyle#dropShadow|dropShadow}
    * - {@link PIXI.TextStyle#dropShadowDistance|dropShadowDistance}
    * - {@link PIXI.TextStyle#dropShadowColor|dropShadowColor}
    * - {@link PIXI.TextStyle#dropShadowBlur|dropShadowBlur}
    * - {@link PIXI.TextStyle#dropShadowAngle|dropShadowAngle}
    * - {@link PIXI.TextStyle#fill|fill}
    * - {@link PIXI.TextStyle#fillGradientStops|fillGradientStops}
    * - {@link PIXI.TextStyle#fillGradientType|fillGradientType}
    * - {@link PIXI.TextStyle#fontFamily|fontFamily}
    * - {@link PIXI.TextStyle#fontSize|fontSize}
    * - {@link PIXI.TextStyle#fontVariant|fontVariant}
    * - {@link PIXI.TextStyle#fontWeight|fontWeight}
    * - {@link PIXI.TextStyle#lineJoin|lineJoin}
    * - {@link PIXI.TextStyle#miterLimit|miterLimit}
    * - {@link PIXI.TextStyle#stroke|stroke}
    * - {@link PIXI.TextStyle#strokeThickness|strokeThickness}
    * - {@link PIXI.TextStyle#textBaseline|textBaseline}
    *
    * @param {string} name - The name of the custom font to use with BitmapText.
    * @param {object|PIXI.TextStyle} [style] - Style options to render with BitmapFont.
    * @param {PIXI.IBitmapFontOptions} [options] - Setup options for font or name of the font.
    * @param {string|string[]|string[][]} [options.chars=PIXI.BitmapFont.ALPHANUMERIC] - characters included
    *      in the font set. You can also use ranges. For example, `[['a', 'z'], ['A', 'Z'], "!@#$%^&*()~{}[] "]`.
    *      Don't forget to include spaces ' ' in your character set!
    * @param {number} [options.resolution=1] - Render resolution for glyphs.
    * @param {number} [options.textureWidth=512] - Optional width of atlas, smaller values to reduce memory.
    * @param {number} [options.textureHeight=512] - Optional height of atlas, smaller values to reduce memory.
    * @param {number} [options.padding=4] - Padding between glyphs on texture atlas.
    * @return {PIXI.BitmapFont} Font generated by style options.
    * @static
    * @example
    * PIXI.BitmapFont.from("TitleFont", {
    *     fontFamily: "Arial",
    *     fontSize: 12,
    *     strokeThickness: 2,
    *     fill: "purple"
    * });
    *
    * const title = new PIXI.BitmapText("This is the title", { fontName: "TitleFont" });
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String, style: js.UndefOr[scala.Nothing], options: Chars): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String, style: js.Any): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String, style: js.Any, options: Chars): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String, style: typingsSlinky.pixiJs.PIXI.TextStyle): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.from")
  @js.native
  def from(name: String, style: typingsSlinky.pixiJs.PIXI.TextStyle, options: Chars): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: String, textures: js.Array[typingsSlinky.pixiJs.PIXI.Texture]): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: String, textures: StringDictionary[typingsSlinky.pixiJs.PIXI.Texture]): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: String, textures: typingsSlinky.pixiJs.PIXI.Texture): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(
    data: typingsSlinky.pixiJs.PIXI.BitmapFontData,
    textures: js.Array[typingsSlinky.pixiJs.PIXI.Texture]
  ): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(
    data: typingsSlinky.pixiJs.PIXI.BitmapFontData,
    textures: StringDictionary[typingsSlinky.pixiJs.PIXI.Texture]
  ): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: typingsSlinky.pixiJs.PIXI.BitmapFontData, textures: typingsSlinky.pixiJs.PIXI.Texture): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: XMLDocument, textures: js.Array[typingsSlinky.pixiJs.PIXI.Texture]): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  /**
    * Register a new bitmap font.
    *
    * @static
    * @param {XMLDocument|string|PIXI.BitmapFontData} data - The
    *        characters map that could be provided as xml or raw string.
    * @param {Object.<string, PIXI.Texture>|PIXI.Texture|PIXI.Texture[]}
    *        textures - List of textures for each page.
    * @return {PIXI.BitmapFont} Result font object with font, size, lineHeight
    *         and char fields.
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: XMLDocument, textures: StringDictionary[typingsSlinky.pixiJs.PIXI.Texture]): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  @JSImport("pixi.js", "BitmapFont.install")
  @js.native
  def install(data: XMLDocument, textures: typingsSlinky.pixiJs.PIXI.Texture): typingsSlinky.pixiJs.PIXI.BitmapFont = js.native
  
  /**
    * Remove bitmap font by name.
    *
    * @static
    * @param {string} name
    */
  /* static member */
  @JSImport("pixi.js", "BitmapFont.uninstall")
  @js.native
  def uninstall(name: String): Unit = js.native
  
  /**
    * Collection of available/installed fonts.
    *
    * @readonly
    * @static
    * @member {Object.<string, PIXI.BitmapFont>}
    */
  /* static member */
  object available
}
