package typingsSlinky.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/core", "transformFileAsync")
@js.native
object transformFileAsync extends js.Object {
  
  def apply(filename: String): js.Promise[BabelFileResult | Null] = js.native
  def apply(filename: String, opts: TransformOptions): js.Promise[BabelFileResult | Null] = js.native
}
