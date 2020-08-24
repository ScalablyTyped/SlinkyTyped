package typingsSlinky.expoFont

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoFont.fontTypesMod.FontSource
import typingsSlinky.expoFont.fontTypesMod.UnloadFontOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-font", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def isLoaded(fontFamily: String): Boolean = js.native
  def isLoading(fontFamily: String): Boolean = js.native
  def loadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: String, source: FontSource): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
  def processFontFamily(): String | Null = js.native
  def processFontFamily(fontFamily: String): String | Null = js.native
  def unloadAllAsync(): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: String, options: UnloadFontOptions): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions]): js.Promise[Unit] = js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions], options: UnloadFontOptions): js.Promise[Unit] = js.native
  def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, js.Error | Null] = js.native
  @js.native
  object FontDisplay extends js.Object {
    /* "auto" */ val AUTO: typingsSlinky.expoFont.fontTypesMod.FontDisplay.AUTO with String = js.native
    /* "block" */ val BLOCK: typingsSlinky.expoFont.fontTypesMod.FontDisplay.BLOCK with String = js.native
    /* "fallback" */ val FALLBACK: typingsSlinky.expoFont.fontTypesMod.FontDisplay.FALLBACK with String = js.native
    /* "optional" */ val OPTIONAL: typingsSlinky.expoFont.fontTypesMod.FontDisplay.OPTIONAL with String = js.native
    /* "swap" */ val SWAP: typingsSlinky.expoFont.fontTypesMod.FontDisplay.SWAP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoFont.fontTypesMod.FontDisplay with String] = js.native
  }
  
}

