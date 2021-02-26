package typingsSlinky.rollup.mod

import typingsSlinky.rollup.rollupBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.anon.Mappings
  - typingsSlinky.rollup.mod.ExistingDecodedSourceMap
*/
trait DecodedSourceMapOrMissing extends StObject
object DecodedSourceMapOrMissing {
  
  @scala.inline
  def ExistingDecodedSourceMap(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): typingsSlinky.rollup.mod.ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.mod.ExistingDecodedSourceMap]
  }
  
  @scala.inline
  def Mappings(missing: `true`, plugin: String): typingsSlinky.rollup.anon.Mappings = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.rollup.anon.Mappings]
  }
}
