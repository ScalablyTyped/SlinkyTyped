package typingsSlinky.ionic.definitionsMod

import typingsSlinky.ionic.ionicStrings.react
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactBuildOptions extends BuildOptions[react] {
  
  var ci: js.UndefOr[Boolean] = js.native
  
  var inlineRuntimeChunk: js.UndefOr[Boolean] = js.native
  
  var publicUrl: js.UndefOr[String] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
}
object ReactBuildOptions {
  
  @scala.inline
  def apply(`--`: js.Array[String], engine: String, `type`: react): ReactBuildOptions = {
    val __obj = js.Dynamic.literal(engine = engine.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactBuildOptions]
  }
  
  @scala.inline
  implicit class ReactBuildOptionsMutableBuilder[Self <: ReactBuildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
    
    @scala.inline
    def setInlineRuntimeChunk(value: Boolean): Self = StObject.set(x, "inlineRuntimeChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineRuntimeChunkUndefined: Self = StObject.set(x, "inlineRuntimeChunk", js.undefined)
    
    @scala.inline
    def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
  }
}
