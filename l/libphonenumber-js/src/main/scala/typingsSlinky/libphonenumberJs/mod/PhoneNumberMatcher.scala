package typingsSlinky.libphonenumberJs.mod

import typingsSlinky.libphonenumberJs.anon.DefaultCountry
import typingsSlinky.libphonenumberJs.typesMod.NumberFound
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libphonenumber-js", "PhoneNumberMatcher")
@js.native
class PhoneNumberMatcher protected () extends js.Object {
  def this(text: String) = this()
  def this(text: String, options: DefaultCountry) = this()
  
  def hasNext(): Boolean = js.native
  
  def next(): js.UndefOr[NumberFound] = js.native
}
