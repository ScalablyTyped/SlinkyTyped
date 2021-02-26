package typingsSlinky.gulpTypescript

import typingsSlinky.gulpTypescript.anon.Typeofts
import typingsSlinky.gulpTypescript.inputMod.FileCache
import typingsSlinky.typescript.mod.CompilerHost
import typingsSlinky.typescript.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostMod {
  
  @JSImport("gulp-typescript/release/host", "Host")
  @js.native
  class Host protected () extends CompilerHost {
    def this(typescript: Typeofts, currentDirectory: String, input: FileCache, options: CompilerOptions) = this()
    
    var currentDirectory: String = js.native
    
    @JSName("directoryExists")
    def directoryExists_MHost(path: String): Boolean = js.native
    
    var fallback: CompilerHost = js.native
    
    @JSName("getCurrentDirectory")
    def getCurrentDirectory_MHost(): String = js.native
    
    @JSName("getDefaultLibLocation")
    def getDefaultLibLocation_MHost(): String = js.native
    
    @JSName("getDirectories")
    def getDirectories_MHost(path: String): js.Array[String] = js.native
    
    var input: FileCache = js.native
    
    @JSName("readDirectory")
    def readDirectory_MHost(
      rootDir: String,
      extensions: js.Array[String],
      excludes: js.Array[String],
      includes: js.Array[String]
    ): js.Array[String] = js.native
    @JSName("readDirectory")
    def readDirectory_MHost(
      rootDir: String,
      extensions: js.Array[String],
      excludes: js.Array[String],
      includes: js.Array[String],
      depth: Double
    ): js.Array[String] = js.native
    
    @JSName("realpath")
    def realpath_MHost(path: String): String = js.native
    
    var typescript: Typeofts = js.native
  }
}
