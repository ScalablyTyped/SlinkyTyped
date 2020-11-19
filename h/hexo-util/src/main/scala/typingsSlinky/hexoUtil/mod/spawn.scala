package typingsSlinky.hexoUtil.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hexo-util", "spawn")
@js.native
object spawn extends js.Object {
  
  def apply(command: String): js.Promise[String] = js.native
  def apply(command: String, args: js.Array[String]): js.Promise[String] = js.native
  def apply(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  def apply(command: String, args: js.Array[String], options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: hexoSpawnOptions): js.Promise[String] = js.native
  def apply(command: String, args: js.Array[String], options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
  def apply(command: String, options: hexoSpawnDisableEncodingAndOverrideStdioOptions): js.Promise[js.UndefOr[Buffer]] = js.native
  def apply(command: String, options: hexoSpawnDisableEncodingOptions): js.Promise[Buffer] = js.native
  def apply(command: String, options: hexoSpawnOptions): js.Promise[String] = js.native
  def apply(command: String, options: hexoSpawnOverrideStdioOptions): js.Promise[js.UndefOr[String]] = js.native
}
