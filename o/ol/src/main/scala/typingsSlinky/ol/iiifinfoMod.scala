package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ol.iiifMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iiifinfoMod {
  
  @JSImport("ol/format/IIIFInfo", JSImport.Default)
  @js.native
  class default protected () extends IIIFInfo {
    def this(imageInfo: String) = this()
    def this(imageInfo: ImageInformationResponse) = this()
  }
  
  @js.native
  sealed trait Versions extends StObject
  @JSImport("ol/format/IIIFInfo", "Versions")
  @js.native
  object Versions extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Versions with String] = js.native
    
    @js.native
    sealed trait VERSION1 extends Versions
    /* "version1" */ val VERSION1: typingsSlinky.ol.iiifinfoMod.Versions.VERSION1 with String = js.native
    
    @js.native
    sealed trait VERSION2 extends Versions
    /* "version2" */ val VERSION2: typingsSlinky.ol.iiifinfoMod.Versions.VERSION2 with String = js.native
    
    @js.native
    sealed trait VERSION3 extends Versions
    /* "version3" */ val VERSION3: typingsSlinky.ol.iiifinfoMod.Versions.VERSION3 with String = js.native
  }
  
  @js.native
  trait IIIFInfo extends StObject {
    
    def getComplianceLevelEntryFromProfile(version: Versions): String = js.native
    
    def getComplianceLevelFromProfile(version: Versions): String = js.native
    
    def getComplianceLevelSupportedFeatures(): SupportedFeatures = js.native
    
    def getImageApiVersion(): Versions = js.native
    
    def getTileSourceOptions(): Options = js.native
    def getTileSourceOptions(opt_preferredOptions: PreferredOptions): Options = js.native
    
    def setImageInfo(imageInfo: String): Unit = js.native
    def setImageInfo(imageInfo: ImageInformationResponse): Unit = js.native
  }
  
  @js.native
  trait IiifProfile extends StObject {
    
    var formats: js.UndefOr[js.Array[String]] = js.native
    
    var maxArea: js.UndefOr[Double] = js.native
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidth: js.UndefOr[Double] = js.native
    
    var qualities: js.UndefOr[js.Array[String]] = js.native
    
    var supports: js.UndefOr[js.Array[String]] = js.native
  }
  object IiifProfile {
    
    @scala.inline
    def apply(): IiifProfile = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IiifProfile]
    }
    
    @scala.inline
    implicit class IiifProfileMutableBuilder[Self <: IiifProfile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setMaxArea(value: Double): Self = StObject.set(x, "maxArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAreaUndefined: Self = StObject.set(x, "maxArea", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setQualities(value: js.Array[String]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
      
      @scala.inline
      def setQualitiesVarargs(value: String*): Self = StObject.set(x, "qualities", js.Array(value :_*))
      
      @scala.inline
      def setSupports(value: js.Array[String]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
      
      @scala.inline
      def setSupportsVarargs(value: String*): Self = StObject.set(x, "supports", js.Array(value :_*))
    }
  }
  
  type ImageInformationResponse = StringDictionary[
    String | Double | (js.Array[Double | String | IiifProfile]) | StringDictionary[Double] | TileInfo
  ]
  
  @js.native
  trait PreferredOptions extends StObject {
    
    var format: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[String] = js.native
  }
  object PreferredOptions {
    
    @scala.inline
    def apply(): PreferredOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreferredOptions]
    }
    
    @scala.inline
    implicit class PreferredOptionsMutableBuilder[Self <: PreferredOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setQuality(value: String): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  @js.native
  trait SupportedFeatures extends StObject {
    
    var formats: js.UndefOr[js.Array[String]] = js.native
    
    var qualities: js.UndefOr[js.Array[String]] = js.native
    
    var supports: js.UndefOr[js.Array[String]] = js.native
  }
  object SupportedFeatures {
    
    @scala.inline
    def apply(): SupportedFeatures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SupportedFeatures]
    }
    
    @scala.inline
    implicit class SupportedFeaturesMutableBuilder[Self <: SupportedFeatures] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormats(value: js.Array[String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      @scala.inline
      def setFormatsVarargs(value: String*): Self = StObject.set(x, "formats", js.Array(value :_*))
      
      @scala.inline
      def setQualities(value: js.Array[String]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualitiesUndefined: Self = StObject.set(x, "qualities", js.undefined)
      
      @scala.inline
      def setQualitiesVarargs(value: String*): Self = StObject.set(x, "qualities", js.Array(value :_*))
      
      @scala.inline
      def setSupports(value: js.Array[String]): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
      
      @scala.inline
      def setSupportsVarargs(value: String*): Self = StObject.set(x, "supports", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TileInfo extends StObject {
    
    var height: js.UndefOr[Double] = js.native
    
    var scaleFactors: js.Array[Double] = js.native
    
    var width: Double = js.native
  }
  object TileInfo {
    
    @scala.inline
    def apply(scaleFactors: js.Array[Double], width: Double): TileInfo = {
      val __obj = js.Dynamic.literal(scaleFactors = scaleFactors.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileInfo]
    }
    
    @scala.inline
    implicit class TileInfoMutableBuilder[Self <: TileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setScaleFactors(value: js.Array[Double]): Self = StObject.set(x, "scaleFactors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleFactorsVarargs(value: Double*): Self = StObject.set(x, "scaleFactors", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
