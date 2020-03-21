package typingsSlinky.enzymeToJson

import typingsSlinky.cheerio.Cheerio_
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.enzyme.mod.ShallowWrapper
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme-to-json", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[P, S](wrapper: Cheerio_): js.Object = js.native
  def default[P, S](wrapper: ReactWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
  def default[P, S](wrapper: ShallowWrapper[P, S, Component[js.Object, js.Object, _]]): js.Object = js.native
}

