package typingsSlinky.express

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mime.mod.TypeMap
import typingsSlinky.qs.anon.IParseOptionsdecodernever
import typingsSlinky.qs.mod.IParseOptions
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.qs.mod.PoorMansUnknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(str: String): StringDictionary[PoorMansUnknown] = js.native
    def apply(str: String, options: IParseOptionsdecodernever): ParsedQs = js.native
    def apply(str: String, options: IParseOptions): StringDictionary[PoorMansUnknown] = js.native
  }
  
  @js.native
  trait Typeofm extends js.Object {
    def define(mimes: TypeMap): Unit = js.native
    def define(mimes: TypeMap, force: Boolean): Unit = js.native
    def getExtension(mime: String): String | Null = js.native
    def getType(path: String): String | Null = js.native
  }
  
}

