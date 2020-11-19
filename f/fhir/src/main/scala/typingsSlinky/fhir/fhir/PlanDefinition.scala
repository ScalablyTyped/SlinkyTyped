package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The definition of a plan for a series of actions, independent of any specific patient or context
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait PlanDefinition extends DomainResource {
  
  /**
    * Contains extended information for property 'approvalDate'.
    */
  var _approvalDate: js.UndefOr[Element] = js.native
  
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
    * Contains extended information for property 'lastReviewDate'.
    */
  var _lastReviewDate: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'usage'.
    */
  var _usage: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.native
  
  /**
    * Action defined by the plan
    */
  var action: js.UndefOr[js.Array[PlanDefinitionAction]] = js.native
  
  /**
    * When the plan definition was approved by publisher
    */
  var approvalDate: js.UndefOr[date] = js.native
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.native
  
  /**
    * A content contributor
    */
  var contributor: js.UndefOr[js.Array[Contributor]] = js.native
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.native
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.native
  
  /**
    * Natural language description of the plan definition
    */
  var description: js.UndefOr[markdown] = js.native
  
  /**
    * When the plan definition is expected to be used
    */
  var effectivePeriod: js.UndefOr[Period] = js.native
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.native
  
  /**
    * What the plan is trying to accomplish
    */
  var goal: js.UndefOr[js.Array[PlanDefinitionGoal]] = js.native
  
  /**
    * Additional identifier for the plan definition
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Intended jurisdiction for plan definition (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * When the plan definition was last reviewed
    */
  var lastReviewDate: js.UndefOr[date] = js.native
  
  /**
    * Logic used by the plan definition
    */
  var library: js.UndefOr[js.Array[Reference]] = js.native
  
  /**
    * Name for this plan definition (computer friendly)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.native
  
  /**
    * Why this plan definition is defined
    */
  var purpose: js.UndefOr[markdown] = js.native
  
  /**
    * Related artifacts for the asset
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.native
  
  /**
    * draft | active | retired | unknown
    */
  var status: code = js.native
  
  /**
    * Name for this plan definition (human friendly)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * E.g. Education, Treatment, Assessment, etc
    */
  var topic: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * order-set | protocol | eca-rule
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Logical URI to reference this plan definition (globally unique)
    */
  var url: js.UndefOr[uri] = js.native
  
  /**
    * Describes the clinical usage of the asset
    */
  var usage: js.UndefOr[String] = js.native
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.native
  
  /**
    * Business version of the plan definition
    */
  var version: js.UndefOr[String] = js.native
}
object PlanDefinition {
  
  @scala.inline
  def apply(status: code): PlanDefinition = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanDefinition]
  }
  
  @scala.inline
  implicit class PlanDefinitionOps[Self <: PlanDefinition] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: code): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_approvalDate(value: Element): Self = this.set("_approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_approvalDate: Self = this.set("_approvalDate", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = this.set("_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_copyright: Self = this.set("_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = this.set("_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_experimental: Self = this.set("_experimental", js.undefined)
    
    @scala.inline
    def set_lastReviewDate(value: Element): Self = this.set("_lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_lastReviewDate: Self = this.set("_lastReviewDate", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = this.set("_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_name: Self = this.set("_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = this.set("_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_publisher: Self = this.set("_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = this.set("_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_purpose: Self = this.set("_purpose", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = this.set("_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_status: Self = this.set("_status", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = this.set("_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_url: Self = this.set("_url", js.undefined)
    
    @scala.inline
    def set_usage(value: Element): Self = this.set("_usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_usage: Self = this.set("_usage", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = this.set("_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_version: Self = this.set("_version", js.undefined)
    
    @scala.inline
    def setActionVarargs(value: PlanDefinitionAction*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[PlanDefinitionAction]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setApprovalDate(value: date): Self = this.set("approvalDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApprovalDate: Self = this.set("approvalDate", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = this.set("contact", js.Array(value :_*))
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    
    @scala.inline
    def setContributorVarargs(value: Contributor*): Self = this.set("contributor", js.Array(value :_*))
    
    @scala.inline
    def setContributor(value: js.Array[Contributor]): Self = this.set("contributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContributor: Self = this.set("contributor", js.undefined)
    
    @scala.inline
    def setCopyright(value: markdown): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEffectivePeriod(value: Period): Self = this.set("effectivePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectivePeriod: Self = this.set("effectivePeriod", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = this.set("experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperimental: Self = this.set("experimental", js.undefined)
    
    @scala.inline
    def setGoalVarargs(value: PlanDefinitionGoal*): Self = this.set("goal", js.Array(value :_*))
    
    @scala.inline
    def setGoal(value: js.Array[PlanDefinitionGoal]): Self = this.set("goal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoal: Self = this.set("goal", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = this.set("jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = this.set("jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJurisdiction: Self = this.set("jurisdiction", js.undefined)
    
    @scala.inline
    def setLastReviewDate(value: date): Self = this.set("lastReviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastReviewDate: Self = this.set("lastReviewDate", js.undefined)
    
    @scala.inline
    def setLibraryVarargs(value: Reference*): Self = this.set("library", js.Array(value :_*))
    
    @scala.inline
    def setLibrary(value: js.Array[Reference]): Self = this.set("library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibrary: Self = this.set("library", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisher: Self = this.set("publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = this.set("purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurpose: Self = this.set("purpose", js.undefined)
    
    @scala.inline
    def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = this.set("relatedArtifact", js.Array(value :_*))
    
    @scala.inline
    def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = this.set("relatedArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedArtifact: Self = this.set("relatedArtifact", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTopicVarargs(value: CodeableConcept*): Self = this.set("topic", js.Array(value :_*))
    
    @scala.inline
    def setTopic(value: js.Array[CodeableConcept]): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setUsage(value: String): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = this.set("useContext", js.Array(value :_*))
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = this.set("useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseContext: Self = this.set("useContext", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
