package typingsSlinky.rollup.anon

import typingsSlinky.rollup.mod.AcornNode
import typingsSlinky.rollup.mod.CustomPluginOptions
import typingsSlinky.rollup.mod.SourceMapInput
import typingsSlinky.rollup.rollupStrings.`no-treeshake`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rollup.rollup.SourceDescription> */
@js.native
trait PartialSourceDescription extends StObject {
  
  var ast: js.UndefOr[AcornNode] = js.native
  
  var code: js.UndefOr[String] = js.native
  
  var map: js.UndefOr[SourceMapInput] = js.native
  
  var meta: js.UndefOr[CustomPluginOptions | Null] = js.native
  
  var moduleSideEffects: js.UndefOr[Boolean | `no-treeshake` | Null] = js.native
  
  var syntheticNamedExports: js.UndefOr[Boolean | String | Null] = js.native
}
object PartialSourceDescription {
  
  @scala.inline
  def apply(): PartialSourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSourceDescription]
  }
  
  @scala.inline
  implicit class PartialSourceDescriptionMutableBuilder[Self <: PartialSourceDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAst(value: AcornNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapInput): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapNull: Self = StObject.set(x, "map", null)
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setMeta(value: CustomPluginOptions): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaNull: Self = StObject.set(x, "meta", null)
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setModuleSideEffects(value: Boolean | `no-treeshake`): Self = StObject.set(x, "moduleSideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleSideEffectsNull: Self = StObject.set(x, "moduleSideEffects", null)
    
    @scala.inline
    def setModuleSideEffectsUndefined: Self = StObject.set(x, "moduleSideEffects", js.undefined)
    
    @scala.inline
    def setSyntheticNamedExports(value: Boolean | String): Self = StObject.set(x, "syntheticNamedExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntheticNamedExportsNull: Self = StObject.set(x, "syntheticNamedExports", null)
    
    @scala.inline
    def setSyntheticNamedExportsUndefined: Self = StObject.set(x, "syntheticNamedExports", js.undefined)
  }
}
