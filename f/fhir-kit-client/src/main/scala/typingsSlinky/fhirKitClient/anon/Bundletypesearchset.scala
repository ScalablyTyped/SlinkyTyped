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
import scala.scalajs.js.annotation._

/* Inlined fhir.fhir.Bundle & {  type  :'searchset'} */
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
    def withType(value: code with searchset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_id(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
    @scala.inline
    def with_implicitRules(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_implicitRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_implicitRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_implicitRules")(js.undefined)
        ret
    }
    @scala.inline
    def with_language(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_language: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_language")(js.undefined)
        ret
    }
    @scala.inline
    def with_resourceType(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_resourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def with_total(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_total: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_total")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def withEntry(value: js.Array[BundleEntry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entry")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withImplicitRules(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplicitRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implicitRules")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Array[BundleLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withMeta(value: Meta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meta")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withSignature(value: Signature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: unsignedInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.undefined)
        ret
    }
  }
  
}

