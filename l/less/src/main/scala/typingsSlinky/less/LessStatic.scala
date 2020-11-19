package typingsSlinky.less

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLLinkElement
import typingsSlinky.less.Less.ImportManager
import typingsSlinky.less.Less.Options
import typingsSlinky.less.Less.RefreshOutput
import typingsSlinky.less.Less.RenderError
import typingsSlinky.less.Less.RenderOutput
import typingsSlinky.less.Less.StaticOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LessStatic extends js.Object {
  
  var importManager: js.UndefOr[ImportManager] = js.native
  
  def modifyVars(vars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  
  var options: StaticOptions = js.native
  
  def refresh(): js.Promise[RefreshOutput] = js.native
  def refresh(reload: js.UndefOr[scala.Nothing], modifyVars: js.UndefOr[scala.Nothing], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: js.UndefOr[scala.Nothing], modifyVars: StringDictionary[String]): js.Promise[RefreshOutput] = js.native
  def refresh(reload: js.UndefOr[scala.Nothing], modifyVars: StringDictionary[String], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean): js.Promise[RefreshOutput] = js.native
  def refresh(reload: Boolean, modifyVars: js.UndefOr[scala.Nothing], clearFileCache: Boolean): js.Promise[RefreshOutput] = js.native
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
  
  var sheets: js.Array[HTMLLinkElement] = js.native
  
  var version: js.Array[Double] = js.native
  
  def watch(): Unit = js.native
}
