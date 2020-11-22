package typingsSlinky.ol.esriJSONMod

import typingsSlinky.ol.featureMod.ReadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EsriJSON
  extends typingsSlinky.ol.jsonfeatureMod.default {
  
  /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: js.UndefOr[scala.Nothing], opt_idField: String): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  /* protected */ def readFeatureFromObject(`object`: js.Any, opt_options: ReadOptions, opt_idField: String): typingsSlinky.ol.olFeatureMod.default[typingsSlinky.ol.geometryMod.default] = js.native
  
  /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry): typingsSlinky.ol.geometryMod.default = js.native
  /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry, opt_options: ReadOptions): typingsSlinky.ol.geometryMod.default = js.native
}
