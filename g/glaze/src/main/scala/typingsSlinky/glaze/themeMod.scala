package typingsSlinky.glaze

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.glaze.anon.AnimationDelay
import typingsSlinky.glaze.anon.Bg
import typingsSlinky.glaze.anon.Border
import typingsSlinky.glaze.anon.BorderWidth
import typingsSlinky.glaze.anon.Inset
import typingsSlinky.glaze.anon.propertyinkeyofCSSPropert
import typingsSlinky.glaze.glazeNumbers.`1024`
import typingsSlinky.glaze.glazeNumbers.`1280`
import typingsSlinky.glaze.glazeNumbers.`640`
import typingsSlinky.glaze.glazeNumbers.`768`
import typingsSlinky.glaze.glazeStrings.hack
import typingsSlinky.glaze.glazeStrings.shorthands
import typingsSlinky.std.Extract
import typingsSlinky.std.NonNullable
import typingsSlinky.treat.typesMod.ThemeRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object themeMod {
  
  @JSImport("glaze/dist-types/theme", "createTheme")
  @js.native
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) with StaticTheme
  ): RuntimeTheme = js.native
  @JSImport("glaze/dist-types/theme", "createTheme")
  @js.native
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) with StaticTheme,
    localDebugName: String
  ): RuntimeTheme = js.native
  
  object defaultTokens {
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.aliases")
    @js.native
    val aliases: Bg = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.breakpoints")
    @js.native
    val breakpoints: js.Tuple4[`640`, `768`, `1024`, `1280`] = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.matchers")
    @js.native
    val matchers: AnimationDelay = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.scales")
    @js.native
    val scales: Border = js.native
    
    @JSImport("glaze/dist-types/theme", "defaultTokens.shorthands")
    @js.native
    val shorthands: Inset = js.native
  }
  
  @js.native
  trait CommonTheme extends StObject {
    
    var aliases: StringDictionary[hack | Tokens[shorthands]] = js.native
    
    var breakpoints: js.Array[Double] = js.native
    
    var shorthands: StringDictionary[js.Array[hack]] = js.native
  }
  object CommonTheme {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      shorthands: StringDictionary[js.Array[hack]]
    ): CommonTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonTheme]
    }
    
    @scala.inline
    implicit class CommonThemeMutableBuilder[Self <: CommonTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAliases(value: StringDictionary[hack | Tokens[shorthands]]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpoints(value: js.Array[Double]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBreakpointsVarargs(value: Double*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
      
      @scala.inline
      def setShorthands(value: StringDictionary[js.Array[hack]]): Self = StObject.set(x, "shorthands", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuntimeTheme extends CommonTheme {
    
    var ref: ThemeRef = js.native
  }
  object RuntimeTheme {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      ref: ThemeRef,
      shorthands: StringDictionary[js.Array[hack]]
    ): RuntimeTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuntimeTheme]
    }
    
    @scala.inline
    implicit class RuntimeThemeMutableBuilder[Self <: RuntimeTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRef(value: ThemeRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    }
  }
  
  type ScaleTokens[T /* <: hack */] = StringDictionary[
    NonNullable[
      /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties[T] */ js.Any
    ]
  ]
  
  @js.native
  trait StaticTheme extends CommonTheme {
    
    var matchers: propertyinkeyofCSSPropert = js.native
    
    var scales: BorderWidth = js.native
  }
  object StaticTheme {
    
    @scala.inline
    def apply(
      aliases: StringDictionary[hack | Tokens[shorthands]],
      breakpoints: js.Array[Double],
      matchers: propertyinkeyofCSSPropert,
      scales: BorderWidth,
      shorthands: StringDictionary[js.Array[hack]]
    ): StaticTheme = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], breakpoints = breakpoints.asInstanceOf[js.Any], matchers = matchers.asInstanceOf[js.Any], scales = scales.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any])
      __obj.asInstanceOf[StaticTheme]
    }
    
    @scala.inline
    implicit class StaticThemeMutableBuilder[Self <: StaticTheme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatchers(value: propertyinkeyofCSSPropert): Self = StObject.set(x, "matchers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScales(value: BorderWidth): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
    }
  }
  
  type Tokens[T /* <: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any */ String */] = Extract[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny * / any[T] */ js.Any, 
    String | Double
  ]
}
