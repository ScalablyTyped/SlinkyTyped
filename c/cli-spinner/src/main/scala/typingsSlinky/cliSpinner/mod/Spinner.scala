package typingsSlinky.cliSpinner.mod

import typingsSlinky.cliSpinner.anon.TypeofSpinner
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cli-spinner", "Spinner")
@js.native
class Spinner () extends js.Object {
  def this(titleOrOptions: String) = this()
  def this(titleOrOptions: Options) = this()
  
  def clearLine(stream: WritableStream): this.type = js.native
  
  def isSpinning(): Boolean = js.native
  
  def setSpinnerDelay(spinnerDelay: Double): this.type = js.native
  
  def setSpinnerString(spinnerString: String): this.type = js.native
  def setSpinnerString(spinnerString: Double): this.type = js.native
  
  def setSpinnerTitle(title: String): this.type = js.native
  
  def start(): this.type = js.native
  
  def stop(): this.type = js.native
  def stop(clear: Boolean): this.type = js.native
  
  val stream: WritableStream = js.native
}
/* static members */
@JSImport("cli-spinner", "Spinner")
@js.native
object Spinner extends js.Object {
  
  def setDefaultSpinnerDelay(spinnerDelay: Double): TypeofSpinner = js.native
  
  def setDefaultSpinnerString(spinnerString: String): TypeofSpinner = js.native
  def setDefaultSpinnerString(spinnerString: Double): TypeofSpinner = js.native
}
