package typingsSlinky.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMCharacterMarker
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The Unicode decimal value for the individual glyph of the font that defines the shape of the marker.
    */
  var characterIndex: js.UndefOr[Double] = js.native
  
  /**
    * The depth of the marker when drawn in 3D.
    */
  var depth3D: js.UndefOr[Double] = js.native
  
  /**
    * The font family name of the font. e.g. Comic Sans.
    */
  var fontFamilyName: js.UndefOr[String] = js.native
  
  /**
    * The style name for the font family. e.g. Regular, Bold, or Italic.
    */
  var fontStyleName: js.UndefOr[String] = js.native
  
  /**
    * The font type.
    */
  var fontType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
  ] = js.native
  
  /**
    * A value indicating whether the frame of the character marker should be honored when transforming the marker.
    */
  var respectFrame: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the strokes and/or fills of a marker are scaled proportionally when the symbol size is changed. When enabled, the strokes for the outline or fill of the polygon symbol used to draw the marker will be scaled proportionally with changes to the symbol size. If this property is not enabled, the stroke will draw with the specified width regardless of the marker size.
    */
  var scaleSymbolsProportionally: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the symbol without changing the height (or depth in 3D), as a ratio.
    */
  var scaleX: js.UndefOr[Double] = js.native
  
  /**
    * The polygon symbol that is used to renderer the marker.
    */
  var symbol: js.UndefOr[CIMPolygonSymbol] = js.native
  
  @JSName("type")
  var type_CIMCharacterMarker: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker = js.native
  
  /**
    * A value indicating whether the marker stands a marker upright as though locked in place. The marker can be viewed from all angles.
    */
  var verticalOrientation3D: js.UndefOr[Boolean] = js.native
}
object CIMCharacterMarker {
  
  @scala.inline
  def apply(`type`: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker): CIMCharacterMarker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCharacterMarker]
  }
  
  @scala.inline
  implicit class CIMCharacterMarkerMutableBuilder[Self <: CIMCharacterMarker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacterIndex(value: Double): Self = StObject.set(x, "characterIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterIndexUndefined: Self = StObject.set(x, "characterIndex", js.undefined)
    
    @scala.inline
    def setDepth3D(value: Double): Self = StObject.set(x, "depth3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth3DUndefined: Self = StObject.set(x, "depth3D", js.undefined)
    
    @scala.inline
    def setFontFamilyName(value: String): Self = StObject.set(x, "fontFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyNameUndefined: Self = StObject.set(x, "fontFamilyName", js.undefined)
    
    @scala.inline
    def setFontStyleName(value: String): Self = StObject.set(x, "fontStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleNameUndefined: Self = StObject.set(x, "fontStyleName", js.undefined)
    
    @scala.inline
    def setFontType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FontType * / any */ String
    ): Self = StObject.set(x, "fontType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontTypeUndefined: Self = StObject.set(x, "fontType", js.undefined)
    
    @scala.inline
    def setRespectFrame(value: Boolean): Self = StObject.set(x, "respectFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectFrameUndefined: Self = StObject.set(x, "respectFrame", js.undefined)
    
    @scala.inline
    def setScaleSymbolsProportionally(value: Boolean): Self = StObject.set(x, "scaleSymbolsProportionally", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleSymbolsProportionallyUndefined: Self = StObject.set(x, "scaleSymbolsProportionally", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMPolygonSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setType(value: typingsSlinky.arcgisJsApi.arcgisJsApiStrings.CIMCharacterMarker): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOrientation3D(value: Boolean): Self = StObject.set(x, "verticalOrientation3D", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalOrientation3DUndefined: Self = StObject.set(x, "verticalOrientation3D", js.undefined)
  }
}
