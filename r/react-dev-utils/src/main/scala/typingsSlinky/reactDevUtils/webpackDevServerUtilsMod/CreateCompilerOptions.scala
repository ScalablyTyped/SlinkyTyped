package typingsSlinky.reactDevUtils.webpackDevServerUtilsMod

import typingsSlinky.reactDevUtils.anon.Call
import typingsSlinky.webpack.mod.Compiler_
import typingsSlinky.webpack.mod.Compiler_.Handler
import typingsSlinky.webpack.mod.Compiler_.Watching
import typingsSlinky.webpack.mod.Configuration
import typingsSlinky.webpack.mod.ConfigurationFactory
import typingsSlinky.webpack.mod.MultiCompiler
import typingsSlinky.webpack.mod.MultiConfigurationFactory
import typingsSlinky.webpack.mod.MultiWatching
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCompilerOptions extends js.Object {
  /**
    * The name that will be printed to the terminal.
    */
  var appName: String = js.native
  /**
    * The webpack configuration options to be provided to the webpack constructor.
    */
  var config: Configuration = js.native
  /**
    * To provide the `urls` argument, use `prepareUrls()` described below.
    */
  var urls: Urls = js.native
  /**
    * If `true`; yarn instructions will be emitted in the terminal instead of npm.
    */
  var useYarn: js.UndefOr[Boolean] = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  @JSName("webpack")
  var webpack_Original: Call = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typingsSlinky.webpack.mod.MultiCompiler.Handler
  ): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration]): MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: js.Array[Configuration], handler: typingsSlinky.webpack.mod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration): Compiler_ = js.native
  /**
    * Takes the `require('webpack')` entry point.
    */
  def webpack(options: Configuration, handler: Handler): Watching | Compiler_ = js.native
}

