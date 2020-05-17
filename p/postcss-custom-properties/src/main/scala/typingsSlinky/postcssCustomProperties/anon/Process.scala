package typingsSlinky.postcssCustomProperties.anon

import typingsSlinky.postcss.mod.LazyResult
import typingsSlinky.postcss.mod.Result
import typingsSlinky.postcssCustomProperties.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends js.Object {
  def process(css: String): LazyResult = js.native
  def process(css: String, opts: js.Any): LazyResult = js.native
  def process(css: String, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: Result): LazyResult = js.native
  def process(css: Result, opts: js.Any): LazyResult = js.native
  def process(css: Result, opts: js.Any, pluginOptions: Options): LazyResult = js.native
  def process(css: ToString): LazyResult = js.native
  def process(css: ToString, opts: js.Any): LazyResult = js.native
  def process(css: ToString, opts: js.Any, pluginOptions: Options): LazyResult = js.native
}

