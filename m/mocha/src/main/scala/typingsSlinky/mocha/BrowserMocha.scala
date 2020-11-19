package typingsSlinky.mocha

import typingsSlinky.mocha.Mocha.Interface
import typingsSlinky.mocha.Mocha.MochaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserMocha extends Mocha {
  
  /**
    * Setup mocha with the given settings options.
    *
    * - _Only supported in the browser._
    */
  def setup(): this.type = js.native
  def setup(opts: Interface): this.type = js.native
  def setup(opts: MochaOptions): this.type = js.native
  
  /**
    * Function to allow assertion libraries to throw errors directly into mocha.
    * This is useful when running tests in a browser because window.onerror will
    * only receive the 'message' attribute of the Error.
    *
    * - _Only supported in the browser._
    */
  def throwError(err: js.Any): scala.Nothing = js.native
}
