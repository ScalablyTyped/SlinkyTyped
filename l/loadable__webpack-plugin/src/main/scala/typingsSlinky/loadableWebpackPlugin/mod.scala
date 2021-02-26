package typingsSlinky.loadableWebpackPlugin

import typingsSlinky.loadableWebpackPlugin.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("@loadable/webpack-plugin", JSImport.Default)
  @js.native
  class default () extends StObject {
    def this(options: PluginOptions) = this()
  }
  
  type LoadablePlugin = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin */ js.Any
  
  @js.native
  trait PluginOptions extends StObject {
    
    /**
      * The stats filename.
      *
      * @default loadable-stats.json
      */
    var filename: js.UndefOr[String] = js.native
    
    /**
      * @default true
      */
    var outputAsset: js.UndefOr[Boolean] = js.native
    
    /**
      * Always write stats file to disk.
      *
      * @default false
      */
    var writeToDisk: js.UndefOr[Boolean | Filename] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      @scala.inline
      def setOutputAsset(value: Boolean): Self = StObject.set(x, "outputAsset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputAssetUndefined: Self = StObject.set(x, "outputAsset", js.undefined)
      
      @scala.inline
      def setWriteToDisk(value: Boolean | Filename): Self = StObject.set(x, "writeToDisk", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWriteToDiskUndefined: Self = StObject.set(x, "writeToDisk", js.undefined)
    }
  }
}
