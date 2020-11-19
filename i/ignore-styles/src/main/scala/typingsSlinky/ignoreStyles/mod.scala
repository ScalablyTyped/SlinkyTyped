package typingsSlinky.ignoreStyles

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ignore-styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val DEFAULT_EXTENSIONS: js.Array[String] = js.native
  
  def default(): Unit = js.native
  def default(extensions: js.UndefOr[scala.Nothing], handler: Handler): Unit = js.native
  def default(extensions: js.Array[String]): Unit = js.native
  def default(extensions: js.Array[String], handler: Handler): Unit = js.native
  
  def noOp(): Unit = js.native
  
  def restore(): Unit = js.native
  
  @js.native
  object oldHandlers extends /* ext */ StringDictionary[Handler]
  
  type Handler = js.Function2[/* m */ NodeModule, /* filename */ String, js.Any]
}
