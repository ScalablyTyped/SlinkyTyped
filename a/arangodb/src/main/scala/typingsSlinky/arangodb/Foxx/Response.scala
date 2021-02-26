package typingsSlinky.arangodb.Foxx

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.arangodb.ArangoDB.HttpStatus
import typingsSlinky.arangodb.anon.Cause
import typingsSlinky.arangodb.anon.Domain
import typingsSlinky.arangodb.anon.LastModified
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Response extends StObject {
  
  def attachment(): this.type = js.native
  def attachment(filename: String): this.type = js.native
  
  var body: Buffer | String = js.native
  
  var context: Context = js.native
  
  def cookie(name: String, value: String): this.type = js.native
  def cookie(name: String, value: String, options: Domain): this.type = js.native
  
  def download(path: String): this.type = js.native
  def download(path: String, filename: String): this.type = js.native
  
  def getHeader(name: String): js.UndefOr[String] = js.native
  
  var headers: StringDictionary[js.Any] = js.native
  
  def json(data: js.Any): this.type = js.native
  
  def redirect(path: String): this.type = js.native
  def redirect(status: Double, path: String): this.type = js.native
  def redirect(status: HttpStatus, path: String): this.type = js.native
  
  def removeHeader(name: String): this.type = js.native
  
  def send(data: js.Any): this.type = js.native
  def send(data: js.Any, `type`: String): this.type = js.native
  
  def sendFile(path: String): this.type = js.native
  def sendFile(path: String, options: LastModified): this.type = js.native
  
  def sendStatus(status: Double): this.type = js.native
  def sendStatus(status: HttpStatus): this.type = js.native
  
  def set(headers: StringDictionary[String]): this.type = js.native
  def set(name: String, value: String): this.type = js.native
  
  def setHeader(name: String, value: String): this.type = js.native
  
  def status(status: Double): this.type = js.native
  def status(status: HttpStatus): this.type = js.native
  
  var statusCode: Double = js.native
  
  def `throw`(status: Double): scala.Nothing = js.native
  def `throw`(status: Double, error: js.Error): scala.Nothing = js.native
  def `throw`(status: Double, options: Cause): scala.Nothing = js.native
  def `throw`(status: Double, reason: String): scala.Nothing = js.native
  def `throw`(status: Double, reason: String, error: js.Error): scala.Nothing = js.native
  def `throw`(status: Double, reason: String, options: Cause): scala.Nothing = js.native
  def `throw`(status: HttpStatus): scala.Nothing = js.native
  def `throw`(status: HttpStatus, error: js.Error): scala.Nothing = js.native
  def `throw`(status: HttpStatus, options: Cause): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String, error: js.Error): scala.Nothing = js.native
  def `throw`(status: HttpStatus, reason: String, options: Cause): scala.Nothing = js.native
  
  def `type`(): String = js.native
  def `type`(`type`: String): String = js.native
  
  def vary(names: String*): this.type = js.native
  def vary(names: js.Array[String]): this.type = js.native
  
  def write(data: String): this.type = js.native
  def write(data: Buffer): this.type = js.native
}
