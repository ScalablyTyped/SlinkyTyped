package typingsSlinky.recursiveReaddir.mod

import typingsSlinky.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recursive-readdir", "RecursiveReaddir")
@js.native
object RecursiveReaddir extends js.Object {
  
  @js.native
  trait readDir extends js.Object {
    
    def apply(path: String): js.Promise[js.Array[String]] = js.native
    def apply(path: String, callback: Callback): Unit = js.native
    def apply(path: String, ignores: Ignores): js.Promise[js.Array[String]] = js.native
    def apply(path: String, ignores: Ignores, callback: Callback): Unit = js.native
  }
  
  type Callback = js.Function2[/* error */ js.Error, /* files */ js.Array[String], Unit]
  
  type IgnoreFunction = js.Function2[/* file */ String, /* stats */ Stats, Boolean]
  
  type Ignores = js.Array[String | IgnoreFunction]
}
