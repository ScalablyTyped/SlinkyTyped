package typingsSlinky.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.Key
import typingsSlinky.maximMazurokGapiClientDatacatalog.anon.Uploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnumValuesResource extends js.Object {
  
  def rename(request: Key, body: GoogleCloudDatacatalogV1beta1RenameTagTemplateFieldEnumValueRequest): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
  /**
    * Renames an enum value in a tag template. The enum values have to be unique within one enum field. Thus, an enum value cannot be renamed with a name used in any other enum value
    * within the same enum field.
    */
  def rename(request: Uploadprotocol): Request[GoogleCloudDatacatalogV1beta1TagTemplateField] = js.native
}
