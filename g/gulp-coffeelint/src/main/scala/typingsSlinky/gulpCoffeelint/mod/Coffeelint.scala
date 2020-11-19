package typingsSlinky.gulpCoffeelint.mod

import typingsSlinky.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coffeelint extends js.Object {
  
  /**
    * @param optFile Absolute path of a json file containing options for coffeelint.
    * @param opt Options you wish to send to coffeelint. If optFile is given, this will be ignored.
    * @param literate Are we dealing with Literate CoffeeScript?
    * @param rules Add custom rules to coffeelint.
    */
  def apply(): ReadWriteStream = js.native
  def apply(
    optFile: js.UndefOr[scala.Nothing],
    opt: js.UndefOr[scala.Nothing],
    literate: js.UndefOr[scala.Nothing],
    rules: js.Array[js.Function]
  ): ReadWriteStream = js.native
  def apply(optFile: js.UndefOr[scala.Nothing], opt: js.UndefOr[scala.Nothing], literate: Boolean): ReadWriteStream = js.native
  def apply(
    optFile: js.UndefOr[scala.Nothing],
    opt: js.UndefOr[scala.Nothing],
    literate: Boolean,
    rules: js.Array[js.Function]
  ): ReadWriteStream = js.native
  def apply(optFile: js.UndefOr[scala.Nothing], opt: js.Any): ReadWriteStream = js.native
  def apply(
    optFile: js.UndefOr[scala.Nothing],
    opt: js.Any,
    literate: js.UndefOr[scala.Nothing],
    rules: js.Array[js.Function]
  ): ReadWriteStream = js.native
  def apply(optFile: js.UndefOr[scala.Nothing], opt: js.Any, literate: Boolean): ReadWriteStream = js.native
  def apply(optFile: js.UndefOr[scala.Nothing], opt: js.Any, literate: Boolean, rules: js.Array[js.Function]): ReadWriteStream = js.native
  def apply(optFile: String): ReadWriteStream = js.native
  def apply(
    optFile: String,
    opt: js.UndefOr[scala.Nothing],
    literate: js.UndefOr[scala.Nothing],
    rules: js.Array[js.Function]
  ): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.UndefOr[scala.Nothing], literate: Boolean): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.UndefOr[scala.Nothing], literate: Boolean, rules: js.Array[js.Function]): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.Any): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.Any, literate: js.UndefOr[scala.Nothing], rules: js.Array[js.Function]): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.Any, literate: Boolean): ReadWriteStream = js.native
  def apply(optFile: String, opt: js.Any, literate: Boolean, rules: js.Array[js.Function]): ReadWriteStream = js.native
  
  def reporter(): ReadWriteStream = js.native
  def reporter(reporter: String): ReadWriteStream = js.native
  def reporter(reporter: js.Function): ReadWriteStream = js.native
}
