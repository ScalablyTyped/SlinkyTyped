package typingsSlinky.postcssCustomProperties

import typingsSlinky.postcss.mod.LazyResult
import typingsSlinky.postcss.mod.Result
import typingsSlinky.postcssCustomProperties.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProcess extends js.Object {
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: String, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
  def process(css: Result, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: AnonToString): LazyResult = js.native
  def process(css: AnonToString, opts: js.Any): LazyResult = js.native
  def process(css: AnonToString, opts: js.Any, pluginOptions: Options): LazyResult = js.native
}

