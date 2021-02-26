package typingsSlinky.gulpZip

import typingsSlinky.node.processMod.global.NodeJS.ReadStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-zip", JSImport.Namespace)
  @js.native
  def apply(filename: String): ReadStream = js.native
  @JSImport("gulp-zip", JSImport.Namespace)
  @js.native
  def apply(filename: String, options: GulpZipOptions): ReadStream = js.native
  
  @js.native
  trait GulpZipOptions extends StObject {
    
    /**
      * Compress
      * @default true
      */
    var compress: js.UndefOr[Boolean] = js.native
    
    /**
      * Overrides the modification timestamp for all files added to the archive.
      *
      * Tip: Setting it to the same value across executions enables you to create stable archives
      * that change only when the contents of their entries change, regardless of whether those
      * entries were "touched" or regenerated.
      *
      * @default undefined
      */
    var modifiedTime: js.UndefOr[js.Date] = js.native
  }
  object GulpZipOptions {
    
    @scala.inline
    def apply(): GulpZipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GulpZipOptions]
    }
    
    @scala.inline
    implicit class GulpZipOptionsMutableBuilder[Self <: GulpZipOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setModifiedTime(value: js.Date): Self = StObject.set(x, "modifiedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedTimeUndefined: Self = StObject.set(x, "modifiedTime", js.undefined)
    }
  }
}
