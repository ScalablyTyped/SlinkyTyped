package typingsSlinky.gulpCopy

import typingsSlinky.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    */
  @JSImport("gulp-copy", JSImport.Namespace)
  @js.native
  def apply(outDirectory: String): ThroughStream = js.native
  /**
    * Copy files to destination and expose those files as source streams for the gulp pipeline.
    *
    * @param outDirectory The name of the destination directory. If this directory
    *                     does not exist, it will be created atomatically.
    * @param options Override values for available settings.
    */
  @JSImport("gulp-copy", JSImport.Namespace)
  @js.native
  def apply(outDirectory: String, options: GulpCopyOptions): ThroughStream = js.native
  
  @js.native
  trait GulpCopyOptions extends StObject {
    
    /**
      * Specifies the number of parts of the path to be ignored as path prefixes.
      */
    var prefix: Double = js.native
  }
  object GulpCopyOptions {
    
    @scala.inline
    def apply(prefix: Double): GulpCopyOptions = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[GulpCopyOptions]
    }
    
    @scala.inline
    implicit class GulpCopyOptionsMutableBuilder[Self <: GulpCopyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: Double): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
