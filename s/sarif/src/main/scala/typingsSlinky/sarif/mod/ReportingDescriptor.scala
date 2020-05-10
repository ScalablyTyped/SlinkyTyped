package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingDescriptor extends js.Object {
  /**
    * Default reporting configuration information.
    */
  var defaultConfiguration: js.UndefOr[ReportingConfiguration] = js.native
  /**
    * An array of unique identifies in the form of a GUID by which this report was known in some previous version of
    * the analysis tool.
    */
  var deprecatedGuids: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of stable, opaque identifiers by which this report was known in some previous version of the analysis
    * tool.
    */
  var deprecatedIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * An array of readable identifiers by which this report was known in some previous version of the analysis tool.
    */
  var deprecatedNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A description of the report. Should, as far as possible, provide details sufficient to enable resolution of any
    * problem indicated by the result.
    */
  var fullDescription: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * A unique identifer for the reporting descriptor in the form of a GUID.
    */
  var guid: js.UndefOr[String] = js.native
  /**
    * Provides the primary documentation for the report, useful when there is no online documentation.
    */
  var help: js.UndefOr[MultiformatMessageString] = js.native
  /**
    * A URI where the primary documentation for the report can be found.
    */
  var helpUri: js.UndefOr[String] = js.native
  /**
    * A stable, opaque identifier for the report.
    */
  var id: String = js.native
  /**
    * A set of name/value pairs with arbitrary names. Each value is a multiformatMessageString object, which holds
    * message strings in plain text and (optionally) Markdown format. The strings can include placeholders, which can
    * be used to construct a message in combination with an arbitrary number of additional string arguments.
    */
  var messageStrings: js.UndefOr[StringDictionary[MultiformatMessageString]] = js.native
  /**
    * A report identifier that is understandable to an end user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Key/value pairs that provide additional information about the report.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  /**
    * An array of objects that describe relationships between this reporting descriptor and others.
    */
  var relationships: js.UndefOr[js.Array[ReportingDescriptorRelationship]] = js.native
  /**
    * A concise description of the report. Should be a single sentence that is understandable when visible space is
    * limited to a single line of text.
    */
  var shortDescription: js.UndefOr[MultiformatMessageString] = js.native
}

object ReportingDescriptor {
  @scala.inline
  def apply(id: String): ReportingDescriptor = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportingDescriptor]
  }
  @scala.inline
  implicit class ReportingDescriptorOps[Self <: ReportingDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultConfiguration(value: ReportingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedGuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedGuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedGuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedGuids")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedIds")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedNames")(js.undefined)
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
    def withHelp(value: MultiformatMessageString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("help")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpUri")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStrings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageStrings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageStrings")(js.undefined)
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
    def withRelationships(value: js.Array[ReportingDescriptorRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelationships: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relationships")(js.undefined)
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
  }
  
}

