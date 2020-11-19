package typingsSlinky.jqueryAjaxfile

import typingsSlinky.jqueryAjaxfile.Mocha.IRunner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mocha_ extends js.Object {
  
  def addFile(file: String): Mocha = js.native
  
  def asyncOnly(value: Boolean): Mocha = js.native
  
  def bail(): Mocha = js.native
  def bail(value: Boolean): Mocha = js.native
  
  def checkLeaks(): Mocha = js.native
  
  def enableTimeouts(value: Boolean): Mocha = js.native
  
  def globals(value: String): Mocha = js.native
  def globals(values: js.Array[String]): Mocha = js.native
  
  def grep(value: String): Mocha = js.native
  def grep(value: js.RegExp): Mocha = js.native
  
  /** Enables growl support. */
  def growl(): Mocha = js.native
  
  def ignoreLeaks(value: Boolean): Mocha = js.native
  
  def invert(): Mocha = js.native
  
  def noHighlighting(value: Boolean): Mocha = js.native
  
  /** Sets reporter by name, defaults to "spec". */
  def reporter(name: String): Mocha = js.native
  /** Sets reporter constructor, defaults to mocha.reporters.Spec. */
  def reporter(reporter: js.Function2[/* runner */ IRunner, /* options */ js.Any, _]): Mocha = js.native
  
  /** Runs tests and invokes `onComplete()` when finished. */
  def run(): IRunner = js.native
  def run(onComplete: js.Function1[/* failures */ Double, Unit]): IRunner = js.native
  
  /** Setup mocha with the given options. */
  def setup(options: MochaSetupOptions): Mocha = js.native
  
  def slow(value: Double): Mocha = js.native
  
  def timeout(value: Double): Mocha = js.native
  
  def ui(value: String): Mocha = js.native
  
  def useColors(value: Boolean): Mocha = js.native
  
  def useInlineDiffs(value: Boolean): Mocha = js.native
}
