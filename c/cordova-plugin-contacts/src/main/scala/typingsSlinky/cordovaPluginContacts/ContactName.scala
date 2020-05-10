package typingsSlinky.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains different kinds of information about a Contact object's name. */
@js.native
trait ContactName extends js.Object {
  /** The contact's family name. */
  var familyName: js.UndefOr[String] = js.native
  /** The complete name of the contact. */
  var formatted: js.UndefOr[String] = js.native
  /** The contact's given name. */
  var givenName: js.UndefOr[String] = js.native
  /** The contact's prefix (example Mr. or Dr.) */
  var honorificPrefix: js.UndefOr[String] = js.native
  /** The contact's suffix (example Esq.). */
  var honorificSuffix: js.UndefOr[String] = js.native
  /** The contact's middle name. */
  var middleName: js.UndefOr[String] = js.native
}

@JSGlobal("ContactName")
@js.native
object ContactName
  extends /** Constructor for ContactName object */
Instantiable6[
      js.UndefOr[/* formatted */ String], 
      js.UndefOr[/* familyName */ String], 
      js.UndefOr[/* givenName */ String], 
      js.UndefOr[/* middleName */ String], 
      js.UndefOr[/* honorificPrefix */ String], 
      js.UndefOr[/* honorificSuffix */ String], 
      ContactName
    ]

