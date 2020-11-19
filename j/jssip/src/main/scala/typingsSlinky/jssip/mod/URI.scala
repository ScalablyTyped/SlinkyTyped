package typingsSlinky.jssip.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jssip", "URI")
@js.native
class URI protected () extends js.Object {
  def this(scheme: String, user: String, host: String) = this()
  def this(scheme: String, user: Null, host: String) = this()
  def this(scheme: Null, user: String, host: String) = this()
  def this(scheme: Null, user: Null, host: String) = this()
  def this(scheme: String, user: String, host: String, port: Double) = this()
  def this(scheme: String, user: Null, host: String, port: Double) = this()
  def this(scheme: Null, user: String, host: String, port: Double) = this()
  def this(scheme: Null, user: Null, host: String, port: Double) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String]
  ) = this()
  def this(scheme: String, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String]
  ) = this()
  def this(scheme: String, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String]
  ) = this()
  def this(scheme: Null, user: String, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String]
  ) = this()
  def this(scheme: Null, user: Null, host: String, port: Double, parameters: StringDictionary[String]) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Double,
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: String,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Double,
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: String,
    user: Null,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Double,
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: String,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: js.UndefOr[scala.Nothing],
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Double,
    parameters: js.UndefOr[scala.Nothing],
    headers: StringDictionary[String]
  ) = this()
  def this(
    scheme: Null,
    user: Null,
    host: String,
    port: Double,
    parameters: StringDictionary[String],
    headers: StringDictionary[String]
  ) = this()
  
  def clearHeaders(): Unit = js.native
  
  def clearParams(): Unit = js.native
  
  def deleteHeader(header: String): Unit = js.native
  
  def deleteParam(parameter: String): Unit = js.native
  
  def getHeader(name: String): js.UndefOr[js.Array[String]] = js.native
  
  def getParam(key: String): js.UndefOr[String] = js.native
  
  def hasHeader(name: String): Boolean = js.native
  
  def hasParam(key: String): Boolean = js.native
  
  def setHeader(name: String, value: String): Unit = js.native
  
  def setParam(key: String): Unit = js.native
  def setParam(key: String, value: String): Unit = js.native
  
  def toAor(show_port: Boolean): String = js.native
}
@JSImport("jssip", "URI")
@js.native
object URI extends js.Object {
  
  def parse(uri: String): URI = js.native
}
