package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExistingDecodedSourceMap extends DecodedSourceMapOrMissing {
  
  var file: js.UndefOr[String] = js.native
  
  var mappings: js.Array[js.Array[SourceMapSegment]] = js.native
  
  var names: js.Array[String] = js.native
  
  var sourceRoot: js.UndefOr[String] = js.native
  
  var sources: js.Array[String] = js.native
  
  var sourcesContent: js.UndefOr[js.Array[String]] = js.native
  
  var version: Double = js.native
}
object ExistingDecodedSourceMap {
  
  @scala.inline
  def apply(
    mappings: js.Array[js.Array[SourceMapSegment]],
    names: js.Array[String],
    sources: js.Array[String],
    version: Double
  ): ExistingDecodedSourceMap = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingDecodedSourceMap]
  }
  
  @scala.inline
  implicit class ExistingDecodedSourceMapMutableBuilder[Self <: ExistingDecodedSourceMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setMappings(value: js.Array[js.Array[SourceMapSegment]]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: js.Array[SourceMapSegment]*): Self = StObject.set(x, "mappings", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    @scala.inline
    def setSources(value: js.Array[String]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesContent(value: js.Array[String]): Self = StObject.set(x, "sourcesContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesContentUndefined: Self = StObject.set(x, "sourcesContent", js.undefined)
    
    @scala.inline
    def setSourcesContentVarargs(value: String*): Self = StObject.set(x, "sourcesContent", js.Array(value :_*))
    
    @scala.inline
    def setSourcesVarargs(value: String*): Self = StObject.set(x, "sources", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
