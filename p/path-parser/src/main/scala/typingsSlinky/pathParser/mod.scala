package typingsSlinky.pathParser

import typingsSlinky.pathParser.pathMod.PathOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("path-parser", "Path")
  @js.native
  class Path[T /* <: Record[String, _] */] protected ()
    extends typingsSlinky.pathParser.pathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  /* static members */
  object Path {
    
    @JSImport("path-parser", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String): typingsSlinky.pathParser.pathMod.Path[T] = js.native
    @JSImport("path-parser", "Path.createPath")
    @js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): typingsSlinky.pathParser.pathMod.Path[T] = js.native
  }
}
