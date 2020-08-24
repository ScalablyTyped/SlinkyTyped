package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rekognitionMod {
  type Assets = js.Array[typingsSlinky.awsSdk.rekognitionMod.Asset]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type Attribute = typingsSlinky.awsSdk.rekognitionMod._Attribute | java.lang.String
  type Attributes = js.Array[typingsSlinky.awsSdk.rekognitionMod.Attribute]
  type AudioMetadataList = js.Array[typingsSlinky.awsSdk.rekognitionMod.AudioMetadata]
  type Boolean = scala.Boolean
  type BoundingBoxHeight = scala.Double
  type BoundingBoxWidth = scala.Double
  type CelebrityList = js.Array[typingsSlinky.awsSdk.rekognitionMod.Celebrity]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ID
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type CelebrityRecognitionSortBy = typingsSlinky.awsSdk.rekognitionMod._CelebrityRecognitionSortBy | java.lang.String
  type CelebrityRecognitions = js.Array[typingsSlinky.awsSdk.rekognitionMod.CelebrityRecognition]
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.rekognitionMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CollectionId = java.lang.String
  type CollectionIdList = js.Array[typingsSlinky.awsSdk.rekognitionMod.CollectionId]
  type CompareFacesMatchList = js.Array[typingsSlinky.awsSdk.rekognitionMod.CompareFacesMatch]
  type CompareFacesUnmatchList = js.Array[typingsSlinky.awsSdk.rekognitionMod.ComparedFace]
  type ComparedFaceList = js.Array[typingsSlinky.awsSdk.rekognitionMod.ComparedFace]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typingsSlinky.awsSdk.awsSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = typingsSlinky.awsSdk.rekognitionMod._ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[typingsSlinky.awsSdk.rekognitionMod.ContentClassifier]
  type ContentModerationDetections = js.Array[typingsSlinky.awsSdk.rekognitionMod.ContentModerationDetection]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type ContentModerationSortBy = typingsSlinky.awsSdk.rekognitionMod._ContentModerationSortBy | java.lang.String
  type CustomLabels = js.Array[typingsSlinky.awsSdk.rekognitionMod.CustomLabel]
  type DateTime = js.Date
  type Degree = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.HAPPY
    - typingsSlinky.awsSdk.awsSdkStrings.SAD
    - typingsSlinky.awsSdk.awsSdkStrings.ANGRY
    - typingsSlinky.awsSdk.awsSdkStrings.CONFUSED
    - typingsSlinky.awsSdk.awsSdkStrings.DISGUSTED
    - typingsSlinky.awsSdk.awsSdkStrings.SURPRISED
    - typingsSlinky.awsSdk.awsSdkStrings.CALM
    - typingsSlinky.awsSdk.awsSdkStrings.UNKNOWN
    - typingsSlinky.awsSdk.awsSdkStrings.FEAR
    - java.lang.String
  */
  type EmotionName = typingsSlinky.awsSdk.rekognitionMod._EmotionName | java.lang.String
  type Emotions = js.Array[typingsSlinky.awsSdk.rekognitionMod.Emotion]
  type ExtendedPaginationToken = java.lang.String
  type ExternalImageId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type FaceAttributes = typingsSlinky.awsSdk.rekognitionMod._FaceAttributes | java.lang.String
  type FaceDetailList = js.Array[typingsSlinky.awsSdk.rekognitionMod.FaceDetail]
  type FaceDetections = js.Array[typingsSlinky.awsSdk.rekognitionMod.FaceDetection]
  type FaceId = java.lang.String
  type FaceIdList = js.Array[typingsSlinky.awsSdk.rekognitionMod.FaceId]
  type FaceList = js.Array[typingsSlinky.awsSdk.rekognitionMod.Face]
  type FaceMatchList = js.Array[typingsSlinky.awsSdk.rekognitionMod.FaceMatch]
  type FaceModelVersionList = js.Array[typingsSlinky.awsSdk.rekognitionMod.String]
  type FaceRecordList = js.Array[typingsSlinky.awsSdk.rekognitionMod.FaceRecord]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INDEX
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type FaceSearchSortBy = typingsSlinky.awsSdk.rekognitionMod._FaceSearchSortBy | java.lang.String
  type Float = scala.Double
  type FlowDefinitionArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Male
    - typingsSlinky.awsSdk.awsSdkStrings.Female
    - java.lang.String
  */
  type GenderType = typingsSlinky.awsSdk.rekognitionMod._GenderType | java.lang.String
  type HumanLoopActivationConditionsEvaluationResults = java.lang.String
  type HumanLoopActivationReason = java.lang.String
  type HumanLoopActivationReasons = js.Array[typingsSlinky.awsSdk.rekognitionMod.HumanLoopActivationReason]
  type HumanLoopArn = java.lang.String
  type HumanLoopName = java.lang.String
  type ImageBlob = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.rekognitionMod.Blob | java.lang.String
  type ImageId = java.lang.String
  type InferenceUnits = scala.Double
  type Instances = js.Array[typingsSlinky.awsSdk.rekognitionMod.Instance]
  type JobId = java.lang.String
  type JobTag = java.lang.String
  type KinesisDataArn = java.lang.String
  type KinesisVideoArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type LabelDetectionSortBy = typingsSlinky.awsSdk.rekognitionMod._LabelDetectionSortBy | java.lang.String
  type LabelDetections = js.Array[typingsSlinky.awsSdk.rekognitionMod.LabelDetection]
  type Labels = js.Array[typingsSlinky.awsSdk.rekognitionMod.Label]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.eyeLeft
    - typingsSlinky.awsSdk.awsSdkStrings.eyeRight
    - typingsSlinky.awsSdk.awsSdkStrings.nose
    - typingsSlinky.awsSdk.awsSdkStrings.mouthLeft
    - typingsSlinky.awsSdk.awsSdkStrings.mouthRight
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeBrowLeft
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeBrowRight
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeBrowUp
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeBrowLeft
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeBrowRight
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeBrowUp
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeLeft
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeRight
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeUp
    - typingsSlinky.awsSdk.awsSdkStrings.leftEyeDown
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeLeft
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeRight
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeUp
    - typingsSlinky.awsSdk.awsSdkStrings.rightEyeDown
    - typingsSlinky.awsSdk.awsSdkStrings.noseLeft
    - typingsSlinky.awsSdk.awsSdkStrings.noseRight
    - typingsSlinky.awsSdk.awsSdkStrings.mouthUp
    - typingsSlinky.awsSdk.awsSdkStrings.mouthDown
    - typingsSlinky.awsSdk.awsSdkStrings.leftPupil
    - typingsSlinky.awsSdk.awsSdkStrings.rightPupil
    - typingsSlinky.awsSdk.awsSdkStrings.upperJawlineLeft
    - typingsSlinky.awsSdk.awsSdkStrings.midJawlineLeft
    - typingsSlinky.awsSdk.awsSdkStrings.chinBottom
    - typingsSlinky.awsSdk.awsSdkStrings.midJawlineRight
    - typingsSlinky.awsSdk.awsSdkStrings.upperJawlineRight
    - java.lang.String
  */
  type LandmarkType = typingsSlinky.awsSdk.rekognitionMod._LandmarkType | java.lang.String
  type Landmarks = js.Array[typingsSlinky.awsSdk.rekognitionMod.Landmark]
  type MaxFaces = scala.Double
  type MaxFacesToIndex = scala.Double
  type MaxResults = scala.Double
  type ModerationLabels = js.Array[typingsSlinky.awsSdk.rekognitionMod.ModerationLabel]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATE_0
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATE_90
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATE_180
    - typingsSlinky.awsSdk.awsSdkStrings.ROTATE_270
    - java.lang.String
  */
  type OrientationCorrection = typingsSlinky.awsSdk.rekognitionMod._OrientationCorrection | java.lang.String
  type PageSize = scala.Double
  type PaginationToken = java.lang.String
  type Parents = js.Array[typingsSlinky.awsSdk.rekognitionMod.Parent]
  type Percent = scala.Double
  type PersonDetections = js.Array[typingsSlinky.awsSdk.rekognitionMod.PersonDetection]
  type PersonIndex = scala.Double
  type PersonMatches = js.Array[typingsSlinky.awsSdk.rekognitionMod.PersonMatch]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.INDEX
    - typingsSlinky.awsSdk.awsSdkStrings.TIMESTAMP
    - java.lang.String
  */
  type PersonTrackingSortBy = typingsSlinky.awsSdk.rekognitionMod._PersonTrackingSortBy | java.lang.String
  type Polygon = js.Array[typingsSlinky.awsSdk.rekognitionMod.Point]
  type ProjectArn = java.lang.String
  type ProjectDescriptions = js.Array[typingsSlinky.awsSdk.rekognitionMod.ProjectDescription]
  type ProjectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectStatus = typingsSlinky.awsSdk.rekognitionMod._ProjectStatus | java.lang.String
  type ProjectVersionArn = java.lang.String
  type ProjectVersionDescriptions = js.Array[typingsSlinky.awsSdk.rekognitionMod.ProjectVersionDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING_COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.TRAINING_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ProjectVersionStatus = typingsSlinky.awsSdk.rekognitionMod._ProjectVersionStatus | java.lang.String
  type ProjectVersionsPageSize = scala.Double
  type ProjectsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NONE
    - typingsSlinky.awsSdk.awsSdkStrings.AUTO
    - typingsSlinky.awsSdk.awsSdkStrings.LOW
    - typingsSlinky.awsSdk.awsSdkStrings.MEDIUM
    - typingsSlinky.awsSdk.awsSdkStrings.HIGH
    - java.lang.String
  */
  type QualityFilter = typingsSlinky.awsSdk.rekognitionMod._QualityFilter | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXCEEDS_MAX_FACES
    - typingsSlinky.awsSdk.awsSdkStrings.EXTREME_POSE
    - typingsSlinky.awsSdk.awsSdkStrings.LOW_BRIGHTNESS
    - typingsSlinky.awsSdk.awsSdkStrings.LOW_SHARPNESS
    - typingsSlinky.awsSdk.awsSdkStrings.LOW_CONFIDENCE
    - typingsSlinky.awsSdk.awsSdkStrings.SMALL_BOUNDING_BOX
    - typingsSlinky.awsSdk.awsSdkStrings.LOW_FACE_QUALITY
    - java.lang.String
  */
  type Reason = typingsSlinky.awsSdk.rekognitionMod._Reason | java.lang.String
  type Reasons = js.Array[typingsSlinky.awsSdk.rekognitionMod.Reason]
  type RegionsOfInterest = js.Array[typingsSlinky.awsSdk.rekognitionMod.RegionOfInterest]
  type RekognitionUniqueId = java.lang.String
  type RoleArn = java.lang.String
  type S3Bucket = java.lang.String
  type S3KeyPrefix = java.lang.String
  type S3ObjectName = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SNSTopicArn = java.lang.String
  type SegmentConfidence = scala.Double
  type SegmentDetections = js.Array[typingsSlinky.awsSdk.rekognitionMod.SegmentDetection]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TECHNICAL_CUE
    - typingsSlinky.awsSdk.awsSdkStrings.SHOT
    - java.lang.String
  */
  type SegmentType = typingsSlinky.awsSdk.rekognitionMod._SegmentType | java.lang.String
  type SegmentTypes = js.Array[typingsSlinky.awsSdk.rekognitionMod.SegmentType]
  type SegmentTypesInfo = js.Array[typingsSlinky.awsSdk.rekognitionMod.SegmentTypeInfo]
  type StatusMessage = java.lang.String
  type StreamProcessorArn = java.lang.String
  type StreamProcessorList = js.Array[typingsSlinky.awsSdk.rekognitionMod.StreamProcessor]
  type StreamProcessorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPED
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - java.lang.String
  */
  type StreamProcessorStatus = typingsSlinky.awsSdk.rekognitionMod._StreamProcessorStatus | java.lang.String
  type String = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ColorBars
    - typingsSlinky.awsSdk.awsSdkStrings.EndCredits
    - typingsSlinky.awsSdk.awsSdkStrings.BlackFrames
    - java.lang.String
  */
  type TechnicalCueType = typingsSlinky.awsSdk.rekognitionMod._TechnicalCueType | java.lang.String
  type TextDetectionList = js.Array[typingsSlinky.awsSdk.rekognitionMod.TextDetection]
  type TextDetectionResults = js.Array[typingsSlinky.awsSdk.rekognitionMod.TextDetectionResult]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LINE
    - typingsSlinky.awsSdk.awsSdkStrings.WORD
    - java.lang.String
  */
  type TextTypes = typingsSlinky.awsSdk.rekognitionMod._TextTypes | java.lang.String
  type Timecode = java.lang.String
  type Timestamp = scala.Double
  type UInteger = scala.Double
  type ULong = scala.Double
  type UnindexedFaces = js.Array[typingsSlinky.awsSdk.rekognitionMod.UnindexedFace]
  type Url = java.lang.String
  type Urls = js.Array[typingsSlinky.awsSdk.rekognitionMod.Url]
  type VersionName = java.lang.String
  type VersionNames = js.Array[typingsSlinky.awsSdk.rekognitionMod.VersionName]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VideoJobStatus = typingsSlinky.awsSdk.rekognitionMod._VideoJobStatus | java.lang.String
  type VideoMetadataList = js.Array[typingsSlinky.awsSdk.rekognitionMod.VideoMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-06-27`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.rekognitionMod._apiVersion | java.lang.String
}
