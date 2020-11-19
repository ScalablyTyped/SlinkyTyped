package typingsSlinky.ldapjs.mod

import typingsSlinky.ldapjs.anon.LDAPMessageJsonObjectobje
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "SearchEntry")
@js.native
class SearchEntry () extends LDAPMessage {
  
  var attributes: js.Array[Attribute] = js.native
  
  @JSName("json")
  val json_SearchEntry: LDAPMessageJsonObjectobje = js.native
  
  /**
    * Retrieve an object with `dn`, `controls` and every `Atttribute` as a property with their value(s)
    */
  val `object`: SearchEntryObject = js.native
  
  var objectName: String | Null = js.native
  
  /**
    * Retrieve an object with `dn`, `controls` and every `Atttribute` as a property, using raw `Buffer`(s) as attribute values.
    */
  val raw: SearchEntryRaw = js.native
  
  @JSName("type")
  val type_SearchEntry: typingsSlinky.ldapjs.ldapjsStrings.SearchEntry = js.native
}
