package typingsSlinky.ol

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Node
import typingsSlinky.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wfsMod {
  
  @JSImport("ol/format/WFS", JSImport.Default)
  @js.native
  class default () extends WFS {
    def this(opt_options: Options) = this()
  }
  
  @JSImport("ol/format/WFS", "writeFilter")
  @js.native
  def writeFilter(filter: typingsSlinky.ol.filterFilterMod.default): Node = js.native
  
  @js.native
  trait FeatureCollectionMetadata extends StObject {
    
    var bounds: Extent = js.native
    
    var numberOfFeatures: Double = js.native
  }
  object FeatureCollectionMetadata {
    
    @scala.inline
    def apply(bounds: Extent, numberOfFeatures: Double): FeatureCollectionMetadata = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], numberOfFeatures = numberOfFeatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureCollectionMetadata]
    }
    
    @scala.inline
    implicit class FeatureCollectionMetadataMutableBuilder[Self <: FeatureCollectionMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: Extent): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberOfFeatures(value: Double): Self = StObject.set(x, "numberOfFeatures", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var featureNS: js.UndefOr[StringDictionary[String] | String] = js.native
    
    var featureType: js.UndefOr[js.Array[String] | String] = js.native
    
    var gmlFormat: js.UndefOr[typingsSlinky.ol.gmlbaseMod.default] = js.native
    
    var schemaLocation: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureNS(value: StringDictionary[String] | String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureNSUndefined: Self = StObject.set(x, "featureNS", js.undefined)
      
      @scala.inline
      def setFeatureType(value: js.Array[String] | String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTypeUndefined: Self = StObject.set(x, "featureType", js.undefined)
      
      @scala.inline
      def setFeatureTypeVarargs(value: String*): Self = StObject.set(x, "featureType", js.Array(value :_*))
      
      @scala.inline
      def setGmlFormat(value: typingsSlinky.ol.gmlbaseMod.default): Self = StObject.set(x, "gmlFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGmlFormatUndefined: Self = StObject.set(x, "gmlFormat", js.undefined)
      
      @scala.inline
      def setSchemaLocation(value: String): Self = StObject.set(x, "schemaLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaLocationUndefined: Self = StObject.set(x, "schemaLocation", js.undefined)
    }
  }
  
  @js.native
  trait TransactionResponse extends StObject {
    
    var insertIds: js.Array[String] = js.native
    
    var totalDeleted: Double = js.native
    
    var totalInserted: Double = js.native
    
    var totalUpdated: Double = js.native
  }
  object TransactionResponse {
    
    @scala.inline
    def apply(insertIds: js.Array[String], totalDeleted: Double, totalInserted: Double, totalUpdated: Double): TransactionResponse = {
      val __obj = js.Dynamic.literal(insertIds = insertIds.asInstanceOf[js.Any], totalDeleted = totalDeleted.asInstanceOf[js.Any], totalInserted = totalInserted.asInstanceOf[js.Any], totalUpdated = totalUpdated.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionResponse]
    }
    
    @scala.inline
    implicit class TransactionResponseMutableBuilder[Self <: TransactionResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertIds(value: js.Array[String]): Self = StObject.set(x, "insertIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertIdsVarargs(value: String*): Self = StObject.set(x, "insertIds", js.Array(value :_*))
      
      @scala.inline
      def setTotalDeleted(value: Double): Self = StObject.set(x, "totalDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalInserted(value: Double): Self = StObject.set(x, "totalInserted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUpdated(value: Double): Self = StObject.set(x, "totalUpdated", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WFS
    extends typingsSlinky.ol.xmlfeatureMod.default {
    
    def getFeatureType(): js.UndefOr[js.Array[String] | String] = js.native
    
    def readFeatureCollectionMetadata(source: String): js.UndefOr[FeatureCollectionMetadata] = js.native
    def readFeatureCollectionMetadata(source: js.Object): js.UndefOr[FeatureCollectionMetadata] = js.native
    /**
      * Read feature collection metadata of the source.
      */
    def readFeatureCollectionMetadata(source: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
    def readFeatureCollectionMetadata(source: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readFeatureCollectionMetadataFromDocument(doc: Document): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readFeatureCollectionMetadataFromNode(node: Element): js.UndefOr[FeatureCollectionMetadata] = js.native
    
    def readTransactionResponse(source: String): js.UndefOr[TransactionResponse] = js.native
    def readTransactionResponse(source: js.Object): js.UndefOr[TransactionResponse] = js.native
    /**
      * Read transaction response of the source.
      */
    def readTransactionResponse(source: Document): js.UndefOr[TransactionResponse] = js.native
    def readTransactionResponse(source: Element): js.UndefOr[TransactionResponse] = js.native
    
    def readTransactionResponseFromDocument(doc: Document): js.UndefOr[TransactionResponse] = js.native
    
    def readTransactionResponseFromNode(node: Element): js.UndefOr[TransactionResponse] = js.native
    
    def setFeatureType(): Unit = js.native
    def setFeatureType(featureType: String): Unit = js.native
    def setFeatureType(featureType: js.Array[String]): Unit = js.native
    
    /**
      * Encode format as WFS GetFeature and return the Node.
      */
    def writeGetFeature(options: WriteGetFeatureOptions): Node = js.native
    
    /**
      * Encode format as WFS Transaction and return the Node.
      */
    def writeTransaction(
      inserts: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      updates: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      deletes: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      options: WriteTransactionOptions
    ): Node = js.native
  }
  
  @js.native
  trait WriteGetFeatureOptions extends StObject {
    
    var bbox: js.UndefOr[Extent] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var featureNS: String = js.native
    
    var featurePrefix: String = js.native
    
    var featureTypes: js.Array[String] = js.native
    
    var filter: js.UndefOr[typingsSlinky.ol.filterFilterMod.default] = js.native
    
    var geometryName: js.UndefOr[String] = js.native
    
    var handle: js.UndefOr[String] = js.native
    
    var maxFeatures: js.UndefOr[Double] = js.native
    
    var outputFormat: js.UndefOr[String] = js.native
    
    var propertyNames: js.UndefOr[js.Array[String]] = js.native
    
    var resultType: js.UndefOr[String] = js.native
    
    var srsName: js.UndefOr[String] = js.native
    
    var startIndex: js.UndefOr[Double] = js.native
    
    var viewParams: js.UndefOr[String] = js.native
  }
  object WriteGetFeatureOptions {
    
    @scala.inline
    def apply(featureNS: String, featurePrefix: String, featureTypes: js.Array[String]): WriteGetFeatureOptions = {
      val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteGetFeatureOptions]
    }
    
    @scala.inline
    implicit class WriteGetFeatureOptionsMutableBuilder[Self <: WriteGetFeatureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: Extent): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTypes(value: js.Array[String]): Self = StObject.set(x, "featureTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureTypesVarargs(value: String*): Self = StObject.set(x, "featureTypes", js.Array(value :_*))
      
      @scala.inline
      def setFilter(value: typingsSlinky.ol.filterFilterMod.default): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setMaxFeatures(value: Double): Self = StObject.set(x, "maxFeatures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFeaturesUndefined: Self = StObject.set(x, "maxFeatures", js.undefined)
      
      @scala.inline
      def setOutputFormat(value: String): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
      
      @scala.inline
      def setPropertyNames(value: js.Array[String]): Self = StObject.set(x, "propertyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNamesUndefined: Self = StObject.set(x, "propertyNames", js.undefined)
      
      @scala.inline
      def setPropertyNamesVarargs(value: String*): Self = StObject.set(x, "propertyNames", js.Array(value :_*))
      
      @scala.inline
      def setResultType(value: String): Self = StObject.set(x, "resultType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultTypeUndefined: Self = StObject.set(x, "resultType", js.undefined)
      
      @scala.inline
      def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
      
      @scala.inline
      def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
      
      @scala.inline
      def setViewParams(value: String): Self = StObject.set(x, "viewParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewParamsUndefined: Self = StObject.set(x, "viewParams", js.undefined)
    }
  }
  
  @js.native
  trait WriteTransactionOptions extends StObject {
    
    var featureNS: String = js.native
    
    var featurePrefix: String = js.native
    
    var featureType: String = js.native
    
    var gmlOptions: js.UndefOr[typingsSlinky.ol.gmlbaseMod.Options] = js.native
    
    var handle: js.UndefOr[String] = js.native
    
    var hasZ: js.UndefOr[Boolean] = js.native
    
    var nativeElements: js.Array[js.Object] = js.native
    
    var srsName: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object WriteTransactionOptions {
    
    @scala.inline
    def apply(featureNS: String, featurePrefix: String, featureType: String, nativeElements: js.Array[js.Object]): WriteTransactionOptions = {
      val __obj = js.Dynamic.literal(featureNS = featureNS.asInstanceOf[js.Any], featurePrefix = featurePrefix.asInstanceOf[js.Any], featureType = featureType.asInstanceOf[js.Any], nativeElements = nativeElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[WriteTransactionOptions]
    }
    
    @scala.inline
    implicit class WriteTransactionOptionsMutableBuilder[Self <: WriteTransactionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatureNS(value: String): Self = StObject.set(x, "featureNS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturePrefix(value: String): Self = StObject.set(x, "featurePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureType(value: String): Self = StObject.set(x, "featureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGmlOptions(value: typingsSlinky.ol.gmlbaseMod.Options): Self = StObject.set(x, "gmlOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGmlOptionsUndefined: Self = StObject.set(x, "gmlOptions", js.undefined)
      
      @scala.inline
      def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      @scala.inline
      def setNativeElements(value: js.Array[js.Object]): Self = StObject.set(x, "nativeElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeElementsVarargs(value: js.Object*): Self = StObject.set(x, "nativeElements", js.Array(value :_*))
      
      @scala.inline
      def setSrsName(value: String): Self = StObject.set(x, "srsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrsNameUndefined: Self = StObject.set(x, "srsName", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
