package typingsSlinky.jimpCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type FunctionRet[T] = js.Array[js.Function1[/* props */ js.Array[js.Any] | scala.Nothing, T]]
  type GetIntersectionFromPlugins[PluginFuncArr /* <: typingsSlinky.jimpCore.utilsMod.FunctionRet[
    typingsSlinky.jimpCore.pluginsMod.JimpPlugin[typingsSlinky.jimpCore.etcMod.Image] | typingsSlinky.jimpCore.pluginsMod.JimpType[typingsSlinky.jimpCore.etcMod.Image]
  ] */] = typingsSlinky.jimpCore.utilsMod.UnionToIntersection[typingsSlinky.jimpCore.utilsMod.GetPluginFuncArrValues[PluginFuncArr]]
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type UnionToIntersection[U] = js.Any
  type WellFormedValues[T /* <: js.Any */] = /* import warning: importer.ImportType#apply Failed type conversion: T['class'] */ js.Any
}
