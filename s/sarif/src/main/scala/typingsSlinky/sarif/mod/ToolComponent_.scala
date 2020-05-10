package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sarif.mod.ToolComponent.contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolComponent_ extends js.Object {
  /**
    * The component which is strongly associated with this component. For a translation, this refers to the component
    * which has been translated. For an extension, this is the driver that provides the extension's plugin model.
    */
  var associatedComponent: js.UndefOr[ToolComponentReference] = js.native
  /**
    * The kinds of data contained in this object.
    */
  var contents: js.UndefOr[js.Array[contents]] = js.native
  /**
    * The binary version of the tool component's primary executable file expressed as four non-negative integers
    * separated by a period (for operating systems that express file versions in this way).
    */
  var dottedQuadFileVersion: js.UndefOr[String] = js.native
  /**
    * The absolute URI from which the tool component can be downloaded.
    */
  var downloadUri: js.UndefOr[String] = js.native
  /**
    * A comprehensive description of the tool component.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * The name of the tool component along with its version and any other useful identifying information, such as its
    * locale.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * A dictionary, each of whose keys is a resource identifier and each of whose values is a multiformatMessageString
    * object, which holds message strings in plain text and (optionally) Markdown format. The strings can include
    * placeholders, which can be used to construct a message in combination with an arbitrary number of additional
    * string arguments.
    */
  var globalMessageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * A unique identifer for the tool component in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * The absolute URI at which information about this version of the tool component can be found.
    */
  var informationUri: js.UndefOr[String] = js.native
  /**
    * Specifies whether this object contains a complete definition of the localizable and/or non-localizable data for
    * this component, as opposed to including only data that is relevant to the results persisted to this log file.
    */
  var isComprehensive: js.UndefOr[Boolean] = js.native
  /**
    * The language of the messages emitted into the log file during this run (expressed as an ISO 639-1 two-letter
    * lowercase language code) and an optional region (expressed as an ISO 3166-1 two-letter uppercase subculture code
    * associated with a country or region). The casing is recommended but not required (in order for this data to
    * conform to RFC5646).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The semantic version of the localized strings defined in this component; maintained by components that provide
    * translations.
    */
  var localizedDataSemanticVersion: js.UndefOr[String] = js.native
  /**
    * An array of the artifactLocation objects associated with the tool component.
    */
  var locations: js.UndefOr[js.Array[ArtifactLocation]] = js.native
  /**
    * The minimum value of localizedDataSemanticVersion required in translations consumed by this component; used by
    * components that consume translations.
    */
  var minimumRequiredLocalizedDataSemanticVersion: js.UndefOr[String] = js.native
  /**
    * The name of the tool component.
    */
  var name: String = js.native
  /**
    * An array of reportingDescriptor objects relevant to the notifications related to the configuration and runtime
    * execution of the tool component.
    */
  var notifications: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * The organization or company that produced the tool component.
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * A product suite to which the tool component belongs.
    */
  var product: js.UndefOr[String] = js.native
  /**
    * A localizable string containing the name of the suite of products to which the tool component belongs.
    */
  var productSuite: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the tool component.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * A string specifying the UTC date (and optionally, the time) of the component's release.
    */
  var releaseDateUtc: js.UndefOr[String] = js.native
  /**
    * An array of reportingDescriptor objects relevant to the analysis performed by the tool component.
    */
  var rules: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * The tool component version in the format specified by Semantic Versioning 2.0.
    */
  var semanticVersion: js.UndefOr[String] = js.native
  /**
    * A brief description of the tool component.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * An array of toolComponentReference objects to declare the taxonomies supported by the tool component.
    */
  var supportedTaxonomies: js.UndefOr[js.Array[ToolComponentReference]] = js.native
  /**
    * An array of reportingDescriptor objects relevant to the definitions of both standalone and tool-defined
    * taxonomies.
    */
  var taxa: js.UndefOr[js.Array[ReportingDescriptor]] = js.native
  /**
    * Translation metadata, required for a translation, not populated by other component types.
    */
  var translationMetadata: js.UndefOr[TranslationMetadata] = js.native
  /**
    * The tool component version, in whatever format the component natively provides.
    */
  var version: js.UndefOr[String] = js.native
}

object ToolComponent_ {
  @scala.inline
  def apply(name: String): ToolComponent_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolComponent_]
  }
  @scala.inline
  implicit class ToolComponent_Ops[Self <: ToolComponent_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociatedComponent(value: ToolComponentReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociatedComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associatedComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withContents(value: js.Array[contents]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withDottedQuadFileVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dottedQuadFileVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDottedQuadFileVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dottedQuadFileVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUri")(js.undefined)
        ret
    }
    @scala.inline
    def withFullDescription(value: MultiformatMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMessageStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalMessageStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalMessageStrings")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withInformationUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInformationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("informationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIsComprehensive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComprehensive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsComprehensive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isComprehensive")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
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
    def withLocalizedDataSemanticVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedDataSemanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalizedDataSemanticVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("localizedDataSemanticVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[ArtifactLocation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRequiredLocalizedDataSemanticVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredLocalizedDataSemanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRequiredLocalizedDataSemanticVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRequiredLocalizedDataSemanticVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifications(value: js.Array[ReportingDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withProductSuite(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSuite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductSuite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productSuite")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: PropertyBag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDateUtc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDateUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDateUtc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseDateUtc")(js.undefined)
        ret
    }
    @scala.inline
    def withRules(value: js.Array[ReportingDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
    @scala.inline
    def withSemanticVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSemanticVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("semanticVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withShortDescription(value: MultiformatMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedTaxonomies(value: js.Array[ToolComponentReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTaxonomies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedTaxonomies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTaxonomies")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxa(value: js.Array[ReportingDescriptor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxa: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxa")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslationMetadata(value: TranslationMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranslationMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationMetadata")(js.undefined)
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

