package typingsSlinky.fhirKitClient.mod

import typingsSlinky.fhir.fhir.Account
import typingsSlinky.fhir.fhir.ActivityDefinition
import typingsSlinky.fhir.fhir.AdverseEvent
import typingsSlinky.fhir.fhir.AllergyIntolerance
import typingsSlinky.fhir.fhir.Appointment
import typingsSlinky.fhir.fhir.AppointmentResponse
import typingsSlinky.fhir.fhir.AuditEvent
import typingsSlinky.fhir.fhir.Basic
import typingsSlinky.fhir.fhir.Binary
import typingsSlinky.fhir.fhir.BodySite
import typingsSlinky.fhir.fhir.Bundle
import typingsSlinky.fhir.fhir.CapabilityStatement
import typingsSlinky.fhir.fhir.CarePlan
import typingsSlinky.fhir.fhir.CareTeam
import typingsSlinky.fhir.fhir.ChargeItem
import typingsSlinky.fhir.fhir.Claim
import typingsSlinky.fhir.fhir.ClaimResponse
import typingsSlinky.fhir.fhir.ClinicalImpression
import typingsSlinky.fhir.fhir.CodeSystem
import typingsSlinky.fhir.fhir.Communication
import typingsSlinky.fhir.fhir.CommunicationRequest
import typingsSlinky.fhir.fhir.CompartmentDefinition
import typingsSlinky.fhir.fhir.Composition
import typingsSlinky.fhir.fhir.ConceptMap
import typingsSlinky.fhir.fhir.Condition
import typingsSlinky.fhir.fhir.Consent
import typingsSlinky.fhir.fhir.Contract
import typingsSlinky.fhir.fhir.Coverage
import typingsSlinky.fhir.fhir.DataElement
import typingsSlinky.fhir.fhir.DetectedIssue
import typingsSlinky.fhir.fhir.Device
import typingsSlinky.fhir.fhir.DeviceComponent
import typingsSlinky.fhir.fhir.DeviceMetric
import typingsSlinky.fhir.fhir.DeviceRequest
import typingsSlinky.fhir.fhir.DeviceUseStatement
import typingsSlinky.fhir.fhir.DiagnosticReport
import typingsSlinky.fhir.fhir.DocumentManifest
import typingsSlinky.fhir.fhir.DocumentReference
import typingsSlinky.fhir.fhir.DomainResource
import typingsSlinky.fhir.fhir.EligibilityRequest
import typingsSlinky.fhir.fhir.EligibilityResponse
import typingsSlinky.fhir.fhir.Encounter
import typingsSlinky.fhir.fhir.Endpoint
import typingsSlinky.fhir.fhir.EnrollmentRequest
import typingsSlinky.fhir.fhir.EnrollmentResponse
import typingsSlinky.fhir.fhir.EpisodeOfCare
import typingsSlinky.fhir.fhir.ExpansionProfile
import typingsSlinky.fhir.fhir.ExplanationOfBenefit
import typingsSlinky.fhir.fhir.FamilyMemberHistory
import typingsSlinky.fhir.fhir.Flag
import typingsSlinky.fhir.fhir.Goal
import typingsSlinky.fhir.fhir.GraphDefinition
import typingsSlinky.fhir.fhir.Group
import typingsSlinky.fhir.fhir.GuidanceResponse
import typingsSlinky.fhir.fhir.HealthcareService
import typingsSlinky.fhir.fhir.ImagingManifest
import typingsSlinky.fhir.fhir.ImagingStudy
import typingsSlinky.fhir.fhir.Immunization
import typingsSlinky.fhir.fhir.ImmunizationRecommendation
import typingsSlinky.fhir.fhir.ImplementationGuide
import typingsSlinky.fhir.fhir.Library
import typingsSlinky.fhir.fhir.Linkage
import typingsSlinky.fhir.fhir.List
import typingsSlinky.fhir.fhir.Location
import typingsSlinky.fhir.fhir.Measure
import typingsSlinky.fhir.fhir.MeasureReport
import typingsSlinky.fhir.fhir.Media
import typingsSlinky.fhir.fhir.Medication
import typingsSlinky.fhir.fhir.MedicationAdministration
import typingsSlinky.fhir.fhir.MedicationDispense
import typingsSlinky.fhir.fhir.MedicationRequest
import typingsSlinky.fhir.fhir.MedicationStatement
import typingsSlinky.fhir.fhir.MessageDefinition
import typingsSlinky.fhir.fhir.MessageHeader
import typingsSlinky.fhir.fhir.NamingSystem
import typingsSlinky.fhir.fhir.NutritionOrder
import typingsSlinky.fhir.fhir.Observation
import typingsSlinky.fhir.fhir.OperationDefinition
import typingsSlinky.fhir.fhir.OperationOutcome
import typingsSlinky.fhir.fhir.Organization
import typingsSlinky.fhir.fhir.Parameters
import typingsSlinky.fhir.fhir.Patient
import typingsSlinky.fhir.fhir.PaymentNotice
import typingsSlinky.fhir.fhir.PaymentReconciliation
import typingsSlinky.fhir.fhir.Person
import typingsSlinky.fhir.fhir.PlanDefinition
import typingsSlinky.fhir.fhir.Practitioner
import typingsSlinky.fhir.fhir.PractitionerRole
import typingsSlinky.fhir.fhir.Procedure
import typingsSlinky.fhir.fhir.ProcedureRequest
import typingsSlinky.fhir.fhir.ProcessRequest
import typingsSlinky.fhir.fhir.ProcessResponse
import typingsSlinky.fhir.fhir.Provenance
import typingsSlinky.fhir.fhir.Questionnaire
import typingsSlinky.fhir.fhir.QuestionnaireResponse
import typingsSlinky.fhir.fhir.ReferralRequest
import typingsSlinky.fhir.fhir.RelatedPerson
import typingsSlinky.fhir.fhir.RequestGroup
import typingsSlinky.fhir.fhir.ResearchStudy
import typingsSlinky.fhir.fhir.ResearchSubject
import typingsSlinky.fhir.fhir.RiskAssessment
import typingsSlinky.fhir.fhir.Schedule
import typingsSlinky.fhir.fhir.SearchParameter
import typingsSlinky.fhir.fhir.Sequence
import typingsSlinky.fhir.fhir.ServiceDefinition
import typingsSlinky.fhir.fhir.Slot
import typingsSlinky.fhir.fhir.Specimen
import typingsSlinky.fhir.fhir.StructureDefinition
import typingsSlinky.fhir.fhir.StructureMap
import typingsSlinky.fhir.fhir.Subscription
import typingsSlinky.fhir.fhir.Substance
import typingsSlinky.fhir.fhir.SupplyDelivery
import typingsSlinky.fhir.fhir.SupplyRequest
import typingsSlinky.fhir.fhir.Task
import typingsSlinky.fhir.fhir.TestReport
import typingsSlinky.fhir.fhir.TestScript
import typingsSlinky.fhir.fhir.ValueSet
import typingsSlinky.fhir.fhir.VisionPrescription
import typingsSlinky.fhirKitClient.anon.Body
import typingsSlinky.fhirKitClient.anon.BodyAllergyIntolerance
import typingsSlinky.fhirKitClient.anon.BodyAppointment
import typingsSlinky.fhirKitClient.anon.BodyAppointmentResponse
import typingsSlinky.fhirKitClient.anon.BodyAuditEvent
import typingsSlinky.fhirKitClient.anon.BodyAuditEventHeaders
import typingsSlinky.fhirKitClient.anon.BodyBasic
import typingsSlinky.fhirKitClient.anon.BodyBasicHeaders
import typingsSlinky.fhirKitClient.anon.BodyBinary
import typingsSlinky.fhirKitClient.anon.BodyBinaryHeaders
import typingsSlinky.fhirKitClient.anon.BodyBodySite
import typingsSlinky.fhirKitClient.anon.BodyBodySiteHeaders
import typingsSlinky.fhirKitClient.anon.BodyBundle
import typingsSlinky.fhirKitClient.anon.BodyBundleHeaders
import typingsSlinky.fhirKitClient.anon.BodyBundletypebatch
import typingsSlinky.fhirKitClient.anon.BodyBundletypetransaction
import typingsSlinky.fhirKitClient.anon.BodyCapabilityStatement
import typingsSlinky.fhirKitClient.anon.BodyCapabilityStatementHeaders
import typingsSlinky.fhirKitClient.anon.BodyCarePlan
import typingsSlinky.fhirKitClient.anon.BodyCarePlanHeaders
import typingsSlinky.fhirKitClient.anon.BodyCareTeam
import typingsSlinky.fhirKitClient.anon.BodyCareTeamHeaders
import typingsSlinky.fhirKitClient.anon.BodyChargeItem
import typingsSlinky.fhirKitClient.anon.BodyChargeItemHeaders
import typingsSlinky.fhirKitClient.anon.BodyClaim
import typingsSlinky.fhirKitClient.anon.BodyClaimHeaders
import typingsSlinky.fhirKitClient.anon.BodyClaimResponse
import typingsSlinky.fhirKitClient.anon.BodyClaimResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyClinicalImpression
import typingsSlinky.fhirKitClient.anon.BodyClinicalImpressionHeaders
import typingsSlinky.fhirKitClient.anon.BodyCodeSystem
import typingsSlinky.fhirKitClient.anon.BodyCodeSystemHeaders
import typingsSlinky.fhirKitClient.anon.BodyCommunication
import typingsSlinky.fhirKitClient.anon.BodyCommunicationHeaders
import typingsSlinky.fhirKitClient.anon.BodyCommunicationRequest
import typingsSlinky.fhirKitClient.anon.BodyCommunicationRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyCompartmentDefinition
import typingsSlinky.fhirKitClient.anon.BodyCompartmentDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyComposition
import typingsSlinky.fhirKitClient.anon.BodyCompositionHeaders
import typingsSlinky.fhirKitClient.anon.BodyConceptMap
import typingsSlinky.fhirKitClient.anon.BodyConceptMapHeaders
import typingsSlinky.fhirKitClient.anon.BodyCondition
import typingsSlinky.fhirKitClient.anon.BodyConditionHeaders
import typingsSlinky.fhirKitClient.anon.BodyConsent
import typingsSlinky.fhirKitClient.anon.BodyConsentHeaders
import typingsSlinky.fhirKitClient.anon.BodyContract
import typingsSlinky.fhirKitClient.anon.BodyContractHeaders
import typingsSlinky.fhirKitClient.anon.BodyCoverage
import typingsSlinky.fhirKitClient.anon.BodyCoverageHeaders
import typingsSlinky.fhirKitClient.anon.BodyDataElement
import typingsSlinky.fhirKitClient.anon.BodyDataElementHeaders
import typingsSlinky.fhirKitClient.anon.BodyDetectedIssue
import typingsSlinky.fhirKitClient.anon.BodyDetectedIssueHeaders
import typingsSlinky.fhirKitClient.anon.BodyDevice
import typingsSlinky.fhirKitClient.anon.BodyDeviceComponent
import typingsSlinky.fhirKitClient.anon.BodyDeviceComponentHeaders
import typingsSlinky.fhirKitClient.anon.BodyDeviceHeaders
import typingsSlinky.fhirKitClient.anon.BodyDeviceMetric
import typingsSlinky.fhirKitClient.anon.BodyDeviceMetricHeaders
import typingsSlinky.fhirKitClient.anon.BodyDeviceRequest
import typingsSlinky.fhirKitClient.anon.BodyDeviceRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyDeviceUseStatement
import typingsSlinky.fhirKitClient.anon.BodyDeviceUseStatementHeaders
import typingsSlinky.fhirKitClient.anon.BodyDiagnosticReport
import typingsSlinky.fhirKitClient.anon.BodyDiagnosticReportHeaders
import typingsSlinky.fhirKitClient.anon.BodyDocumentManifest
import typingsSlinky.fhirKitClient.anon.BodyDocumentManifestHeaders
import typingsSlinky.fhirKitClient.anon.BodyDocumentReference
import typingsSlinky.fhirKitClient.anon.BodyDocumentReferenceHeaders
import typingsSlinky.fhirKitClient.anon.BodyDomainResource
import typingsSlinky.fhirKitClient.anon.BodyDomainResourceHeaders
import typingsSlinky.fhirKitClient.anon.BodyEligibilityRequest
import typingsSlinky.fhirKitClient.anon.BodyEligibilityRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyEligibilityResponse
import typingsSlinky.fhirKitClient.anon.BodyEligibilityResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyEncounter
import typingsSlinky.fhirKitClient.anon.BodyEncounterHeaders
import typingsSlinky.fhirKitClient.anon.BodyEndpoint
import typingsSlinky.fhirKitClient.anon.BodyEndpointHeaders
import typingsSlinky.fhirKitClient.anon.BodyEnrollmentRequest
import typingsSlinky.fhirKitClient.anon.BodyEnrollmentRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyEnrollmentResponse
import typingsSlinky.fhirKitClient.anon.BodyEnrollmentResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyEpisodeOfCare
import typingsSlinky.fhirKitClient.anon.BodyEpisodeOfCareHeaders
import typingsSlinky.fhirKitClient.anon.BodyExpansionProfile
import typingsSlinky.fhirKitClient.anon.BodyExpansionProfileHeaders
import typingsSlinky.fhirKitClient.anon.BodyExplanationOfBenefit
import typingsSlinky.fhirKitClient.anon.BodyExplanationOfBenefitHeaders
import typingsSlinky.fhirKitClient.anon.BodyFamilyMemberHistory
import typingsSlinky.fhirKitClient.anon.BodyFamilyMemberHistoryHeaders
import typingsSlinky.fhirKitClient.anon.BodyFlag
import typingsSlinky.fhirKitClient.anon.BodyFlagHeaders
import typingsSlinky.fhirKitClient.anon.BodyGoal
import typingsSlinky.fhirKitClient.anon.BodyGoalHeaders
import typingsSlinky.fhirKitClient.anon.BodyGraphDefinition
import typingsSlinky.fhirKitClient.anon.BodyGraphDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyGroup
import typingsSlinky.fhirKitClient.anon.BodyGroupHeaders
import typingsSlinky.fhirKitClient.anon.BodyGuidanceResponse
import typingsSlinky.fhirKitClient.anon.BodyGuidanceResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyHeaders
import typingsSlinky.fhirKitClient.anon.BodyHeadersId
import typingsSlinky.fhirKitClient.anon.BodyHeadersIdOptions
import typingsSlinky.fhirKitClient.anon.BodyHeadersIdOptionsResourceType
import typingsSlinky.fhirKitClient.anon.BodyHeadersOptions
import typingsSlinky.fhirKitClient.anon.BodyHeadersOptionsResourceType
import typingsSlinky.fhirKitClient.anon.BodyHealthcareService
import typingsSlinky.fhirKitClient.anon.BodyHealthcareServiceHeaders
import typingsSlinky.fhirKitClient.anon.BodyImagingManifest
import typingsSlinky.fhirKitClient.anon.BodyImagingManifestHeaders
import typingsSlinky.fhirKitClient.anon.BodyImagingStudy
import typingsSlinky.fhirKitClient.anon.BodyImagingStudyHeaders
import typingsSlinky.fhirKitClient.anon.BodyImmunization
import typingsSlinky.fhirKitClient.anon.BodyImmunizationHeaders
import typingsSlinky.fhirKitClient.anon.BodyImmunizationRecommendation
import typingsSlinky.fhirKitClient.anon.BodyImmunizationRecommendationHeaders
import typingsSlinky.fhirKitClient.anon.BodyImplementationGuide
import typingsSlinky.fhirKitClient.anon.BodyImplementationGuideHeaders
import typingsSlinky.fhirKitClient.anon.BodyLibrary
import typingsSlinky.fhirKitClient.anon.BodyLibraryHeaders
import typingsSlinky.fhirKitClient.anon.BodyLinkage
import typingsSlinky.fhirKitClient.anon.BodyLinkageHeaders
import typingsSlinky.fhirKitClient.anon.BodyList
import typingsSlinky.fhirKitClient.anon.BodyListHeaders
import typingsSlinky.fhirKitClient.anon.BodyLocation
import typingsSlinky.fhirKitClient.anon.BodyLocationHeaders
import typingsSlinky.fhirKitClient.anon.BodyMeasure
import typingsSlinky.fhirKitClient.anon.BodyMeasureHeaders
import typingsSlinky.fhirKitClient.anon.BodyMeasureReport
import typingsSlinky.fhirKitClient.anon.BodyMeasureReportHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedia
import typingsSlinky.fhirKitClient.anon.BodyMediaHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedication
import typingsSlinky.fhirKitClient.anon.BodyMedicationAdministration
import typingsSlinky.fhirKitClient.anon.BodyMedicationAdministrationHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedicationDispense
import typingsSlinky.fhirKitClient.anon.BodyMedicationDispenseHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedicationHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedicationRequest
import typingsSlinky.fhirKitClient.anon.BodyMedicationRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyMedicationStatement
import typingsSlinky.fhirKitClient.anon.BodyMedicationStatementHeaders
import typingsSlinky.fhirKitClient.anon.BodyMessageDefinition
import typingsSlinky.fhirKitClient.anon.BodyMessageDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyMessageHeader
import typingsSlinky.fhirKitClient.anon.BodyMessageHeaderHeaders
import typingsSlinky.fhirKitClient.anon.BodyNamingSystem
import typingsSlinky.fhirKitClient.anon.BodyNamingSystemHeaders
import typingsSlinky.fhirKitClient.anon.BodyNutritionOrder
import typingsSlinky.fhirKitClient.anon.BodyNutritionOrderHeaders
import typingsSlinky.fhirKitClient.anon.BodyObservation
import typingsSlinky.fhirKitClient.anon.BodyObservationHeaders
import typingsSlinky.fhirKitClient.anon.BodyOperationDefinition
import typingsSlinky.fhirKitClient.anon.BodyOperationDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyOperationOutcome
import typingsSlinky.fhirKitClient.anon.BodyOperationOutcomeHeaders
import typingsSlinky.fhirKitClient.anon.BodyOrganization
import typingsSlinky.fhirKitClient.anon.BodyOrganizationHeaders
import typingsSlinky.fhirKitClient.anon.BodyParameters
import typingsSlinky.fhirKitClient.anon.BodyParametersHeaders
import typingsSlinky.fhirKitClient.anon.BodyPatient
import typingsSlinky.fhirKitClient.anon.BodyPatientHeaders
import typingsSlinky.fhirKitClient.anon.BodyPaymentNotice
import typingsSlinky.fhirKitClient.anon.BodyPaymentNoticeHeaders
import typingsSlinky.fhirKitClient.anon.BodyPaymentReconciliation
import typingsSlinky.fhirKitClient.anon.BodyPaymentReconciliationHeaders
import typingsSlinky.fhirKitClient.anon.BodyPerson
import typingsSlinky.fhirKitClient.anon.BodyPersonHeaders
import typingsSlinky.fhirKitClient.anon.BodyPlanDefinition
import typingsSlinky.fhirKitClient.anon.BodyPlanDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyPractitioner
import typingsSlinky.fhirKitClient.anon.BodyPractitionerHeaders
import typingsSlinky.fhirKitClient.anon.BodyPractitionerRole
import typingsSlinky.fhirKitClient.anon.BodyPractitionerRoleHeaders
import typingsSlinky.fhirKitClient.anon.BodyProcedure
import typingsSlinky.fhirKitClient.anon.BodyProcedureHeaders
import typingsSlinky.fhirKitClient.anon.BodyProcedureRequest
import typingsSlinky.fhirKitClient.anon.BodyProcedureRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyProcessRequest
import typingsSlinky.fhirKitClient.anon.BodyProcessRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyProcessResponse
import typingsSlinky.fhirKitClient.anon.BodyProcessResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyProvenance
import typingsSlinky.fhirKitClient.anon.BodyProvenanceHeaders
import typingsSlinky.fhirKitClient.anon.BodyQuestionnaire
import typingsSlinky.fhirKitClient.anon.BodyQuestionnaireHeaders
import typingsSlinky.fhirKitClient.anon.BodyQuestionnaireResponse
import typingsSlinky.fhirKitClient.anon.BodyQuestionnaireResponseHeaders
import typingsSlinky.fhirKitClient.anon.BodyReferralRequest
import typingsSlinky.fhirKitClient.anon.BodyReferralRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyRelatedPerson
import typingsSlinky.fhirKitClient.anon.BodyRelatedPersonHeaders
import typingsSlinky.fhirKitClient.anon.BodyRequestGroup
import typingsSlinky.fhirKitClient.anon.BodyRequestGroupHeaders
import typingsSlinky.fhirKitClient.anon.BodyResearchStudy
import typingsSlinky.fhirKitClient.anon.BodyResearchStudyHeaders
import typingsSlinky.fhirKitClient.anon.BodyResearchSubject
import typingsSlinky.fhirKitClient.anon.BodyResearchSubjectHeaders
import typingsSlinky.fhirKitClient.anon.BodyRiskAssessment
import typingsSlinky.fhirKitClient.anon.BodyRiskAssessmentHeaders
import typingsSlinky.fhirKitClient.anon.BodySchedule
import typingsSlinky.fhirKitClient.anon.BodyScheduleHeaders
import typingsSlinky.fhirKitClient.anon.BodySearchParameter
import typingsSlinky.fhirKitClient.anon.BodySearchParameterHeaders
import typingsSlinky.fhirKitClient.anon.BodySequence
import typingsSlinky.fhirKitClient.anon.BodySequenceHeaders
import typingsSlinky.fhirKitClient.anon.BodyServiceDefinition
import typingsSlinky.fhirKitClient.anon.BodyServiceDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodySlot
import typingsSlinky.fhirKitClient.anon.BodySlotHeaders
import typingsSlinky.fhirKitClient.anon.BodySpecimen
import typingsSlinky.fhirKitClient.anon.BodySpecimenHeaders
import typingsSlinky.fhirKitClient.anon.BodyStructureDefinition
import typingsSlinky.fhirKitClient.anon.BodyStructureDefinitionHeaders
import typingsSlinky.fhirKitClient.anon.BodyStructureMap
import typingsSlinky.fhirKitClient.anon.BodyStructureMapHeaders
import typingsSlinky.fhirKitClient.anon.BodySubscription
import typingsSlinky.fhirKitClient.anon.BodySubscriptionHeaders
import typingsSlinky.fhirKitClient.anon.BodySubstance
import typingsSlinky.fhirKitClient.anon.BodySubstanceHeaders
import typingsSlinky.fhirKitClient.anon.BodySupplyDelivery
import typingsSlinky.fhirKitClient.anon.BodySupplyDeliveryHeaders
import typingsSlinky.fhirKitClient.anon.BodySupplyRequest
import typingsSlinky.fhirKitClient.anon.BodySupplyRequestHeaders
import typingsSlinky.fhirKitClient.anon.BodyT
import typingsSlinky.fhirKitClient.anon.BodyTHeaders
import typingsSlinky.fhirKitClient.anon.BodyTask
import typingsSlinky.fhirKitClient.anon.BodyTaskHeaders
import typingsSlinky.fhirKitClient.anon.BodyTestReport
import typingsSlinky.fhirKitClient.anon.BodyTestReportHeaders
import typingsSlinky.fhirKitClient.anon.BodyTestScript
import typingsSlinky.fhirKitClient.anon.BodyTestScriptHeaders
import typingsSlinky.fhirKitClient.anon.BodyValueSet
import typingsSlinky.fhirKitClient.anon.BodyValueSetHeaders
import typingsSlinky.fhirKitClient.anon.BodyVisionPrescription
import typingsSlinky.fhirKitClient.anon.BodyVisionPrescriptionHeaders
import typingsSlinky.fhirKitClient.anon.Bundletypebatchresponse
import typingsSlinky.fhirKitClient.anon.Bundletypehistory
import typingsSlinky.fhirKitClient.anon.Bundletypesearchset
import typingsSlinky.fhirKitClient.anon.Bundletypetransactionresp
import typingsSlinky.fhirKitClient.anon.CompartmentHeaders
import typingsSlinky.fhirKitClient.anon.Context
import typingsSlinky.fhirKitClient.anon.HeadersId
import typingsSlinky.fhirKitClient.anon.HeadersIdJSONPatch
import typingsSlinky.fhirKitClient.anon.HeadersIdJSONPatchOptions
import typingsSlinky.fhirKitClient.anon.HeadersIdJSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.anon.HeadersIdOptions
import typingsSlinky.fhirKitClient.anon.HeadersIdOptionsResourceType
import typingsSlinky.fhirKitClient.anon.HeadersIdOptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.anon.HeadersIdString
import typingsSlinky.fhirKitClient.anon.HeadersIdStringJSONPatchArray
import typingsSlinky.fhirKitClient.anon.HeadersIdStringJSONPatchArrayOptions
import typingsSlinky.fhirKitClient.anon.HeadersIdStringJSONPatchArrayOptionsResourceType
import typingsSlinky.fhirKitClient.anon.HeadersIdStringOptions
import typingsSlinky.fhirKitClient.anon.HeadersIdStringOptionsResourceType
import typingsSlinky.fhirKitClient.anon.HeadersIdStringOptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.anon.HeadersOptions
import typingsSlinky.fhirKitClient.anon.HeadersOptionsResourceType
import typingsSlinky.fhirKitClient.anon.Id
import typingsSlinky.fhirKitClient.anon.IdJSONPatch
import typingsSlinky.fhirKitClient.anon.IdJSONPatchOptions
import typingsSlinky.fhirKitClient.anon.IdJSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.anon.IdOptions
import typingsSlinky.fhirKitClient.anon.IdOptionsResourceType
import typingsSlinky.fhirKitClient.anon.IdOptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.anon.IdString
import typingsSlinky.fhirKitClient.anon.IdStringJSONPatchArray
import typingsSlinky.fhirKitClient.anon.IdStringJSONPatchArrayOptions
import typingsSlinky.fhirKitClient.anon.IdStringJSONPatchArrayOptionsResourceType
import typingsSlinky.fhirKitClient.anon.IdStringOptions
import typingsSlinky.fhirKitClient.anon.IdStringOptionsResourceType
import typingsSlinky.fhirKitClient.anon.IdStringOptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.anon.JSONPatch
import typingsSlinky.fhirKitClient.anon.JSONPatchArray
import typingsSlinky.fhirKitClient.anon.JSONPatchArrayOptions
import typingsSlinky.fhirKitClient.anon.JSONPatchArrayOptionsResourceType
import typingsSlinky.fhirKitClient.anon.JSONPatchArrayOptionsResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.anon.JSONPatchOptions
import typingsSlinky.fhirKitClient.anon.JSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.anon.Options
import typingsSlinky.fhirKitClient.anon.OptionsResourceType
import typingsSlinky.fhirKitClient.anon.OptionsResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.anon.OptionsResourceTypeResourceType
import typingsSlinky.fhirKitClient.anon.OptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.anon.OptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.anon.OptionsSearchParams
import typingsSlinky.fhirKitClient.anon.ResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.anon.ResourceTypeResourceType
import typingsSlinky.fhirKitClient.anon.ResourceTypeVersion
import typingsSlinky.fhirKitClient.anon.ResourceTypeVersionString
import typingsSlinky.fhirKitClient.anon.Type
import typingsSlinky.fhirKitClient.anon.Version
import typingsSlinky.fhirKitClient.anon.VersionString
import typingsSlinky.fhirKitClient.anon.`0`
import typingsSlinky.fhirKitClient.anon.`100`
import typingsSlinky.fhirKitClient.anon.`101`
import typingsSlinky.fhirKitClient.anon.`102`
import typingsSlinky.fhirKitClient.anon.`103`
import typingsSlinky.fhirKitClient.anon.`104`
import typingsSlinky.fhirKitClient.anon.`105`
import typingsSlinky.fhirKitClient.anon.`106`
import typingsSlinky.fhirKitClient.anon.`107`
import typingsSlinky.fhirKitClient.anon.`108`
import typingsSlinky.fhirKitClient.anon.`109`
import typingsSlinky.fhirKitClient.anon.`10`
import typingsSlinky.fhirKitClient.anon.`110`
import typingsSlinky.fhirKitClient.anon.`111`
import typingsSlinky.fhirKitClient.anon.`112`
import typingsSlinky.fhirKitClient.anon.`113`
import typingsSlinky.fhirKitClient.anon.`114`
import typingsSlinky.fhirKitClient.anon.`115`
import typingsSlinky.fhirKitClient.anon.`116`
import typingsSlinky.fhirKitClient.anon.`117`
import typingsSlinky.fhirKitClient.anon.`118`
import typingsSlinky.fhirKitClient.anon.`119`
import typingsSlinky.fhirKitClient.anon.`11`
import typingsSlinky.fhirKitClient.anon.`120`
import typingsSlinky.fhirKitClient.anon.`121`
import typingsSlinky.fhirKitClient.anon.`122`
import typingsSlinky.fhirKitClient.anon.`123`
import typingsSlinky.fhirKitClient.anon.`124`
import typingsSlinky.fhirKitClient.anon.`125`
import typingsSlinky.fhirKitClient.anon.`126`
import typingsSlinky.fhirKitClient.anon.`127`
import typingsSlinky.fhirKitClient.anon.`128`
import typingsSlinky.fhirKitClient.anon.`129`
import typingsSlinky.fhirKitClient.anon.`12`
import typingsSlinky.fhirKitClient.anon.`130`
import typingsSlinky.fhirKitClient.anon.`131`
import typingsSlinky.fhirKitClient.anon.`132`
import typingsSlinky.fhirKitClient.anon.`133`
import typingsSlinky.fhirKitClient.anon.`134`
import typingsSlinky.fhirKitClient.anon.`135`
import typingsSlinky.fhirKitClient.anon.`136`
import typingsSlinky.fhirKitClient.anon.`137`
import typingsSlinky.fhirKitClient.anon.`138`
import typingsSlinky.fhirKitClient.anon.`139`
import typingsSlinky.fhirKitClient.anon.`13`
import typingsSlinky.fhirKitClient.anon.`140`
import typingsSlinky.fhirKitClient.anon.`141`
import typingsSlinky.fhirKitClient.anon.`142`
import typingsSlinky.fhirKitClient.anon.`143`
import typingsSlinky.fhirKitClient.anon.`144`
import typingsSlinky.fhirKitClient.anon.`145`
import typingsSlinky.fhirKitClient.anon.`146`
import typingsSlinky.fhirKitClient.anon.`147`
import typingsSlinky.fhirKitClient.anon.`148`
import typingsSlinky.fhirKitClient.anon.`149`
import typingsSlinky.fhirKitClient.anon.`14`
import typingsSlinky.fhirKitClient.anon.`150`
import typingsSlinky.fhirKitClient.anon.`151`
import typingsSlinky.fhirKitClient.anon.`152`
import typingsSlinky.fhirKitClient.anon.`153`
import typingsSlinky.fhirKitClient.anon.`154`
import typingsSlinky.fhirKitClient.anon.`155`
import typingsSlinky.fhirKitClient.anon.`156`
import typingsSlinky.fhirKitClient.anon.`157`
import typingsSlinky.fhirKitClient.anon.`158`
import typingsSlinky.fhirKitClient.anon.`159`
import typingsSlinky.fhirKitClient.anon.`15`
import typingsSlinky.fhirKitClient.anon.`160`
import typingsSlinky.fhirKitClient.anon.`161`
import typingsSlinky.fhirKitClient.anon.`162`
import typingsSlinky.fhirKitClient.anon.`163`
import typingsSlinky.fhirKitClient.anon.`164`
import typingsSlinky.fhirKitClient.anon.`165`
import typingsSlinky.fhirKitClient.anon.`166`
import typingsSlinky.fhirKitClient.anon.`167`
import typingsSlinky.fhirKitClient.anon.`168`
import typingsSlinky.fhirKitClient.anon.`169`
import typingsSlinky.fhirKitClient.anon.`16`
import typingsSlinky.fhirKitClient.anon.`170`
import typingsSlinky.fhirKitClient.anon.`171`
import typingsSlinky.fhirKitClient.anon.`172`
import typingsSlinky.fhirKitClient.anon.`173`
import typingsSlinky.fhirKitClient.anon.`174`
import typingsSlinky.fhirKitClient.anon.`175`
import typingsSlinky.fhirKitClient.anon.`176`
import typingsSlinky.fhirKitClient.anon.`177`
import typingsSlinky.fhirKitClient.anon.`178`
import typingsSlinky.fhirKitClient.anon.`179`
import typingsSlinky.fhirKitClient.anon.`17`
import typingsSlinky.fhirKitClient.anon.`180`
import typingsSlinky.fhirKitClient.anon.`181`
import typingsSlinky.fhirKitClient.anon.`182`
import typingsSlinky.fhirKitClient.anon.`183`
import typingsSlinky.fhirKitClient.anon.`184`
import typingsSlinky.fhirKitClient.anon.`185`
import typingsSlinky.fhirKitClient.anon.`186`
import typingsSlinky.fhirKitClient.anon.`187`
import typingsSlinky.fhirKitClient.anon.`188`
import typingsSlinky.fhirKitClient.anon.`189`
import typingsSlinky.fhirKitClient.anon.`18`
import typingsSlinky.fhirKitClient.anon.`190`
import typingsSlinky.fhirKitClient.anon.`191`
import typingsSlinky.fhirKitClient.anon.`192`
import typingsSlinky.fhirKitClient.anon.`193`
import typingsSlinky.fhirKitClient.anon.`194`
import typingsSlinky.fhirKitClient.anon.`195`
import typingsSlinky.fhirKitClient.anon.`196`
import typingsSlinky.fhirKitClient.anon.`197`
import typingsSlinky.fhirKitClient.anon.`198`
import typingsSlinky.fhirKitClient.anon.`199`
import typingsSlinky.fhirKitClient.anon.`19`
import typingsSlinky.fhirKitClient.anon.`1`
import typingsSlinky.fhirKitClient.anon.`200`
import typingsSlinky.fhirKitClient.anon.`201`
import typingsSlinky.fhirKitClient.anon.`202`
import typingsSlinky.fhirKitClient.anon.`203`
import typingsSlinky.fhirKitClient.anon.`204`
import typingsSlinky.fhirKitClient.anon.`205`
import typingsSlinky.fhirKitClient.anon.`206`
import typingsSlinky.fhirKitClient.anon.`207`
import typingsSlinky.fhirKitClient.anon.`208`
import typingsSlinky.fhirKitClient.anon.`209`
import typingsSlinky.fhirKitClient.anon.`20`
import typingsSlinky.fhirKitClient.anon.`210`
import typingsSlinky.fhirKitClient.anon.`211`
import typingsSlinky.fhirKitClient.anon.`212`
import typingsSlinky.fhirKitClient.anon.`213`
import typingsSlinky.fhirKitClient.anon.`214`
import typingsSlinky.fhirKitClient.anon.`215`
import typingsSlinky.fhirKitClient.anon.`216`
import typingsSlinky.fhirKitClient.anon.`217`
import typingsSlinky.fhirKitClient.anon.`218`
import typingsSlinky.fhirKitClient.anon.`219`
import typingsSlinky.fhirKitClient.anon.`21`
import typingsSlinky.fhirKitClient.anon.`220`
import typingsSlinky.fhirKitClient.anon.`221`
import typingsSlinky.fhirKitClient.anon.`222`
import typingsSlinky.fhirKitClient.anon.`223`
import typingsSlinky.fhirKitClient.anon.`224`
import typingsSlinky.fhirKitClient.anon.`225`
import typingsSlinky.fhirKitClient.anon.`226`
import typingsSlinky.fhirKitClient.anon.`227`
import typingsSlinky.fhirKitClient.anon.`228`
import typingsSlinky.fhirKitClient.anon.`229`
import typingsSlinky.fhirKitClient.anon.`22`
import typingsSlinky.fhirKitClient.anon.`230`
import typingsSlinky.fhirKitClient.anon.`231`
import typingsSlinky.fhirKitClient.anon.`232`
import typingsSlinky.fhirKitClient.anon.`233`
import typingsSlinky.fhirKitClient.anon.`234`
import typingsSlinky.fhirKitClient.anon.`235`
import typingsSlinky.fhirKitClient.anon.`236`
import typingsSlinky.fhirKitClient.anon.`237`
import typingsSlinky.fhirKitClient.anon.`238`
import typingsSlinky.fhirKitClient.anon.`239`
import typingsSlinky.fhirKitClient.anon.`23`
import typingsSlinky.fhirKitClient.anon.`240`
import typingsSlinky.fhirKitClient.anon.`241`
import typingsSlinky.fhirKitClient.anon.`242`
import typingsSlinky.fhirKitClient.anon.`243`
import typingsSlinky.fhirKitClient.anon.`244`
import typingsSlinky.fhirKitClient.anon.`245`
import typingsSlinky.fhirKitClient.anon.`246`
import typingsSlinky.fhirKitClient.anon.`247`
import typingsSlinky.fhirKitClient.anon.`248`
import typingsSlinky.fhirKitClient.anon.`249`
import typingsSlinky.fhirKitClient.anon.`24`
import typingsSlinky.fhirKitClient.anon.`250`
import typingsSlinky.fhirKitClient.anon.`251`
import typingsSlinky.fhirKitClient.anon.`252`
import typingsSlinky.fhirKitClient.anon.`253`
import typingsSlinky.fhirKitClient.anon.`254`
import typingsSlinky.fhirKitClient.anon.`255`
import typingsSlinky.fhirKitClient.anon.`256`
import typingsSlinky.fhirKitClient.anon.`257`
import typingsSlinky.fhirKitClient.anon.`258`
import typingsSlinky.fhirKitClient.anon.`259`
import typingsSlinky.fhirKitClient.anon.`25`
import typingsSlinky.fhirKitClient.anon.`260`
import typingsSlinky.fhirKitClient.anon.`261`
import typingsSlinky.fhirKitClient.anon.`262`
import typingsSlinky.fhirKitClient.anon.`263`
import typingsSlinky.fhirKitClient.anon.`264`
import typingsSlinky.fhirKitClient.anon.`265`
import typingsSlinky.fhirKitClient.anon.`266`
import typingsSlinky.fhirKitClient.anon.`267`
import typingsSlinky.fhirKitClient.anon.`268`
import typingsSlinky.fhirKitClient.anon.`269`
import typingsSlinky.fhirKitClient.anon.`26`
import typingsSlinky.fhirKitClient.anon.`270`
import typingsSlinky.fhirKitClient.anon.`271`
import typingsSlinky.fhirKitClient.anon.`272`
import typingsSlinky.fhirKitClient.anon.`273`
import typingsSlinky.fhirKitClient.anon.`274`
import typingsSlinky.fhirKitClient.anon.`275`
import typingsSlinky.fhirKitClient.anon.`276`
import typingsSlinky.fhirKitClient.anon.`277`
import typingsSlinky.fhirKitClient.anon.`278`
import typingsSlinky.fhirKitClient.anon.`279`
import typingsSlinky.fhirKitClient.anon.`27`
import typingsSlinky.fhirKitClient.anon.`280`
import typingsSlinky.fhirKitClient.anon.`281`
import typingsSlinky.fhirKitClient.anon.`282`
import typingsSlinky.fhirKitClient.anon.`283`
import typingsSlinky.fhirKitClient.anon.`284`
import typingsSlinky.fhirKitClient.anon.`285`
import typingsSlinky.fhirKitClient.anon.`286`
import typingsSlinky.fhirKitClient.anon.`287`
import typingsSlinky.fhirKitClient.anon.`288`
import typingsSlinky.fhirKitClient.anon.`289`
import typingsSlinky.fhirKitClient.anon.`28`
import typingsSlinky.fhirKitClient.anon.`290`
import typingsSlinky.fhirKitClient.anon.`291`
import typingsSlinky.fhirKitClient.anon.`292`
import typingsSlinky.fhirKitClient.anon.`293`
import typingsSlinky.fhirKitClient.anon.`294`
import typingsSlinky.fhirKitClient.anon.`295`
import typingsSlinky.fhirKitClient.anon.`296`
import typingsSlinky.fhirKitClient.anon.`297`
import typingsSlinky.fhirKitClient.anon.`298`
import typingsSlinky.fhirKitClient.anon.`299`
import typingsSlinky.fhirKitClient.anon.`29`
import typingsSlinky.fhirKitClient.anon.`2`
import typingsSlinky.fhirKitClient.anon.`300`
import typingsSlinky.fhirKitClient.anon.`301`
import typingsSlinky.fhirKitClient.anon.`302`
import typingsSlinky.fhirKitClient.anon.`303`
import typingsSlinky.fhirKitClient.anon.`304`
import typingsSlinky.fhirKitClient.anon.`305`
import typingsSlinky.fhirKitClient.anon.`306`
import typingsSlinky.fhirKitClient.anon.`307`
import typingsSlinky.fhirKitClient.anon.`308`
import typingsSlinky.fhirKitClient.anon.`309`
import typingsSlinky.fhirKitClient.anon.`30`
import typingsSlinky.fhirKitClient.anon.`310`
import typingsSlinky.fhirKitClient.anon.`311`
import typingsSlinky.fhirKitClient.anon.`31`
import typingsSlinky.fhirKitClient.anon.`32`
import typingsSlinky.fhirKitClient.anon.`33`
import typingsSlinky.fhirKitClient.anon.`34`
import typingsSlinky.fhirKitClient.anon.`35`
import typingsSlinky.fhirKitClient.anon.`36`
import typingsSlinky.fhirKitClient.anon.`37`
import typingsSlinky.fhirKitClient.anon.`38`
import typingsSlinky.fhirKitClient.anon.`39`
import typingsSlinky.fhirKitClient.anon.`3`
import typingsSlinky.fhirKitClient.anon.`40`
import typingsSlinky.fhirKitClient.anon.`41`
import typingsSlinky.fhirKitClient.anon.`42`
import typingsSlinky.fhirKitClient.anon.`43`
import typingsSlinky.fhirKitClient.anon.`44`
import typingsSlinky.fhirKitClient.anon.`45`
import typingsSlinky.fhirKitClient.anon.`46`
import typingsSlinky.fhirKitClient.anon.`47`
import typingsSlinky.fhirKitClient.anon.`48`
import typingsSlinky.fhirKitClient.anon.`49`
import typingsSlinky.fhirKitClient.anon.`4`
import typingsSlinky.fhirKitClient.anon.`50`
import typingsSlinky.fhirKitClient.anon.`51`
import typingsSlinky.fhirKitClient.anon.`52`
import typingsSlinky.fhirKitClient.anon.`53`
import typingsSlinky.fhirKitClient.anon.`54`
import typingsSlinky.fhirKitClient.anon.`55`
import typingsSlinky.fhirKitClient.anon.`56`
import typingsSlinky.fhirKitClient.anon.`57`
import typingsSlinky.fhirKitClient.anon.`58`
import typingsSlinky.fhirKitClient.anon.`59`
import typingsSlinky.fhirKitClient.anon.`5`
import typingsSlinky.fhirKitClient.anon.`60`
import typingsSlinky.fhirKitClient.anon.`61`
import typingsSlinky.fhirKitClient.anon.`62`
import typingsSlinky.fhirKitClient.anon.`63`
import typingsSlinky.fhirKitClient.anon.`64`
import typingsSlinky.fhirKitClient.anon.`65`
import typingsSlinky.fhirKitClient.anon.`66`
import typingsSlinky.fhirKitClient.anon.`67`
import typingsSlinky.fhirKitClient.anon.`68`
import typingsSlinky.fhirKitClient.anon.`69`
import typingsSlinky.fhirKitClient.anon.`6`
import typingsSlinky.fhirKitClient.anon.`70`
import typingsSlinky.fhirKitClient.anon.`71`
import typingsSlinky.fhirKitClient.anon.`72`
import typingsSlinky.fhirKitClient.anon.`73`
import typingsSlinky.fhirKitClient.anon.`74`
import typingsSlinky.fhirKitClient.anon.`75`
import typingsSlinky.fhirKitClient.anon.`76`
import typingsSlinky.fhirKitClient.anon.`77`
import typingsSlinky.fhirKitClient.anon.`78`
import typingsSlinky.fhirKitClient.anon.`79`
import typingsSlinky.fhirKitClient.anon.`7`
import typingsSlinky.fhirKitClient.anon.`80`
import typingsSlinky.fhirKitClient.anon.`81`
import typingsSlinky.fhirKitClient.anon.`82`
import typingsSlinky.fhirKitClient.anon.`83`
import typingsSlinky.fhirKitClient.anon.`84`
import typingsSlinky.fhirKitClient.anon.`85`
import typingsSlinky.fhirKitClient.anon.`86`
import typingsSlinky.fhirKitClient.anon.`87`
import typingsSlinky.fhirKitClient.anon.`88`
import typingsSlinky.fhirKitClient.anon.`89`
import typingsSlinky.fhirKitClient.anon.`8`
import typingsSlinky.fhirKitClient.anon.`90`
import typingsSlinky.fhirKitClient.anon.`91`
import typingsSlinky.fhirKitClient.anon.`92`
import typingsSlinky.fhirKitClient.anon.`93`
import typingsSlinky.fhirKitClient.anon.`94`
import typingsSlinky.fhirKitClient.anon.`95`
import typingsSlinky.fhirKitClient.anon.`96`
import typingsSlinky.fhirKitClient.anon.`97`
import typingsSlinky.fhirKitClient.anon.`98`
import typingsSlinky.fhirKitClient.anon.`99`
import typingsSlinky.fhirKitClient.anon.`9`
import typingsSlinky.request.mod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  var baseUrl: String = js.native
  var bearerToken: js.UndefOr[String] = js.native
  var customHeaders: Headers = js.native
  /**
    * Submit a set of actions to perform independently as a batch.
    *
    * Update, create or delete a set of resources in a single interaction.
    * There should be no interdependencies between entries in the bundle.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'batch',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.batch({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.batch({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.body - The request body with a type of 'batch'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def batch(params: BodyBundletypebatch): js.Promise[OperationOutcome | Bundletypebatchresponse] = js.native
  /**
    * Get the default capability statement.
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.capabilityStatement().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.capabilityStatement();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} capability statement FHIR resource.
    */
  def capabilityStatement(): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def capabilityStatement(params: typingsSlinky.fhirKitClient.anon.Headers): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  /**
    * Search for FHIR resources within a compartment.
    * The resourceType and id must be specified.
    *
    * @example
    *
    * // Using promises
    * fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.compartmentSearch({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc' }
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.compartment - The search compartment.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def compartmentSearch(params: CompartmentHeaders): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Create a resource.
    *
    * @example
    * const newPatient = {
    *   resourceType: 'Patient',
    *   active: true,
    *   name: [{ use: 'official', family: ['Coleman'], given: ['Lisa', 'P.'] }],
    *   gender: 'female',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.create({
    *   resourceType: 'Patient',
    *   body: newPatient,
    * })
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The FHIR resource type.
    * @param {Response} params.body - The new resource data to create.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def create(params: Body): js.Promise[OperationOutcome | Account] = js.native
  def create(params: BodyAuditEvent): js.Promise[OperationOutcome | AuditEvent] = js.native
  def create(params: BodyBasic): js.Promise[OperationOutcome | Basic] = js.native
  def create(params: BodyBinary): js.Promise[OperationOutcome | Binary] = js.native
  def create(params: BodyBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def create(params: BodyBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def create(params: BodyCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def create(params: BodyCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def create(params: BodyCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def create(params: BodyChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def create(params: BodyClaim): js.Promise[OperationOutcome | Claim] = js.native
  def create(params: BodyClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def create(params: BodyClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def create(params: BodyCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def create(params: BodyCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def create(params: BodyCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def create(params: BodyCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def create(params: BodyComposition): js.Promise[OperationOutcome | Composition] = js.native
  def create(params: BodyConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def create(params: BodyCondition): js.Promise[OperationOutcome | Condition] = js.native
  def create(params: BodyConsent): js.Promise[OperationOutcome | Consent] = js.native
  def create(params: BodyContract): js.Promise[OperationOutcome | Contract] = js.native
  def create(params: BodyCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def create(params: BodyDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def create(params: BodyDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def create(params: BodyDevice): js.Promise[OperationOutcome | Device] = js.native
  def create(params: BodyDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def create(params: BodyDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def create(params: BodyDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def create(params: BodyDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def create(params: BodyDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def create(params: BodyDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def create(params: BodyDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def create(params: BodyDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def create(params: BodyEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def create(params: BodyEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def create(params: BodyEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def create(params: BodyEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def create(params: BodyEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def create(params: BodyEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def create(params: BodyEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def create(params: BodyExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def create(params: BodyExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def create(params: BodyFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def create(params: BodyFlag): js.Promise[OperationOutcome | Flag] = js.native
  def create(params: BodyGoal): js.Promise[OperationOutcome | Goal] = js.native
  def create(params: BodyGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def create(params: BodyGroup): js.Promise[OperationOutcome | Group] = js.native
  def create(params: BodyGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def create(params: BodyHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def create(params: BodyHeadersOptions): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def create(params: BodyHeadersOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def create(params: BodyHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def create(params: BodyImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def create(params: BodyImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def create(params: BodyImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def create(params: BodyImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def create(params: BodyImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def create(params: BodyLibrary): js.Promise[OperationOutcome | Library] = js.native
  def create(params: BodyLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def create(params: BodyList): js.Promise[OperationOutcome | List] = js.native
  def create(params: BodyLocation): js.Promise[OperationOutcome | Location] = js.native
  def create(params: BodyMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def create(params: BodyMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def create(params: BodyMedia): js.Promise[OperationOutcome | Media] = js.native
  def create(params: BodyMedication): js.Promise[OperationOutcome | Medication] = js.native
  def create(params: BodyMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def create(params: BodyMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def create(params: BodyMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def create(params: BodyMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def create(params: BodyMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def create(params: BodyMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def create(params: BodyNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def create(params: BodyNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def create(params: BodyObservation): js.Promise[OperationOutcome | Observation] = js.native
  def create(params: BodyOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def create(params: BodyOperationOutcome): js.Promise[OperationOutcome] = js.native
  def create(params: BodyOrganization): js.Promise[OperationOutcome | Organization] = js.native
  def create(params: BodyParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def create(params: BodyPatient): js.Promise[OperationOutcome | Patient] = js.native
  def create(params: BodyPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def create(params: BodyPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def create(params: BodyPerson): js.Promise[OperationOutcome | Person] = js.native
  def create(params: BodyPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def create(params: BodyPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def create(params: BodyPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def create(params: BodyProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def create(params: BodyProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def create(params: BodyProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def create(params: BodyProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def create(params: BodyProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def create(params: BodyQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def create(params: BodyQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def create(params: BodyReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def create(params: BodyRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def create(params: BodyRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def create(params: BodyResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def create(params: BodyResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def create(params: BodyRiskAssessment): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def create(params: BodySchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def create(params: BodySearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def create(params: BodySequence): js.Promise[OperationOutcome | Sequence] = js.native
  def create(params: BodyServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def create(params: BodySlot): js.Promise[OperationOutcome | Slot] = js.native
  def create(params: BodySpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def create(params: BodyStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def create(params: BodyStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def create(params: BodySubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def create(params: BodySubstance): js.Promise[OperationOutcome | Substance] = js.native
  def create(params: BodySupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def create(params: BodySupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def create(params: BodyTask): js.Promise[OperationOutcome | Task] = js.native
  def create(params: BodyTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def create(params: BodyTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def create(params: BodyValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def create(params: BodyVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def create(params: HeadersOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def create(params: HeadersOptionsResourceType): js.Promise[OperationOutcome | Appointment] = js.native
  def create[T /* <: CustomResource */](params: BodyT[T]): js.Promise[OperationOutcome | T] = js.native
  /**
    * Delete a resource by FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.delete({
    *   resourceType: 'Patient',
    *   id: 12345,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.delete({ resourceType: 'Patient', id: 12345 });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient", "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} Operation Outcome FHIR resource
    */
  def delete(params: ResourceTypeResourceType): js.Promise[OperationOutcome] = js.native
  /**
    * Retrieve the change history for a FHIR resource id, a resource type or the
    * entire system
    *
    * @example
    *
    * // Using promises
    * fhirClient.history({ resourceType: 'Patient', id: '12345' });
    *   .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.history({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {string} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {string} [params.id] - The FHIR id for the resource, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def history(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def history(params: `311`): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Return the next page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def nextPage[T /* <: String */](params: typingsSlinky.fhirKitClient.anon.Bundle[T]): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def nextPage[T /* <: String */](params: typingsSlinky.fhirKitClient.anon.Bundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def patch(params: HeadersIdJSONPatch): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def patch(params: HeadersIdJSONPatchOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def patch(params: HeadersIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  def patch(params: HeadersIdStringJSONPatchArray): js.Promise[OperationOutcome | CarePlan] = js.native
  def patch(params: HeadersIdStringJSONPatchArrayOptions): js.Promise[OperationOutcome | Claim] = js.native
  def patch(params: HeadersIdStringJSONPatchArrayOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def patch(params: IdJSONPatch): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def patch(params: IdJSONPatchOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def patch(params: IdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def patch(params: IdStringJSONPatchArray): js.Promise[OperationOutcome | Bundle] = js.native
  def patch(params: IdStringJSONPatchArrayOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def patch(params: IdStringJSONPatchArrayOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
  /**
    * Patch a resource by FHIR id.
    *
    * From http://hl7.org/fhir/STU3/http.html#patch:
    * Content-Type is 'application/json-patch+json'
    * Expects a JSON Patch document format, see http://jsonpatch.com/
    *
    * @example
    *
    * // JSON Patch document format from http://jsonpatch.com/
    * const JSONPatch = [{ op: 'replace', path: '/gender', value: 'male' }];
    *
    * // Using promises
    * fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.patch({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   JSONPatch
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Array} params.JSONPatch - A JSON Patch document containing an array
    *   of patch operations, formatted according to http://jsonpatch.com/.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def patch(params: JSONPatch): js.Promise[OperationOutcome | Account] = js.native
  def patch(params: JSONPatchArray): js.Promise[OperationOutcome | BodySite] = js.native
  def patch(params: JSONPatchArrayOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def patch(params: JSONPatchArrayOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def patch(params: JSONPatchArrayOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def patch(params: JSONPatchOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def patch(params: JSONPatchOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def patch(params: `211`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def patch(params: `212`): js.Promise[OperationOutcome | Communication] = js.native
  def patch(params: `213`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def patch(params: `214`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def patch(params: `215`): js.Promise[OperationOutcome | Composition] = js.native
  def patch(params: `216`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def patch(params: `217`): js.Promise[OperationOutcome | Condition] = js.native
  def patch(params: `218`): js.Promise[OperationOutcome | Consent] = js.native
  def patch(params: `219`): js.Promise[OperationOutcome | Contract] = js.native
  def patch(params: `220`): js.Promise[OperationOutcome | Coverage] = js.native
  def patch(params: `221`): js.Promise[OperationOutcome | DataElement] = js.native
  def patch(params: `222`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def patch(params: `223`): js.Promise[OperationOutcome | Device] = js.native
  def patch(params: `224`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def patch(params: `225`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def patch(params: `226`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def patch(params: `227`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def patch(params: `228`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def patch(params: `229`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def patch(params: `230`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def patch(params: `231`): js.Promise[OperationOutcome | DomainResource] = js.native
  def patch(params: `232`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def patch(params: `233`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def patch(params: `234`): js.Promise[OperationOutcome | Encounter] = js.native
  def patch(params: `235`): js.Promise[OperationOutcome | Endpoint] = js.native
  def patch(params: `236`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def patch(params: `237`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def patch(params: `238`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def patch(params: `239`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def patch(params: `240`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def patch(params: `241`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def patch(params: `242`): js.Promise[OperationOutcome | Flag] = js.native
  def patch(params: `243`): js.Promise[OperationOutcome | Goal] = js.native
  def patch(params: `244`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def patch(params: `245`): js.Promise[OperationOutcome | Group] = js.native
  def patch(params: `246`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def patch(params: `247`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def patch(params: `248`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def patch(params: `249`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def patch(params: `250`): js.Promise[OperationOutcome | Immunization] = js.native
  def patch(params: `251`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def patch(params: `252`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def patch(params: `253`): js.Promise[OperationOutcome | Library] = js.native
  def patch(params: `254`): js.Promise[OperationOutcome | Linkage] = js.native
  def patch(params: `255`): js.Promise[OperationOutcome | List] = js.native
  def patch(params: `256`): js.Promise[OperationOutcome | Location] = js.native
  def patch(params: `257`): js.Promise[OperationOutcome | Measure] = js.native
  def patch(params: `258`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def patch(params: `259`): js.Promise[OperationOutcome | Media] = js.native
  def patch(params: `260`): js.Promise[OperationOutcome | Medication] = js.native
  def patch(params: `261`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def patch(params: `262`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def patch(params: `263`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def patch(params: `264`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def patch(params: `265`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def patch(params: `266`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def patch(params: `267`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def patch(params: `268`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def patch(params: `269`): js.Promise[OperationOutcome | Observation] = js.native
  def patch(params: `270`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def patch(params: `271`): js.Promise[OperationOutcome] = js.native
  def patch(params: `272`): js.Promise[OperationOutcome | Organization] = js.native
  def patch(params: `273`): js.Promise[OperationOutcome | Parameters] = js.native
  def patch(params: `274`): js.Promise[OperationOutcome | Patient] = js.native
  def patch(params: `275`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def patch(params: `276`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def patch(params: `277`): js.Promise[OperationOutcome | Person] = js.native
  def patch(params: `278`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def patch(params: `279`): js.Promise[OperationOutcome | Practitioner] = js.native
  def patch(params: `280`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def patch(params: `281`): js.Promise[OperationOutcome | Procedure] = js.native
  def patch(params: `282`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def patch(params: `283`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def patch(params: `284`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def patch(params: `285`): js.Promise[OperationOutcome | Provenance] = js.native
  def patch(params: `286`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def patch(params: `287`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def patch(params: `288`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def patch(params: `289`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def patch(params: `290`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def patch(params: `291`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def patch(params: `292`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def patch(params: `293`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def patch(params: `294`): js.Promise[OperationOutcome | Schedule] = js.native
  def patch(params: `295`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def patch(params: `296`): js.Promise[OperationOutcome | Sequence] = js.native
  def patch(params: `297`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def patch(params: `298`): js.Promise[OperationOutcome | Slot] = js.native
  def patch(params: `299`): js.Promise[OperationOutcome | Specimen] = js.native
  def patch(params: `300`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def patch(params: `301`): js.Promise[OperationOutcome | StructureMap] = js.native
  def patch(params: `302`): js.Promise[OperationOutcome | Subscription] = js.native
  def patch(params: `303`): js.Promise[OperationOutcome | Substance] = js.native
  def patch(params: `304`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def patch(params: `305`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def patch(params: `306`): js.Promise[OperationOutcome | Task] = js.native
  def patch(params: `307`): js.Promise[OperationOutcome | TestReport] = js.native
  def patch(params: `308`): js.Promise[OperationOutcome | TestScript] = js.native
  def patch(params: `309`): js.Promise[OperationOutcome | ValueSet] = js.native
  def patch(params: `310`): js.Promise[OperationOutcome | VisionPrescription] = js.native
  /**
    * Return the previous page of results.
    *
    * @param {Object} params - The request parameters. Passing the bundle as the
    *   first parameter is DEPRECATED
    * @param {object} params.bundle - fhir.Bundle result of a FHIR search
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    * @param {Object} [headers] - DEPRECATED Optional custom headers to add to
    *   the request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def prevPage[T /* <: String */](params: typingsSlinky.fhirKitClient.anon.Bundle[T]): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def prevPage[T /* <: String */](params: typingsSlinky.fhirKitClient.anon.Bundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with Type[T])] = js.native
  def read(params: HeadersId): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def read(params: HeadersIdOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def read(params: HeadersIdOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  def read(params: HeadersIdString): js.Promise[OperationOutcome | Bundle] = js.native
  def read(params: HeadersIdStringOptions): js.Promise[OperationOutcome | CarePlan] = js.native
  def read(params: HeadersIdStringOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  /**
    * Get a resource by id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.read({
    *   resourceType: 'Patient',
    *   id: '12345',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.read({
    *   resourceType: 'Patient',
    *   id: '12345',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def read(params: Id): js.Promise[OperationOutcome | Account] = js.native
  def read(params: IdOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def read(params: IdOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def read(params: IdString): js.Promise[OperationOutcome | BodySite] = js.native
  def read(params: IdStringOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def read(params: IdStringOptionsResourceType): js.Promise[OperationOutcome | CareTeam] = js.native
  def read(params: Options): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def read(params: OptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def read(params: typingsSlinky.fhirKitClient.anon.ResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def read(params: ResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def read(params: `0`): js.Promise[OperationOutcome | Claim] = js.native
  def read(params: `100`): js.Promise[OperationOutcome | TestScript] = js.native
  def read(params: `101`): js.Promise[OperationOutcome | ValueSet] = js.native
  def read(params: `102`): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def read(params: `10`): js.Promise[OperationOutcome | Consent] = js.native
  def read(params: `11`): js.Promise[OperationOutcome | Contract] = js.native
  def read(params: `12`): js.Promise[OperationOutcome | Coverage] = js.native
  def read(params: `13`): js.Promise[OperationOutcome | DataElement] = js.native
  def read(params: `14`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def read(params: `15`): js.Promise[OperationOutcome | Device] = js.native
  def read(params: `16`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def read(params: `17`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def read(params: `18`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def read(params: `19`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def read(params: `1`): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def read(params: `20`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def read(params: `21`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def read(params: `22`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def read(params: `23`): js.Promise[OperationOutcome | DomainResource] = js.native
  def read(params: `24`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def read(params: `25`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def read(params: `26`): js.Promise[OperationOutcome | Encounter] = js.native
  def read(params: `27`): js.Promise[OperationOutcome | Endpoint] = js.native
  def read(params: `28`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def read(params: `29`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def read(params: `2`): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def read(params: `30`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def read(params: `31`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def read(params: `32`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def read(params: `33`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def read(params: `34`): js.Promise[OperationOutcome | Flag] = js.native
  def read(params: `35`): js.Promise[OperationOutcome | Goal] = js.native
  def read(params: `36`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def read(params: `37`): js.Promise[OperationOutcome | Group] = js.native
  def read(params: `38`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def read(params: `39`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def read(params: `3`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def read(params: `40`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def read(params: `41`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def read(params: `42`): js.Promise[OperationOutcome | Immunization] = js.native
  def read(params: `43`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def read(params: `44`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def read(params: `45`): js.Promise[OperationOutcome | Library] = js.native
  def read(params: `46`): js.Promise[OperationOutcome | Linkage] = js.native
  def read(params: `47`): js.Promise[OperationOutcome | List] = js.native
  def read(params: `48`): js.Promise[OperationOutcome | Location] = js.native
  def read(params: `49`): js.Promise[OperationOutcome | Measure] = js.native
  def read(params: `4`): js.Promise[OperationOutcome | Communication] = js.native
  def read(params: `50`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def read(params: `51`): js.Promise[OperationOutcome | Media] = js.native
  def read(params: `52`): js.Promise[OperationOutcome | Medication] = js.native
  def read(params: `53`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def read(params: `54`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def read(params: `55`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def read(params: `56`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def read(params: `57`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def read(params: `58`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def read(params: `59`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def read(params: `5`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def read(params: `60`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def read(params: `61`): js.Promise[OperationOutcome | Observation] = js.native
  def read(params: `62`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def read(params: `63`): js.Promise[OperationOutcome] = js.native
  def read(params: `64`): js.Promise[OperationOutcome | Organization] = js.native
  def read(params: `65`): js.Promise[OperationOutcome | Parameters] = js.native
  def read(params: `66`): js.Promise[OperationOutcome | Patient] = js.native
  def read(params: `67`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def read(params: `68`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def read(params: `69`): js.Promise[OperationOutcome | Person] = js.native
  def read(params: `6`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def read(params: `70`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def read(params: `71`): js.Promise[OperationOutcome | Practitioner] = js.native
  def read(params: `72`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def read(params: `73`): js.Promise[OperationOutcome | Procedure] = js.native
  def read(params: `74`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def read(params: `75`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def read(params: `76`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def read(params: `77`): js.Promise[OperationOutcome | Provenance] = js.native
  def read(params: `78`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def read(params: `79`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def read(params: `7`): js.Promise[OperationOutcome | Composition] = js.native
  def read(params: `80`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def read(params: `81`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def read(params: `82`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def read(params: `83`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def read(params: `84`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def read(params: `85`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def read(params: `86`): js.Promise[OperationOutcome | Schedule] = js.native
  def read(params: `87`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def read(params: `88`): js.Promise[OperationOutcome | Sequence] = js.native
  def read(params: `89`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def read(params: `8`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def read(params: `90`): js.Promise[OperationOutcome | Slot] = js.native
  def read(params: `91`): js.Promise[OperationOutcome | Specimen] = js.native
  def read(params: `92`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def read(params: `93`): js.Promise[OperationOutcome | StructureMap] = js.native
  def read(params: `94`): js.Promise[OperationOutcome | Subscription] = js.native
  def read(params: `95`): js.Promise[OperationOutcome | Substance] = js.native
  def read(params: `96`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def read(params: `97`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def read(params: `98`): js.Promise[OperationOutcome | Task] = js.native
  def read(params: `99`): js.Promise[OperationOutcome | TestReport] = js.native
  def read(params: `9`): js.Promise[OperationOutcome | Condition] = js.native
  /**
    * Resolve a reference and return FHIR resource
    *
    * From: http://hl7.org/fhir/STU3/references.html, a reference can be: 1)
    * absolute URL, 2) relative URL or 3) an internal fragement. In the case of
    * (2), there are rules on resolving references that are in a FHIR bundle.
    *
    * @async
    *
    * @example
    *
    * // Always does a new http request
    * client.resolve({ reference: 'http://test.com/fhir/Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Always does a new http request, using the client.baseUrl
    * client.resolve({ reference: 'Patient/1' }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Try to resolve a patient in the bundle, otherwise build request
    * // at client.baseUrl
    * client.resolve({ reference: 'Patient/1', context: bundle }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * // Resolve a patient contained in someResource (see:
    * // http://hl7.org/fhir/STU3/references.html#contained)
    * client.resolve({ reference: '#patient-1', context: someResource }).then((patient) => {
    *   console.log(patient);
    * });
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.reference - FHIR reference
    * @param {Object} [params.context] - Optional bundle with 'entry' array or FHIR resource with 'contained' array (if 'params.reference' starts with '#')
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def resolve(params: Context): js.Promise[FhirResource] = js.native
  /**
    * Retrieve the change history for a particular resource FHIR id.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceHistory({ resourceType: 'Patient', id: '12345' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {string} params.id - The FHIR id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceHistory(params: ResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search for a FHIR resource.
    *
    * @example
    *
    * // Using promises
    * fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.resourceSearch({
    *   resourceType: 'Patient',
    *   searchParams: { name: 'Smith' },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def resourceSearch(params: typingsSlinky.fhirKitClient.anon.SearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Search for a FHIR resource, with or without compartments, or the entire
    * system
    *
    * @example
    *
    * // Using promises
    * fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.search({
    *   resourceType: 'Observation',
    *   compartment: { resourceType: 'Patient', id: 123 },
    *   searchParams: { code: 'abc', _include: ['Observation:encounter', 'Observation:performer'] },
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} [params.resourceType] - The resource type
    *   (e.g. "Patient", "Observation"), optional.
    * @param {Object} [params.compartment] - The search compartment, optional.
    * @param {Object} [params.searchParams] - The search parameters, optional.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    *
    * @throws {Error} if neither searchParams nor resourceType are supplied
    */
  def search(params: typingsSlinky.fhirKitClient.anon.Compartment): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Obtain the SMART OAuth URLs from the Capability Statement
    * http://docs.smarthealthit.org/authorization/conformance-statement/
    *
    * @async
    *
    * @example
    *
    * // Using promises
    * fhirClient.smartAuthMetadata().then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.smartAuthMetadata();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} contains the following SMART URIs: authorizeUrl,
    *   tokenUrl, registerUrl, manageUrl
    */
  def smartAuthMetadata(): js.Promise[SmartAuthMetadata] = js.native
  def smartAuthMetadata(params: typingsSlinky.fhirKitClient.anon.Headers): js.Promise[SmartAuthMetadata] = js.native
  /**
    * Retrieve the change history for all resources.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemHistory();
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemHistory();
    * console.log(response);
    *
    * @param {Object} [params] - The request parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemHistory(): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def systemHistory(params: typingsSlinky.fhirKitClient.anon.Headers): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  /**
    * Search across all FHIR resource types in the system.
    * Only the parameters defined for all resources can be used.
    *
    * @example
    *
    * // Using promises
    * fhirClient.systemSearch({
    *   searchParams: { name: 'smith' }
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.systemSearch({ searchParams: { name: 'smith' } });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {Object} params.searchParams - The search parameters.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def systemSearch(params: OptionsSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
  /**
    * Submit a set of actions to perform independently as a transaction.
    *
    * Update, create or delete a set of resources in a single interaction.
    * The entire set of changes should succeed or fail as a single entity.
    * Multiple actions on multiple resources different types may be submitted.
    * The outcome should not depend on the order of the resources loaded.
    * Order of processing actions: DELETE, POST, PUT, and GET.
    * The transaction fails if any resource overlap in DELETE, POST and PUT.
    *
    * @example
    *
    * const request.Bundle = {
    *   'resourceType': 'fhir.Bundle',
    *   'type': 'transaction',
    *   'entry': [
    *    {
    *      'fullUrl': 'http://example.org/fhir/Patient/123',
    *      'resource': {
    *        'resourceType': 'Patient',
    *        'id': '123',
    *        'active': true
    *      },
    *      'request': {
    *        'method': 'PUT',
    *        'url': 'Patient/123'
    *      }
    *    },
    *     {
    *       'request': {
    *         'method': 'DELETE',
    *         'url': 'Patient/2e27c71e-30c8-4ceb-8c1c-5641e066c0a4'
    *       }
    *     },
    *     {
    *       'request': {
    *         'method': 'GET',
    *         'url': 'Patient?name=peter'
    *       }
    *     }
    *   ]
    * }
    *
    * // Using promises
    * fhirClient.transaction({
    *   body: request.Bundle
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.transaction({
    *   body: request.Bundle
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.body - The request body with a type of
    *   'transaction'.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def transaction(params: BodyBundletypetransaction): js.Promise[OperationOutcome | Bundletypetransactionresp] = js.native
  /**
    * Retrieve the change history for a particular resource type.
    *
    * @example
    *
    * // Using promises
    * fhirClient.typeHistory({ resourceType: 'Patient' });
    *           .then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.typeHistory({ resourceType: 'Patient' });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {string} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resources in a FHIR fhir.Bundle structure.
    */
  def typeHistory(params: OptionsResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def update(params: BodyAllergyIntolerance): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def update(params: BodyAppointment): js.Promise[OperationOutcome | Appointment] = js.native
  def update(params: BodyAppointmentResponse): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def update(params: BodyAuditEventHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def update(params: BodyBasicHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def update(params: BodyBinaryHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def update(params: BodyBodySiteHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def update(params: BodyBundleHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def update(params: BodyCapabilityStatementHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def update(params: BodyCarePlanHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def update(params: BodyCareTeamHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def update(params: BodyChargeItemHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def update(params: BodyClaimHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def update(params: BodyClaimResponseHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def update(params: BodyClinicalImpressionHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def update(params: BodyCodeSystemHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def update(params: BodyCommunicationHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def update(params: BodyCommunicationRequestHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def update(params: BodyCompartmentDefinitionHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def update(params: BodyCompositionHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def update(params: BodyConceptMapHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def update(params: BodyConditionHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def update(params: BodyConsentHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def update(params: BodyContractHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def update(params: BodyCoverageHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def update(params: BodyDataElementHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def update(params: BodyDetectedIssueHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def update(params: BodyDeviceComponentHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def update(params: BodyDeviceHeaders): js.Promise[OperationOutcome | Device] = js.native
  def update(params: BodyDeviceMetricHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def update(params: BodyDeviceRequestHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def update(params: BodyDeviceUseStatementHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def update(params: BodyDiagnosticReportHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def update(params: BodyDocumentManifestHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def update(params: BodyDocumentReferenceHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def update(params: BodyDomainResourceHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def update(params: BodyEligibilityRequestHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def update(params: BodyEligibilityResponseHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def update(params: BodyEncounterHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def update(params: BodyEndpointHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def update(params: BodyEnrollmentRequestHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def update(params: BodyEnrollmentResponseHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def update(params: BodyEpisodeOfCareHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def update(params: BodyExpansionProfileHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def update(params: BodyExplanationOfBenefitHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def update(params: BodyFamilyMemberHistoryHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def update(params: BodyFlagHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def update(params: BodyGoalHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def update(params: BodyGraphDefinitionHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def update(params: BodyGroupHeaders): js.Promise[OperationOutcome | Group] = js.native
  def update(params: BodyGuidanceResponseHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  /**
    * Update a resource by FHIR id.
    *
    * @example
    *
    * const updatedPatient = {
    *   resourceType: 'Patient',
    *   birthDate: '1948-04-14',
    * }
    *
    * // Using promises
    * fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * }).then((data) => { console.log(data); });
    *
    * // Using async
    * let response = await fhirClient.update({
    *   resourceType: 'Patient',
    *   id: 12345,
    *   body: updatedPatient,
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.body - The resource to be updated.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def update(params: BodyHeadersId): js.Promise[OperationOutcome | Account] = js.native
  def update(params: BodyHeadersIdOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def update(params: BodyHeadersIdOptionsResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def update(params: BodyHealthcareServiceHeaders): js.Promise[OperationOutcome | HealthcareService] = js.native
  def update(params: BodyImagingManifestHeaders): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def update(params: BodyImagingStudyHeaders): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def update(params: BodyImmunizationHeaders): js.Promise[OperationOutcome | Immunization] = js.native
  def update(params: BodyImmunizationRecommendationHeaders): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def update(params: BodyImplementationGuideHeaders): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def update(params: BodyLibraryHeaders): js.Promise[OperationOutcome | Library] = js.native
  def update(params: BodyLinkageHeaders): js.Promise[OperationOutcome | Linkage] = js.native
  def update(params: BodyListHeaders): js.Promise[OperationOutcome | List] = js.native
  def update(params: BodyLocationHeaders): js.Promise[OperationOutcome | Location] = js.native
  def update(params: BodyMeasureHeaders): js.Promise[OperationOutcome | Measure] = js.native
  def update(params: BodyMeasureReportHeaders): js.Promise[OperationOutcome | MeasureReport] = js.native
  def update(params: BodyMediaHeaders): js.Promise[OperationOutcome | Media] = js.native
  def update(params: BodyMedicationAdministrationHeaders): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def update(params: BodyMedicationDispenseHeaders): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def update(params: BodyMedicationHeaders): js.Promise[OperationOutcome | Medication] = js.native
  def update(params: BodyMedicationRequestHeaders): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def update(params: BodyMedicationStatementHeaders): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def update(params: BodyMessageDefinitionHeaders): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def update(params: BodyMessageHeaderHeaders): js.Promise[OperationOutcome | MessageHeader] = js.native
  def update(params: BodyNamingSystemHeaders): js.Promise[OperationOutcome | NamingSystem] = js.native
  def update(params: BodyNutritionOrderHeaders): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def update(params: BodyObservationHeaders): js.Promise[OperationOutcome | Observation] = js.native
  def update(params: BodyOperationDefinitionHeaders): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def update(params: BodyOperationOutcomeHeaders): js.Promise[OperationOutcome] = js.native
  def update(params: BodyOrganizationHeaders): js.Promise[OperationOutcome | Organization] = js.native
  def update(params: BodyParametersHeaders): js.Promise[OperationOutcome | Parameters] = js.native
  def update(params: BodyPatientHeaders): js.Promise[OperationOutcome | Patient] = js.native
  def update(params: BodyPaymentNoticeHeaders): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def update(params: BodyPaymentReconciliationHeaders): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def update(params: BodyPersonHeaders): js.Promise[OperationOutcome | Person] = js.native
  def update(params: BodyPlanDefinitionHeaders): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def update(params: BodyPractitionerHeaders): js.Promise[OperationOutcome | Practitioner] = js.native
  def update(params: BodyPractitionerRoleHeaders): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def update(params: BodyProcedureHeaders): js.Promise[OperationOutcome | Procedure] = js.native
  def update(params: BodyProcedureRequestHeaders): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def update(params: BodyProcessRequestHeaders): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def update(params: BodyProcessResponseHeaders): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def update(params: BodyProvenanceHeaders): js.Promise[OperationOutcome | Provenance] = js.native
  def update(params: BodyQuestionnaireHeaders): js.Promise[OperationOutcome | Questionnaire] = js.native
  def update(params: BodyQuestionnaireResponseHeaders): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def update(params: BodyReferralRequestHeaders): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def update(params: BodyRelatedPersonHeaders): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def update(params: BodyRequestGroupHeaders): js.Promise[OperationOutcome | RequestGroup] = js.native
  def update(params: BodyResearchStudyHeaders): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def update(params: BodyResearchSubjectHeaders): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def update(params: BodyRiskAssessmentHeaders): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def update(params: BodyScheduleHeaders): js.Promise[OperationOutcome | Schedule] = js.native
  def update(params: BodySearchParameterHeaders): js.Promise[OperationOutcome | SearchParameter] = js.native
  def update(params: BodySequenceHeaders): js.Promise[OperationOutcome | Sequence] = js.native
  def update(params: BodyServiceDefinitionHeaders): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def update(params: BodySlotHeaders): js.Promise[OperationOutcome | Slot] = js.native
  def update(params: BodySpecimenHeaders): js.Promise[OperationOutcome | Specimen] = js.native
  def update(params: BodyStructureDefinitionHeaders): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def update(params: BodyStructureMapHeaders): js.Promise[OperationOutcome | StructureMap] = js.native
  def update(params: BodySubscriptionHeaders): js.Promise[OperationOutcome | Subscription] = js.native
  def update(params: BodySubstanceHeaders): js.Promise[OperationOutcome | Substance] = js.native
  def update(params: BodySupplyDeliveryHeaders): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def update(params: BodySupplyRequestHeaders): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def update(params: BodyTaskHeaders): js.Promise[OperationOutcome | Task] = js.native
  def update(params: BodyTestReportHeaders): js.Promise[OperationOutcome | TestReport] = js.native
  def update(params: BodyTestScriptHeaders): js.Promise[OperationOutcome | TestScript] = js.native
  def update(params: BodyValueSetHeaders): js.Promise[OperationOutcome | ValueSet] = js.native
  def update(params: BodyVisionPrescriptionHeaders): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: BodyTHeaders[T]): js.Promise[OperationOutcome | T] = js.native
  def vread(params: HeadersIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | Appointment] = js.native
  def vread(params: HeadersIdStringOptionsResourceTypeVersionString): js.Promise[OperationOutcome | BodySite] = js.native
  def vread(params: IdOptionsResourceTypeVersion): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def vread(params: IdStringOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Binary] = js.native
  def vread(params: OptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def vread(params: OptionsResourceTypeVersion): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def vread(params: OptionsResourceTypeVersionString): js.Promise[OperationOutcome | Basic] = js.native
  def vread(params: ResourceTypeVersion): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def vread(params: ResourceTypeVersionString): js.Promise[OperationOutcome | AuditEvent] = js.native
  /**
    * Get a resource by id and version.
    *
    * @example
    *
    * // Using promises
    * fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * }).then(data => console.log(data));
    *
    * // Using async
    * let response = await fhirClient.vread({
    *   resourceType: 'Patient',
    *   id: '12345',
    *   version: '1',
    * });
    * console.log(response);
    *
    * @param {Object} params - The request parameters.
    * @param {String} params.resourceType - The resource type (e.g. "Patient",
    *   "Observation").
    * @param {String} params.id - The FHIR id for the resource.
    * @param {String} params.version - The version id for the resource.
    * @param {Object} [params.headers] - DEPRECATED Optional custom headers to
    *   add to the request
    * @param {Object} [params.options] - Optional options object
    * @param {Object} [params.options.headers] - Optional headers to add to the
    *   request
    *
    * @return {Promise<Object>} FHIR resource
    */
  def vread(params: Version): js.Promise[OperationOutcome | Account] = js.native
  def vread(params: VersionString): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def vread(params: `103`): js.Promise[OperationOutcome | Bundle] = js.native
  def vread(params: `104`): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def vread(params: `105`): js.Promise[OperationOutcome | CarePlan] = js.native
  def vread(params: `106`): js.Promise[OperationOutcome | CareTeam] = js.native
  def vread(params: `107`): js.Promise[OperationOutcome | ChargeItem] = js.native
  def vread(params: `108`): js.Promise[OperationOutcome | Claim] = js.native
  def vread(params: `109`): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def vread(params: `110`): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def vread(params: `111`): js.Promise[OperationOutcome | CodeSystem] = js.native
  def vread(params: `112`): js.Promise[OperationOutcome | Communication] = js.native
  def vread(params: `113`): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def vread(params: `114`): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def vread(params: `115`): js.Promise[OperationOutcome | Composition] = js.native
  def vread(params: `116`): js.Promise[OperationOutcome | ConceptMap] = js.native
  def vread(params: `117`): js.Promise[OperationOutcome | Condition] = js.native
  def vread(params: `118`): js.Promise[OperationOutcome | Consent] = js.native
  def vread(params: `119`): js.Promise[OperationOutcome | Contract] = js.native
  def vread(params: `120`): js.Promise[OperationOutcome | Coverage] = js.native
  def vread(params: `121`): js.Promise[OperationOutcome | DataElement] = js.native
  def vread(params: `122`): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def vread(params: `123`): js.Promise[OperationOutcome | Device] = js.native
  def vread(params: `124`): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def vread(params: `125`): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def vread(params: `126`): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def vread(params: `127`): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def vread(params: `128`): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def vread(params: `129`): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def vread(params: `130`): js.Promise[OperationOutcome | DocumentReference] = js.native
  def vread(params: `131`): js.Promise[OperationOutcome | DomainResource] = js.native
  def vread(params: `132`): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def vread(params: `133`): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def vread(params: `134`): js.Promise[OperationOutcome | Encounter] = js.native
  def vread(params: `135`): js.Promise[OperationOutcome | Endpoint] = js.native
  def vread(params: `136`): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def vread(params: `137`): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def vread(params: `138`): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def vread(params: `139`): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def vread(params: `140`): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def vread(params: `141`): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def vread(params: `142`): js.Promise[OperationOutcome | Flag] = js.native
  def vread(params: `143`): js.Promise[OperationOutcome | Goal] = js.native
  def vread(params: `144`): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def vread(params: `145`): js.Promise[OperationOutcome | Group] = js.native
  def vread(params: `146`): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def vread(params: `147`): js.Promise[OperationOutcome | HealthcareService] = js.native
  def vread(params: `148`): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def vread(params: `149`): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def vread(params: `150`): js.Promise[OperationOutcome | Immunization] = js.native
  def vread(params: `151`): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def vread(params: `152`): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def vread(params: `153`): js.Promise[OperationOutcome | Library] = js.native
  def vread(params: `154`): js.Promise[OperationOutcome | Linkage] = js.native
  def vread(params: `155`): js.Promise[OperationOutcome | List] = js.native
  def vread(params: `156`): js.Promise[OperationOutcome | Location] = js.native
  def vread(params: `157`): js.Promise[OperationOutcome | Measure] = js.native
  def vread(params: `158`): js.Promise[OperationOutcome | MeasureReport] = js.native
  def vread(params: `159`): js.Promise[OperationOutcome | Media] = js.native
  def vread(params: `160`): js.Promise[OperationOutcome | Medication] = js.native
  def vread(params: `161`): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def vread(params: `162`): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def vread(params: `163`): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def vread(params: `164`): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def vread(params: `165`): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def vread(params: `166`): js.Promise[OperationOutcome | MessageHeader] = js.native
  def vread(params: `167`): js.Promise[OperationOutcome | NamingSystem] = js.native
  def vread(params: `168`): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def vread(params: `169`): js.Promise[OperationOutcome | Observation] = js.native
  def vread(params: `170`): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def vread(params: `171`): js.Promise[OperationOutcome] = js.native
  def vread(params: `172`): js.Promise[OperationOutcome | Organization] = js.native
  def vread(params: `173`): js.Promise[OperationOutcome | Parameters] = js.native
  def vread(params: `174`): js.Promise[OperationOutcome | Patient] = js.native
  def vread(params: `175`): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def vread(params: `176`): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def vread(params: `177`): js.Promise[OperationOutcome | Person] = js.native
  def vread(params: `178`): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def vread(params: `179`): js.Promise[OperationOutcome | Practitioner] = js.native
  def vread(params: `180`): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def vread(params: `181`): js.Promise[OperationOutcome | Procedure] = js.native
  def vread(params: `182`): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def vread(params: `183`): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def vread(params: `184`): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def vread(params: `185`): js.Promise[OperationOutcome | Provenance] = js.native
  def vread(params: `186`): js.Promise[OperationOutcome | Questionnaire] = js.native
  def vread(params: `187`): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def vread(params: `188`): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def vread(params: `189`): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def vread(params: `190`): js.Promise[OperationOutcome | RequestGroup] = js.native
  def vread(params: `191`): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def vread(params: `192`): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def vread(params: `193`): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def vread(params: `194`): js.Promise[OperationOutcome | Schedule] = js.native
  def vread(params: `195`): js.Promise[OperationOutcome | SearchParameter] = js.native
  def vread(params: `196`): js.Promise[OperationOutcome | Sequence] = js.native
  def vread(params: `197`): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def vread(params: `198`): js.Promise[OperationOutcome | Slot] = js.native
  def vread(params: `199`): js.Promise[OperationOutcome | Specimen] = js.native
  def vread(params: `200`): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def vread(params: `201`): js.Promise[OperationOutcome | StructureMap] = js.native
  def vread(params: `202`): js.Promise[OperationOutcome | Subscription] = js.native
  def vread(params: `203`): js.Promise[OperationOutcome | Substance] = js.native
  def vread(params: `204`): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def vread(params: `205`): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def vread(params: `206`): js.Promise[OperationOutcome | Task] = js.native
  def vread(params: `207`): js.Promise[OperationOutcome | TestReport] = js.native
  def vread(params: `208`): js.Promise[OperationOutcome | TestScript] = js.native
  def vread(params: `209`): js.Promise[OperationOutcome | ValueSet] = js.native
  def vread(params: `210`): js.Promise[OperationOutcome | VisionPrescription] = js.native
}

