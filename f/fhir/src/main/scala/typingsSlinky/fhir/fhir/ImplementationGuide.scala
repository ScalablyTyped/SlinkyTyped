package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of rules about how FHIR is used
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ImplementationGuide extends DomainResource {
  
  /**
    * Contains extended information for property 'binary'.
    */
  var _binary: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'fhirVersion'.
    */
  var _fhirVersion: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Group of resources as used in .page.package
    */
  @JSName("package")
  var _package: js.UndefOr[js.Array[ImplementationGuidePackage]] = js.native
  
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
    * Image, css, script, etc.
    */
  var binary: js.UndefOr[js.Array[uri]] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Another Implementation guide this depends on
    */
  var dependency: js.UndefOr[js.Array[ImplementationGuideDependency]] = js.native
  
  /**
    * Natural language description of the implementation guide
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * FHIR Version this Implementation Guide targets
    */
  var fhirVersion: js.UndefOr[id] = js.native
  
  /**
    * Profiles that apply globally
    */
  var global: js.UndefOr[js.Array[ImplementationGuideGlobal]] = js.native
  
  /**
    * Intended jurisdiction for implementation guide (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Name for this implementation guide (computer friendly)
    */
  var name: String = js.native
  
  /**
    * Page/Section in the Guide
    */
  var page: js.UndefOr[ImplementationGuidePage] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Logical URI to reference this implementation guide (globally unique)
    */
  var url: uri = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the implementation guide
    */
  var version: js.UndefOr[String] = js.native
}
object ImplementationGuide {
  
  @scala.inline
  def apply(name: String, status: code, url: uri): ImplementationGuide = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImplementationGuide]
  }
  
  @scala.inline
  implicit class ImplementationGuideMutableBuilder[Self <: ImplementationGuide] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinary(value: js.Array[uri]): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    @scala.inline
    def setBinaryVarargs(value: uri*): Self = StObject.set(x, "binary", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDependency(value: js.Array[ImplementationGuideDependency]): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    @scala.inline
    def setDependencyVarargs(value: ImplementationGuideDependency*): Self = StObject.set(x, "dependency", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setFhirVersion(value: id): Self = StObject.set(x, "fhirVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirVersionUndefined: Self = StObject.set(x, "fhirVersion", js.undefined)
    
    @scala.inline
    def setGlobal(value: js.Array[ImplementationGuideGlobal]): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalUndefined: Self = StObject.set(x, "global", js.undefined)
    
    @scala.inline
    def setGlobalVarargs(value: ImplementationGuideGlobal*): Self = StObject.set(x, "global", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: ImplementationGuidePage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_binary(value: js.Array[Element]): Self = StObject.set(x, "_binary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_binaryUndefined: Self = StObject.set(x, "_binary", js.undefined)
    
    @scala.inline
    def set_binaryVarargs(value: Element*): Self = StObject.set(x, "_binary", js.Array(value :_*))
    
    @scala.inline
    def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_fhirVersion(value: Element): Self = StObject.set(x, "_fhirVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_fhirVersionUndefined: Self = StObject.set(x, "_fhirVersion", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_package(value: js.Array[ImplementationGuidePackage]): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
    
    @scala.inline
    def set_packageVarargs(value: ImplementationGuidePackage*): Self = StObject.set(x, "package", js.Array(value :_*))
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
