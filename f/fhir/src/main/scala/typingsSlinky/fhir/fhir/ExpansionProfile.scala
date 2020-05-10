package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines behaviour and contraints on the ValueSet Expansion operation
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ExpansionProfile extends DomainResource {
  /**
    * Contains extended information for property 'activeOnly'.
    */
  var _activeOnly: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'displayLanguage'.
    */
  var _displayLanguage: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'excludeNested'.
    */
  var _excludeNested: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'excludeNotForUI'.
    */
  var _excludeNotForUI: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'excludePostCoordinated'.
    */
  var _excludePostCoordinated: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'includeDefinition'.
    */
  var _includeDefinition: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'includeDesignations'.
    */
  var _includeDesignations: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'limitedExpansion'.
    */
  var _limitedExpansion: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  /**
    * Include or exclude inactive concepts in the expansion
    */
  var activeOnly: js.UndefOr[Boolean] = js.native
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  /**
    * Natural language description of the expansion profile
    */
  var description: js.UndefOr[markdown] = js.native
  /**
    * When the expansion profile imposes designation contraints
    */
  var designation: js.UndefOr[ExpansionProfileDesignation] = js.native
  /**
    * Specify the language for the display element of codes in the value set expansion
    */
  var displayLanguage: js.UndefOr[code] = js.native
  /**
    * Nested codes in the expansion or not
    */
  var excludeNested: js.UndefOr[Boolean] = js.native
  /**
    * Include or exclude codes which cannot be rendered in user interfaces in the value set expansion
    */
  var excludeNotForUI: js.UndefOr[Boolean] = js.native
  /**
    * Include or exclude codes which are post coordinated expressions in the value set expansion
    */
  var excludePostCoordinated: js.UndefOr[Boolean] = js.native
  /**
    * Systems/Versions to be exclude
    */
  var excludedSystem: js.UndefOr[ExpansionProfileExcludedSystem] = js.native
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  /**
    * Fix use of a code system to a particular version
    */
  var fixedVersion: js.UndefOr[js.Array[ExpansionProfileFixedVersion]] = js.native
  /**
    * Additional identifier for the expansion profile
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Include or exclude the value set definition in the expansion
    */
  var includeDefinition: js.UndefOr[Boolean] = js.native
  /**
    * Whether the expansion should include concept designations
    */
  var includeDesignations: js.UndefOr[Boolean] = js.native
  /**
    * Intended jurisdiction for expansion profile (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Controls behaviour of the value set expand operation when value sets are too large to be completely expanded
    */
  var limitedExpansion: js.UndefOr[Boolean] = js.native
  /**
    * Name for this expansion profile (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  /**
    * Logical URI to reference this expansion profile (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  /**
    * Business version of the expansion profile
    */
  var version: js.UndefOr[String] = js.native
}

object ExpansionProfile {
  @scala.inline
  def apply(status: code): ExpansionProfile = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpansionProfile]
  }
  @scala.inline
  implicit class ExpansionProfileOps[Self <: ExpansionProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_activeOnly(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_activeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_activeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_activeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def with_date(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_date")(js.undefined)
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_displayLanguage(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_displayLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_displayLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_displayLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def with_excludeNested(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludeNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_excludeNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludeNested")(js.undefined)
        ret
    }
    @scala.inline
    def with_excludeNotForUI(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludeNotForUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_excludeNotForUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludeNotForUI")(js.undefined)
        ret
    }
    @scala.inline
    def with_excludePostCoordinated(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludePostCoordinated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_excludePostCoordinated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_excludePostCoordinated")(js.undefined)
        ret
    }
    @scala.inline
    def with_experimental(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_experimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_experimental")(js.undefined)
        ret
    }
    @scala.inline
    def with_includeDefinition(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_includeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_includeDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_includeDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def with_includeDesignations(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_includeDesignations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_includeDesignations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_includeDesignations")(js.undefined)
        ret
    }
    @scala.inline
    def with_limitedExpansion(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_limitedExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_limitedExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_limitedExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_publisher(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_publisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_publisher")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def with_url(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_url")(js.undefined)
        ret
    }
    @scala.inline
    def with_version(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_version")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: js.Array[ContactDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: dateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: markdown): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDesignation(value: ExpansionProfileDesignation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesignation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("designation")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLanguage(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeNested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeNested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNested")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeNotForUI(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNotForUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeNotForUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeNotForUI")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePostCoordinated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePostCoordinated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePostCoordinated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePostCoordinated")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludedSystem(value: ExpansionProfileExcludedSystem): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludedSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withExperimental(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExperimental: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experimental")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedVersion(value: js.Array[ExpansionProfileFixedVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedVersion")(js.undefined)
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
    def withIncludeDefinition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefinition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefinition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefinition")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeDesignations(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDesignations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDesignations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDesignations")(js.undefined)
        ret
    }
    @scala.inline
    def withJurisdiction(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJurisdiction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jurisdiction")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitedExpansion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitedExpansion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitedExpansion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitedExpansion")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPublisher(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublisher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publisher")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUseContext(value: js.Array[UsageContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useContext")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

