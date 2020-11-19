package typingsSlinky.openurl2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openurl2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def mailto(recipients: js.Array[String], fields: StringDictionary[String]): Unit = js.native
  def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  def mailto(recipients: js.Array[String], fields: StringDictionary[String], recipientsSeparator: String): Unit = js.native
  def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: String,
    callback: js.Function1[/* err */ js.Error, Unit]
  ): Unit = js.native
  
  def open(url: String): Unit = js.native
  def open(url: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
