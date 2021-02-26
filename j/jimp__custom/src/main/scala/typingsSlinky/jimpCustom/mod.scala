package typingsSlinky.jimpCustom

import typingsSlinky.jimpCore.etcMod.Image
import typingsSlinky.jimpCore.jimpMod.JimpConstructors
import typingsSlinky.jimpCore.pluginsMod.JimpPlugin
import typingsSlinky.jimpCore.pluginsMod.JimpType
import typingsSlinky.jimpCore.utilsMod.FunctionRet
import typingsSlinky.jimpCore.utilsMod.GetIntersectionFromPluginsStatics
import typingsSlinky.jimpCustom.anon.Plugins
import typingsSlinky.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/custom", JSImport.Default)
  @js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr]): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  @JSImport("@jimp/custom", JSImport.Default)
  @js.native
  def default[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */](configuration: Plugins[TypesFuncArr, PluginFuncArr], jimpInstance: J): JimpInstance[TypesFuncArr, PluginFuncArr, J] = js.native
  
  type JimpInstance[TypesFuncArr /* <: js.UndefOr[FunctionRet[JimpType[Image]]] */, PluginFuncArr /* <: js.UndefOr[FunctionRet[JimpPlugin[Image]]] */, J /* <: JimpConstructors */] = J with (GetIntersectionFromPluginsStatics[Exclude[TypesFuncArr | PluginFuncArr, js.UndefOr[scala.Nothing]]]) with js.Object
}
