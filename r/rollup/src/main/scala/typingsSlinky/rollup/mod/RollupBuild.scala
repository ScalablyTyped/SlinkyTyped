package typingsSlinky.rollup.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollupBuild extends StObject {
  
  var cache: js.UndefOr[RollupCache] = js.native
  
  def generate(outputOptions: OutputOptions): js.Promise[RollupOutput] = js.native
  
  var getTimings: js.UndefOr[js.Function0[SerializedTimings]] = js.native
  
  var watchFiles: js.Array[String] = js.native
  
  def write(options: OutputOptions): js.Promise[RollupOutput] = js.native
}
object RollupBuild {
  
  @scala.inline
  def apply(
    generate: OutputOptions => js.Promise[RollupOutput],
    watchFiles: js.Array[String],
    write: OutputOptions => js.Promise[RollupOutput]
  ): RollupBuild = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate), watchFiles = watchFiles.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[RollupBuild]
  }
  
  @scala.inline
  implicit class RollupBuildMutableBuilder[Self <: RollupBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCache(value: RollupCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setGenerate(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTimings(value: () => SerializedTimings): Self = StObject.set(x, "getTimings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimingsUndefined: Self = StObject.set(x, "getTimings", js.undefined)
    
    @scala.inline
    def setWatchFiles(value: js.Array[String]): Self = StObject.set(x, "watchFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWatchFilesVarargs(value: String*): Self = StObject.set(x, "watchFiles", js.Array(value :_*))
    
    @scala.inline
    def setWrite(value: OutputOptions => js.Promise[RollupOutput]): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
