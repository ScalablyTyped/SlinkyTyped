package typingsSlinky.cfenv.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEnv extends js.Object {
  var app: js.Object = js.native
  var bind: String = js.native
  var isLocal: Boolean = js.native
  var name: String = js.native
  var port: Double = js.native
  var services: js.Object = js.native
  var url: String = js.native
  var urls: js.Array[String] = js.native
  def getService(spec: String): Service | Null = js.native
  def getService(spec: js.RegExp): Service | Null = js.native
  def getServiceCreds(spec: String): js.Object | Null = js.native
  def getServiceCreds(spec: js.RegExp): js.Object | Null = js.native
  def getServiceURL(spec: String): String | Null = js.native
  def getServiceURL(spec: String, replacements: js.Object): String | Null = js.native
  def getServiceURL(spec: js.RegExp): String | Null = js.native
  def getServiceURL(spec: js.RegExp, replacements: js.Object): String | Null = js.native
  def getServices(): StringDictionary[Service] = js.native
  def toJSON(): String = js.native
}

