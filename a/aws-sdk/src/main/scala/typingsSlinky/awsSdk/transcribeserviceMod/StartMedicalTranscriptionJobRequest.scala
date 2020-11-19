package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartMedicalTranscriptionJobRequest extends js.Object {
  
  /**
    * The language code for the language spoken in the input media file. US English (en-US) is the valid value for medical transcription jobs. Any other value you enter for language code results in a BadRequestException error.
    */
  var LanguageCode: typingsSlinky.awsSdk.transcribeserviceMod.LanguageCode = js.native
  
  var Media: typingsSlinky.awsSdk.transcribeserviceMod.Media = js.native
  
  /**
    * The audio format of the input media file.
    */
  var MediaFormat: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaFormat] = js.native
  
  /**
    * The sample rate, in Hertz, of the audio track in the input media file. If you do not specify the media sample rate, Amazon Transcribe Medical determines the sample rate. If you specify the sample rate, it must match the rate detected by Amazon Transcribe Medical. In most cases, you should leave the MediaSampleRateHertz field blank and let Amazon Transcribe Medical determine the sample rate.
    */
  var MediaSampleRateHertz: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MediaSampleRateHertz] = js.native
  
  /**
    * The name of the medical transcription job. You can't use the strings "." or ".." by themselves as the job name. The name must also be unique within an AWS account. If you try to create a medical transcription job with the same name as a previous medical transcription job you will receive a ConflictException error.
    */
  var MedicalTranscriptionJobName: TranscriptionJobName = js.native
  
  /**
    * The Amazon S3 location where the transcription is stored. You must set OutputBucketName for Amazon Transcribe Medical to store the transcription results. Your transcript appears in the S3 location you specify. When you call the GetMedicalTranscriptionJob, the operation returns this location in the TranscriptFileUri field. The S3 bucket must have permissions that allow Amazon Transcribe Medical to put files in the bucket. For more information, see Permissions Required for IAM User Roles. You can specify an AWS Key Management Service (KMS) key to encrypt the output of your transcription using the OutputEncryptionKMSKeyId parameter. If you don't specify a KMS key, Amazon Transcribe Medical uses the default Amazon S3 key for server-side encryption of transcripts that are placed in your S3 bucket.
    */
  var OutputBucketName: typingsSlinky.awsSdk.transcribeserviceMod.OutputBucketName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key used to encrypt the output of the transcription job. The user calling the StartMedicalTranscriptionJob operation must have permission to use the specified KMS key. You use either of the following to identify a KMS key in the current account:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"   KMS Key Alias: "alias/ExampleAlias"   You can use either of the following to identify a KMS key in the current account or another account:   Amazon Resource Name (ARN) of a KMS key in the current account or another account: "arn:aws:kms:region:account ID:key/1234abcd-12ab-34cd-56ef-1234567890ab"   ARN of a KMS Key Alias: "arn:aws:kms:region:account ID:alias/ExampleAlias"   If you don't specify an encryption key, the output of the medical transcription job is encrypted with the default Amazon S3 key (SSE-S3). If you specify a KMS key to encrypt your output, you must also specify an output location in the OutputBucketName parameter.
    */
  var OutputEncryptionKMSKeyId: js.UndefOr[KMSKeyId] = js.native
  
  /**
    * Optional settings for the medical transcription job.
    */
  var Settings: js.UndefOr[MedicalTranscriptionSetting] = js.native
  
  /**
    * The medical specialty of any clinician speaking in the input media.
    */
  var Specialty: typingsSlinky.awsSdk.transcribeserviceMod.Specialty = js.native
  
  /**
    * The type of speech in the input audio. CONVERSATION refers to conversations between two or more speakers, e.g., a conversations between doctors and patients. DICTATION refers to single-speaker dictated speech, e.g., for clinical notes.
    */
  var Type: typingsSlinky.awsSdk.transcribeserviceMod.Type = js.native
}
object StartMedicalTranscriptionJobRequest {
  
  @scala.inline
  def apply(
    LanguageCode: LanguageCode,
    Media: Media,
    MedicalTranscriptionJobName: TranscriptionJobName,
    OutputBucketName: OutputBucketName,
    Specialty: Specialty,
    Type: Type
  ): StartMedicalTranscriptionJobRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], MedicalTranscriptionJobName = MedicalTranscriptionJobName.asInstanceOf[js.Any], OutputBucketName = OutputBucketName.asInstanceOf[js.Any], Specialty = Specialty.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMedicalTranscriptionJobRequest]
  }
  
  @scala.inline
  implicit class StartMedicalTranscriptionJobRequestOps[Self <: StartMedicalTranscriptionJobRequest] (val x: Self) extends AnyVal {
    
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
    def setLanguageCode(value: LanguageCode): Self = this.set("LanguageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia(value: Media): Self = this.set("Media", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedicalTranscriptionJobName(value: TranscriptionJobName): Self = this.set("MedicalTranscriptionJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputBucketName(value: OutputBucketName): Self = this.set("OutputBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialty(value: Specialty): Self = this.set("Specialty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFormat(value: MediaFormat): Self = this.set("MediaFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaFormat: Self = this.set("MediaFormat", js.undefined)
    
    @scala.inline
    def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = this.set("MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaSampleRateHertz: Self = this.set("MediaSampleRateHertz", js.undefined)
    
    @scala.inline
    def setOutputEncryptionKMSKeyId(value: KMSKeyId): Self = this.set("OutputEncryptionKMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputEncryptionKMSKeyId: Self = this.set("OutputEncryptionKMSKeyId", js.undefined)
    
    @scala.inline
    def setSettings(value: MedicalTranscriptionSetting): Self = this.set("Settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("Settings", js.undefined)
  }
}
