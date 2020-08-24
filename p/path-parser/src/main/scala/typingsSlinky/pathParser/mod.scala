package typingsSlinky.pathParser

import typingsSlinky.pathParser.pathMod.PathOptions
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("path-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Path[T /* <: Record[String, _] */] protected ()
    extends typingsSlinky.pathParser.pathMod.Path[T] {
    def this(path: String) = this()
    def this(path: String, options: PathOptions) = this()
  }
  
  /* static members */
  @js.native
  object Path extends js.Object {
    def createPath[T /* <: Record[String, _] */](path: String): typingsSlinky.pathParser.pathMod.Path[T] = js.native
    def createPath[T /* <: Record[String, _] */](path: String, options: PathOptions): typingsSlinky.pathParser.pathMod.Path[T] = js.native
  }
  
}

