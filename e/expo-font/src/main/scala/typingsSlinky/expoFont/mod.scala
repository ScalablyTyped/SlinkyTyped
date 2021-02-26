package typingsSlinky.expoFont

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoFont.fontTypesMod.FontSource
import typingsSlinky.expoFont.fontTypesMod.UnloadFontOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-font", "FontDisplay")
  @js.native
  object FontDisplay extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoFont.fontTypesMod.FontDisplay with String] = js.native
    
    /* "auto" */ val AUTO: typingsSlinky.expoFont.fontTypesMod.FontDisplay.AUTO with String = js.native
    
    /* "block" */ val BLOCK: typingsSlinky.expoFont.fontTypesMod.FontDisplay.BLOCK with String = js.native
    
    /* "fallback" */ val FALLBACK: typingsSlinky.expoFont.fontTypesMod.FontDisplay.FALLBACK with String = js.native
    
    /* "optional" */ val OPTIONAL: typingsSlinky.expoFont.fontTypesMod.FontDisplay.OPTIONAL with String = js.native
    
    /* "swap" */ val SWAP: typingsSlinky.expoFont.fontTypesMod.FontDisplay.SWAP with String = js.native
  }
  
  @JSImport("expo-font", "isLoaded")
  @js.native
  def isLoaded(fontFamily: String): Boolean = js.native
  
  @JSImport("expo-font", "isLoading")
  @js.native
  def isLoading(fontFamily: String): Boolean = js.native
  
  @JSImport("expo-font", "loadAsync")
  @js.native
  def loadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  @JSImport("expo-font", "loadAsync")
  @js.native
  def loadAsync(fontFamilyOrFontMap: String, source: FontSource): js.Promise[Unit] = js.native
  @JSImport("expo-font", "loadAsync")
  @js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource]): js.Promise[Unit] = js.native
  @JSImport("expo-font", "loadAsync")
  @js.native
  def loadAsync(fontFamilyOrFontMap: StringDictionary[FontSource], source: FontSource): js.Promise[Unit] = js.native
  
  @JSImport("expo-font", "processFontFamily")
  @js.native
  def processFontFamily(): String | Null = js.native
  @JSImport("expo-font", "processFontFamily")
  @js.native
  def processFontFamily(fontFamily: String): String | Null = js.native
  
  @JSImport("expo-font", "unloadAllAsync")
  @js.native
  def unloadAllAsync(): js.Promise[Unit] = js.native
  
  @JSImport("expo-font", "unloadAsync")
  @js.native
  def unloadAsync(fontFamilyOrFontMap: String): js.Promise[Unit] = js.native
  @JSImport("expo-font", "unloadAsync")
  @js.native
  def unloadAsync(fontFamilyOrFontMap: String, options: UnloadFontOptions): js.Promise[Unit] = js.native
  @JSImport("expo-font", "unloadAsync")
  @js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions]): js.Promise[Unit] = js.native
  @JSImport("expo-font", "unloadAsync")
  @js.native
  def unloadAsync(fontFamilyOrFontMap: StringDictionary[UnloadFontOptions], options: UnloadFontOptions): js.Promise[Unit] = js.native
  
  @JSImport("expo-font", "useFonts")
  @js.native
  def useFonts(map: String): js.Tuple2[Boolean, js.Error | Null] = js.native
  @JSImport("expo-font", "useFonts")
  @js.native
  def useFonts(map: StringDictionary[FontSource]): js.Tuple2[Boolean, js.Error | Null] = js.native
}
