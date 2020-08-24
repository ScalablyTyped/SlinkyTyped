package typingsSlinky.expoFont

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoFont.fontTypesMod.FontSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font/build/FontHooks", JSImport.Namespace)
@js.native
object fontHooksMod extends js.Object {
  def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, js.Error | Null] = js.native
}

