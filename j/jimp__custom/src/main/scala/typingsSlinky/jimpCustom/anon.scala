package typingsSlinky.jimpCustom

import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Plugins[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] extends StObject {
    
    var plugins: js.UndefOr[PluginFuncArr] = js.native
    
    var types: js.UndefOr[TypesFuncArr] = js.native
  }
  object Plugins {
    
    @scala.inline
    def apply[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */](): Plugins[TypesFuncArr, PluginFuncArr] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Plugins[TypesFuncArr, PluginFuncArr]]
    }
    
    @scala.inline
    implicit class PluginsMutableBuilder[Self <: Plugins[_, _], TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */] (val x: Self with (Plugins[TypesFuncArr, PluginFuncArr])) extends AnyVal {
      
      @scala.inline
      def setPlugins(value: PluginFuncArr): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setTypes(value: TypesFuncArr): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    }
  }
}
