package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VueBuildOptions extends BuildOptions[vue] {
  
  var configuration: js.UndefOr[String] = js.native
  
  var cordovaAssets: js.UndefOr[Boolean] = js.native
  
  var sourcemaps: js.UndefOr[Boolean] = js.native
}
object VueBuildOptions {
  
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: vue): VueBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VueBuildOptions]
  }
  
  @scala.inline
  implicit class VueBuildOptionsMutableBuilder[Self <: VueBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setCordovaAssets(value: Boolean): Self = StObject.set(x, "cordovaAssets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCordovaAssetsUndefined: Self = StObject.set(x, "cordovaAssets", js.undefined)
    
    @scala.inline
    def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
  }
}
