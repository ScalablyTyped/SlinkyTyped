package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.colorMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object literalStyleMod {
  
  @js.native
  sealed trait SymbolType extends StObject
  @JSImport("ol/style/LiteralStyle", "SymbolType")
  @js.native
  object SymbolType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SymbolType with String] = js.native
    
    @js.native
    sealed trait CIRCLE extends SymbolType
    /* "circle" */ val CIRCLE: typingsSlinky.ol.literalStyleMod.SymbolType.CIRCLE with String = js.native
    
    @js.native
    sealed trait IMAGE extends SymbolType
    /* "image" */ val IMAGE: typingsSlinky.ol.literalStyleMod.SymbolType.IMAGE with String = js.native
    
    @js.native
    sealed trait SQUARE extends SymbolType
    /* "square" */ val SQUARE: typingsSlinky.ol.literalStyleMod.SymbolType.SQUARE with String = js.native
    
    @js.native
    sealed trait TRIANGLE extends SymbolType
    /* "triangle" */ val TRIANGLE: typingsSlinky.ol.literalStyleMod.SymbolType.TRIANGLE with String = js.native
  }
  
  type ExpressionValue = typingsSlinky.ol.expressionsMod.ExpressionValue
  
  @js.native
  trait LiteralStyle extends StObject {
    
    var filter: js.UndefOr[ExpressionValue] = js.native
    
    var symbol: js.UndefOr[LiteralSymbolStyle] = js.native
    
    var variables: js.UndefOr[StringDictionary[Double]] = js.native
  }
  object LiteralStyle {
    
    @scala.inline
    def apply(): LiteralStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LiteralStyle]
    }
    
    @scala.inline
    implicit class LiteralStyleMutableBuilder[Self <: LiteralStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: ExpressionValue): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFilterVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "filter", js.Array(value :_*))
      
      @scala.inline
      def setSymbol(value: LiteralSymbolStyle): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      @scala.inline
      def setVariables(value: StringDictionary[Double]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    }
  }
  
  @js.native
  trait LiteralSymbolStyle extends StObject {
    
    var color: js.UndefOr[Color | js.Array[ExpressionValue] | String] = js.native
    
    var offset: js.UndefOr[js.Array[ExpressionValue]] = js.native
    
    var opacity: js.UndefOr[ExpressionValue] = js.native
    
    var rotateWithView: js.UndefOr[Boolean] = js.native
    
    var rotation: js.UndefOr[ExpressionValue] = js.native
    
    var size: ExpressionValue | js.Array[ExpressionValue] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var symbolType: SymbolType = js.native
    
    var textureCoord: js.UndefOr[js.Array[ExpressionValue]] = js.native
  }
  object LiteralSymbolStyle {
    
    @scala.inline
    def apply(size: ExpressionValue | js.Array[ExpressionValue], symbolType: SymbolType): LiteralSymbolStyle = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], symbolType = symbolType.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiteralSymbolStyle]
    }
    
    @scala.inline
    implicit class LiteralSymbolStyleMutableBuilder[Self <: LiteralSymbolStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: Color | js.Array[ExpressionValue] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: (Double | ExpressionValue)*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setOffset(value: js.Array[ExpressionValue]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOffsetVarargs(value: ExpressionValue*): Self = StObject.set(x, "offset", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: ExpressionValue): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOpacityVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "opacity", js.Array(value :_*))
      
      @scala.inline
      def setRotateWithView(value: Boolean): Self = StObject.set(x, "rotateWithView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateWithViewUndefined: Self = StObject.set(x, "rotateWithView", js.undefined)
      
      @scala.inline
      def setRotation(value: ExpressionValue): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setRotationVarargs(value: (js.Any | Double)*): Self = StObject.set(x, "rotation", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: ExpressionValue | js.Array[ExpressionValue]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeVarargs(value: (js.Any | Double | ExpressionValue)*): Self = StObject.set(x, "size", js.Array(value :_*))
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setSymbolType(value: SymbolType): Self = StObject.set(x, "symbolType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureCoord(value: js.Array[ExpressionValue]): Self = StObject.set(x, "textureCoord", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextureCoordUndefined: Self = StObject.set(x, "textureCoord", js.undefined)
      
      @scala.inline
      def setTextureCoordVarargs(value: ExpressionValue*): Self = StObject.set(x, "textureCoord", js.Array(value :_*))
    }
  }
}
