package typingsSlinky.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactAddress object stores the properties of a single address of a contact.
  * A Contact object may include more than one address in a ContactAddress[] array.
  */
@js.native
trait ContactAddress extends js.Object {
  /** The country name. */
  var country: js.UndefOr[String] = js.native
  /** The full address formatted for display. */
  var formatted: js.UndefOr[String] = js.native
  /** The city or locality. */
  var locality: js.UndefOr[String] = js.native
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[String] = js.native
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.native
  /** The state or region. */
  var region: js.UndefOr[String] = js.native
  /** The full street address. */
  var streetAddress: js.UndefOr[String] = js.native
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.native
}

@JSGlobal("ContactAddress")
@js.native
object ContactAddress
  extends /** Constructor of ContactAddress object */
Instantiable8[
      js.UndefOr[/* pref */ Boolean], 
      js.UndefOr[/* type */ String], 
      js.UndefOr[/* formatted */ String], 
      js.UndefOr[/* streetAddress */ String], 
      js.UndefOr[/* locality */ String], 
      js.UndefOr[/* region */ String], 
      js.UndefOr[/* postalCode */ String], 
      js.UndefOr[/* country */ String], 
      ContactAddress
    ]

