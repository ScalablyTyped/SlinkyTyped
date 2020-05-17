package typingsSlinky.express

import typingsSlinky.mime.mod.TypeMap
import typingsSlinky.qs.mod.IParseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(str: String): js.Any = js.native
    def apply(str: String, options: IParseOptions): js.Any = js.native
  }
  
  @js.native
  trait Typeofm extends js.Object {
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    def getExtension(mime: String): String | Null = js.native
    def getType(path: String): String | Null = js.native
  }
  
}

