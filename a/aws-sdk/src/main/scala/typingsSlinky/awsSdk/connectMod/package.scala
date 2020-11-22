package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectMod {
  
  type ARN = java.lang.String
  
  type AfterContactWorkTimeLimit = scala.Double
  
  type AgentFirstName = java.lang.String
  
  type AgentLastName = java.lang.String
  
  type AgentUsername = java.lang.String
  
  type AssociationId = java.lang.String
  
  type AttributeName = java.lang.String
  
  type AttributeValue = java.lang.String
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.connectMod.AttributeValue]
  
  type AttributesList = js.Array[typingsSlinky.awsSdk.connectMod.Attribute]
  
  type AutoAccept = scala.Boolean
  
  type BotName = java.lang.String
  
  type BucketName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.VOICE
    - typingsSlinky.awsSdk.awsSdkStrings.CHAT
    - java.lang.String
  */
  type Channel = typingsSlinky.awsSdk.connectMod._Channel | java.lang.String
  
  type Channels = js.Array[typingsSlinky.awsSdk.connectMod.Channel]
  
  type ChatContent = java.lang.String
  
  type ChatContentType = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.connectMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type Comparison = typingsSlinky.awsSdk.awsSdkStrings.LT | java.lang.String
  
  type Concurrency = scala.Double
  
  type ContactFlowContent = java.lang.String
  
  type ContactFlowDescription = java.lang.String
  
  type ContactFlowId = java.lang.String
  
  type ContactFlowName = java.lang.String
  
  type ContactFlowSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.ContactFlowSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT_FLOW
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_QUEUE
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_HOLD
    - typingsSlinky.awsSdk.awsSdkStrings.CUSTOMER_WHISPER
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT_HOLD
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT_WHISPER
    - typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND_WHISPER
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT_TRANSFER
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUE_TRANSFER
    - java.lang.String
  */
  type ContactFlowType = typingsSlinky.awsSdk.connectMod._ContactFlowType | java.lang.String
  
  type ContactFlowTypes = js.Array[typingsSlinky.awsSdk.connectMod.ContactFlowType]
  
  type ContactId = java.lang.String
  
  type CurrentMetricDataCollections = js.Array[typingsSlinky.awsSdk.connectMod.CurrentMetricData]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_ONLINE
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_ON_CALL
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_NON_PRODUCTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_AFTER_CONTACT_WORK
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_STAFFED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_IN_QUEUE
    - typingsSlinky.awsSdk.awsSdkStrings.OLDEST_CONTACT_AGE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.AGENTS_ON_CONTACT
    - typingsSlinky.awsSdk.awsSdkStrings.SLOTS_ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.SLOTS_AVAILABLE
    - java.lang.String
  */
  type CurrentMetricName = typingsSlinky.awsSdk.connectMod._CurrentMetricName | java.lang.String
  
  type CurrentMetricResults = js.Array[typingsSlinky.awsSdk.connectMod.CurrentMetricResult]
  
  type CurrentMetrics = js.Array[typingsSlinky.awsSdk.connectMod.CurrentMetric]
  
  type Delay = scala.Double
  
  type DirectoryAlias = java.lang.String
  
  type DirectoryId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SAML
    - typingsSlinky.awsSdk.awsSdkStrings.CONNECT_MANAGED
    - typingsSlinky.awsSdk.awsSdkStrings.EXISTING_DIRECTORY
    - java.lang.String
  */
  type DirectoryType = typingsSlinky.awsSdk.connectMod._DirectoryType | java.lang.String
  
  type DirectoryUserId = java.lang.String
  
  type DisplayName = java.lang.String
  
  type Email = java.lang.String
  
  type EncryptionType = typingsSlinky.awsSdk.awsSdkStrings.KMS | java.lang.String
  
  type FunctionArn = java.lang.String
  
  type FunctionArnsList = js.Array[typingsSlinky.awsSdk.connectMod.FunctionArn]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUE
    - typingsSlinky.awsSdk.awsSdkStrings.CHANNEL
    - java.lang.String
  */
  type Grouping = typingsSlinky.awsSdk.connectMod._Grouping | java.lang.String
  
  type Groupings = js.Array[typingsSlinky.awsSdk.connectMod.Grouping]
  
  type HierarchyGroupId = java.lang.String
  
  type HierarchyGroupName = java.lang.String
  
  type HierarchyGroupSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.HierarchyGroupSummary]
  
  type HierarchyLevelId = java.lang.String
  
  type HierarchyLevelName = java.lang.String
  
  type HistoricalMetricDataCollections = js.Array[typingsSlinky.awsSdk.connectMod.HistoricalMetricData]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_QUEUED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_HANDLED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_ABANDONED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_CONSULTED
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_AGENT_HUNG_UP_FIRST
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_HANDLED_INCOMING
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_HANDLED_OUTBOUND
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_HOLD_ABANDONS
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_IN_FROM_QUEUE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_TRANSFERRED_OUT_FROM_QUEUE
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTS_MISSED
    - typingsSlinky.awsSdk.awsSdkStrings.CALLBACK_CONTACTS_HANDLED
    - typingsSlinky.awsSdk.awsSdkStrings.API_CONTACTS_HANDLED
    - typingsSlinky.awsSdk.awsSdkStrings.OCCUPANCY
    - typingsSlinky.awsSdk.awsSdkStrings.HANDLE_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.AFTER_CONTACT_WORK_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUED_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.ABANDON_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.QUEUE_ANSWER_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.HOLD_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.INTERACTION_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.INTERACTION_AND_HOLD_TIME
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE_LEVEL
    - java.lang.String
  */
  type HistoricalMetricName = typingsSlinky.awsSdk.connectMod._HistoricalMetricName | java.lang.String
  
  type HistoricalMetricResults = js.Array[typingsSlinky.awsSdk.connectMod.HistoricalMetricResult]
  
  type HistoricalMetrics = js.Array[typingsSlinky.awsSdk.connectMod.HistoricalMetric]
  
  type Hours = scala.Double
  
  type HoursOfOperationId = java.lang.String
  
  type HoursOfOperationName = java.lang.String
  
  type HoursOfOperationSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.HoursOfOperationSummary]
  
  type InboundCallsEnabled = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INBOUND_CALLS
    - typingsSlinky.awsSdk.awsSdkStrings.OUTBOUND_CALLS
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACTFLOW_LOGS
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT_LENS
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO_RESOLVE_BEST_VOICES
    - typingsSlinky.awsSdk.awsSdkStrings.USE_CUSTOM_TTS_VOICES
    - typingsSlinky.awsSdk.awsSdkStrings.EARLY_MEDIA
    - java.lang.String
  */
  type InstanceAttributeType = typingsSlinky.awsSdk.connectMod._InstanceAttributeType | java.lang.String
  
  type InstanceAttributeValue = java.lang.String
  
  type InstanceId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATION_FAILED
    - java.lang.String
  */
  type InstanceStatus = typingsSlinky.awsSdk.connectMod._InstanceStatus | java.lang.String
  
  type InstanceStorageConfigs = js.Array[typingsSlinky.awsSdk.connectMod.InstanceStorageConfig]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CHAT_TRANSCRIPTS
    - typingsSlinky.awsSdk.awsSdkStrings.CALL_RECORDINGS
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULED_REPORTS
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIA_STREAMS
    - typingsSlinky.awsSdk.awsSdkStrings.CONTACT_TRACE_RECORDS
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT_EVENTS
    - java.lang.String
  */
  type InstanceStorageResourceType = typingsSlinky.awsSdk.connectMod._InstanceStorageResourceType | java.lang.String
  
  type InstanceSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.InstanceSummary]
  
  type KeyId = java.lang.String
  
  type LexBotsList = js.Array[typingsSlinky.awsSdk.connectMod.LexBot]
  
  type LexRegion = java.lang.String
  
  type MaxResult10 = scala.Double
  
  type MaxResult100 = scala.Double
  
  type MaxResult1000 = scala.Double
  
  type MaxResult2 = scala.Double
  
  type MaxResult25 = scala.Double
  
  type MaxResult7 = scala.Double
  
  type MediaConcurrencies = js.Array[typingsSlinky.awsSdk.connectMod.MediaConcurrency]
  
  type NextToken = java.lang.String
  
  type Origin = java.lang.String
  
  type OriginsList = js.Array[typingsSlinky.awsSdk.connectMod.Origin]
  
  type OutboundCallsEnabled = scala.Boolean
  
  type PEM = java.lang.String
  
  type ParticipantId = java.lang.String
  
  type ParticipantToken = java.lang.String
  
  type Password = java.lang.String
  
  type PhoneNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AF
    - typingsSlinky.awsSdk.awsSdkStrings.AL
    - typingsSlinky.awsSdk.awsSdkStrings.DZ
    - typingsSlinky.awsSdk.awsSdkStrings.AS
    - typingsSlinky.awsSdk.awsSdkStrings.AD
    - typingsSlinky.awsSdk.awsSdkStrings.AO
    - typingsSlinky.awsSdk.awsSdkStrings.AI
    - typingsSlinky.awsSdk.awsSdkStrings.AQ
    - typingsSlinky.awsSdk.awsSdkStrings.AG
    - typingsSlinky.awsSdk.awsSdkStrings.AR
    - typingsSlinky.awsSdk.awsSdkStrings.AM
    - typingsSlinky.awsSdk.awsSdkStrings.AW
    - typingsSlinky.awsSdk.awsSdkStrings.AU
    - typingsSlinky.awsSdk.awsSdkStrings.AT
    - typingsSlinky.awsSdk.awsSdkStrings.AZ
    - typingsSlinky.awsSdk.awsSdkStrings.BS
    - typingsSlinky.awsSdk.awsSdkStrings.BH
    - typingsSlinky.awsSdk.awsSdkStrings.BD
    - typingsSlinky.awsSdk.awsSdkStrings.BB
    - typingsSlinky.awsSdk.awsSdkStrings.BY
    - typingsSlinky.awsSdk.awsSdkStrings.BE
    - typingsSlinky.awsSdk.awsSdkStrings.BZ
    - typingsSlinky.awsSdk.awsSdkStrings.BJ
    - typingsSlinky.awsSdk.awsSdkStrings.BM
    - typingsSlinky.awsSdk.awsSdkStrings.BT
    - typingsSlinky.awsSdk.awsSdkStrings.BO
    - typingsSlinky.awsSdk.awsSdkStrings.BA
    - typingsSlinky.awsSdk.awsSdkStrings.BW
    - typingsSlinky.awsSdk.awsSdkStrings.BR
    - typingsSlinky.awsSdk.awsSdkStrings.IO
    - typingsSlinky.awsSdk.awsSdkStrings.VG
    - typingsSlinky.awsSdk.awsSdkStrings.BN
    - typingsSlinky.awsSdk.awsSdkStrings.BG
    - typingsSlinky.awsSdk.awsSdkStrings.BF
    - typingsSlinky.awsSdk.awsSdkStrings.BI
    - typingsSlinky.awsSdk.awsSdkStrings.KH
    - typingsSlinky.awsSdk.awsSdkStrings.CM
    - typingsSlinky.awsSdk.awsSdkStrings.CA
    - typingsSlinky.awsSdk.awsSdkStrings.CV
    - typingsSlinky.awsSdk.awsSdkStrings.KY
    - typingsSlinky.awsSdk.awsSdkStrings.CF
    - typingsSlinky.awsSdk.awsSdkStrings.TD
    - typingsSlinky.awsSdk.awsSdkStrings.CL
    - typingsSlinky.awsSdk.awsSdkStrings.CN
    - typingsSlinky.awsSdk.awsSdkStrings.CX
    - typingsSlinky.awsSdk.awsSdkStrings.CC
    - typingsSlinky.awsSdk.awsSdkStrings.CO
    - typingsSlinky.awsSdk.awsSdkStrings.KM
    - typingsSlinky.awsSdk.awsSdkStrings.CK
    - typingsSlinky.awsSdk.awsSdkStrings.CR
    - typingsSlinky.awsSdk.awsSdkStrings.HR
    - typingsSlinky.awsSdk.awsSdkStrings.CU
    - typingsSlinky.awsSdk.awsSdkStrings.CW
    - typingsSlinky.awsSdk.awsSdkStrings.CY
    - typingsSlinky.awsSdk.awsSdkStrings.CZ
    - typingsSlinky.awsSdk.awsSdkStrings.CD
    - typingsSlinky.awsSdk.awsSdkStrings.DK
    - typingsSlinky.awsSdk.awsSdkStrings.DJ
    - typingsSlinky.awsSdk.awsSdkStrings.DM
    - typingsSlinky.awsSdk.awsSdkStrings.DO
    - typingsSlinky.awsSdk.awsSdkStrings.TL
    - typingsSlinky.awsSdk.awsSdkStrings.EC
    - typingsSlinky.awsSdk.awsSdkStrings.EG
    - typingsSlinky.awsSdk.awsSdkStrings.SV
    - typingsSlinky.awsSdk.awsSdkStrings.GQ
    - typingsSlinky.awsSdk.awsSdkStrings.ER
    - typingsSlinky.awsSdk.awsSdkStrings.EE
    - typingsSlinky.awsSdk.awsSdkStrings.ET
    - typingsSlinky.awsSdk.awsSdkStrings.FK
    - typingsSlinky.awsSdk.awsSdkStrings.FO
    - typingsSlinky.awsSdk.awsSdkStrings.FJ
    - typingsSlinky.awsSdk.awsSdkStrings.FI
    - typingsSlinky.awsSdk.awsSdkStrings.FR
    - typingsSlinky.awsSdk.awsSdkStrings.PF
    - typingsSlinky.awsSdk.awsSdkStrings.GA
    - typingsSlinky.awsSdk.awsSdkStrings.GM
    - typingsSlinky.awsSdk.awsSdkStrings.GE
    - typingsSlinky.awsSdk.awsSdkStrings.DE
    - typingsSlinky.awsSdk.awsSdkStrings.GH
    - typingsSlinky.awsSdk.awsSdkStrings.GI
    - typingsSlinky.awsSdk.awsSdkStrings.GR
    - typingsSlinky.awsSdk.awsSdkStrings.GL
    - typingsSlinky.awsSdk.awsSdkStrings.GD
    - typingsSlinky.awsSdk.awsSdkStrings.GU
    - typingsSlinky.awsSdk.awsSdkStrings.GT
    - typingsSlinky.awsSdk.awsSdkStrings.GG
    - typingsSlinky.awsSdk.awsSdkStrings.GN
    - typingsSlinky.awsSdk.awsSdkStrings.GW
    - typingsSlinky.awsSdk.awsSdkStrings.GY
    - typingsSlinky.awsSdk.awsSdkStrings.HT
    - typingsSlinky.awsSdk.awsSdkStrings.HN
    - typingsSlinky.awsSdk.awsSdkStrings.HK
    - typingsSlinky.awsSdk.awsSdkStrings.HU
    - typingsSlinky.awsSdk.awsSdkStrings.IS
    - typingsSlinky.awsSdk.awsSdkStrings.IN
    - typingsSlinky.awsSdk.awsSdkStrings.ID
    - typingsSlinky.awsSdk.awsSdkStrings.IR
    - typingsSlinky.awsSdk.awsSdkStrings.IQ
    - typingsSlinky.awsSdk.awsSdkStrings.IE
    - typingsSlinky.awsSdk.awsSdkStrings.IM
    - typingsSlinky.awsSdk.awsSdkStrings.IL
    - typingsSlinky.awsSdk.awsSdkStrings.IT
    - typingsSlinky.awsSdk.awsSdkStrings.CI
    - typingsSlinky.awsSdk.awsSdkStrings.JM
    - typingsSlinky.awsSdk.awsSdkStrings.JP
    - typingsSlinky.awsSdk.awsSdkStrings.JE
    - typingsSlinky.awsSdk.awsSdkStrings.JO
    - typingsSlinky.awsSdk.awsSdkStrings.KZ
    - typingsSlinky.awsSdk.awsSdkStrings.KE
    - typingsSlinky.awsSdk.awsSdkStrings.KI
    - typingsSlinky.awsSdk.awsSdkStrings.KW
    - typingsSlinky.awsSdk.awsSdkStrings.KG
    - typingsSlinky.awsSdk.awsSdkStrings.LA
    - typingsSlinky.awsSdk.awsSdkStrings.LV
    - typingsSlinky.awsSdk.awsSdkStrings.LB
    - typingsSlinky.awsSdk.awsSdkStrings.LS
    - typingsSlinky.awsSdk.awsSdkStrings.LR
    - typingsSlinky.awsSdk.awsSdkStrings.LY
    - typingsSlinky.awsSdk.awsSdkStrings.LI
    - typingsSlinky.awsSdk.awsSdkStrings.LT
    - typingsSlinky.awsSdk.awsSdkStrings.LU
    - typingsSlinky.awsSdk.awsSdkStrings.MO
    - typingsSlinky.awsSdk.awsSdkStrings.MK
    - typingsSlinky.awsSdk.awsSdkStrings.MG
    - typingsSlinky.awsSdk.awsSdkStrings.MW
    - typingsSlinky.awsSdk.awsSdkStrings.MY
    - typingsSlinky.awsSdk.awsSdkStrings.MV
    - typingsSlinky.awsSdk.awsSdkStrings.ML
    - typingsSlinky.awsSdk.awsSdkStrings.MT
    - typingsSlinky.awsSdk.awsSdkStrings.MH
    - typingsSlinky.awsSdk.awsSdkStrings.MR
    - typingsSlinky.awsSdk.awsSdkStrings.MU
    - typingsSlinky.awsSdk.awsSdkStrings.YT
    - typingsSlinky.awsSdk.awsSdkStrings.MX
    - typingsSlinky.awsSdk.awsSdkStrings.FM
    - typingsSlinky.awsSdk.awsSdkStrings.MD
    - typingsSlinky.awsSdk.awsSdkStrings.MC
    - typingsSlinky.awsSdk.awsSdkStrings.MN
    - typingsSlinky.awsSdk.awsSdkStrings.ME
    - typingsSlinky.awsSdk.awsSdkStrings.MS
    - typingsSlinky.awsSdk.awsSdkStrings.MA
    - typingsSlinky.awsSdk.awsSdkStrings.MZ
    - typingsSlinky.awsSdk.awsSdkStrings.MM
    - typingsSlinky.awsSdk.awsSdkStrings.NA
    - typingsSlinky.awsSdk.awsSdkStrings.NR
    - typingsSlinky.awsSdk.awsSdkStrings.NP
    - typingsSlinky.awsSdk.awsSdkStrings.NL
    - typingsSlinky.awsSdk.awsSdkStrings.AN
    - typingsSlinky.awsSdk.awsSdkStrings.NC
    - typingsSlinky.awsSdk.awsSdkStrings.NZ
    - typingsSlinky.awsSdk.awsSdkStrings.NI
    - typingsSlinky.awsSdk.awsSdkStrings.NE
    - typingsSlinky.awsSdk.awsSdkStrings.NG
    - typingsSlinky.awsSdk.awsSdkStrings.NU
    - typingsSlinky.awsSdk.awsSdkStrings.KP
    - typingsSlinky.awsSdk.awsSdkStrings.MP
    - typingsSlinky.awsSdk.awsSdkStrings.NO
    - typingsSlinky.awsSdk.awsSdkStrings.OM
    - typingsSlinky.awsSdk.awsSdkStrings.PK
    - typingsSlinky.awsSdk.awsSdkStrings.PW
    - typingsSlinky.awsSdk.awsSdkStrings.PA
    - typingsSlinky.awsSdk.awsSdkStrings.PG
    - typingsSlinky.awsSdk.awsSdkStrings.PY
    - typingsSlinky.awsSdk.awsSdkStrings.PE
    - typingsSlinky.awsSdk.awsSdkStrings.PH
    - typingsSlinky.awsSdk.awsSdkStrings.PN
    - typingsSlinky.awsSdk.awsSdkStrings.PL
    - typingsSlinky.awsSdk.awsSdkStrings.PT
    - typingsSlinky.awsSdk.awsSdkStrings.PR
    - typingsSlinky.awsSdk.awsSdkStrings.QA
    - typingsSlinky.awsSdk.awsSdkStrings.CG
    - typingsSlinky.awsSdk.awsSdkStrings.RE
    - typingsSlinky.awsSdk.awsSdkStrings.RO
    - typingsSlinky.awsSdk.awsSdkStrings.RU
    - typingsSlinky.awsSdk.awsSdkStrings.RW
    - typingsSlinky.awsSdk.awsSdkStrings.BL
    - typingsSlinky.awsSdk.awsSdkStrings.SH
    - typingsSlinky.awsSdk.awsSdkStrings.KN
    - typingsSlinky.awsSdk.awsSdkStrings.LC
    - typingsSlinky.awsSdk.awsSdkStrings.MF
    - typingsSlinky.awsSdk.awsSdkStrings.PM
    - typingsSlinky.awsSdk.awsSdkStrings.VC
    - typingsSlinky.awsSdk.awsSdkStrings.WS
    - typingsSlinky.awsSdk.awsSdkStrings.SM
    - typingsSlinky.awsSdk.awsSdkStrings.ST
    - typingsSlinky.awsSdk.awsSdkStrings.SA
    - typingsSlinky.awsSdk.awsSdkStrings.SN
    - typingsSlinky.awsSdk.awsSdkStrings.RS
    - typingsSlinky.awsSdk.awsSdkStrings.SC
    - typingsSlinky.awsSdk.awsSdkStrings.SL
    - typingsSlinky.awsSdk.awsSdkStrings.SG
    - typingsSlinky.awsSdk.awsSdkStrings.SX
    - typingsSlinky.awsSdk.awsSdkStrings.SK
    - typingsSlinky.awsSdk.awsSdkStrings.SI
    - typingsSlinky.awsSdk.awsSdkStrings.SB
    - typingsSlinky.awsSdk.awsSdkStrings.SO
    - typingsSlinky.awsSdk.awsSdkStrings.ZA
    - typingsSlinky.awsSdk.awsSdkStrings.KR
    - typingsSlinky.awsSdk.awsSdkStrings.ES
    - typingsSlinky.awsSdk.awsSdkStrings.LK
    - typingsSlinky.awsSdk.awsSdkStrings.SD
    - typingsSlinky.awsSdk.awsSdkStrings.SR
    - typingsSlinky.awsSdk.awsSdkStrings.SJ
    - typingsSlinky.awsSdk.awsSdkStrings.SZ
    - typingsSlinky.awsSdk.awsSdkStrings.SE
    - typingsSlinky.awsSdk.awsSdkStrings.CH
    - typingsSlinky.awsSdk.awsSdkStrings.SY
    - typingsSlinky.awsSdk.awsSdkStrings.TW
    - typingsSlinky.awsSdk.awsSdkStrings.TJ
    - typingsSlinky.awsSdk.awsSdkStrings.TZ
    - typingsSlinky.awsSdk.awsSdkStrings.TH
    - typingsSlinky.awsSdk.awsSdkStrings.TG
    - typingsSlinky.awsSdk.awsSdkStrings.TK
    - typingsSlinky.awsSdk.awsSdkStrings.TO
    - typingsSlinky.awsSdk.awsSdkStrings.TT
    - typingsSlinky.awsSdk.awsSdkStrings.TN
    - typingsSlinky.awsSdk.awsSdkStrings.TR
    - typingsSlinky.awsSdk.awsSdkStrings.TM
    - typingsSlinky.awsSdk.awsSdkStrings.TC
    - typingsSlinky.awsSdk.awsSdkStrings.TV
    - typingsSlinky.awsSdk.awsSdkStrings.VI
    - typingsSlinky.awsSdk.awsSdkStrings.UG
    - typingsSlinky.awsSdk.awsSdkStrings.UA
    - typingsSlinky.awsSdk.awsSdkStrings.AE
    - typingsSlinky.awsSdk.awsSdkStrings.GB
    - typingsSlinky.awsSdk.awsSdkStrings.US
    - typingsSlinky.awsSdk.awsSdkStrings.UY
    - typingsSlinky.awsSdk.awsSdkStrings.UZ
    - typingsSlinky.awsSdk.awsSdkStrings.VU
    - typingsSlinky.awsSdk.awsSdkStrings.VA
    - typingsSlinky.awsSdk.awsSdkStrings.VE
    - typingsSlinky.awsSdk.awsSdkStrings.VN
    - typingsSlinky.awsSdk.awsSdkStrings.WF
    - typingsSlinky.awsSdk.awsSdkStrings.EH
    - typingsSlinky.awsSdk.awsSdkStrings.YE
    - typingsSlinky.awsSdk.awsSdkStrings.ZM
    - typingsSlinky.awsSdk.awsSdkStrings.ZW
    - java.lang.String
  */
  type PhoneNumberCountryCode = typingsSlinky.awsSdk.connectMod._PhoneNumberCountryCode | java.lang.String
  
  type PhoneNumberCountryCodes = js.Array[typingsSlinky.awsSdk.connectMod.PhoneNumberCountryCode]
  
  type PhoneNumberId = java.lang.String
  
  type PhoneNumberSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.PhoneNumberSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TOLL_FREE
    - typingsSlinky.awsSdk.awsSdkStrings.DID
    - java.lang.String
  */
  type PhoneNumberType = typingsSlinky.awsSdk.connectMod._PhoneNumberType | java.lang.String
  
  type PhoneNumberTypes = js.Array[typingsSlinky.awsSdk.connectMod.PhoneNumberType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SOFT_PHONE
    - typingsSlinky.awsSdk.awsSdkStrings.DESK_PHONE
    - java.lang.String
  */
  type PhoneType = typingsSlinky.awsSdk.connectMod._PhoneType | java.lang.String
  
  type Prefix = java.lang.String
  
  type Priority = scala.Double
  
  type PromptId = java.lang.String
  
  type PromptName = java.lang.String
  
  type PromptSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.PromptSummary]
  
  type QueueId = java.lang.String
  
  type QueueName = java.lang.String
  
  type QueueSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.QueueSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDARD
    - typingsSlinky.awsSdk.awsSdkStrings.AGENT
    - java.lang.String
  */
  type QueueType = typingsSlinky.awsSdk.connectMod._QueueType | java.lang.String
  
  type QueueTypes = js.Array[typingsSlinky.awsSdk.connectMod.QueueType]
  
  type Queues = js.Array[typingsSlinky.awsSdk.connectMod.QueueId]
  
  type RoutingProfileDescription = java.lang.String
  
  type RoutingProfileId = java.lang.String
  
  type RoutingProfileName = java.lang.String
  
  type RoutingProfileQueueConfigList = js.Array[typingsSlinky.awsSdk.connectMod.RoutingProfileQueueConfig]
  
  type RoutingProfileQueueConfigSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.RoutingProfileQueueConfigSummary]
  
  type RoutingProfileQueueReferenceList = js.Array[typingsSlinky.awsSdk.connectMod.RoutingProfileQueueReference]
  
  type RoutingProfileSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.RoutingProfileSummary]
  
  type SecurityKeysList = js.Array[typingsSlinky.awsSdk.connectMod.SecurityKey]
  
  type SecurityProfileId = java.lang.String
  
  type SecurityProfileIds = js.Array[typingsSlinky.awsSdk.connectMod.SecurityProfileId]
  
  type SecurityProfileName = java.lang.String
  
  type SecurityProfileSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.SecurityProfileSummary]
  
  type SecurityToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUM
    - typingsSlinky.awsSdk.awsSdkStrings.MAX
    - typingsSlinky.awsSdk.awsSdkStrings.AVG
    - java.lang.String
  */
  type Statistic = typingsSlinky.awsSdk.connectMod._Statistic | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.S3
    - typingsSlinky.awsSdk.awsSdkStrings.KINESIS_VIDEO_STREAM
    - typingsSlinky.awsSdk.awsSdkStrings.KINESIS_STREAM
    - typingsSlinky.awsSdk.awsSdkStrings.KINESIS_FIREHOSE
    - java.lang.String
  */
  type StorageType = typingsSlinky.awsSdk.connectMod._StorageType | java.lang.String
  
  type String = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.connectMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.connectMod.TagValue]
  
  type TagValue = java.lang.String
  
  type ThresholdValue = scala.Double
  
  type Timestamp_ = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SECONDS
    - typingsSlinky.awsSdk.awsSdkStrings.COUNT
    - typingsSlinky.awsSdk.awsSdkStrings.PERCENT
    - java.lang.String
  */
  type Unit = typingsSlinky.awsSdk.connectMod._Unit | java.lang.String
  
  type UserId = java.lang.String
  
  type UserSummaryList = js.Array[typingsSlinky.awsSdk.connectMod.UserSummary]
  
  type Value = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FROM_AGENT
    - typingsSlinky.awsSdk.awsSdkStrings.TO_AGENT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type VoiceRecordingTrack = typingsSlinky.awsSdk.connectMod._VoiceRecordingTrack | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-08-08`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.connectMod._apiVersion | java.lang.String
  
  type timestamp = js.Date
}
