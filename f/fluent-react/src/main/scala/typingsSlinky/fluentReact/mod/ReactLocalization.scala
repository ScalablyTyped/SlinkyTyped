package typingsSlinky.fluentReact.mod

import typingsSlinky.fluent.mod.FluentBundle
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluent-react", "ReactLocalization")
@js.native
class ReactLocalization protected () extends js.Object {
  def this(bundles: IterableIterator[FluentBundle]) = this()
  
  def getString(id: String): String = js.native
  def getString(id: String, args: js.UndefOr[scala.Nothing], fallback: String): String = js.native
  def getString(id: String, args: js.Object): String = js.native
  def getString(id: String, args: js.Object, fallback: String): String = js.native
}
