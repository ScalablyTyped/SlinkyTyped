package typingsSlinky.consolidate.mod

import typingsSlinky.consolidate.anon.DictotherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RendererInterface extends js.Object {
  
  def apply(path: String): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, _]): js.Any = js.native
  def apply(path: String, options: DictotherOptions): typingsSlinky.bluebird.mod.^[String] = js.native
  def apply(
    path: String,
    options: DictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
  
  def render(path: String): typingsSlinky.bluebird.mod.^[String] = js.native
  def render(path: String, fn: js.Function2[/* err */ js.Error, /* html */ String, _]): js.Any = js.native
  def render(path: String, options: DictotherOptions): typingsSlinky.bluebird.mod.^[String] = js.native
  def render(
    path: String,
    options: DictotherOptions,
    fn: js.Function2[/* err */ js.Error, /* html */ String, _]
  ): js.Any = js.native
}
