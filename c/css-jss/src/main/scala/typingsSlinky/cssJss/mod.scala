package typingsSlinky.cssJss

import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.JssStyle
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("css-jss", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val create: CreateCss = js.native
  
  val default: ReturnType[CreateCss] = js.native
  
  type CreateCss = js.Function1[/* jss */ js.UndefOr[Jss], Css]
  
  type Css = js.Function1[/* repeated */ StyleArg, String]
  
  type StyleArg = JssStyle | js.Array[JssStyle]
}
