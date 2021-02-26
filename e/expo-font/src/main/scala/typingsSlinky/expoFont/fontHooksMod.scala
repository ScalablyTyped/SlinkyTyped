package typingsSlinky.expoFont

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoFont.fontTypesMod.FontSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontHooksMod {
  
  @JSImport("expo-font/build/FontHooks", "useFonts")
  @js.native
  def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = js.native
  @JSImport("expo-font/build/FontHooks", "useFonts")
  @js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, js.Error | Null] = js.native
}
