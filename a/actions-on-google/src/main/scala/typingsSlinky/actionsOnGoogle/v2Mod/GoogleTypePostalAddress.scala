package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleTypePostalAddress extends js.Object {
  
  /**
    * Unstructured address lines describing the lower levels of an address.
    *
    * Because values in address_lines do not have type information and may
    * sometimes contain multiple values in a single field (e.g.
    * \"Austin, TX\"), it is important that the line order is clear. The order of
    * address lines should be \"envelope order\" for the country/region of the
    * address. In places where this can vary (e.g. Japan), address_language is
    * used to make it explicit (e.g. \"ja\" for large-to-small ordering and
    * \"ja-Latn\" or \"en\" for small-to-large). This way, the most specific line
    * of an address can be selected based on the language.
    *
    * The minimum permitted structural representation of an address consists
    * of a region_code with all remaining information placed in the
    * address_lines. It would be possible to format such an address very
    * approximately without geocoding, but no semantic reasoning could be
    * made about any of the address components until it was at least
    * partially resolved.
    *
    * Creating an address only containing a region_code and address_lines, and
    * then geocoding is the recommended way to handle completely unstructured
    * addresses (as opposed to guessing which parts of the address should be
    * localities or administrative areas).
    */
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Highest administrative subdivision which is used for postal
    * addresses of a country or region.
    * For example, this can be a state, a province, an oblast, or a prefecture.
    * Specifically, for Spain this is the province and not the autonomous
    * community (e.g. \"Barcelona\" and not \"Catalonia\").
    * Many countries don't use an administrative area in postal addresses. E.g.
    * in Switzerland this should be left unpopulated.
    */
  var administrativeArea: js.UndefOr[String] = js.native
  
  /**
    * Optional. BCP-47 language code of the contents of this address (if
    * known). This is often the UI language of the input form or is expected
    * to match one of the languages used in the address' country/region, or their
    * transliterated equivalents.
    * This can affect formatting in certain countries, but is not critical
    * to the correctness of the data and will never affect any validation or
    * other non-formatting related operations.
    *
    * If this value is not known, it should be omitted (rather than specifying a
    * possibly incorrect default).
    *
    * Examples: \"zh-Hant\", \"ja\", \"ja-Latn\", \"en\".
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. Generally refers to the city/town portion of the address.
    * Examples: US city, IT comune, UK post town.
    * In regions of the world where localities are not well defined or do not fit
    * into this structure well, leave locality empty and use address_lines.
    */
  var locality: js.UndefOr[String] = js.native
  
  /**
    * Optional. The name of the organization at the address.
    */
  var organization: js.UndefOr[String] = js.native
  
  /**
    * Optional. Postal code of the address. Not all countries use or require
    * postal codes to be present, but where they are used, they may trigger
    * additional validation with other parts of the address (e.g. state/zip
    * validation in the U.S.A.).
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. The recipient at the address.
    * This field may, under certain circumstances, contain multiline information.
    * For example, it might contain \"care of\" information.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Required. CLDR region code of the country/region of the address. This
    * is never inferred and it is up to the user to ensure the value is
    * correct. See http://cldr.unicode.org/ and
    * http://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
    * for details. Example: \"CH\" for Switzerland.
    */
  var regionCode: js.UndefOr[String] = js.native
  
  /**
    * The schema revision of the `PostalAddress`. This must be set to 0, which is
    * the latest revision.
    *
    * All new revisions **must** be backward compatible with old revisions.
    */
  var revision: js.UndefOr[Double] = js.native
  
  /**
    * Optional. Additional, country-specific, sorting code. This is not used
    * in most regions. Where it is used, the value is either a string like
    * \"CEDEX\", optionally followed by a number (e.g. \"CEDEX 7\"), or just a
    * number alone, representing the \"sector code\" (Jamaica), \"delivery area
    * indicator\" (Malawi) or \"post office indicator\" (e.g. Côte d'Ivoire).
    */
  var sortingCode: js.UndefOr[String] = js.native
  
  /**
    * Optional. Sublocality of the address.
    * For example, this can be neighborhoods, boroughs, districts.
    */
  var sublocality: js.UndefOr[String] = js.native
}
object GoogleTypePostalAddress {
  
  @scala.inline
  def apply(): GoogleTypePostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleTypePostalAddress]
  }
  
  @scala.inline
  implicit class GoogleTypePostalAddressOps[Self <: GoogleTypePostalAddress] (val x: Self) extends AnyVal {
    
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
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortingCode: Self = this.set("sortingCode", js.undefined)
    
    @scala.inline
    def setSublocality(value: String): Self = this.set("sublocality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSublocality: Self = this.set("sublocality", js.undefined)
  }
}
