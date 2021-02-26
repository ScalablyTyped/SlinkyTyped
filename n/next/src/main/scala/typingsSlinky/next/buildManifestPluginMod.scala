package typingsSlinky.next

import typingsSlinky.next.anon.BuildId
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildManifestPluginMod {
  
  @JSImport("next/dist/build/webpack/plugins/build-manifest-plugin", JSImport.Default)
  @js.native
  class default protected () extends BuildManifestPlugin {
    def this(options: BuildId) = this()
  }
  
  @js.native
  trait BuildManifestPlugin extends StObject {
    
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any
    ): Unit = js.native
    
    var buildId: js.Any = js.native
    
    def createAssets(compilation: js.Any, assets: js.Any): js.Any = js.native
    
    var modern: js.Any = js.native
    
    var rewrites: js.Any = js.native
  }
  object BuildManifestPlugin {
    
    @scala.inline
    def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit,
      buildId: js.Any,
      createAssets: (js.Any, js.Any) => js.Any,
      modern: js.Any,
      rewrites: js.Any
    ): BuildManifestPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), buildId = buildId.asInstanceOf[js.Any], createAssets = js.Any.fromFunction2(createAssets), modern = modern.asInstanceOf[js.Any], rewrites = rewrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildManifestPlugin]
    }
    
    @scala.inline
    implicit class BuildManifestPluginMutableBuilder[Self <: BuildManifestPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildId(value: js.Any): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateAssets(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "createAssets", js.Any.fromFunction2(value))
      
      @scala.inline
      def setModern(value: js.Any): Self = StObject.set(x, "modern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRewrites(value: js.Any): Self = StObject.set(x, "rewrites", value.asInstanceOf[js.Any])
    }
  }
  
  type ClientBuildManifest = Record[String, js.Array[String]]
}
