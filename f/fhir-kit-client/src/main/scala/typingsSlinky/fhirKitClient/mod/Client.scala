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
import typingsSlinky.fhirKitClient.Anon0
import typingsSlinky.fhirKitClient.Anon1
import typingsSlinky.fhirKitClient.Anon10
import typingsSlinky.fhirKitClient.Anon100
import typingsSlinky.fhirKitClient.Anon101
import typingsSlinky.fhirKitClient.Anon102
import typingsSlinky.fhirKitClient.Anon103
import typingsSlinky.fhirKitClient.Anon104
import typingsSlinky.fhirKitClient.Anon105
import typingsSlinky.fhirKitClient.Anon106
import typingsSlinky.fhirKitClient.Anon107
import typingsSlinky.fhirKitClient.Anon108
import typingsSlinky.fhirKitClient.Anon109
import typingsSlinky.fhirKitClient.Anon11
import typingsSlinky.fhirKitClient.Anon110
import typingsSlinky.fhirKitClient.Anon111
import typingsSlinky.fhirKitClient.Anon112
import typingsSlinky.fhirKitClient.Anon113
import typingsSlinky.fhirKitClient.Anon114
import typingsSlinky.fhirKitClient.Anon115
import typingsSlinky.fhirKitClient.Anon116
import typingsSlinky.fhirKitClient.Anon117
import typingsSlinky.fhirKitClient.Anon118
import typingsSlinky.fhirKitClient.Anon119
import typingsSlinky.fhirKitClient.Anon12
import typingsSlinky.fhirKitClient.Anon120
import typingsSlinky.fhirKitClient.Anon121
import typingsSlinky.fhirKitClient.Anon122
import typingsSlinky.fhirKitClient.Anon123
import typingsSlinky.fhirKitClient.Anon124
import typingsSlinky.fhirKitClient.Anon125
import typingsSlinky.fhirKitClient.Anon126
import typingsSlinky.fhirKitClient.Anon127
import typingsSlinky.fhirKitClient.Anon128
import typingsSlinky.fhirKitClient.Anon129
import typingsSlinky.fhirKitClient.Anon13
import typingsSlinky.fhirKitClient.Anon130
import typingsSlinky.fhirKitClient.Anon131
import typingsSlinky.fhirKitClient.Anon132
import typingsSlinky.fhirKitClient.Anon133
import typingsSlinky.fhirKitClient.Anon134
import typingsSlinky.fhirKitClient.Anon135
import typingsSlinky.fhirKitClient.Anon136
import typingsSlinky.fhirKitClient.Anon137
import typingsSlinky.fhirKitClient.Anon138
import typingsSlinky.fhirKitClient.Anon139
import typingsSlinky.fhirKitClient.Anon14
import typingsSlinky.fhirKitClient.Anon140
import typingsSlinky.fhirKitClient.Anon141
import typingsSlinky.fhirKitClient.Anon142
import typingsSlinky.fhirKitClient.Anon143
import typingsSlinky.fhirKitClient.Anon144
import typingsSlinky.fhirKitClient.Anon145
import typingsSlinky.fhirKitClient.Anon146
import typingsSlinky.fhirKitClient.Anon147
import typingsSlinky.fhirKitClient.Anon148
import typingsSlinky.fhirKitClient.Anon149
import typingsSlinky.fhirKitClient.Anon15
import typingsSlinky.fhirKitClient.Anon150
import typingsSlinky.fhirKitClient.Anon151
import typingsSlinky.fhirKitClient.Anon152
import typingsSlinky.fhirKitClient.Anon153
import typingsSlinky.fhirKitClient.Anon154
import typingsSlinky.fhirKitClient.Anon155
import typingsSlinky.fhirKitClient.Anon156
import typingsSlinky.fhirKitClient.Anon157
import typingsSlinky.fhirKitClient.Anon158
import typingsSlinky.fhirKitClient.Anon159
import typingsSlinky.fhirKitClient.Anon16
import typingsSlinky.fhirKitClient.Anon160
import typingsSlinky.fhirKitClient.Anon161
import typingsSlinky.fhirKitClient.Anon162
import typingsSlinky.fhirKitClient.Anon163
import typingsSlinky.fhirKitClient.Anon164
import typingsSlinky.fhirKitClient.Anon165
import typingsSlinky.fhirKitClient.Anon166
import typingsSlinky.fhirKitClient.Anon167
import typingsSlinky.fhirKitClient.Anon168
import typingsSlinky.fhirKitClient.Anon169
import typingsSlinky.fhirKitClient.Anon17
import typingsSlinky.fhirKitClient.Anon170
import typingsSlinky.fhirKitClient.Anon171
import typingsSlinky.fhirKitClient.Anon172
import typingsSlinky.fhirKitClient.Anon173
import typingsSlinky.fhirKitClient.Anon174
import typingsSlinky.fhirKitClient.Anon175
import typingsSlinky.fhirKitClient.Anon176
import typingsSlinky.fhirKitClient.Anon177
import typingsSlinky.fhirKitClient.Anon178
import typingsSlinky.fhirKitClient.Anon179
import typingsSlinky.fhirKitClient.Anon18
import typingsSlinky.fhirKitClient.Anon180
import typingsSlinky.fhirKitClient.Anon181
import typingsSlinky.fhirKitClient.Anon182
import typingsSlinky.fhirKitClient.Anon183
import typingsSlinky.fhirKitClient.Anon184
import typingsSlinky.fhirKitClient.Anon185
import typingsSlinky.fhirKitClient.Anon186
import typingsSlinky.fhirKitClient.Anon187
import typingsSlinky.fhirKitClient.Anon188
import typingsSlinky.fhirKitClient.Anon189
import typingsSlinky.fhirKitClient.Anon19
import typingsSlinky.fhirKitClient.Anon190
import typingsSlinky.fhirKitClient.Anon191
import typingsSlinky.fhirKitClient.Anon192
import typingsSlinky.fhirKitClient.Anon193
import typingsSlinky.fhirKitClient.Anon194
import typingsSlinky.fhirKitClient.Anon195
import typingsSlinky.fhirKitClient.Anon196
import typingsSlinky.fhirKitClient.Anon197
import typingsSlinky.fhirKitClient.Anon198
import typingsSlinky.fhirKitClient.Anon199
import typingsSlinky.fhirKitClient.Anon2
import typingsSlinky.fhirKitClient.Anon20
import typingsSlinky.fhirKitClient.Anon200
import typingsSlinky.fhirKitClient.Anon201
import typingsSlinky.fhirKitClient.Anon202
import typingsSlinky.fhirKitClient.Anon203
import typingsSlinky.fhirKitClient.Anon204
import typingsSlinky.fhirKitClient.Anon205
import typingsSlinky.fhirKitClient.Anon206
import typingsSlinky.fhirKitClient.Anon207
import typingsSlinky.fhirKitClient.Anon208
import typingsSlinky.fhirKitClient.Anon209
import typingsSlinky.fhirKitClient.Anon21
import typingsSlinky.fhirKitClient.Anon210
import typingsSlinky.fhirKitClient.Anon211
import typingsSlinky.fhirKitClient.Anon212
import typingsSlinky.fhirKitClient.Anon213
import typingsSlinky.fhirKitClient.Anon214
import typingsSlinky.fhirKitClient.Anon215
import typingsSlinky.fhirKitClient.Anon216
import typingsSlinky.fhirKitClient.Anon217
import typingsSlinky.fhirKitClient.Anon218
import typingsSlinky.fhirKitClient.Anon219
import typingsSlinky.fhirKitClient.Anon22
import typingsSlinky.fhirKitClient.Anon220
import typingsSlinky.fhirKitClient.Anon221
import typingsSlinky.fhirKitClient.Anon222
import typingsSlinky.fhirKitClient.Anon223
import typingsSlinky.fhirKitClient.Anon224
import typingsSlinky.fhirKitClient.Anon225
import typingsSlinky.fhirKitClient.Anon226
import typingsSlinky.fhirKitClient.Anon227
import typingsSlinky.fhirKitClient.Anon228
import typingsSlinky.fhirKitClient.Anon229
import typingsSlinky.fhirKitClient.Anon23
import typingsSlinky.fhirKitClient.Anon230
import typingsSlinky.fhirKitClient.Anon231
import typingsSlinky.fhirKitClient.Anon232
import typingsSlinky.fhirKitClient.Anon233
import typingsSlinky.fhirKitClient.Anon234
import typingsSlinky.fhirKitClient.Anon235
import typingsSlinky.fhirKitClient.Anon236
import typingsSlinky.fhirKitClient.Anon237
import typingsSlinky.fhirKitClient.Anon238
import typingsSlinky.fhirKitClient.Anon239
import typingsSlinky.fhirKitClient.Anon24
import typingsSlinky.fhirKitClient.Anon240
import typingsSlinky.fhirKitClient.Anon241
import typingsSlinky.fhirKitClient.Anon242
import typingsSlinky.fhirKitClient.Anon243
import typingsSlinky.fhirKitClient.Anon244
import typingsSlinky.fhirKitClient.Anon245
import typingsSlinky.fhirKitClient.Anon246
import typingsSlinky.fhirKitClient.Anon247
import typingsSlinky.fhirKitClient.Anon248
import typingsSlinky.fhirKitClient.Anon249
import typingsSlinky.fhirKitClient.Anon25
import typingsSlinky.fhirKitClient.Anon250
import typingsSlinky.fhirKitClient.Anon251
import typingsSlinky.fhirKitClient.Anon252
import typingsSlinky.fhirKitClient.Anon253
import typingsSlinky.fhirKitClient.Anon254
import typingsSlinky.fhirKitClient.Anon255
import typingsSlinky.fhirKitClient.Anon256
import typingsSlinky.fhirKitClient.Anon257
import typingsSlinky.fhirKitClient.Anon258
import typingsSlinky.fhirKitClient.Anon259
import typingsSlinky.fhirKitClient.Anon26
import typingsSlinky.fhirKitClient.Anon260
import typingsSlinky.fhirKitClient.Anon261
import typingsSlinky.fhirKitClient.Anon262
import typingsSlinky.fhirKitClient.Anon263
import typingsSlinky.fhirKitClient.Anon264
import typingsSlinky.fhirKitClient.Anon265
import typingsSlinky.fhirKitClient.Anon266
import typingsSlinky.fhirKitClient.Anon267
import typingsSlinky.fhirKitClient.Anon268
import typingsSlinky.fhirKitClient.Anon269
import typingsSlinky.fhirKitClient.Anon27
import typingsSlinky.fhirKitClient.Anon270
import typingsSlinky.fhirKitClient.Anon271
import typingsSlinky.fhirKitClient.Anon272
import typingsSlinky.fhirKitClient.Anon273
import typingsSlinky.fhirKitClient.Anon274
import typingsSlinky.fhirKitClient.Anon275
import typingsSlinky.fhirKitClient.Anon276
import typingsSlinky.fhirKitClient.Anon277
import typingsSlinky.fhirKitClient.Anon278
import typingsSlinky.fhirKitClient.Anon279
import typingsSlinky.fhirKitClient.Anon28
import typingsSlinky.fhirKitClient.Anon280
import typingsSlinky.fhirKitClient.Anon281
import typingsSlinky.fhirKitClient.Anon282
import typingsSlinky.fhirKitClient.Anon283
import typingsSlinky.fhirKitClient.Anon284
import typingsSlinky.fhirKitClient.Anon285
import typingsSlinky.fhirKitClient.Anon286
import typingsSlinky.fhirKitClient.Anon287
import typingsSlinky.fhirKitClient.Anon288
import typingsSlinky.fhirKitClient.Anon289
import typingsSlinky.fhirKitClient.Anon29
import typingsSlinky.fhirKitClient.Anon290
import typingsSlinky.fhirKitClient.Anon291
import typingsSlinky.fhirKitClient.Anon292
import typingsSlinky.fhirKitClient.Anon293
import typingsSlinky.fhirKitClient.Anon294
import typingsSlinky.fhirKitClient.Anon295
import typingsSlinky.fhirKitClient.Anon296
import typingsSlinky.fhirKitClient.Anon297
import typingsSlinky.fhirKitClient.Anon298
import typingsSlinky.fhirKitClient.Anon299
import typingsSlinky.fhirKitClient.Anon3
import typingsSlinky.fhirKitClient.Anon30
import typingsSlinky.fhirKitClient.Anon300
import typingsSlinky.fhirKitClient.Anon301
import typingsSlinky.fhirKitClient.Anon302
import typingsSlinky.fhirKitClient.Anon303
import typingsSlinky.fhirKitClient.Anon304
import typingsSlinky.fhirKitClient.Anon305
import typingsSlinky.fhirKitClient.Anon306
import typingsSlinky.fhirKitClient.Anon307
import typingsSlinky.fhirKitClient.Anon31
import typingsSlinky.fhirKitClient.Anon32
import typingsSlinky.fhirKitClient.Anon33
import typingsSlinky.fhirKitClient.Anon34
import typingsSlinky.fhirKitClient.Anon35
import typingsSlinky.fhirKitClient.Anon36
import typingsSlinky.fhirKitClient.Anon37
import typingsSlinky.fhirKitClient.Anon38
import typingsSlinky.fhirKitClient.Anon39
import typingsSlinky.fhirKitClient.Anon4
import typingsSlinky.fhirKitClient.Anon40
import typingsSlinky.fhirKitClient.Anon41
import typingsSlinky.fhirKitClient.Anon42
import typingsSlinky.fhirKitClient.Anon43
import typingsSlinky.fhirKitClient.Anon44
import typingsSlinky.fhirKitClient.Anon45
import typingsSlinky.fhirKitClient.Anon46
import typingsSlinky.fhirKitClient.Anon47
import typingsSlinky.fhirKitClient.Anon48
import typingsSlinky.fhirKitClient.Anon49
import typingsSlinky.fhirKitClient.Anon5
import typingsSlinky.fhirKitClient.Anon50
import typingsSlinky.fhirKitClient.Anon51
import typingsSlinky.fhirKitClient.Anon52
import typingsSlinky.fhirKitClient.Anon53
import typingsSlinky.fhirKitClient.Anon54
import typingsSlinky.fhirKitClient.Anon55
import typingsSlinky.fhirKitClient.Anon56
import typingsSlinky.fhirKitClient.Anon57
import typingsSlinky.fhirKitClient.Anon58
import typingsSlinky.fhirKitClient.Anon59
import typingsSlinky.fhirKitClient.Anon6
import typingsSlinky.fhirKitClient.Anon60
import typingsSlinky.fhirKitClient.Anon61
import typingsSlinky.fhirKitClient.Anon62
import typingsSlinky.fhirKitClient.Anon63
import typingsSlinky.fhirKitClient.Anon64
import typingsSlinky.fhirKitClient.Anon65
import typingsSlinky.fhirKitClient.Anon66
import typingsSlinky.fhirKitClient.Anon67
import typingsSlinky.fhirKitClient.Anon68
import typingsSlinky.fhirKitClient.Anon69
import typingsSlinky.fhirKitClient.Anon7
import typingsSlinky.fhirKitClient.Anon70
import typingsSlinky.fhirKitClient.Anon71
import typingsSlinky.fhirKitClient.Anon72
import typingsSlinky.fhirKitClient.Anon73
import typingsSlinky.fhirKitClient.Anon74
import typingsSlinky.fhirKitClient.Anon75
import typingsSlinky.fhirKitClient.Anon76
import typingsSlinky.fhirKitClient.Anon77
import typingsSlinky.fhirKitClient.Anon78
import typingsSlinky.fhirKitClient.Anon79
import typingsSlinky.fhirKitClient.Anon8
import typingsSlinky.fhirKitClient.Anon80
import typingsSlinky.fhirKitClient.Anon81
import typingsSlinky.fhirKitClient.Anon82
import typingsSlinky.fhirKitClient.Anon83
import typingsSlinky.fhirKitClient.Anon84
import typingsSlinky.fhirKitClient.Anon85
import typingsSlinky.fhirKitClient.Anon86
import typingsSlinky.fhirKitClient.Anon87
import typingsSlinky.fhirKitClient.Anon88
import typingsSlinky.fhirKitClient.Anon89
import typingsSlinky.fhirKitClient.Anon9
import typingsSlinky.fhirKitClient.Anon90
import typingsSlinky.fhirKitClient.Anon91
import typingsSlinky.fhirKitClient.Anon92
import typingsSlinky.fhirKitClient.Anon93
import typingsSlinky.fhirKitClient.Anon94
import typingsSlinky.fhirKitClient.Anon95
import typingsSlinky.fhirKitClient.Anon96
import typingsSlinky.fhirKitClient.Anon97
import typingsSlinky.fhirKitClient.Anon98
import typingsSlinky.fhirKitClient.Anon99
import typingsSlinky.fhirKitClient.AnonBody
import typingsSlinky.fhirKitClient.AnonBodyAllergyIntolerance
import typingsSlinky.fhirKitClient.AnonBodyAppointment
import typingsSlinky.fhirKitClient.AnonBodyAppointmentResponse
import typingsSlinky.fhirKitClient.AnonBodyAuditEvent
import typingsSlinky.fhirKitClient.AnonBodyAuditEventHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyBasic
import typingsSlinky.fhirKitClient.AnonBodyBasicHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyBinary
import typingsSlinky.fhirKitClient.AnonBodyBinaryHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyBodySite
import typingsSlinky.fhirKitClient.AnonBodyBodySiteHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyBundle
import typingsSlinky.fhirKitClient.AnonBodyBundleHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyBundletypebatch
import typingsSlinky.fhirKitClient.AnonBodyBundletypetransaction
import typingsSlinky.fhirKitClient.AnonBodyCapabilityStatement
import typingsSlinky.fhirKitClient.AnonBodyCapabilityStatementHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCarePlan
import typingsSlinky.fhirKitClient.AnonBodyCarePlanHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCareTeam
import typingsSlinky.fhirKitClient.AnonBodyCareTeamHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyChargeItem
import typingsSlinky.fhirKitClient.AnonBodyChargeItemHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyClaim
import typingsSlinky.fhirKitClient.AnonBodyClaimHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyClaimResponse
import typingsSlinky.fhirKitClient.AnonBodyClaimResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyClinicalImpression
import typingsSlinky.fhirKitClient.AnonBodyClinicalImpressionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCodeSystem
import typingsSlinky.fhirKitClient.AnonBodyCodeSystemHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCommunication
import typingsSlinky.fhirKitClient.AnonBodyCommunicationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCommunicationRequest
import typingsSlinky.fhirKitClient.AnonBodyCommunicationRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCompartmentDefinition
import typingsSlinky.fhirKitClient.AnonBodyCompartmentDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyComposition
import typingsSlinky.fhirKitClient.AnonBodyCompositionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyConceptMap
import typingsSlinky.fhirKitClient.AnonBodyConceptMapHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCondition
import typingsSlinky.fhirKitClient.AnonBodyConditionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyConsent
import typingsSlinky.fhirKitClient.AnonBodyConsentHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyContract
import typingsSlinky.fhirKitClient.AnonBodyContractHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyCoverage
import typingsSlinky.fhirKitClient.AnonBodyCoverageHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDataElement
import typingsSlinky.fhirKitClient.AnonBodyDataElementHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDetectedIssue
import typingsSlinky.fhirKitClient.AnonBodyDetectedIssueHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDevice
import typingsSlinky.fhirKitClient.AnonBodyDeviceComponent
import typingsSlinky.fhirKitClient.AnonBodyDeviceComponentHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDeviceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDeviceMetric
import typingsSlinky.fhirKitClient.AnonBodyDeviceMetricHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDeviceRequest
import typingsSlinky.fhirKitClient.AnonBodyDeviceRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDeviceUseStatement
import typingsSlinky.fhirKitClient.AnonBodyDeviceUseStatementHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDiagnosticReport
import typingsSlinky.fhirKitClient.AnonBodyDiagnosticReportHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDocumentManifest
import typingsSlinky.fhirKitClient.AnonBodyDocumentManifestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDocumentReference
import typingsSlinky.fhirKitClient.AnonBodyDocumentReferenceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyDomainResource
import typingsSlinky.fhirKitClient.AnonBodyDomainResourceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEligibilityRequest
import typingsSlinky.fhirKitClient.AnonBodyEligibilityRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEligibilityResponse
import typingsSlinky.fhirKitClient.AnonBodyEligibilityResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEncounter
import typingsSlinky.fhirKitClient.AnonBodyEncounterHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEndpoint
import typingsSlinky.fhirKitClient.AnonBodyEndpointHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEnrollmentRequest
import typingsSlinky.fhirKitClient.AnonBodyEnrollmentRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEnrollmentResponse
import typingsSlinky.fhirKitClient.AnonBodyEnrollmentResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyEpisodeOfCare
import typingsSlinky.fhirKitClient.AnonBodyEpisodeOfCareHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyExpansionProfile
import typingsSlinky.fhirKitClient.AnonBodyExpansionProfileHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyExplanationOfBenefit
import typingsSlinky.fhirKitClient.AnonBodyExplanationOfBenefitHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyFamilyMemberHistory
import typingsSlinky.fhirKitClient.AnonBodyFamilyMemberHistoryHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyFlag
import typingsSlinky.fhirKitClient.AnonBodyFlagHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyGoal
import typingsSlinky.fhirKitClient.AnonBodyGoalHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyGraphDefinition
import typingsSlinky.fhirKitClient.AnonBodyGraphDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyGroup
import typingsSlinky.fhirKitClient.AnonBodyGroupHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyGuidanceResponse
import typingsSlinky.fhirKitClient.AnonBodyGuidanceResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyHeaders
import typingsSlinky.fhirKitClient.AnonBodyHeadersId
import typingsSlinky.fhirKitClient.AnonBodyHeadersIdOptions
import typingsSlinky.fhirKitClient.AnonBodyHeadersIdOptionsResourceType
import typingsSlinky.fhirKitClient.AnonBodyHeadersOptions
import typingsSlinky.fhirKitClient.AnonBodyHeadersOptionsResourceType
import typingsSlinky.fhirKitClient.AnonBodyHealthcareService
import typingsSlinky.fhirKitClient.AnonBodyHealthcareServiceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyImagingManifest
import typingsSlinky.fhirKitClient.AnonBodyImagingManifestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyImagingStudy
import typingsSlinky.fhirKitClient.AnonBodyImagingStudyHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyImmunization
import typingsSlinky.fhirKitClient.AnonBodyImmunizationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyImmunizationRecommendation
import typingsSlinky.fhirKitClient.AnonBodyImmunizationRecommendationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyImplementationGuide
import typingsSlinky.fhirKitClient.AnonBodyImplementationGuideHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyLibrary
import typingsSlinky.fhirKitClient.AnonBodyLibraryHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyLinkage
import typingsSlinky.fhirKitClient.AnonBodyLinkageHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyList
import typingsSlinky.fhirKitClient.AnonBodyListHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyLocation
import typingsSlinky.fhirKitClient.AnonBodyLocationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMeasure
import typingsSlinky.fhirKitClient.AnonBodyMeasureHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMeasureReport
import typingsSlinky.fhirKitClient.AnonBodyMeasureReportHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedia
import typingsSlinky.fhirKitClient.AnonBodyMediaHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedication
import typingsSlinky.fhirKitClient.AnonBodyMedicationAdministration
import typingsSlinky.fhirKitClient.AnonBodyMedicationAdministrationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedicationDispense
import typingsSlinky.fhirKitClient.AnonBodyMedicationDispenseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedicationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedicationRequest
import typingsSlinky.fhirKitClient.AnonBodyMedicationRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMedicationStatement
import typingsSlinky.fhirKitClient.AnonBodyMedicationStatementHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMessageDefinition
import typingsSlinky.fhirKitClient.AnonBodyMessageDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyMessageHeader
import typingsSlinky.fhirKitClient.AnonBodyMessageHeaderHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyNamingSystem
import typingsSlinky.fhirKitClient.AnonBodyNamingSystemHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyNutritionOrder
import typingsSlinky.fhirKitClient.AnonBodyNutritionOrderHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyObservation
import typingsSlinky.fhirKitClient.AnonBodyObservationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyOperationDefinition
import typingsSlinky.fhirKitClient.AnonBodyOperationDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyOperationOutcome
import typingsSlinky.fhirKitClient.AnonBodyOperationOutcomeHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyOrganization
import typingsSlinky.fhirKitClient.AnonBodyOrganizationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyParameters
import typingsSlinky.fhirKitClient.AnonBodyParametersHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPatient
import typingsSlinky.fhirKitClient.AnonBodyPatientHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPaymentNotice
import typingsSlinky.fhirKitClient.AnonBodyPaymentNoticeHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPaymentReconciliation
import typingsSlinky.fhirKitClient.AnonBodyPaymentReconciliationHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPerson
import typingsSlinky.fhirKitClient.AnonBodyPersonHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPlanDefinition
import typingsSlinky.fhirKitClient.AnonBodyPlanDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPractitioner
import typingsSlinky.fhirKitClient.AnonBodyPractitionerHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyPractitionerRole
import typingsSlinky.fhirKitClient.AnonBodyPractitionerRoleHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyProcedure
import typingsSlinky.fhirKitClient.AnonBodyProcedureHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyProcedureRequest
import typingsSlinky.fhirKitClient.AnonBodyProcedureRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyProcessRequest
import typingsSlinky.fhirKitClient.AnonBodyProcessRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyProcessResponse
import typingsSlinky.fhirKitClient.AnonBodyProcessResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyProvenance
import typingsSlinky.fhirKitClient.AnonBodyProvenanceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyQuestionnaire
import typingsSlinky.fhirKitClient.AnonBodyQuestionnaireHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyQuestionnaireResponse
import typingsSlinky.fhirKitClient.AnonBodyQuestionnaireResponseHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyReferralRequest
import typingsSlinky.fhirKitClient.AnonBodyReferralRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyRelatedPerson
import typingsSlinky.fhirKitClient.AnonBodyRelatedPersonHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyRequestGroup
import typingsSlinky.fhirKitClient.AnonBodyRequestGroupHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyResearchStudy
import typingsSlinky.fhirKitClient.AnonBodyResearchStudyHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyResearchSubject
import typingsSlinky.fhirKitClient.AnonBodyResearchSubjectHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyRiskAssessment
import typingsSlinky.fhirKitClient.AnonBodyRiskAssessmentHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySchedule
import typingsSlinky.fhirKitClient.AnonBodyScheduleHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySearchParameter
import typingsSlinky.fhirKitClient.AnonBodySearchParameterHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySequence
import typingsSlinky.fhirKitClient.AnonBodySequenceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyServiceDefinition
import typingsSlinky.fhirKitClient.AnonBodyServiceDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySlot
import typingsSlinky.fhirKitClient.AnonBodySlotHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySpecimen
import typingsSlinky.fhirKitClient.AnonBodySpecimenHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyStructureDefinition
import typingsSlinky.fhirKitClient.AnonBodyStructureDefinitionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyStructureMap
import typingsSlinky.fhirKitClient.AnonBodyStructureMapHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySubscription
import typingsSlinky.fhirKitClient.AnonBodySubscriptionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySubstance
import typingsSlinky.fhirKitClient.AnonBodySubstanceHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySupplyDelivery
import typingsSlinky.fhirKitClient.AnonBodySupplyDeliveryHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodySupplyRequest
import typingsSlinky.fhirKitClient.AnonBodySupplyRequestHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyT
import typingsSlinky.fhirKitClient.AnonBodyTHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyTask
import typingsSlinky.fhirKitClient.AnonBodyTaskHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyTestReport
import typingsSlinky.fhirKitClient.AnonBodyTestReportHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyTestScript
import typingsSlinky.fhirKitClient.AnonBodyTestScriptHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyValueSet
import typingsSlinky.fhirKitClient.AnonBodyValueSetHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBodyVisionPrescription
import typingsSlinky.fhirKitClient.AnonBodyVisionPrescriptionHeadersHeaders
import typingsSlinky.fhirKitClient.AnonBundle
import typingsSlinky.fhirKitClient.AnonCompartment
import typingsSlinky.fhirKitClient.AnonCompartmentHeaders
import typingsSlinky.fhirKitClient.AnonContext
import typingsSlinky.fhirKitClient.AnonHeaders
import typingsSlinky.fhirKitClient.AnonHeadersHeaders
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdString
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArray
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptions
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptions
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonHeadersHeadersIdStringOptionsOptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.AnonHeadersHeadersOptionsOptions
import typingsSlinky.fhirKitClient.AnonHeadersId
import typingsSlinky.fhirKitClient.AnonHeadersIdJSONPatch
import typingsSlinky.fhirKitClient.AnonHeadersIdJSONPatchOptions
import typingsSlinky.fhirKitClient.AnonHeadersIdJSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.AnonHeadersIdOptions
import typingsSlinky.fhirKitClient.AnonHeadersIdOptionsResourceType
import typingsSlinky.fhirKitClient.AnonHeadersIdOptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.AnonHeadersOptions
import typingsSlinky.fhirKitClient.AnonHeadersOptionsResourceType
import typingsSlinky.fhirKitClient.AnonId
import typingsSlinky.fhirKitClient.AnonIdJSONPatch
import typingsSlinky.fhirKitClient.AnonIdJSONPatchOptions
import typingsSlinky.fhirKitClient.AnonIdJSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.AnonIdOptions
import typingsSlinky.fhirKitClient.AnonIdOptionsResourceType
import typingsSlinky.fhirKitClient.AnonIdOptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.AnonIdString
import typingsSlinky.fhirKitClient.AnonIdStringJSONPatchArray
import typingsSlinky.fhirKitClient.AnonIdStringJSONPatchArrayOptionsOptions
import typingsSlinky.fhirKitClient.AnonIdStringJSONPatchArrayOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonIdStringOptionsOptions
import typingsSlinky.fhirKitClient.AnonIdStringOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonIdStringOptionsOptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.AnonJSONPatch
import typingsSlinky.fhirKitClient.AnonJSONPatchArray
import typingsSlinky.fhirKitClient.AnonJSONPatchArrayOptionsOptions
import typingsSlinky.fhirKitClient.AnonJSONPatchArrayOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonJSONPatchArrayOptionsOptionsResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.AnonJSONPatchOptions
import typingsSlinky.fhirKitClient.AnonJSONPatchOptionsResourceType
import typingsSlinky.fhirKitClient.AnonOptions
import typingsSlinky.fhirKitClient.AnonOptionsOptions
import typingsSlinky.fhirKitClient.AnonOptionsOptionsResourceType
import typingsSlinky.fhirKitClient.AnonOptionsOptionsResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.AnonOptionsOptionsResourceTypeResourceType
import typingsSlinky.fhirKitClient.AnonOptionsOptionsResourceTypeVersionString
import typingsSlinky.fhirKitClient.AnonOptionsResourceType
import typingsSlinky.fhirKitClient.AnonOptionsResourceTypeVersion
import typingsSlinky.fhirKitClient.AnonOptionsSearchParams
import typingsSlinky.fhirKitClient.AnonResourceType
import typingsSlinky.fhirKitClient.AnonResourceTypeCustomResourceType
import typingsSlinky.fhirKitClient.AnonResourceTypeResourceType
import typingsSlinky.fhirKitClient.AnonResourceTypeVersion
import typingsSlinky.fhirKitClient.AnonResourceTypeVersionString
import typingsSlinky.fhirKitClient.AnonSearchParams
import typingsSlinky.fhirKitClient.AnonType
import typingsSlinky.fhirKitClient.AnonVersion
import typingsSlinky.fhirKitClient.AnonVersionString
import typingsSlinky.fhirKitClient.Bundletypebatchresponse
import typingsSlinky.fhirKitClient.Bundletypehistory
import typingsSlinky.fhirKitClient.Bundletypesearchset
import typingsSlinky.fhirKitClient.Bundletypetransactionresp
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
  def batch(params: AnonBodyBundletypebatch): js.Promise[OperationOutcome | Bundletypebatchresponse] = js.native
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
  def capabilityStatement(params: AnonHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
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
  def compartmentSearch(params: AnonCompartmentHeaders): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
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
  def create(params: AnonBody): js.Promise[OperationOutcome | Account] = js.native
  def create(params: AnonBodyAuditEvent): js.Promise[OperationOutcome | AuditEvent] = js.native
  def create(params: AnonBodyBasic): js.Promise[OperationOutcome | Basic] = js.native
  def create(params: AnonBodyBinary): js.Promise[OperationOutcome | Binary] = js.native
  def create(params: AnonBodyBodySite): js.Promise[OperationOutcome | BodySite] = js.native
  def create(params: AnonBodyBundle): js.Promise[OperationOutcome | Bundle] = js.native
  def create(params: AnonBodyCapabilityStatement): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def create(params: AnonBodyCarePlan): js.Promise[OperationOutcome | CarePlan] = js.native
  def create(params: AnonBodyCareTeam): js.Promise[OperationOutcome | CareTeam] = js.native
  def create(params: AnonBodyChargeItem): js.Promise[OperationOutcome | ChargeItem] = js.native
  def create(params: AnonBodyClaim): js.Promise[OperationOutcome | Claim] = js.native
  def create(params: AnonBodyClaimResponse): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def create(params: AnonBodyClinicalImpression): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def create(params: AnonBodyCodeSystem): js.Promise[OperationOutcome | CodeSystem] = js.native
  def create(params: AnonBodyCommunication): js.Promise[OperationOutcome | Communication] = js.native
  def create(params: AnonBodyCommunicationRequest): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def create(params: AnonBodyCompartmentDefinition): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def create(params: AnonBodyComposition): js.Promise[OperationOutcome | Composition] = js.native
  def create(params: AnonBodyConceptMap): js.Promise[OperationOutcome | ConceptMap] = js.native
  def create(params: AnonBodyCondition): js.Promise[OperationOutcome | Condition] = js.native
  def create(params: AnonBodyConsent): js.Promise[OperationOutcome | Consent] = js.native
  def create(params: AnonBodyContract): js.Promise[OperationOutcome | Contract] = js.native
  def create(params: AnonBodyCoverage): js.Promise[OperationOutcome | Coverage] = js.native
  def create(params: AnonBodyDataElement): js.Promise[OperationOutcome | DataElement] = js.native
  def create(params: AnonBodyDetectedIssue): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def create(params: AnonBodyDevice): js.Promise[OperationOutcome | Device] = js.native
  def create(params: AnonBodyDeviceComponent): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def create(params: AnonBodyDeviceMetric): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def create(params: AnonBodyDeviceRequest): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def create(params: AnonBodyDeviceUseStatement): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def create(params: AnonBodyDiagnosticReport): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def create(params: AnonBodyDocumentManifest): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def create(params: AnonBodyDocumentReference): js.Promise[OperationOutcome | DocumentReference] = js.native
  def create(params: AnonBodyDomainResource): js.Promise[OperationOutcome | DomainResource] = js.native
  def create(params: AnonBodyEligibilityRequest): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def create(params: AnonBodyEligibilityResponse): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def create(params: AnonBodyEncounter): js.Promise[OperationOutcome | Encounter] = js.native
  def create(params: AnonBodyEndpoint): js.Promise[OperationOutcome | Endpoint] = js.native
  def create(params: AnonBodyEnrollmentRequest): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def create(params: AnonBodyEnrollmentResponse): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def create(params: AnonBodyEpisodeOfCare): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def create(params: AnonBodyExpansionProfile): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def create(params: AnonBodyExplanationOfBenefit): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def create(params: AnonBodyFamilyMemberHistory): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def create(params: AnonBodyFlag): js.Promise[OperationOutcome | Flag] = js.native
  def create(params: AnonBodyGoal): js.Promise[OperationOutcome | Goal] = js.native
  def create(params: AnonBodyGraphDefinition): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def create(params: AnonBodyGroup): js.Promise[OperationOutcome | Group] = js.native
  def create(params: AnonBodyGuidanceResponse): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def create(params: AnonBodyHeaders): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def create(params: AnonBodyHeadersOptions): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def create(params: AnonBodyHeadersOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def create(params: AnonBodyHealthcareService): js.Promise[OperationOutcome | HealthcareService] = js.native
  def create(params: AnonBodyImagingManifest): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def create(params: AnonBodyImagingStudy): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def create(params: AnonBodyImmunization): js.Promise[OperationOutcome | Immunization] = js.native
  def create(params: AnonBodyImmunizationRecommendation): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def create(params: AnonBodyImplementationGuide): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def create(params: AnonBodyLibrary): js.Promise[OperationOutcome | Library] = js.native
  def create(params: AnonBodyLinkage): js.Promise[OperationOutcome | Linkage] = js.native
  def create(params: AnonBodyList): js.Promise[OperationOutcome | List] = js.native
  def create(params: AnonBodyLocation): js.Promise[OperationOutcome | Location] = js.native
  def create(params: AnonBodyMeasure): js.Promise[OperationOutcome | Measure] = js.native
  def create(params: AnonBodyMeasureReport): js.Promise[OperationOutcome | MeasureReport] = js.native
  def create(params: AnonBodyMedia): js.Promise[OperationOutcome | Media] = js.native
  def create(params: AnonBodyMedication): js.Promise[OperationOutcome | Medication] = js.native
  def create(params: AnonBodyMedicationAdministration): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def create(params: AnonBodyMedicationDispense): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def create(params: AnonBodyMedicationRequest): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def create(params: AnonBodyMedicationStatement): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def create(params: AnonBodyMessageDefinition): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def create(params: AnonBodyMessageHeader): js.Promise[OperationOutcome | MessageHeader] = js.native
  def create(params: AnonBodyNamingSystem): js.Promise[OperationOutcome | NamingSystem] = js.native
  def create(params: AnonBodyNutritionOrder): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def create(params: AnonBodyObservation): js.Promise[OperationOutcome | Observation] = js.native
  def create(params: AnonBodyOperationDefinition): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def create(params: AnonBodyOperationOutcome): js.Promise[OperationOutcome] = js.native
  def create(params: AnonBodyOrganization): js.Promise[OperationOutcome | Organization] = js.native
  def create(params: AnonBodyParameters): js.Promise[OperationOutcome | Parameters] = js.native
  def create(params: AnonBodyPatient): js.Promise[OperationOutcome | Patient] = js.native
  def create(params: AnonBodyPaymentNotice): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def create(params: AnonBodyPaymentReconciliation): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def create(params: AnonBodyPerson): js.Promise[OperationOutcome | Person] = js.native
  def create(params: AnonBodyPlanDefinition): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def create(params: AnonBodyPractitioner): js.Promise[OperationOutcome | Practitioner] = js.native
  def create(params: AnonBodyPractitionerRole): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def create(params: AnonBodyProcedure): js.Promise[OperationOutcome | Procedure] = js.native
  def create(params: AnonBodyProcedureRequest): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def create(params: AnonBodyProcessRequest): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def create(params: AnonBodyProcessResponse): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def create(params: AnonBodyProvenance): js.Promise[OperationOutcome | Provenance] = js.native
  def create(params: AnonBodyQuestionnaire): js.Promise[OperationOutcome | Questionnaire] = js.native
  def create(params: AnonBodyQuestionnaireResponse): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def create(params: AnonBodyReferralRequest): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def create(params: AnonBodyRelatedPerson): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def create(params: AnonBodyRequestGroup): js.Promise[OperationOutcome | RequestGroup] = js.native
  def create(params: AnonBodyResearchStudy): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def create(params: AnonBodyResearchSubject): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def create(params: AnonBodyRiskAssessment): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def create(params: AnonBodySchedule): js.Promise[OperationOutcome | Schedule] = js.native
  def create(params: AnonBodySearchParameter): js.Promise[OperationOutcome | SearchParameter] = js.native
  def create(params: AnonBodySequence): js.Promise[OperationOutcome | Sequence] = js.native
  def create(params: AnonBodyServiceDefinition): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def create(params: AnonBodySlot): js.Promise[OperationOutcome | Slot] = js.native
  def create(params: AnonBodySpecimen): js.Promise[OperationOutcome | Specimen] = js.native
  def create(params: AnonBodyStructureDefinition): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def create(params: AnonBodyStructureMap): js.Promise[OperationOutcome | StructureMap] = js.native
  def create(params: AnonBodySubscription): js.Promise[OperationOutcome | Subscription] = js.native
  def create(params: AnonBodySubstance): js.Promise[OperationOutcome | Substance] = js.native
  def create(params: AnonBodySupplyDelivery): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def create(params: AnonBodySupplyRequest): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def create(params: AnonBodyTask): js.Promise[OperationOutcome | Task] = js.native
  def create(params: AnonBodyTestReport): js.Promise[OperationOutcome | TestReport] = js.native
  def create(params: AnonBodyTestScript): js.Promise[OperationOutcome | TestScript] = js.native
  def create(params: AnonBodyValueSet): js.Promise[OperationOutcome | ValueSet] = js.native
  def create(params: AnonBodyVisionPrescription): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def create(params: AnonHeadersOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def create(params: AnonHeadersOptionsResourceType): js.Promise[OperationOutcome | Appointment] = js.native
  def create[T /* <: CustomResource */](params: AnonBodyT[T]): js.Promise[OperationOutcome | T] = js.native
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
  def delete(params: AnonResourceTypeResourceType): js.Promise[OperationOutcome] = js.native
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
  def history(params: AnonOptionsOptionsResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
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
  def nextPage[T /* <: String */](params: AnonBundle[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def nextPage[T /* <: String */](params: AnonBundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def patch(params: Anon208): js.Promise[OperationOutcome | CodeSystem] = js.native
  def patch(params: Anon209): js.Promise[OperationOutcome | Communication] = js.native
  def patch(params: Anon210): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def patch(params: Anon211): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def patch(params: Anon212): js.Promise[OperationOutcome | Composition] = js.native
  def patch(params: Anon213): js.Promise[OperationOutcome | ConceptMap] = js.native
  def patch(params: Anon214): js.Promise[OperationOutcome | Condition] = js.native
  def patch(params: Anon215): js.Promise[OperationOutcome | Consent] = js.native
  def patch(params: Anon216): js.Promise[OperationOutcome | Contract] = js.native
  def patch(params: Anon217): js.Promise[OperationOutcome | Coverage] = js.native
  def patch(params: Anon218): js.Promise[OperationOutcome | DataElement] = js.native
  def patch(params: Anon219): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def patch(params: Anon220): js.Promise[OperationOutcome | Device] = js.native
  def patch(params: Anon221): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def patch(params: Anon222): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def patch(params: Anon223): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def patch(params: Anon224): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def patch(params: Anon225): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def patch(params: Anon226): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def patch(params: Anon227): js.Promise[OperationOutcome | DocumentReference] = js.native
  def patch(params: Anon228): js.Promise[OperationOutcome | DomainResource] = js.native
  def patch(params: Anon229): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def patch(params: Anon230): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def patch(params: Anon231): js.Promise[OperationOutcome | Encounter] = js.native
  def patch(params: Anon232): js.Promise[OperationOutcome | Endpoint] = js.native
  def patch(params: Anon233): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def patch(params: Anon234): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def patch(params: Anon235): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def patch(params: Anon236): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def patch(params: Anon237): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def patch(params: Anon238): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def patch(params: Anon239): js.Promise[OperationOutcome | Flag] = js.native
  def patch(params: Anon240): js.Promise[OperationOutcome | Goal] = js.native
  def patch(params: Anon241): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def patch(params: Anon242): js.Promise[OperationOutcome | Group] = js.native
  def patch(params: Anon243): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def patch(params: Anon244): js.Promise[OperationOutcome | HealthcareService] = js.native
  def patch(params: Anon245): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def patch(params: Anon246): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def patch(params: Anon247): js.Promise[OperationOutcome | Immunization] = js.native
  def patch(params: Anon248): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def patch(params: Anon249): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def patch(params: Anon250): js.Promise[OperationOutcome | Library] = js.native
  def patch(params: Anon251): js.Promise[OperationOutcome | Linkage] = js.native
  def patch(params: Anon252): js.Promise[OperationOutcome | List] = js.native
  def patch(params: Anon253): js.Promise[OperationOutcome | Location] = js.native
  def patch(params: Anon254): js.Promise[OperationOutcome | Measure] = js.native
  def patch(params: Anon255): js.Promise[OperationOutcome | MeasureReport] = js.native
  def patch(params: Anon256): js.Promise[OperationOutcome | Media] = js.native
  def patch(params: Anon257): js.Promise[OperationOutcome | Medication] = js.native
  def patch(params: Anon258): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def patch(params: Anon259): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def patch(params: Anon260): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def patch(params: Anon261): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def patch(params: Anon262): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def patch(params: Anon263): js.Promise[OperationOutcome | MessageHeader] = js.native
  def patch(params: Anon264): js.Promise[OperationOutcome | NamingSystem] = js.native
  def patch(params: Anon265): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def patch(params: Anon266): js.Promise[OperationOutcome | Observation] = js.native
  def patch(params: Anon267): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def patch(params: Anon268): js.Promise[OperationOutcome] = js.native
  def patch(params: Anon269): js.Promise[OperationOutcome | Organization] = js.native
  def patch(params: Anon270): js.Promise[OperationOutcome | Parameters] = js.native
  def patch(params: Anon271): js.Promise[OperationOutcome | Patient] = js.native
  def patch(params: Anon272): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def patch(params: Anon273): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def patch(params: Anon274): js.Promise[OperationOutcome | Person] = js.native
  def patch(params: Anon275): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def patch(params: Anon276): js.Promise[OperationOutcome | Practitioner] = js.native
  def patch(params: Anon277): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def patch(params: Anon278): js.Promise[OperationOutcome | Procedure] = js.native
  def patch(params: Anon279): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def patch(params: Anon280): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def patch(params: Anon281): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def patch(params: Anon282): js.Promise[OperationOutcome | Provenance] = js.native
  def patch(params: Anon283): js.Promise[OperationOutcome | Questionnaire] = js.native
  def patch(params: Anon284): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def patch(params: Anon285): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def patch(params: Anon286): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def patch(params: Anon287): js.Promise[OperationOutcome | RequestGroup] = js.native
  def patch(params: Anon288): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def patch(params: Anon289): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def patch(params: Anon290): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def patch(params: Anon291): js.Promise[OperationOutcome | Schedule] = js.native
  def patch(params: Anon292): js.Promise[OperationOutcome | SearchParameter] = js.native
  def patch(params: Anon293): js.Promise[OperationOutcome | Sequence] = js.native
  def patch(params: Anon294): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def patch(params: Anon295): js.Promise[OperationOutcome | Slot] = js.native
  def patch(params: Anon296): js.Promise[OperationOutcome | Specimen] = js.native
  def patch(params: Anon297): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def patch(params: Anon298): js.Promise[OperationOutcome | StructureMap] = js.native
  def patch(params: Anon299): js.Promise[OperationOutcome | Subscription] = js.native
  def patch(params: Anon300): js.Promise[OperationOutcome | Substance] = js.native
  def patch(params: Anon301): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def patch(params: Anon302): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def patch(params: Anon303): js.Promise[OperationOutcome | Task] = js.native
  def patch(params: Anon304): js.Promise[OperationOutcome | TestReport] = js.native
  def patch(params: Anon305): js.Promise[OperationOutcome | TestScript] = js.native
  def patch(params: Anon306): js.Promise[OperationOutcome | ValueSet] = js.native
  def patch(params: Anon307): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArray): js.Promise[OperationOutcome | CarePlan] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | Claim] = js.native
  def patch(params: AnonHeadersHeadersIdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def patch(params: AnonHeadersIdJSONPatch): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def patch(params: AnonHeadersIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
  def patch(params: AnonIdJSONPatch): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def patch(params: AnonIdJSONPatchOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def patch(params: AnonIdJSONPatchOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def patch(params: AnonIdStringJSONPatchArray): js.Promise[OperationOutcome | Bundle] = js.native
  def patch(params: AnonIdStringJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def patch(params: AnonIdStringJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
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
  def patch(params: AnonJSONPatch): js.Promise[OperationOutcome | Account] = js.native
  def patch(params: AnonJSONPatchArray): js.Promise[OperationOutcome | BodySite] = js.native
  def patch(params: AnonJSONPatchArrayOptionsOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def patch(params: AnonJSONPatchArrayOptionsOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def patch(params: AnonJSONPatchArrayOptionsOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def patch(params: AnonJSONPatchOptions): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def patch(params: AnonJSONPatchOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
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
  def prevPage[T /* <: String */](params: AnonBundle[T]): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def prevPage[T /* <: String */](params: AnonBundle[T], headers: Headers): js.Promise[OperationOutcome | (Bundle with AnonType[T])] = js.native
  def read(params: Anon0): js.Promise[OperationOutcome | CodeSystem] = js.native
  def read(params: Anon1): js.Promise[OperationOutcome | Communication] = js.native
  def read(params: Anon10): js.Promise[OperationOutcome | DataElement] = js.native
  def read(params: Anon11): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def read(params: Anon12): js.Promise[OperationOutcome | Device] = js.native
  def read(params: Anon13): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def read(params: Anon14): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def read(params: Anon15): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def read(params: Anon16): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def read(params: Anon17): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def read(params: Anon18): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def read(params: Anon19): js.Promise[OperationOutcome | DocumentReference] = js.native
  def read(params: Anon2): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def read(params: Anon20): js.Promise[OperationOutcome | DomainResource] = js.native
  def read(params: Anon21): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def read(params: Anon22): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def read(params: Anon23): js.Promise[OperationOutcome | Encounter] = js.native
  def read(params: Anon24): js.Promise[OperationOutcome | Endpoint] = js.native
  def read(params: Anon25): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def read(params: Anon26): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def read(params: Anon27): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def read(params: Anon28): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def read(params: Anon29): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def read(params: Anon3): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def read(params: Anon30): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def read(params: Anon31): js.Promise[OperationOutcome | Flag] = js.native
  def read(params: Anon32): js.Promise[OperationOutcome | Goal] = js.native
  def read(params: Anon33): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def read(params: Anon34): js.Promise[OperationOutcome | Group] = js.native
  def read(params: Anon35): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def read(params: Anon36): js.Promise[OperationOutcome | HealthcareService] = js.native
  def read(params: Anon37): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def read(params: Anon38): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def read(params: Anon39): js.Promise[OperationOutcome | Immunization] = js.native
  def read(params: Anon4): js.Promise[OperationOutcome | Composition] = js.native
  def read(params: Anon40): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def read(params: Anon41): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def read(params: Anon42): js.Promise[OperationOutcome | Library] = js.native
  def read(params: Anon43): js.Promise[OperationOutcome | Linkage] = js.native
  def read(params: Anon44): js.Promise[OperationOutcome | List] = js.native
  def read(params: Anon45): js.Promise[OperationOutcome | Location] = js.native
  def read(params: Anon46): js.Promise[OperationOutcome | Measure] = js.native
  def read(params: Anon47): js.Promise[OperationOutcome | MeasureReport] = js.native
  def read(params: Anon48): js.Promise[OperationOutcome | Media] = js.native
  def read(params: Anon49): js.Promise[OperationOutcome | Medication] = js.native
  def read(params: Anon5): js.Promise[OperationOutcome | ConceptMap] = js.native
  def read(params: Anon50): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def read(params: Anon51): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def read(params: Anon52): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def read(params: Anon53): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def read(params: Anon54): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def read(params: Anon55): js.Promise[OperationOutcome | MessageHeader] = js.native
  def read(params: Anon56): js.Promise[OperationOutcome | NamingSystem] = js.native
  def read(params: Anon57): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def read(params: Anon58): js.Promise[OperationOutcome | Observation] = js.native
  def read(params: Anon59): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def read(params: Anon6): js.Promise[OperationOutcome | Condition] = js.native
  def read(params: Anon60): js.Promise[OperationOutcome] = js.native
  def read(params: Anon61): js.Promise[OperationOutcome | Organization] = js.native
  def read(params: Anon62): js.Promise[OperationOutcome | Parameters] = js.native
  def read(params: Anon63): js.Promise[OperationOutcome | Patient] = js.native
  def read(params: Anon64): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def read(params: Anon65): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def read(params: Anon66): js.Promise[OperationOutcome | Person] = js.native
  def read(params: Anon67): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def read(params: Anon68): js.Promise[OperationOutcome | Practitioner] = js.native
  def read(params: Anon69): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def read(params: Anon7): js.Promise[OperationOutcome | Consent] = js.native
  def read(params: Anon70): js.Promise[OperationOutcome | Procedure] = js.native
  def read(params: Anon71): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def read(params: Anon72): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def read(params: Anon73): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def read(params: Anon74): js.Promise[OperationOutcome | Provenance] = js.native
  def read(params: Anon75): js.Promise[OperationOutcome | Questionnaire] = js.native
  def read(params: Anon76): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def read(params: Anon77): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def read(params: Anon78): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def read(params: Anon79): js.Promise[OperationOutcome | RequestGroup] = js.native
  def read(params: Anon8): js.Promise[OperationOutcome | Contract] = js.native
  def read(params: Anon80): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def read(params: Anon81): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def read(params: Anon82): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def read(params: Anon83): js.Promise[OperationOutcome | Schedule] = js.native
  def read(params: Anon84): js.Promise[OperationOutcome | SearchParameter] = js.native
  def read(params: Anon85): js.Promise[OperationOutcome | Sequence] = js.native
  def read(params: Anon86): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def read(params: Anon87): js.Promise[OperationOutcome | Slot] = js.native
  def read(params: Anon88): js.Promise[OperationOutcome | Specimen] = js.native
  def read(params: Anon89): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def read(params: Anon9): js.Promise[OperationOutcome | Coverage] = js.native
  def read(params: Anon90): js.Promise[OperationOutcome | StructureMap] = js.native
  def read(params: Anon91): js.Promise[OperationOutcome | Subscription] = js.native
  def read(params: Anon92): js.Promise[OperationOutcome | Substance] = js.native
  def read(params: Anon93): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def read(params: Anon94): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def read(params: Anon95): js.Promise[OperationOutcome | Task] = js.native
  def read(params: Anon96): js.Promise[OperationOutcome | TestReport] = js.native
  def read(params: Anon97): js.Promise[OperationOutcome | TestScript] = js.native
  def read(params: Anon98): js.Promise[OperationOutcome | ValueSet] = js.native
  def read(params: Anon99): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def read(params: AnonHeadersHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def read(params: AnonHeadersHeadersIdString): js.Promise[OperationOutcome | CarePlan] = js.native
  def read(params: AnonHeadersHeadersIdStringOptionsOptions): js.Promise[OperationOutcome | Claim] = js.native
  def read(params: AnonHeadersHeadersIdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def read(params: AnonHeadersId): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def read(params: AnonHeadersIdOptions): js.Promise[OperationOutcome | AuditEvent] = js.native
  def read(params: AnonHeadersIdOptionsResourceType): js.Promise[OperationOutcome | Binary] = js.native
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
  def read(params: AnonId): js.Promise[OperationOutcome | Account] = js.native
  def read(params: AnonIdOptions): js.Promise[OperationOutcome | Appointment] = js.native
  def read(params: AnonIdOptionsResourceType): js.Promise[OperationOutcome | Basic] = js.native
  def read(params: AnonIdString): js.Promise[OperationOutcome | Bundle] = js.native
  def read(params: AnonIdStringOptionsOptions): js.Promise[OperationOutcome | CareTeam] = js.native
  def read(params: AnonIdStringOptionsOptionsResourceType): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def read(params: AnonOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def read(params: AnonOptionsOptions): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def read(params: AnonOptionsOptionsResourceType): js.Promise[OperationOutcome | ChargeItem] = js.native
  def read(params: AnonOptionsResourceType): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def read(params: AnonResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def read(params: AnonResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
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
  def resolve(params: AnonContext): js.Promise[FhirResource] = js.native
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
  def resourceHistory(params: AnonResourceTypeResourceType): js.Promise[OperationOutcome | Bundletypehistory] = js.native
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
  def resourceSearch(params: AnonSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
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
  def search(params: AnonCompartment): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
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
  def smartAuthMetadata(params: AnonHeaders): js.Promise[SmartAuthMetadata] = js.native
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
  def systemHistory(params: AnonHeaders): js.Promise[OperationOutcome | Bundletypehistory] = js.native
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
  def systemSearch(params: AnonOptionsSearchParams): js.Promise[OperationOutcome | Bundletypesearchset] = js.native
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
  def transaction(params: AnonBodyBundletypetransaction): js.Promise[OperationOutcome | Bundletypetransactionresp] = js.native
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
  def typeHistory(params: AnonHeadersHeadersOptionsOptions): js.Promise[OperationOutcome | Bundletypehistory] = js.native
  def update(params: AnonBodyAllergyIntolerance): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def update(params: AnonBodyAppointment): js.Promise[OperationOutcome | Appointment] = js.native
  def update(params: AnonBodyAppointmentResponse): js.Promise[OperationOutcome | AppointmentResponse] = js.native
  def update(params: AnonBodyAuditEventHeadersHeaders): js.Promise[OperationOutcome | AuditEvent] = js.native
  def update(params: AnonBodyBasicHeadersHeaders): js.Promise[OperationOutcome | Basic] = js.native
  def update(params: AnonBodyBinaryHeadersHeaders): js.Promise[OperationOutcome | Binary] = js.native
  def update(params: AnonBodyBodySiteHeadersHeaders): js.Promise[OperationOutcome | BodySite] = js.native
  def update(params: AnonBodyBundleHeadersHeaders): js.Promise[OperationOutcome | Bundle] = js.native
  def update(params: AnonBodyCapabilityStatementHeadersHeaders): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def update(params: AnonBodyCarePlanHeadersHeaders): js.Promise[OperationOutcome | CarePlan] = js.native
  def update(params: AnonBodyCareTeamHeadersHeaders): js.Promise[OperationOutcome | CareTeam] = js.native
  def update(params: AnonBodyChargeItemHeadersHeaders): js.Promise[OperationOutcome | ChargeItem] = js.native
  def update(params: AnonBodyClaimHeadersHeaders): js.Promise[OperationOutcome | Claim] = js.native
  def update(params: AnonBodyClaimResponseHeadersHeaders): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def update(params: AnonBodyClinicalImpressionHeadersHeaders): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def update(params: AnonBodyCodeSystemHeadersHeaders): js.Promise[OperationOutcome | CodeSystem] = js.native
  def update(params: AnonBodyCommunicationHeadersHeaders): js.Promise[OperationOutcome | Communication] = js.native
  def update(params: AnonBodyCommunicationRequestHeadersHeaders): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def update(params: AnonBodyCompartmentDefinitionHeadersHeaders): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def update(params: AnonBodyCompositionHeadersHeaders): js.Promise[OperationOutcome | Composition] = js.native
  def update(params: AnonBodyConceptMapHeadersHeaders): js.Promise[OperationOutcome | ConceptMap] = js.native
  def update(params: AnonBodyConditionHeadersHeaders): js.Promise[OperationOutcome | Condition] = js.native
  def update(params: AnonBodyConsentHeadersHeaders): js.Promise[OperationOutcome | Consent] = js.native
  def update(params: AnonBodyContractHeadersHeaders): js.Promise[OperationOutcome | Contract] = js.native
  def update(params: AnonBodyCoverageHeadersHeaders): js.Promise[OperationOutcome | Coverage] = js.native
  def update(params: AnonBodyDataElementHeadersHeaders): js.Promise[OperationOutcome | DataElement] = js.native
  def update(params: AnonBodyDetectedIssueHeadersHeaders): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def update(params: AnonBodyDeviceComponentHeadersHeaders): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def update(params: AnonBodyDeviceHeadersHeaders): js.Promise[OperationOutcome | Device] = js.native
  def update(params: AnonBodyDeviceMetricHeadersHeaders): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def update(params: AnonBodyDeviceRequestHeadersHeaders): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def update(params: AnonBodyDeviceUseStatementHeadersHeaders): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def update(params: AnonBodyDiagnosticReportHeadersHeaders): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def update(params: AnonBodyDocumentManifestHeadersHeaders): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def update(params: AnonBodyDocumentReferenceHeadersHeaders): js.Promise[OperationOutcome | DocumentReference] = js.native
  def update(params: AnonBodyDomainResourceHeadersHeaders): js.Promise[OperationOutcome | DomainResource] = js.native
  def update(params: AnonBodyEligibilityRequestHeadersHeaders): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def update(params: AnonBodyEligibilityResponseHeadersHeaders): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def update(params: AnonBodyEncounterHeadersHeaders): js.Promise[OperationOutcome | Encounter] = js.native
  def update(params: AnonBodyEndpointHeadersHeaders): js.Promise[OperationOutcome | Endpoint] = js.native
  def update(params: AnonBodyEnrollmentRequestHeadersHeaders): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def update(params: AnonBodyEnrollmentResponseHeadersHeaders): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def update(params: AnonBodyEpisodeOfCareHeadersHeaders): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def update(params: AnonBodyExpansionProfileHeadersHeaders): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def update(params: AnonBodyExplanationOfBenefitHeadersHeaders): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def update(params: AnonBodyFamilyMemberHistoryHeadersHeaders): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def update(params: AnonBodyFlagHeadersHeaders): js.Promise[OperationOutcome | Flag] = js.native
  def update(params: AnonBodyGoalHeadersHeaders): js.Promise[OperationOutcome | Goal] = js.native
  def update(params: AnonBodyGraphDefinitionHeadersHeaders): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def update(params: AnonBodyGroupHeadersHeaders): js.Promise[OperationOutcome | Group] = js.native
  def update(params: AnonBodyGuidanceResponseHeadersHeaders): js.Promise[OperationOutcome | GuidanceResponse] = js.native
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
  def update(params: AnonBodyHeadersId): js.Promise[OperationOutcome | Account] = js.native
  def update(params: AnonBodyHeadersIdOptions): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def update(params: AnonBodyHeadersIdOptionsResourceType): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def update(params: AnonBodyHealthcareServiceHeadersHeaders): js.Promise[OperationOutcome | HealthcareService] = js.native
  def update(params: AnonBodyImagingManifestHeadersHeaders): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def update(params: AnonBodyImagingStudyHeadersHeaders): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def update(params: AnonBodyImmunizationHeadersHeaders): js.Promise[OperationOutcome | Immunization] = js.native
  def update(params: AnonBodyImmunizationRecommendationHeadersHeaders): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def update(params: AnonBodyImplementationGuideHeadersHeaders): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def update(params: AnonBodyLibraryHeadersHeaders): js.Promise[OperationOutcome | Library] = js.native
  def update(params: AnonBodyLinkageHeadersHeaders): js.Promise[OperationOutcome | Linkage] = js.native
  def update(params: AnonBodyListHeadersHeaders): js.Promise[OperationOutcome | List] = js.native
  def update(params: AnonBodyLocationHeadersHeaders): js.Promise[OperationOutcome | Location] = js.native
  def update(params: AnonBodyMeasureHeadersHeaders): js.Promise[OperationOutcome | Measure] = js.native
  def update(params: AnonBodyMeasureReportHeadersHeaders): js.Promise[OperationOutcome | MeasureReport] = js.native
  def update(params: AnonBodyMediaHeadersHeaders): js.Promise[OperationOutcome | Media] = js.native
  def update(params: AnonBodyMedicationAdministrationHeadersHeaders): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def update(params: AnonBodyMedicationDispenseHeadersHeaders): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def update(params: AnonBodyMedicationHeadersHeaders): js.Promise[OperationOutcome | Medication] = js.native
  def update(params: AnonBodyMedicationRequestHeadersHeaders): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def update(params: AnonBodyMedicationStatementHeadersHeaders): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def update(params: AnonBodyMessageDefinitionHeadersHeaders): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def update(params: AnonBodyMessageHeaderHeadersHeaders): js.Promise[OperationOutcome | MessageHeader] = js.native
  def update(params: AnonBodyNamingSystemHeadersHeaders): js.Promise[OperationOutcome | NamingSystem] = js.native
  def update(params: AnonBodyNutritionOrderHeadersHeaders): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def update(params: AnonBodyObservationHeadersHeaders): js.Promise[OperationOutcome | Observation] = js.native
  def update(params: AnonBodyOperationDefinitionHeadersHeaders): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def update(params: AnonBodyOperationOutcomeHeadersHeaders): js.Promise[OperationOutcome] = js.native
  def update(params: AnonBodyOrganizationHeadersHeaders): js.Promise[OperationOutcome | Organization] = js.native
  def update(params: AnonBodyParametersHeadersHeaders): js.Promise[OperationOutcome | Parameters] = js.native
  def update(params: AnonBodyPatientHeadersHeaders): js.Promise[OperationOutcome | Patient] = js.native
  def update(params: AnonBodyPaymentNoticeHeadersHeaders): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def update(params: AnonBodyPaymentReconciliationHeadersHeaders): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def update(params: AnonBodyPersonHeadersHeaders): js.Promise[OperationOutcome | Person] = js.native
  def update(params: AnonBodyPlanDefinitionHeadersHeaders): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def update(params: AnonBodyPractitionerHeadersHeaders): js.Promise[OperationOutcome | Practitioner] = js.native
  def update(params: AnonBodyPractitionerRoleHeadersHeaders): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def update(params: AnonBodyProcedureHeadersHeaders): js.Promise[OperationOutcome | Procedure] = js.native
  def update(params: AnonBodyProcedureRequestHeadersHeaders): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def update(params: AnonBodyProcessRequestHeadersHeaders): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def update(params: AnonBodyProcessResponseHeadersHeaders): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def update(params: AnonBodyProvenanceHeadersHeaders): js.Promise[OperationOutcome | Provenance] = js.native
  def update(params: AnonBodyQuestionnaireHeadersHeaders): js.Promise[OperationOutcome | Questionnaire] = js.native
  def update(params: AnonBodyQuestionnaireResponseHeadersHeaders): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def update(params: AnonBodyReferralRequestHeadersHeaders): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def update(params: AnonBodyRelatedPersonHeadersHeaders): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def update(params: AnonBodyRequestGroupHeadersHeaders): js.Promise[OperationOutcome | RequestGroup] = js.native
  def update(params: AnonBodyResearchStudyHeadersHeaders): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def update(params: AnonBodyResearchSubjectHeadersHeaders): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def update(params: AnonBodyRiskAssessmentHeadersHeaders): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def update(params: AnonBodyScheduleHeadersHeaders): js.Promise[OperationOutcome | Schedule] = js.native
  def update(params: AnonBodySearchParameterHeadersHeaders): js.Promise[OperationOutcome | SearchParameter] = js.native
  def update(params: AnonBodySequenceHeadersHeaders): js.Promise[OperationOutcome | Sequence] = js.native
  def update(params: AnonBodyServiceDefinitionHeadersHeaders): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def update(params: AnonBodySlotHeadersHeaders): js.Promise[OperationOutcome | Slot] = js.native
  def update(params: AnonBodySpecimenHeadersHeaders): js.Promise[OperationOutcome | Specimen] = js.native
  def update(params: AnonBodyStructureDefinitionHeadersHeaders): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def update(params: AnonBodyStructureMapHeadersHeaders): js.Promise[OperationOutcome | StructureMap] = js.native
  def update(params: AnonBodySubscriptionHeadersHeaders): js.Promise[OperationOutcome | Subscription] = js.native
  def update(params: AnonBodySubstanceHeadersHeaders): js.Promise[OperationOutcome | Substance] = js.native
  def update(params: AnonBodySupplyDeliveryHeadersHeaders): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def update(params: AnonBodySupplyRequestHeadersHeaders): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def update(params: AnonBodyTaskHeadersHeaders): js.Promise[OperationOutcome | Task] = js.native
  def update(params: AnonBodyTestReportHeadersHeaders): js.Promise[OperationOutcome | TestReport] = js.native
  def update(params: AnonBodyTestScriptHeadersHeaders): js.Promise[OperationOutcome | TestScript] = js.native
  def update(params: AnonBodyValueSetHeadersHeaders): js.Promise[OperationOutcome | ValueSet] = js.native
  def update(params: AnonBodyVisionPrescriptionHeadersHeaders): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def update[T /* <: CustomResource */](params: AnonBodyTHeadersHeaders[T]): js.Promise[OperationOutcome | T] = js.native
  def vread(params: Anon100): js.Promise[OperationOutcome | Bundle] = js.native
  def vread(params: Anon101): js.Promise[OperationOutcome | CapabilityStatement] = js.native
  def vread(params: Anon102): js.Promise[OperationOutcome | CarePlan] = js.native
  def vread(params: Anon103): js.Promise[OperationOutcome | CareTeam] = js.native
  def vread(params: Anon104): js.Promise[OperationOutcome | ChargeItem] = js.native
  def vread(params: Anon105): js.Promise[OperationOutcome | Claim] = js.native
  def vread(params: Anon106): js.Promise[OperationOutcome | ClaimResponse] = js.native
  def vread(params: Anon107): js.Promise[OperationOutcome | ClinicalImpression] = js.native
  def vread(params: Anon108): js.Promise[OperationOutcome | CodeSystem] = js.native
  def vread(params: Anon109): js.Promise[OperationOutcome | Communication] = js.native
  def vread(params: Anon110): js.Promise[OperationOutcome | CommunicationRequest] = js.native
  def vread(params: Anon111): js.Promise[OperationOutcome | CompartmentDefinition] = js.native
  def vread(params: Anon112): js.Promise[OperationOutcome | Composition] = js.native
  def vread(params: Anon113): js.Promise[OperationOutcome | ConceptMap] = js.native
  def vread(params: Anon114): js.Promise[OperationOutcome | Condition] = js.native
  def vread(params: Anon115): js.Promise[OperationOutcome | Consent] = js.native
  def vread(params: Anon116): js.Promise[OperationOutcome | Contract] = js.native
  def vread(params: Anon117): js.Promise[OperationOutcome | Coverage] = js.native
  def vread(params: Anon118): js.Promise[OperationOutcome | DataElement] = js.native
  def vread(params: Anon119): js.Promise[OperationOutcome | DetectedIssue] = js.native
  def vread(params: Anon120): js.Promise[OperationOutcome | Device] = js.native
  def vread(params: Anon121): js.Promise[OperationOutcome | DeviceComponent] = js.native
  def vread(params: Anon122): js.Promise[OperationOutcome | DeviceMetric] = js.native
  def vread(params: Anon123): js.Promise[OperationOutcome | DeviceRequest] = js.native
  def vread(params: Anon124): js.Promise[OperationOutcome | DeviceUseStatement] = js.native
  def vread(params: Anon125): js.Promise[OperationOutcome | DiagnosticReport] = js.native
  def vread(params: Anon126): js.Promise[OperationOutcome | DocumentManifest] = js.native
  def vread(params: Anon127): js.Promise[OperationOutcome | DocumentReference] = js.native
  def vread(params: Anon128): js.Promise[OperationOutcome | DomainResource] = js.native
  def vread(params: Anon129): js.Promise[OperationOutcome | EligibilityRequest] = js.native
  def vread(params: Anon130): js.Promise[OperationOutcome | EligibilityResponse] = js.native
  def vread(params: Anon131): js.Promise[OperationOutcome | Encounter] = js.native
  def vread(params: Anon132): js.Promise[OperationOutcome | Endpoint] = js.native
  def vread(params: Anon133): js.Promise[OperationOutcome | EnrollmentRequest] = js.native
  def vread(params: Anon134): js.Promise[OperationOutcome | EnrollmentResponse] = js.native
  def vread(params: Anon135): js.Promise[OperationOutcome | EpisodeOfCare] = js.native
  def vread(params: Anon136): js.Promise[OperationOutcome | ExpansionProfile] = js.native
  def vread(params: Anon137): js.Promise[OperationOutcome | ExplanationOfBenefit] = js.native
  def vread(params: Anon138): js.Promise[OperationOutcome | FamilyMemberHistory] = js.native
  def vread(params: Anon139): js.Promise[OperationOutcome | Flag] = js.native
  def vread(params: Anon140): js.Promise[OperationOutcome | Goal] = js.native
  def vread(params: Anon141): js.Promise[OperationOutcome | GraphDefinition] = js.native
  def vread(params: Anon142): js.Promise[OperationOutcome | Group] = js.native
  def vread(params: Anon143): js.Promise[OperationOutcome | GuidanceResponse] = js.native
  def vread(params: Anon144): js.Promise[OperationOutcome | HealthcareService] = js.native
  def vread(params: Anon145): js.Promise[OperationOutcome | ImagingManifest] = js.native
  def vread(params: Anon146): js.Promise[OperationOutcome | ImagingStudy] = js.native
  def vread(params: Anon147): js.Promise[OperationOutcome | Immunization] = js.native
  def vread(params: Anon148): js.Promise[OperationOutcome | ImmunizationRecommendation] = js.native
  def vread(params: Anon149): js.Promise[OperationOutcome | ImplementationGuide] = js.native
  def vread(params: Anon150): js.Promise[OperationOutcome | Library] = js.native
  def vread(params: Anon151): js.Promise[OperationOutcome | Linkage] = js.native
  def vread(params: Anon152): js.Promise[OperationOutcome | List] = js.native
  def vread(params: Anon153): js.Promise[OperationOutcome | Location] = js.native
  def vread(params: Anon154): js.Promise[OperationOutcome | Measure] = js.native
  def vread(params: Anon155): js.Promise[OperationOutcome | MeasureReport] = js.native
  def vread(params: Anon156): js.Promise[OperationOutcome | Media] = js.native
  def vread(params: Anon157): js.Promise[OperationOutcome | Medication] = js.native
  def vread(params: Anon158): js.Promise[OperationOutcome | MedicationAdministration] = js.native
  def vread(params: Anon159): js.Promise[OperationOutcome | MedicationDispense] = js.native
  def vread(params: Anon160): js.Promise[OperationOutcome | MedicationRequest] = js.native
  def vread(params: Anon161): js.Promise[OperationOutcome | MedicationStatement] = js.native
  def vread(params: Anon162): js.Promise[OperationOutcome | MessageDefinition] = js.native
  def vread(params: Anon163): js.Promise[OperationOutcome | MessageHeader] = js.native
  def vread(params: Anon164): js.Promise[OperationOutcome | NamingSystem] = js.native
  def vread(params: Anon165): js.Promise[OperationOutcome | NutritionOrder] = js.native
  def vread(params: Anon166): js.Promise[OperationOutcome | Observation] = js.native
  def vread(params: Anon167): js.Promise[OperationOutcome | OperationDefinition] = js.native
  def vread(params: Anon168): js.Promise[OperationOutcome] = js.native
  def vread(params: Anon169): js.Promise[OperationOutcome | Organization] = js.native
  def vread(params: Anon170): js.Promise[OperationOutcome | Parameters] = js.native
  def vread(params: Anon171): js.Promise[OperationOutcome | Patient] = js.native
  def vread(params: Anon172): js.Promise[OperationOutcome | PaymentNotice] = js.native
  def vread(params: Anon173): js.Promise[OperationOutcome | PaymentReconciliation] = js.native
  def vread(params: Anon174): js.Promise[OperationOutcome | Person] = js.native
  def vread(params: Anon175): js.Promise[OperationOutcome | PlanDefinition] = js.native
  def vread(params: Anon176): js.Promise[OperationOutcome | Practitioner] = js.native
  def vread(params: Anon177): js.Promise[OperationOutcome | PractitionerRole] = js.native
  def vread(params: Anon178): js.Promise[OperationOutcome | Procedure] = js.native
  def vread(params: Anon179): js.Promise[OperationOutcome | ProcedureRequest] = js.native
  def vread(params: Anon180): js.Promise[OperationOutcome | ProcessRequest] = js.native
  def vread(params: Anon181): js.Promise[OperationOutcome | ProcessResponse] = js.native
  def vread(params: Anon182): js.Promise[OperationOutcome | Provenance] = js.native
  def vread(params: Anon183): js.Promise[OperationOutcome | Questionnaire] = js.native
  def vread(params: Anon184): js.Promise[OperationOutcome | QuestionnaireResponse] = js.native
  def vread(params: Anon185): js.Promise[OperationOutcome | ReferralRequest] = js.native
  def vread(params: Anon186): js.Promise[OperationOutcome | RelatedPerson] = js.native
  def vread(params: Anon187): js.Promise[OperationOutcome | RequestGroup] = js.native
  def vread(params: Anon188): js.Promise[OperationOutcome | ResearchStudy] = js.native
  def vread(params: Anon189): js.Promise[OperationOutcome | ResearchSubject] = js.native
  def vread(params: Anon190): js.Promise[OperationOutcome | RiskAssessment] = js.native
  def vread(params: Anon191): js.Promise[OperationOutcome | Schedule] = js.native
  def vread(params: Anon192): js.Promise[OperationOutcome | SearchParameter] = js.native
  def vread(params: Anon193): js.Promise[OperationOutcome | Sequence] = js.native
  def vread(params: Anon194): js.Promise[OperationOutcome | ServiceDefinition] = js.native
  def vread(params: Anon195): js.Promise[OperationOutcome | Slot] = js.native
  def vread(params: Anon196): js.Promise[OperationOutcome | Specimen] = js.native
  def vread(params: Anon197): js.Promise[OperationOutcome | StructureDefinition] = js.native
  def vread(params: Anon198): js.Promise[OperationOutcome | StructureMap] = js.native
  def vread(params: Anon199): js.Promise[OperationOutcome | Subscription] = js.native
  def vread(params: Anon200): js.Promise[OperationOutcome | Substance] = js.native
  def vread(params: Anon201): js.Promise[OperationOutcome | SupplyDelivery] = js.native
  def vread(params: Anon202): js.Promise[OperationOutcome | SupplyRequest] = js.native
  def vread(params: Anon203): js.Promise[OperationOutcome | Task] = js.native
  def vread(params: Anon204): js.Promise[OperationOutcome | TestReport] = js.native
  def vread(params: Anon205): js.Promise[OperationOutcome | TestScript] = js.native
  def vread(params: Anon206): js.Promise[OperationOutcome | ValueSet] = js.native
  def vread(params: Anon207): js.Promise[OperationOutcome | VisionPrescription] = js.native
  def vread(params: AnonHeadersHeadersIdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | BodySite] = js.native
  def vread(params: AnonHeadersIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | Appointment] = js.native
  def vread(params: AnonIdOptionsResourceTypeVersion): js.Promise[OperationOutcome | AllergyIntolerance] = js.native
  def vread(params: AnonIdStringOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Binary] = js.native
  def vread(params: AnonOptionsOptionsResourceTypeCustomResourceType): js.Promise[OperationOutcome | CustomResource] = js.native
  def vread(params: AnonOptionsOptionsResourceTypeVersionString): js.Promise[OperationOutcome | Basic] = js.native
  def vread(params: AnonOptionsResourceTypeVersion): js.Promise[OperationOutcome | AdverseEvent] = js.native
  def vread(params: AnonResourceTypeVersion): js.Promise[OperationOutcome | ActivityDefinition] = js.native
  def vread(params: AnonResourceTypeVersionString): js.Promise[OperationOutcome | AuditEvent] = js.native
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
  def vread(params: AnonVersion): js.Promise[OperationOutcome | Account] = js.native
  def vread(params: AnonVersionString): js.Promise[OperationOutcome | AppointmentResponse] = js.native
}

