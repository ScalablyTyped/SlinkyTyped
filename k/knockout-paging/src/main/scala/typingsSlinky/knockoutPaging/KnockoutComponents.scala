package typingsSlinky.knockoutPaging

import org.scalajs.dom.raw.Node
import typingsSlinky.knockoutPaging.KnockoutComponentTypes.Config
import typingsSlinky.knockoutPaging.KnockoutComponentTypes.Definition
import typingsSlinky.knockoutPaging.KnockoutComponentTypes.EmptyConfig
import typingsSlinky.knockoutPaging.KnockoutComponentTypes.Loader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComponents extends js.Object {
  var defaultLoader: Loader = js.native
  var loaders: js.Array[Loader] = js.native
  def clearCachedDefinition(componentName: String): Unit = js.native
  def get(componentName: String, callback: js.Function1[/* definition */ Definition, Unit]): Unit = js.native
  def getComponentNameForNode(node: Node): String = js.native
  def isRegistered(componentName: String): Boolean = js.native
  // overloads for register method:
  def register(componentName: String, config: Config): Unit = js.native
  def register(componentName: String, config: EmptyConfig): Unit = js.native
  def unregister(componentName: String): Unit = js.native
}

