package typingsSlinky.cryptojs.CryptoJS.lib

import typingsSlinky.cryptojs.CryptoJS.format.IFormatter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherParams
  extends Base
     with CipherParamsData {
  
  def create(): CipherParams = js.native
  def create(cipherParams: CipherParamsData): CipherParams = js.native
  
  def init(): Unit = js.native
  def init(cipherParams: CipherParamsData): Unit = js.native
  
  def toString(formatter: IFormatter): String = js.native
}
