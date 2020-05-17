package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reference to a sub-type of ResourceBase. This is needed for stricter object literal typing introduced in TypeScript 1.6.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fhir.fhir.DomainResource
  - typingsSlinky.fhir.fhir.Account
  - typingsSlinky.fhir.fhir.ActivityDefinition
  - typingsSlinky.fhir.fhir.AdverseEvent
  - typingsSlinky.fhir.fhir.AllergyIntolerance
  - typingsSlinky.fhir.fhir.Appointment
  - typingsSlinky.fhir.fhir.AppointmentResponse
  - typingsSlinky.fhir.fhir.AuditEvent
  - typingsSlinky.fhir.fhir.Basic
  - typingsSlinky.fhir.fhir.BodySite
  - typingsSlinky.fhir.fhir.CapabilityStatement
  - typingsSlinky.fhir.fhir.CarePlan
  - typingsSlinky.fhir.fhir.CareTeam
  - typingsSlinky.fhir.fhir.ChargeItem
  - typingsSlinky.fhir.fhir.Claim
  - typingsSlinky.fhir.fhir.ClaimResponse
  - typingsSlinky.fhir.fhir.ClinicalImpression
  - typingsSlinky.fhir.fhir.CodeSystem
  - typingsSlinky.fhir.fhir.Communication
  - typingsSlinky.fhir.fhir.CommunicationRequest
  - typingsSlinky.fhir.fhir.CompartmentDefinition
  - typingsSlinky.fhir.fhir.Composition
  - typingsSlinky.fhir.fhir.ConceptMap
  - typingsSlinky.fhir.fhir.Condition
  - typingsSlinky.fhir.fhir.Consent
  - typingsSlinky.fhir.fhir.Contract
  - typingsSlinky.fhir.fhir.Coverage
  - typingsSlinky.fhir.fhir.DataElement
  - typingsSlinky.fhir.fhir.DetectedIssue
  - typingsSlinky.fhir.fhir.Device
  - typingsSlinky.fhir.fhir.DeviceComponent
  - typingsSlinky.fhir.fhir.DeviceMetric
  - typingsSlinky.fhir.fhir.DeviceRequest
  - typingsSlinky.fhir.fhir.DeviceUseStatement
  - typingsSlinky.fhir.fhir.DiagnosticReport
  - typingsSlinky.fhir.fhir.DocumentManifest
  - typingsSlinky.fhir.fhir.DocumentReference
  - typingsSlinky.fhir.fhir.EligibilityRequest
  - typingsSlinky.fhir.fhir.EligibilityResponse
  - typingsSlinky.fhir.fhir.Encounter
  - typingsSlinky.fhir.fhir.Endpoint
  - typingsSlinky.fhir.fhir.EnrollmentRequest
  - typingsSlinky.fhir.fhir.EnrollmentResponse
  - typingsSlinky.fhir.fhir.EpisodeOfCare
  - typingsSlinky.fhir.fhir.ExpansionProfile
  - typingsSlinky.fhir.fhir.ExplanationOfBenefit
  - typingsSlinky.fhir.fhir.FamilyMemberHistory
  - typingsSlinky.fhir.fhir.Flag
  - typingsSlinky.fhir.fhir.Goal
  - typingsSlinky.fhir.fhir.GraphDefinition
  - typingsSlinky.fhir.fhir.Group
  - typingsSlinky.fhir.fhir.GuidanceResponse
  - typingsSlinky.fhir.fhir.HealthcareService
  - typingsSlinky.fhir.fhir.ImagingManifest
  - typingsSlinky.fhir.fhir.ImagingStudy
  - typingsSlinky.fhir.fhir.Immunization
  - typingsSlinky.fhir.fhir.ImmunizationRecommendation
  - typingsSlinky.fhir.fhir.ImplementationGuide
  - typingsSlinky.fhir.fhir.Library
  - typingsSlinky.fhir.fhir.Linkage
  - typingsSlinky.fhir.fhir.List
  - typingsSlinky.fhir.fhir.Location
  - typingsSlinky.fhir.fhir.Measure
  - typingsSlinky.fhir.fhir.MeasureReport
  - typingsSlinky.fhir.fhir.Media
  - typingsSlinky.fhir.fhir.Medication
  - typingsSlinky.fhir.fhir.MedicationAdministration
  - typingsSlinky.fhir.fhir.MedicationDispense
  - typingsSlinky.fhir.fhir.MedicationRequest
  - typingsSlinky.fhir.fhir.MedicationStatement
  - typingsSlinky.fhir.fhir.MessageDefinition
  - typingsSlinky.fhir.fhir.MessageHeader
  - typingsSlinky.fhir.fhir.NamingSystem
  - typingsSlinky.fhir.fhir.NutritionOrder
  - typingsSlinky.fhir.fhir.Observation
  - typingsSlinky.fhir.fhir.OperationDefinition
  - typingsSlinky.fhir.fhir.OperationOutcome
  - typingsSlinky.fhir.fhir.Organization
  - typingsSlinky.fhir.fhir.Patient
  - typingsSlinky.fhir.fhir.PaymentNotice
  - typingsSlinky.fhir.fhir.PaymentReconciliation
  - typingsSlinky.fhir.fhir.Person
  - typingsSlinky.fhir.fhir.PlanDefinition
  - typingsSlinky.fhir.fhir.Practitioner
  - typingsSlinky.fhir.fhir.PractitionerRole
  - typingsSlinky.fhir.fhir.Procedure
  - typingsSlinky.fhir.fhir.ProcedureRequest
  - typingsSlinky.fhir.fhir.ProcessRequest
  - typingsSlinky.fhir.fhir.ProcessResponse
  - typingsSlinky.fhir.fhir.Provenance
  - typingsSlinky.fhir.fhir.Questionnaire
  - typingsSlinky.fhir.fhir.QuestionnaireResponse
  - typingsSlinky.fhir.fhir.ReferralRequest
  - typingsSlinky.fhir.fhir.RelatedPerson
  - typingsSlinky.fhir.fhir.RequestGroup
  - typingsSlinky.fhir.fhir.ResearchStudy
  - typingsSlinky.fhir.fhir.ResearchSubject
  - typingsSlinky.fhir.fhir.RiskAssessment
  - typingsSlinky.fhir.fhir.Schedule
  - typingsSlinky.fhir.fhir.SearchParameter
  - typingsSlinky.fhir.fhir.Sequence
  - typingsSlinky.fhir.fhir.ServiceDefinition
  - typingsSlinky.fhir.fhir.Slot
  - typingsSlinky.fhir.fhir.Specimen
  - typingsSlinky.fhir.fhir.StructureDefinition
  - typingsSlinky.fhir.fhir.StructureMap
  - typingsSlinky.fhir.fhir.Subscription
  - typingsSlinky.fhir.fhir.Substance
  - typingsSlinky.fhir.fhir.SupplyDelivery
  - typingsSlinky.fhir.fhir.SupplyRequest
  - typingsSlinky.fhir.fhir.Task
  - typingsSlinky.fhir.fhir.TestReport
  - typingsSlinky.fhir.fhir.TestScript
  - typingsSlinky.fhir.fhir.ValueSet
  - typingsSlinky.fhir.fhir.VisionPrescription
  - typingsSlinky.fhir.fhir.Binary
  - typingsSlinky.fhir.fhir.Bundle
  - typingsSlinky.fhir.fhir.Parameters
*/
trait Resource extends js.Object

object Resource {
  @scala.inline
  implicit def apply(value: Account): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ActivityDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: AdverseEvent): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: AllergyIntolerance): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Appointment): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: AppointmentResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: AuditEvent): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Basic): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Binary): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: BodySite): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Bundle): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CapabilityStatement): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CarePlan): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CareTeam): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ChargeItem): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Claim): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ClaimResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ClinicalImpression): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CodeSystem): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Communication): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CommunicationRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: CompartmentDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Composition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ConceptMap): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Condition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Consent): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Contract): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Coverage): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DataElement): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DetectedIssue): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Device): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DeviceComponent): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DeviceMetric): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DeviceRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DeviceUseStatement): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DiagnosticReport): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DocumentManifest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DocumentReference): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: DomainResource): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: EligibilityRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: EligibilityResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Encounter): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Endpoint): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: EnrollmentRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: EnrollmentResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: EpisodeOfCare): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ExpansionProfile): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ExplanationOfBenefit): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: FamilyMemberHistory): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Flag): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Goal): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: GraphDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Group): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: GuidanceResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: HealthcareService): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ImagingManifest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ImagingStudy): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Immunization): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ImmunizationRecommendation): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ImplementationGuide): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Library): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Linkage): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: List): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Location): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Measure): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MeasureReport): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Media): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Medication): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MedicationAdministration): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MedicationDispense): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MedicationRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MedicationStatement): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MessageDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: MessageHeader): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: NamingSystem): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: NutritionOrder): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Observation): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: OperationDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: OperationOutcome): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Organization): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Parameters): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Patient): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: PaymentNotice): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: PaymentReconciliation): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Person): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: PlanDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Practitioner): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: PractitionerRole): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Procedure): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ProcedureRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ProcessRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ProcessResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Provenance): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Questionnaire): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: QuestionnaireResponse): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ReferralRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: RelatedPerson): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: RequestGroup): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ResearchStudy): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ResearchSubject): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: RiskAssessment): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Schedule): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: SearchParameter): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Sequence): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ServiceDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Slot): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Specimen): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: StructureDefinition): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: StructureMap): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Subscription): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Substance): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: SupplyDelivery): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: SupplyRequest): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: Task): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: TestReport): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: TestScript): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: ValueSet): Resource = value.asInstanceOf[Resource]
  @scala.inline
  implicit def apply(value: VisionPrescription): Resource = value.asInstanceOf[Resource]
}

