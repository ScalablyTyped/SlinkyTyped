package typingsSlinky.geopattern

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geopattern", "generate")
  @js.native
  def generate(): Pattern = js.native
  @JSImport("geopattern", "generate")
  @js.native
  def generate(string: js.UndefOr[scala.Nothing], options: PatternOptions): Pattern = js.native
  @JSImport("geopattern", "generate")
  @js.native
  def generate(string: String): Pattern = js.native
  @JSImport("geopattern", "generate")
  @js.native
  def generate(string: String, options: PatternOptions): Pattern = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.geopattern.geopatternStrings.chevrons
    - typingsSlinky.geopattern.geopatternStrings.octagons
    - typingsSlinky.geopattern.geopatternStrings.overlappingCircles
    - typingsSlinky.geopattern.geopatternStrings.plusSigns
    - typingsSlinky.geopattern.geopatternStrings.xes
    - typingsSlinky.geopattern.geopatternStrings.sineWaves
    - typingsSlinky.geopattern.geopatternStrings.hexagons
    - typingsSlinky.geopattern.geopatternStrings.overlappingRings
    - typingsSlinky.geopattern.geopatternStrings.plaid
    - typingsSlinky.geopattern.geopatternStrings.triangles
    - typingsSlinky.geopattern.geopatternStrings.squares
    - typingsSlinky.geopattern.geopatternStrings.nestedSquares
    - typingsSlinky.geopattern.geopatternStrings.mosaicSquares
    - typingsSlinky.geopattern.geopatternStrings.concentricCircles
    - typingsSlinky.geopattern.geopatternStrings.diamonds
    - typingsSlinky.geopattern.geopatternStrings.tessellation
  */
  trait GeneratorType extends StObject
  object GeneratorType {
    
    @scala.inline
    def chevrons: typingsSlinky.geopattern.geopatternStrings.chevrons = "chevrons".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.chevrons]
    
    @scala.inline
    def concentricCircles: typingsSlinky.geopattern.geopatternStrings.concentricCircles = "concentricCircles".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.concentricCircles]
    
    @scala.inline
    def diamonds: typingsSlinky.geopattern.geopatternStrings.diamonds = "diamonds".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.diamonds]
    
    @scala.inline
    def hexagons: typingsSlinky.geopattern.geopatternStrings.hexagons = "hexagons".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.hexagons]
    
    @scala.inline
    def mosaicSquares: typingsSlinky.geopattern.geopatternStrings.mosaicSquares = "mosaicSquares".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.mosaicSquares]
    
    @scala.inline
    def nestedSquares: typingsSlinky.geopattern.geopatternStrings.nestedSquares = "nestedSquares".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.nestedSquares]
    
    @scala.inline
    def octagons: typingsSlinky.geopattern.geopatternStrings.octagons = "octagons".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.octagons]
    
    @scala.inline
    def overlappingCircles: typingsSlinky.geopattern.geopatternStrings.overlappingCircles = "overlappingCircles".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.overlappingCircles]
    
    @scala.inline
    def overlappingRings: typingsSlinky.geopattern.geopatternStrings.overlappingRings = "overlappingRings".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.overlappingRings]
    
    @scala.inline
    def plaid: typingsSlinky.geopattern.geopatternStrings.plaid = "plaid".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.plaid]
    
    @scala.inline
    def plusSigns: typingsSlinky.geopattern.geopatternStrings.plusSigns = "plusSigns".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.plusSigns]
    
    @scala.inline
    def sineWaves: typingsSlinky.geopattern.geopatternStrings.sineWaves = "sineWaves".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.sineWaves]
    
    @scala.inline
    def squares: typingsSlinky.geopattern.geopatternStrings.squares = "squares".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.squares]
    
    @scala.inline
    def tessellation: typingsSlinky.geopattern.geopatternStrings.tessellation = "tessellation".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.tessellation]
    
    @scala.inline
    def triangles: typingsSlinky.geopattern.geopatternStrings.triangles = "triangles".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.triangles]
    
    @scala.inline
    def xes: typingsSlinky.geopattern.geopatternStrings.xes = "xes".asInstanceOf[typingsSlinky.geopattern.geopatternStrings.xes]
  }
  
  @js.native
  trait Pattern extends StObject {
    
    /** Gets the pattern's background color as a hexadecimal string. */
    var color: String = js.native
    
    /** Gets the SVG as a Base64-encoded string. */
    def toBase64(): String = js.native
    
    /**
      * Gets the pattern as a data URI,
      * i.e. data:image/svg+xml;base64,PHN2ZyB...
      */
    def toDataUri(): String = js.native
    
    /**
      * Gets the pattern as a data URL suitable for use as a CSS
      * background-image, i.e. url("data:image/svg+xml;base64,PHN2ZyB...").
      */
    def toDataUrl(): String = js.native
    
    /** Gets the SVG string representing the pattern. */
    def toSvg(): String = js.native
  }
  object Pattern {
    
    @scala.inline
    def apply(
      color: String,
      toBase64: () => String,
      toDataUri: () => String,
      toDataUrl: () => String,
      toSvg: () => String
    ): Pattern = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], toBase64 = js.Any.fromFunction0(toBase64), toDataUri = js.Any.fromFunction0(toDataUri), toDataUrl = js.Any.fromFunction0(toDataUrl), toSvg = js.Any.fromFunction0(toSvg))
      __obj.asInstanceOf[Pattern]
    }
    
    @scala.inline
    implicit class PatternMutableBuilder[Self <: Pattern] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToBase64(value: () => String): Self = StObject.set(x, "toBase64", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToDataUri(value: () => String): Self = StObject.set(x, "toDataUri", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToDataUrl(value: () => String): Self = StObject.set(x, "toDataUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToSvg(value: () => String): Self = StObject.set(x, "toSvg", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait PatternOptions extends StObject {
    
    /**
      * Controls the relative background color of the generated image. The color
      * is not identical to that used in the pattern because the hue is rotated
      * by the generator. This is a CSS hexadecimal color value, which defaults
      * to #933c3c.
      */
    var baseColor: js.UndefOr[String] = js.native
    
    /**
      * Specify an exact background color. This is a CSS hexadecimal color
      * value.
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Determines the pattern. All of the original patterns from the Ruby
      * version at jasonlong/geo_pattern are available in this port, and their
      * names are camelCased.
      */
    var generator: js.UndefOr[GeneratorType] = js.native
  }
  object PatternOptions {
    
    @scala.inline
    def apply(): PatternOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternOptions]
    }
    
    @scala.inline
    implicit class PatternOptionsMutableBuilder[Self <: PatternOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseColor(value: String): Self = StObject.set(x, "baseColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseColorUndefined: Self = StObject.set(x, "baseColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setGenerator(value: GeneratorType): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    }
  }
  
  object global {
    
    @js.native
    trait JQuery extends StObject {
      
      def geopattern(string: String): JQuery = js.native
      def geopattern(string: String, options: PatternOptions): JQuery = js.native
    }
  }
}
