package typingsSlinky.awsSdk.transcribeserviceMod

import typingsSlinky.awsSdk.configBaseMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranscribeService extends Service {
  
  @JSName("config")
  var config_TranscribeService: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time it takes to create your model depends on the size of your training data.
    */
  def createLanguageModel(): Request[CreateLanguageModelResponse, AWSError] = js.native
  def createLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ CreateLanguageModelResponse, Unit]): Request[CreateLanguageModelResponse, AWSError] = js.native
  /**
    * Creates a new custom language model. Use Amazon S3 prefixes to provide the location of your input files. The time it takes to create your model depends on the size of your training data.
    */
  def createLanguageModel(params: CreateLanguageModelRequest): Request[CreateLanguageModelResponse, AWSError] = js.native
  def createLanguageModel(
    params: CreateLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLanguageModelResponse, Unit]
  ): Request[CreateLanguageModelResponse, AWSError] = js.native
  
  /**
    * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio file.
    */
  def createMedicalVocabulary(): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change how Amazon Transcribe Medical transcribes your audio file.
    */
  def createMedicalVocabulary(params: CreateMedicalVocabularyRequest): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  def createMedicalVocabulary(
    params: CreateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMedicalVocabularyResponse, Unit]
  ): Request[CreateMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]): Request[CreateVocabularyResponse, AWSError] = js.native
  /**
    * Creates a new custom vocabulary that you can use to change the way Amazon Transcribe handles transcription of an audio file. 
    */
  def createVocabulary(params: CreateVocabularyRequest): Request[CreateVocabularyResponse, AWSError] = js.native
  def createVocabulary(
    params: CreateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyResponse, Unit]
  ): Request[CreateVocabularyResponse, AWSError] = js.native
  
  /**
    * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a transcription job.
    */
  def createVocabularyFilter(): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Creates a new vocabulary filter that you can use to filter words, such as profane words, from the output of a transcription job.
    */
  def createVocabularyFilter(params: CreateVocabularyFilterRequest): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  def createVocabularyFilter(
    params: CreateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVocabularyFilterResponse, Unit]
  ): Request[CreateVocabularyFilterResponse, AWSError] = js.native
  
  /**
    * Deletes a custom language model using its name.
    */
  def deleteLanguageModel(): Request[js.Object, AWSError] = js.native
  def deleteLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a custom language model using its name.
    */
  def deleteLanguageModel(params: DeleteLanguageModelRequest): Request[js.Object, AWSError] = js.native
  def deleteLanguageModel(
    params: DeleteLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
    */
  def deleteMedicalTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a transcription job generated by Amazon Transcribe Medical and any related information.
    */
  def deleteMedicalTranscriptionJob(params: DeleteMedicalTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalTranscriptionJob(
    params: DeleteMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a vocabulary from Amazon Transcribe Medical.
    */
  def deleteMedicalVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe Medical.
    */
  def deleteMedicalVocabulary(params: DeleteMedicalVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteMedicalVocabulary(
    params: DeleteMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a previously submitted transcription job along with any other generated results such as the transcription, models, and so on.
    */
  def deleteTranscriptionJob(params: DeleteTranscriptionJobRequest): Request[js.Object, AWSError] = js.native
  def deleteTranscriptionJob(
    params: DeleteTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a vocabulary from Amazon Transcribe. 
    */
  def deleteVocabulary(params: DeleteVocabularyRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabulary(
    params: DeleteVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes a vocabulary filter.
    */
  def deleteVocabularyFilter(): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a vocabulary filter.
    */
  def deleteVocabularyFilter(params: DeleteVocabularyFilterRequest): Request[js.Object, AWSError] = js.native
  def deleteVocabularyFilter(
    params: DeleteVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets information about a single custom language model. Use this information to see details about the language model in your AWS account. You can also see whether the base language model used to create your custom language model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the updated base model. If the language model wasn't created, you can use this operation to understand why Amazon Transcribe couldn't create it. 
    */
  def describeLanguageModel(): Request[DescribeLanguageModelResponse, AWSError] = js.native
  def describeLanguageModel(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLanguageModelResponse, Unit]): Request[DescribeLanguageModelResponse, AWSError] = js.native
  /**
    * Gets information about a single custom language model. Use this information to see details about the language model in your AWS account. You can also see whether the base language model used to create your custom language model has been updated. If Amazon Transcribe has updated the base model, you can create a new custom language model using the updated base model. If the language model wasn't created, you can use this operation to understand why Amazon Transcribe couldn't create it. 
    */
  def describeLanguageModel(params: DescribeLanguageModelRequest): Request[DescribeLanguageModelResponse, AWSError] = js.native
  def describeLanguageModel(
    params: DescribeLanguageModelRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLanguageModelResponse, Unit]
  ): Request[DescribeLanguageModelResponse, AWSError] = js.native
  
  /**
    * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You find the results of the completed job in the TranscriptFileUri field.
    */
  def getMedicalTranscriptionJob(): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job from Amazon Transcribe Medical. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished. You find the results of the completed job in the TranscriptFileUri field.
    */
  def getMedicalTranscriptionJob(params: GetMedicalTranscriptionJobRequest): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  def getMedicalTranscriptionJob(
    params: GetMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalTranscriptionJobResponse, Unit]
  ): Request[GetMedicalTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Retrieves information about a medical vocabulary.
    */
  def getMedicalVocabulary(): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Retrieves information about a medical vocabulary.
    */
  def getMedicalVocabulary(params: GetMedicalVocabularyRequest): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  def getMedicalVocabulary(
    params: GetMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMedicalVocabularyResponse, Unit]
  ): Request[GetMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri.
    */
  def getTranscriptionJob(): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]): Request[GetTranscriptionJobResponse, AWSError] = js.native
  /**
    * Returns information about a transcription job. To see the status of the job, check the TranscriptionJobStatus field. If the status is COMPLETED, the job is finished and you can find the results at the location specified in the TranscriptFileUri field. If you enable content redaction, the redacted transcript appears in RedactedTranscriptFileUri.
    */
  def getTranscriptionJob(params: GetTranscriptionJobRequest): Request[GetTranscriptionJobResponse, AWSError] = js.native
  def getTranscriptionJob(
    params: GetTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTranscriptionJobResponse, Unit]
  ): Request[GetTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]): Request[GetVocabularyResponse, AWSError] = js.native
  /**
    * Gets information about a vocabulary. 
    */
  def getVocabulary(params: GetVocabularyRequest): Request[GetVocabularyResponse, AWSError] = js.native
  def getVocabulary(
    params: GetVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyResponse, Unit]
  ): Request[GetVocabularyResponse, AWSError] = js.native
  
  /**
    * Returns information about a vocabulary filter.
    */
  def getVocabularyFilter(): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]): Request[GetVocabularyFilterResponse, AWSError] = js.native
  /**
    * Returns information about a vocabulary filter.
    */
  def getVocabularyFilter(params: GetVocabularyFilterRequest): Request[GetVocabularyFilterResponse, AWSError] = js.native
  def getVocabularyFilter(
    params: GetVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVocabularyFilterResponse, Unit]
  ): Request[GetVocabularyFilterResponse, AWSError] = js.native
  
  /**
    * Provides more information about the custom language models you've created. You can use the information in this list to find a specific custom language model. You can then use the operation to get more information about it.
    */
  def listLanguageModels(): Request[ListLanguageModelsResponse, AWSError] = js.native
  def listLanguageModels(callback: js.Function2[/* err */ AWSError, /* data */ ListLanguageModelsResponse, Unit]): Request[ListLanguageModelsResponse, AWSError] = js.native
  /**
    * Provides more information about the custom language models you've created. You can use the information in this list to find a specific custom language model. You can then use the operation to get more information about it.
    */
  def listLanguageModels(params: ListLanguageModelsRequest): Request[ListLanguageModelsResponse, AWSError] = js.native
  def listLanguageModels(
    params: ListLanguageModelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLanguageModelsResponse, Unit]
  ): Request[ListLanguageModelsResponse, AWSError] = js.native
  
  /**
    * Lists medical transcription jobs with a specified status or substring that matches their names.
    */
  def listMedicalTranscriptionJobs(): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Lists medical transcription jobs with a specified status or substring that matches their names.
    */
  def listMedicalTranscriptionJobs(params: ListMedicalTranscriptionJobsRequest): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  def listMedicalTranscriptionJobs(
    params: ListMedicalTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalTranscriptionJobsResponse, Unit]
  ): Request[ListMedicalTranscriptionJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the request parameters, returns the entire list of vocabularies.
    */
  def listMedicalVocabularies(): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If you don't enter a value in any of the request parameters, returns the entire list of vocabularies.
    */
  def listMedicalVocabularies(params: ListMedicalVocabulariesRequest): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  def listMedicalVocabularies(
    params: ListMedicalVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMedicalVocabulariesResponse, Unit]
  ): Request[ListMedicalVocabulariesResponse, AWSError] = js.native
  
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  /**
    * Lists transcription jobs with the specified status.
    */
  def listTranscriptionJobs(params: ListTranscriptionJobsRequest): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  def listTranscriptionJobs(
    params: ListTranscriptionJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTranscriptionJobsResponse, Unit]
  ): Request[ListTranscriptionJobsResponse, AWSError] = js.native
  
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]): Request[ListVocabulariesResponse, AWSError] = js.native
  /**
    * Returns a list of vocabularies that match the specified criteria. If no criteria are specified, returns the entire list of vocabularies.
    */
  def listVocabularies(params: ListVocabulariesRequest): Request[ListVocabulariesResponse, AWSError] = js.native
  def listVocabularies(
    params: ListVocabulariesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabulariesResponse, Unit]
  ): Request[ListVocabulariesResponse, AWSError] = js.native
  
  /**
    * Gets information about vocabulary filters.
    */
  def listVocabularyFilters(): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  /**
    * Gets information about vocabulary filters.
    */
  def listVocabularyFilters(params: ListVocabularyFiltersRequest): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  def listVocabularyFilters(
    params: ListVocabularyFiltersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVocabularyFiltersResponse, Unit]
  ): Request[ListVocabularyFiltersResponse, AWSError] = js.native
  
  /**
    * Starts a batch job to transcribe medical speech to text.
    */
  def startMedicalTranscriptionJob(): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  /**
    * Starts a batch job to transcribe medical speech to text.
    */
  def startMedicalTranscriptionJob(params: StartMedicalTranscriptionJobRequest): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  def startMedicalTranscriptionJob(
    params: StartMedicalTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartMedicalTranscriptionJobResponse, Unit]
  ): Request[StartMedicalTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]): Request[StartTranscriptionJobResponse, AWSError] = js.native
  /**
    * Starts an asynchronous job to transcribe speech to text. 
    */
  def startTranscriptionJob(params: StartTranscriptionJobRequest): Request[StartTranscriptionJobResponse, AWSError] = js.native
  def startTranscriptionJob(
    params: StartTranscriptionJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTranscriptionJobResponse, Unit]
  ): Request[StartTranscriptionJobResponse, AWSError] = js.native
  
  /**
    * Updates a vocabulary with new values that you provide in a different text file from the one you used to create the vocabulary. The UpdateMedicalVocabulary operation overwrites all of the existing information with the values that you provide in the request.
    */
  def updateMedicalVocabulary(): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  /**
    * Updates a vocabulary with new values that you provide in a different text file from the one you used to create the vocabulary. The UpdateMedicalVocabulary operation overwrites all of the existing information with the values that you provide in the request.
    */
  def updateMedicalVocabulary(params: UpdateMedicalVocabularyRequest): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  def updateMedicalVocabulary(
    params: UpdateMedicalVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMedicalVocabularyResponse, Unit]
  ): Request[UpdateMedicalVocabularyResponse, AWSError] = js.native
  
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]): Request[UpdateVocabularyResponse, AWSError] = js.native
  /**
    * Updates an existing vocabulary with new values. The UpdateVocabulary operation overwrites all of the existing information with the values that you provide in the request. 
    */
  def updateVocabulary(params: UpdateVocabularyRequest): Request[UpdateVocabularyResponse, AWSError] = js.native
  def updateVocabulary(
    params: UpdateVocabularyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyResponse, Unit]
  ): Request[UpdateVocabularyResponse, AWSError] = js.native
  
  /**
    * Updates a vocabulary filter with a new list of filtered words.
    */
  def updateVocabularyFilter(): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  /**
    * Updates a vocabulary filter with a new list of filtered words.
    */
  def updateVocabularyFilter(params: UpdateVocabularyFilterRequest): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
  def updateVocabularyFilter(
    params: UpdateVocabularyFilterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVocabularyFilterResponse, Unit]
  ): Request[UpdateVocabularyFilterResponse, AWSError] = js.native
}
