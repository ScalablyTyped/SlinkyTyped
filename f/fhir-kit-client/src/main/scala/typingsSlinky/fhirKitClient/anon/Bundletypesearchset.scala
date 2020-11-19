package typingsSlinky.fhirKitClient.anon

import typingsSlinky.fhir.fhir.BundleEntry
import typingsSlinky.fhir.fhir.BundleLink
import typingsSlinky.fhir.fhir.Element
import typingsSlinky.fhir.fhir.Identifier
import typingsSlinky.fhir.fhir.Meta
import typingsSlinky.fhir.fhir.Signature
import typingsSlinky.fhir.fhir.code
import typingsSlinky.fhir.fhir.id
import typingsSlinky.fhir.fhir.unsignedInt
import typingsSlinky.fhir.fhir.uri
import typingsSlinky.fhirKitClient.fhirKitClientStrings.searchset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined fhir.fhir.Bundle & {  type :'searchset'} */
@js.native
trait Bundletypesearchset extends js.Object {
  
  /**
    * Contains extended information for property 'id'.
    */
  var _id: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'implicitRules'.
    */
  var _implicitRules: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'resourceType'.
    */
  var _resourceType: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Entry in the bundle - will have a resource, or information
    */
  var entry: js.UndefOr[js.Array[BundleEntry]] = js.native
  
  /**
    * Logical id of this artifact
    */
  var id: js.UndefOr[typingsSlinky.fhir.fhir.id] = js.native
  
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * A set of rules under which this content was created
    */
  var implicitRules: js.UndefOr[uri] = js.native
  
  /**
    * Language of the resource content
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.native
  
  /**
    * Metadata about the resource
    */
  var meta: js.UndefOr[Meta] = js.native
  
  /**
    * The type of the resource.
    */
  var resourceType: js.UndefOr[code] = js.native
  
  /**
    * Digital Signature
    */
  var signature: js.UndefOr[Signature] = js.native
  
  /**
    * If search, the total number of matches
    */
  var total: js.UndefOr[unsignedInt] = js.native
  
  /**
    * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
    */
  var `type`: code with searchset = js.native
}
object Bundletypesearchset {
  
  @scala.inline
  def apply(`type`: code with searchset): Bundletypesearchset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundletypesearchset]
  }
  
  @scala.inline
  implicit class BundletypesearchsetOps[Self <: Bundletypesearchset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: code with searchset): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_id(value: Element): Self = this.set("_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_id: Self = this.set("_id", js.undefined)
    
    @scala.inline
    def set_implicitRules(value: Element): Self = this.set("_implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_implicitRules: Self = this.set("_implicitRules", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = this.set("_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_language: Self = this.set("_language", js.undefined)
    
    @scala.inline
    def set_resourceType(value: Element): Self = this.set("_resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_resourceType: Self = this.set("_resourceType", js.undefined)
    
    @scala.inline
    def set_total(value: Element): Self = this.set("_total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_total: Self = this.set("_total", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def setEntryVarargs(value: BundleEntry*): Self = this.set("entry", js.Array(value :_*))
    
    @scala.inline
    def setEntry(value: js.Array[BundleEntry]): Self = this.set("entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    
    @scala.inline
    def setId(value: id): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setImplicitRules(value: uri): Self = this.set("implicitRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImplicitRules: Self = this.set("implicitRules", js.undefined)
    
    @scala.inline
    def setLanguage(value: code): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = this.set("link", js.Array(value :_*))
    
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setResourceType(value: code): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setSignature(value: Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setTotal(value: unsignedInt): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
