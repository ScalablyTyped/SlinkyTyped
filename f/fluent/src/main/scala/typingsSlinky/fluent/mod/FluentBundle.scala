package typingsSlinky.fluent.mod

import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent", "FluentBundle")
@js.native
class FluentBundle protected () extends js.Object {
  def this(locales: String) = this()
  def this(locales: js.Array[String]) = this()
  def this(locales: String, options: FluentBundleContructorOptions) = this()
  def this(locales: js.Array[String], options: FluentBundleContructorOptions) = this()
  
  def addMessages(source: String): js.Array[String] = js.native
  
  def addResource(res: FluentResource): js.Array[String] = js.native
  
  def format(message: js.Array[FluentNode]): String = js.native
  def format(
    message: js.Array[FluentNode],
    args: js.UndefOr[scala.Nothing],
    errors: js.Array[String | js.Error]
  ): String = js.native
  def format(message: js.Array[FluentNode], args: js.Object): String = js.native
  def format(message: js.Array[FluentNode], args: js.Object, errors: js.Array[String | js.Error]): String = js.native
  
  def getMessage(id: String): js.UndefOr[js.Array[FluentNode]] = js.native
  
  def hasMessage(id: String): Boolean = js.native
  
  var locales: js.Array[String] = js.native
  
  var messages: IterableIterator[js.Tuple2[String, js.Array[FluentNode]]] = js.native
}
