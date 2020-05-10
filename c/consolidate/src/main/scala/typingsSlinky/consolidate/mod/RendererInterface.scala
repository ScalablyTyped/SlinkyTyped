package typingsSlinky.consolidate.mod

import typingsSlinky.consolidate.AnonDictotherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RendererInterface extends js.Object {
  def apply(path: String): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, _]): js.Any = js.native
  def apply(path: String, options: AnonDictotherOptions): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(
    path: String,
    options: AnonDictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
  def render(path: String): typingsSlinky.bluebird.mod.^[String] = js.native
  def render(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, _]): js.Any = js.native
  def render(path: String, options: AnonDictotherOptions): typingsSlinky.bluebird.mod.^[String] = js.native
  def render(
    path: String,
    options: AnonDictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
}

