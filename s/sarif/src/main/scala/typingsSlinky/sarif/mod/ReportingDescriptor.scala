package typingsSlinky.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportingDescriptor extends StObject {
  
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
  implicit class ReportingDescriptorMutableBuilder[Self <: ReportingDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultConfiguration(value: ReportingConfiguration): Self = StObject.set(x, "defaultConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfigurationUndefined: Self = StObject.set(x, "defaultConfiguration", js.undefined)
    
    @scala.inline
    def setDeprecatedGuids(value: js.Array[String]): Self = StObject.set(x, "deprecatedGuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedGuidsUndefined: Self = StObject.set(x, "deprecatedGuids", js.undefined)
    
    @scala.inline
    def setDeprecatedGuidsVarargs(value: String*): Self = StObject.set(x, "deprecatedGuids", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedIds(value: js.Array[String]): Self = StObject.set(x, "deprecatedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedIdsUndefined: Self = StObject.set(x, "deprecatedIds", js.undefined)
    
    @scala.inline
    def setDeprecatedIdsVarargs(value: String*): Self = StObject.set(x, "deprecatedIds", js.Array(value :_*))
    
    @scala.inline
    def setDeprecatedNames(value: js.Array[String]): Self = StObject.set(x, "deprecatedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedNamesUndefined: Self = StObject.set(x, "deprecatedNames", js.undefined)
    
    @scala.inline
    def setDeprecatedNamesVarargs(value: String*): Self = StObject.set(x, "deprecatedNames", js.Array(value :_*))
    
    @scala.inline
    def setFullDescription(value: MultiformatMessageString): Self = StObject.set(x, "fullDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDescriptionUndefined: Self = StObject.set(x, "fullDescription", js.undefined)
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidUndefined: Self = StObject.set(x, "guid", js.undefined)
    
    @scala.inline
    def setHelp(value: MultiformatMessageString): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    @scala.inline
    def setHelpUri(value: String): Self = StObject.set(x, "helpUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelpUriUndefined: Self = StObject.set(x, "helpUri", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStrings(value: StringDictionary[MultiformatMessageString]): Self = StObject.set(x, "messageStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStringsUndefined: Self = StObject.set(x, "messageStrings", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setRelationships(value: js.Array[ReportingDescriptorRelationship]): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipsUndefined: Self = StObject.set(x, "relationships", js.undefined)
    
    @scala.inline
    def setRelationshipsVarargs(value: ReportingDescriptorRelationship*): Self = StObject.set(x, "relationships", js.Array(value :_*))
    
    @scala.inline
    def setShortDescription(value: MultiformatMessageString): Self = StObject.set(x, "shortDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDescriptionUndefined: Self = StObject.set(x, "shortDescription", js.undefined)
  }
}
