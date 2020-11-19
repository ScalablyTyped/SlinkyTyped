package typingsSlinky.dav.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dav", "AddressBook")
@js.native
class AddressBook () extends DAVCollection[VCard] {
  def this(options: AddressBookOptions) = this()
}
