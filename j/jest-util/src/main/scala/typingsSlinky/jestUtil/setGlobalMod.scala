package typingsSlinky.jestUtil

import org.scalajs.dom.raw.Window
import typingsSlinky.node.NodeJS.Global
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-util/build/setGlobal", JSImport.Namespace)
@js.native
object setGlobalMod extends js.Object {
  def default(globalToMutate: Global, key: String, value: js.Any): Unit = js.native
  def default(globalToMutate: Window, key: String, value: js.Any): Unit = js.native
}

