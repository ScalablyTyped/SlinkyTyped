package typingsSlinky.ol

import typingsSlinky.ol.featureMod.ReadOptions
import typingsSlinky.ol.featureMod.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFeatureMod {
  
  @JSImport("ol/format/TextFeature", JSImport.Default)
  @js.native
  abstract class default () extends TextFeature
  
  @js.native
  trait TextFeature
    extends typingsSlinky.ol.featureMod.default {
    
    /* protected */ def readFeatureFromText(text: String): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    /* protected */ def readFeatureFromText(text: String, opt_options: ReadOptions): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
    
    /* protected */ def readFeaturesFromText(text: String): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    /* protected */ def readFeaturesFromText(text: String, opt_options: ReadOptions): js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]] = js.native
    
    /* protected */ def readGeometryFromText(text: String): typingsSlinky.ol.geometryMod.default = js.native
    /* protected */ def readGeometryFromText(text: String, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
    
    /* protected */ def readProjectionFromText(text: String): typingsSlinky.ol.projectionMod.default = js.native
    
    /* protected */ def writeFeatureText(feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]): String = js.native
    /* protected */ def writeFeatureText(
      feature: typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeFeaturesText(features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]]): String = js.native
    /* protected */ def writeFeaturesText(
      features: js.Array[typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default]],
      opt_options: WriteOptions
    ): String = js.native
    
    /* protected */ def writeGeometryText(geometry: typingsSlinky.ol.geometryMod.default): String = js.native
    /* protected */ def writeGeometryText(geometry: typingsSlinky.ol.geometryMod.default, opt_options: WriteOptions): String = js.native
  }
}
