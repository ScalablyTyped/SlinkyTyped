package typingsSlinky.nodemailer.mailerMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodemailer.anon.Prepared
import typingsSlinky.nodemailer.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[
java.lang.String | js.Array[java.lang.String] | typingsSlinky.nodemailer.anon.Prepared]
  - js.Array[typingsSlinky.nodemailer.anon.Value]
*/
trait Headers extends js.Object

object Headers {
  @scala.inline
  implicit def apply(value: js.Array[Value]): Headers = value.asInstanceOf[Headers]
  @scala.inline
  implicit def apply(value: StringDictionary[String | js.Array[String] | Prepared]): Headers = value.asInstanceOf[Headers]
}

