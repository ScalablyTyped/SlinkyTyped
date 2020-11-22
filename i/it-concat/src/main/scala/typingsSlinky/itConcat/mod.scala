package typingsSlinky.itConcat

import typingsSlinky.bl.mod.^
import typingsSlinky.itConcat.anon.Type
import typingsSlinky.itConcat.anon.`0`
import typingsSlinky.node.Buffer
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("it-concat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(source: AsyncIterable[Buffer | String | ^ ]): js.Promise[^] = js.native
  def apply(source: AsyncIterable[Buffer | String | ^ ], options: Type): js.Promise[String] = js.native
  def apply(source: AsyncIterable[Buffer | ^ ], options: `0`): js.Promise[^] = js.native
}
