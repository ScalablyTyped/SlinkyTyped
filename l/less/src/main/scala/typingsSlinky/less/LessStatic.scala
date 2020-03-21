package typingsSlinky.less

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLinkElement
import typingsSlinky.less.Less_.ImportManager
import typingsSlinky.less.Less_.Options
import typingsSlinky.less.Less_.RefreshOutput
import typingsSlinky.less.Less_.RenderError
import typingsSlinky.less.Less_.RenderOutput
import typingsSlinky.less.Less_.StaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LessStatic extends js.Object {
  var importManager: js.UndefOr[ImportManager] = js.native
  var options: StaticOptions = js.native
  var sheets: js.Array[HTMLLinkElement] = js.native
  var version: js.Array[Double] = js.native
  def modifyVars(vars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  def refresh(): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: StringDictionary[String], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refreshStyles(): Unit = js.native
  def render(input: String): js.Promise[RenderOutput] = js.native
  def render(
    input: String,
    callback: js.Function2[/* error */ RenderError, /* output */ js.UndefOr[RenderOutput], Unit]
  ): Unit = js.native
  def render(input: String, options: Options): js.Promise[RenderOutput] = js.native
  def render(
    input: String,
    options: Options,
    callback: js.Function2[/* error */ RenderError, /* output */ js.UndefOr[RenderOutput], Unit]
  ): Unit = js.native
  def watch(): Unit = js.native
}

