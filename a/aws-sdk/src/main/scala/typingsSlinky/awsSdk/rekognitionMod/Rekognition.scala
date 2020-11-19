package typingsSlinky.awsSdk.rekognitionMod

import typingsSlinky.awsSdk.anon.DescribeProjectVersionsRe
import typingsSlinky.awsSdk.awsSdkStrings.projectVersionRunning
import typingsSlinky.awsSdk.awsSdkStrings.projectVersionTrainingCompleted
import typingsSlinky.awsSdk.configMod.ConfigBase
import typingsSlinky.awsSdk.errorMod.AWSError
import typingsSlinky.awsSdk.requestMod.Request
import typingsSlinky.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rekognition extends Service {
  
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(): Request[CompareFacesResponse, AWSError] = js.native
  def compareFaces(callback: js.Function2[/* err */ AWSError, /* data */ CompareFacesResponse, Unit]): Request[CompareFacesResponse, AWSError] = js.native
  /**
    * Compares a face in the source input image with each of the 100 largest faces detected in the target input image.    If the source image contains multiple faces, the service detects the largest face and compares it with each face detected in the target image.   You pass the input and target images either as base64-encoded image bytes or as references to images in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  In response, the operation returns an array of face matches ordered by similarity score in descending order. For each face match, the response provides a bounding box of the face, facial landmarks, pose details (pitch, role, and yaw), quality (brightness and sharpness), and confidence value (indicating the level of confidence that the bounding box contains a face). The response also provides a similarity score, which indicates how closely the faces match.   By default, only faces with a similarity score of greater than or equal to 80% are returned in the response. You can change this value by specifying the SimilarityThreshold parameter.   CompareFaces also returns an array of faces that don't match the source image. For each face, it returns a bounding box, confidence value, landmarks, pose details, and quality. The response also returns information about the face in the source image, including the bounding box of the face and confidence value. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   If the image doesn't contain Exif metadata, CompareFaces returns orientation information for the source and target images. Use these values to display the images with the correct image orientation. If no faces are detected in the source or target images, CompareFaces returns an InvalidParameterException error.    This is a stateless API operation. That is, data returned by this operation doesn't persist.  For an example, see Comparing Faces in Images in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:CompareFaces action.
    */
  def compareFaces(params: CompareFacesRequest): Request[CompareFacesResponse, AWSError] = js.native
  def compareFaces(
    params: CompareFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompareFacesResponse, Unit]
  ): Request[CompareFacesResponse, AWSError] = js.native
  
  @JSName("config")
  var config_Rekognition: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
    */
  def createCollection(): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]): Request[CreateCollectionResponse, AWSError] = js.native
  /**
    * Creates a collection in an AWS Region. You can add faces to the collection using the IndexFaces operation.  For example, you might create collections, one for each of your application users. A user can then index faces using the IndexFaces operation and persist results in a specific collection. Then, a user can search the collection for faces in the user-specific container.  When you create a collection, it is associated with the latest version of the face model version.  Collection names are case-sensitive.  This operation requires permissions to perform the rekognition:CreateCollection action.
    */
  def createCollection(params: CreateCollectionRequest): Request[CreateCollectionResponse, AWSError] = js.native
  def createCollection(
    params: CreateCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCollectionResponse, Unit]
  ): Request[CreateCollectionResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon Rekognition Custom Labels project. A project is a logical grouping of resources (images, Labels, models) and operations (training, evaluation and detection).  This operation requires permissions to perform the rekognition:CreateProject action.
    */
  def createProject(): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]): Request[CreateProjectResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Rekognition Custom Labels project. A project is a logical grouping of resources (images, Labels, models) and operations (training, evaluation and detection).  This operation requires permissions to perform the rekognition:CreateProject action.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResponse, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResponse, Unit]
  ): Request[CreateProjectResponse, AWSError] = js.native
  
  /**
    * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom Labels project. You can specify one training dataset and one testing dataset. The response from CreateProjectVersion is an Amazon Resource Name (ARN) for the version of the model.  Training takes a while to complete. You can get the current status by calling DescribeProjectVersions. Once training has successfully completed, call DescribeProjectVersions to get the training results and evaluate the model.  After evaluating the model, you start the model by calling StartProjectVersion. This operation requires permissions to perform the rekognition:CreateProjectVersion action.
    */
  def createProjectVersion(): Request[CreateProjectVersionResponse, AWSError] = js.native
  def createProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectVersionResponse, Unit]): Request[CreateProjectVersionResponse, AWSError] = js.native
  /**
    * Creates a new version of a model and begins training. Models are managed as part of an Amazon Rekognition Custom Labels project. You can specify one training dataset and one testing dataset. The response from CreateProjectVersion is an Amazon Resource Name (ARN) for the version of the model.  Training takes a while to complete. You can get the current status by calling DescribeProjectVersions. Once training has successfully completed, call DescribeProjectVersions to get the training results and evaluate the model.  After evaluating the model, you start the model by calling StartProjectVersion. This operation requires permissions to perform the rekognition:CreateProjectVersion action.
    */
  def createProjectVersion(params: CreateProjectVersionRequest): Request[CreateProjectVersionResponse, AWSError] = js.native
  def createProjectVersion(
    params: CreateProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectVersionResponse, Unit]
  ): Request[CreateProjectVersionResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing. You can delete the stream processor by calling DeleteStreamProcessor.
    */
  def createStreamProcessor(): Request[CreateStreamProcessorResponse, AWSError] = js.native
  def createStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamProcessorResponse, Unit]): Request[CreateStreamProcessorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Rekognition stream processor that you can use to detect and recognize faces in a streaming video. Amazon Rekognition Video is a consumer of live video from Amazon Kinesis Video Streams. Amazon Rekognition Video sends analysis results to Amazon Kinesis Data Streams. You provide as input a Kinesis video stream (Input) and a Kinesis data stream (Output) stream. You also specify the face recognition criteria in Settings. For example, the collection containing faces that you want to recognize. Use Name to assign an identifier for the stream processor. You use Name to manage the stream processor. For example, you can start processing the source video by calling StartStreamProcessor with the Name field.  After you have finished analyzing a streaming video, use StopStreamProcessor to stop processing. You can delete the stream processor by calling DeleteStreamProcessor.
    */
  def createStreamProcessor(params: CreateStreamProcessorRequest): Request[CreateStreamProcessorResponse, AWSError] = js.native
  def createStreamProcessor(
    params: CreateStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStreamProcessorResponse, Unit]
  ): Request[CreateStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]): Request[DeleteCollectionResponse, AWSError] = js.native
  /**
    * Deletes the specified collection. Note that this operation removes all faces in the collection. For an example, see delete-collection-procedure. This operation requires permissions to perform the rekognition:DeleteCollection action.
    */
  def deleteCollection(params: DeleteCollectionRequest): Request[DeleteCollectionResponse, AWSError] = js.native
  def deleteCollection(
    params: DeleteCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCollectionResponse, Unit]
  ): Request[DeleteCollectionResponse, AWSError] = js.native
  
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(): Request[DeleteFacesResponse, AWSError] = js.native
  def deleteFaces(callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacesResponse, Unit]): Request[DeleteFacesResponse, AWSError] = js.native
  /**
    * Deletes faces from a collection. You specify a collection ID and an array of face IDs to remove from the collection. This operation requires permissions to perform the rekognition:DeleteFaces action.
    */
  def deleteFaces(params: DeleteFacesRequest): Request[DeleteFacesResponse, AWSError] = js.native
  def deleteFaces(
    params: DeleteFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteFacesResponse, Unit]
  ): Request[DeleteFacesResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models associated with the project. To delete a model, see DeleteProjectVersion. This operation requires permissions to perform the rekognition:DeleteProject action. 
    */
  def deleteProject(): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]): Request[DeleteProjectResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Rekognition Custom Labels project. To delete a project you must first delete all models associated with the project. To delete a model, see DeleteProjectVersion. This operation requires permissions to perform the rekognition:DeleteProject action. 
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResponse, Unit]
  ): Request[DeleteProjectResponse, AWSError] = js.native
  
  /**
    * Deletes an Amazon Rekognition Custom Labels model.  You can't delete a model if it is running or if it is training. To check the status of a model, use the Status field returned from DescribeProjectVersions. To stop a running model call StopProjectVersion. If the model is training, wait until it finishes. This operation requires permissions to perform the rekognition:DeleteProjectVersion action. 
    */
  def deleteProjectVersion(): Request[DeleteProjectVersionResponse, AWSError] = js.native
  def deleteProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectVersionResponse, Unit]): Request[DeleteProjectVersionResponse, AWSError] = js.native
  /**
    * Deletes an Amazon Rekognition Custom Labels model.  You can't delete a model if it is running or if it is training. To check the status of a model, use the Status field returned from DescribeProjectVersions. To stop a running model call StopProjectVersion. If the model is training, wait until it finishes. This operation requires permissions to perform the rekognition:DeleteProjectVersion action. 
    */
  def deleteProjectVersion(params: DeleteProjectVersionRequest): Request[DeleteProjectVersionResponse, AWSError] = js.native
  def deleteProjectVersion(
    params: DeleteProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectVersionResponse, Unit]
  ): Request[DeleteProjectVersionResponse, AWSError] = js.native
  
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  def deleteStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamProcessorResponse, Unit]): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  /**
    * Deletes the stream processor identified by Name. You assign the value for Name when you create the stream processor with CreateStreamProcessor. You might not be able to use the same name for a stream processor for a few seconds after calling DeleteStreamProcessor.
    */
  def deleteStreamProcessor(params: DeleteStreamProcessorRequest): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  def deleteStreamProcessor(
    params: DeleteStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteStreamProcessorResponse, Unit]
  ): Request[DeleteStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(): Request[DescribeCollectionResponse, AWSError] = js.native
  def describeCollection(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCollectionResponse, Unit]): Request[DescribeCollectionResponse, AWSError] = js.native
  /**
    * Describes the specified collection. You can use DescribeCollection to get information, such as the number of faces indexed into a collection and the version of the model used by the collection for face detection. For more information, see Describing a Collection in the Amazon Rekognition Developer Guide.
    */
  def describeCollection(params: DescribeCollectionRequest): Request[DescribeCollectionResponse, AWSError] = js.native
  def describeCollection(
    params: DescribeCollectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCollectionResponse, Unit]
  ): Request[DescribeCollectionResponse, AWSError] = js.native
  
  /**
    * Lists and describes the models in an Amazon Rekognition Custom Labels project. You can specify up to 10 model versions in ProjectVersionArns. If you don't specify a value, descriptions for all models are returned. This operation requires permissions to perform the rekognition:DescribeProjectVersions action.
    */
  def describeProjectVersions(): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  def describeProjectVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Lists and describes the models in an Amazon Rekognition Custom Labels project. You can specify up to 10 model versions in ProjectVersionArns. If you don't specify a value, descriptions for all models are returned. This operation requires permissions to perform the rekognition:DescribeProjectVersions action.
    */
  def describeProjectVersions(params: DescribeProjectVersionsRequest): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  def describeProjectVersions(
    params: DescribeProjectVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  
  /**
    * Lists and gets information about your Amazon Rekognition Custom Labels projects. This operation requires permissions to perform the rekognition:DescribeProjects action.
    */
  def describeProjects(): Request[DescribeProjectsResponse, AWSError] = js.native
  def describeProjects(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectsResponse, Unit]): Request[DescribeProjectsResponse, AWSError] = js.native
  /**
    * Lists and gets information about your Amazon Rekognition Custom Labels projects. This operation requires permissions to perform the rekognition:DescribeProjects action.
    */
  def describeProjects(params: DescribeProjectsRequest): Request[DescribeProjectsResponse, AWSError] = js.native
  def describeProjects(
    params: DescribeProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectsResponse, Unit]
  ): Request[DescribeProjectsResponse, AWSError] = js.native
  
  /**
    * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  def describeStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamProcessorResponse, Unit]): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  /**
    * Provides information about a stream processor created by CreateStreamProcessor. You can get information about the input and output streams, the input parameters for the face recognition being performed, and the current status of the stream processor.
    */
  def describeStreamProcessor(params: DescribeStreamProcessorRequest): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  def describeStreamProcessor(
    params: DescribeStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStreamProcessorResponse, Unit]
  ): Request[DescribeStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.  You specify which version of a model version to use by using the ProjectVersionArn input parameter.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object that the model version detects on an image, the API returns a (CustomLabel) object in an array (CustomLabels). Each CustomLabel object provides the label name (Name), the level of confidence that the image contains the object (Confidence), and object location information, if it exists, for the label on the image (Geometry).  During training model calculates a threshold value that determines if a prediction for a label is true. By default, DetectCustomLabels doesn't return labels whose confidence value is below the model's calculated threshold value. To filter labels that are returned, specify a value for MinConfidence that is higher than the model's calculated threshold. You can get the model's calculated threshold from the model's training results shown in the Amazon Rekognition Custom Labels console. To get all labels, regardless of confidence, specify a MinConfidence value of 0.  You can also add the MaxResults parameter to limit the number of labels returned.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectCustomLabels action. 
    */
  def detectCustomLabels(): Request[DetectCustomLabelsResponse, AWSError] = js.native
  def detectCustomLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectCustomLabelsResponse, Unit]): Request[DetectCustomLabelsResponse, AWSError] = js.native
  /**
    * Detects custom labels in a supplied image by using an Amazon Rekognition Custom Labels model.  You specify which version of a model version to use by using the ProjectVersionArn input parameter.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object that the model version detects on an image, the API returns a (CustomLabel) object in an array (CustomLabels). Each CustomLabel object provides the label name (Name), the level of confidence that the image contains the object (Confidence), and object location information, if it exists, for the label on the image (Geometry).  During training model calculates a threshold value that determines if a prediction for a label is true. By default, DetectCustomLabels doesn't return labels whose confidence value is below the model's calculated threshold value. To filter labels that are returned, specify a value for MinConfidence that is higher than the model's calculated threshold. You can get the model's calculated threshold from the model's training results shown in the Amazon Rekognition Custom Labels console. To get all labels, regardless of confidence, specify a MinConfidence value of 0.  You can also add the MaxResults parameter to limit the number of labels returned.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectCustomLabels action. 
    */
  def detectCustomLabels(params: DetectCustomLabelsRequest): Request[DetectCustomLabelsResponse, AWSError] = js.native
  def detectCustomLabels(
    params: DetectCustomLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectCustomLabelsResponse, Unit]
  ): Request[DetectCustomLabelsResponse, AWSError] = js.native
  
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(): Request[DetectFacesResponse, AWSError] = js.native
  def detectFaces(callback: js.Function2[/* err */ AWSError, /* data */ DetectFacesResponse, Unit]): Request[DetectFacesResponse, AWSError] = js.native
  /**
    * Detects faces within an image that is provided as input.  DetectFaces detects the 100 largest faces in the image. For each face detected, the operation returns face details. These details include a bounding box of the face, a confidence value (that the bounding box contains a face), and a fixed set of attributes such as facial landmarks (for example, coordinates of eye and mouth), presence of beard, sunglasses, and so on.  The face-detection algorithm is most effective on frontal faces. For non-frontal or obscured faces, the algorithm might not detect the faces or might detect faces with lower confidence.  You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   This is a stateless API operation. That is, the operation does not persist any data.  This operation requires permissions to perform the rekognition:DetectFaces action. 
    */
  def detectFaces(params: DetectFacesRequest): Request[DetectFacesResponse, AWSError] = js.native
  def detectFaces(
    params: DetectFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectFacesResponse, Unit]
  ): Request[DetectFacesResponse, AWSError] = js.native
  
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of Instance objects. An Instance object contains a BoundingBox object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(): Request[DetectLabelsResponse, AWSError] = js.native
  def detectLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectLabelsResponse, Unit]): Request[DetectLabelsResponse, AWSError] = js.native
  /**
    * Detects instances of real-world entities within an image (JPEG or PNG) provided as input. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; and concepts like landscape, evening, and nature.  For an example, see Analyzing Images Stored in an Amazon S3 Bucket in the Amazon Rekognition Developer Guide.   DetectLabels does not support the detection of activities. However, activity detection is supported for label detection in videos. For more information, see StartLabelDetection in the Amazon Rekognition Developer Guide.  You pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   For each object, scene, and concept the API returns one or more labels. Each label provides the object name, and the level of confidence that the image contains the object. For example, suppose the input image has a lighthouse, the sea, and a rock. The response includes all three labels, one for each object.   {Name: lighthouse, Confidence: 98.4629}   {Name: rock,Confidence: 79.2097}    {Name: sea,Confidence: 75.061}  In the preceding example, the operation returns one label for each of the three objects. The operation can also return multiple labels for the same object in the image. For example, if the input image shows a flower (for example, a tulip), the operation might return the following three labels.   {Name: flower,Confidence: 99.0562}   {Name: plant,Confidence: 99.0562}   {Name: tulip,Confidence: 99.0562}  In this example, the detection algorithm more precisely identifies the flower as a tulip. In response, the API returns an array of labels. In addition, the response also includes the orientation correction. Optionally, you can specify MinConfidence to control the confidence threshold for the labels returned. The default is 55%. You can also add the MaxLabels parameter to limit the number of labels returned.   If the object detected is a person, the operation doesn't provide the same facial details that the DetectFaces operation provides.   DetectLabels returns bounding boxes for instances of common object labels in an array of Instance objects. An Instance object contains a BoundingBox object, for the location of the label on the image. It also includes the confidence by which the bounding box was detected.  DetectLabels also returns a hierarchical taxonomy of detected labels. For example, a detected car might be assigned the label car. The label car has two parent labels: Vehicle (its parent) and Transportation (its grandparent). The response returns the entire list of ancestors for a label. Each ancestor is a unique label in the response. In the previous example, Car, Vehicle, and Transportation are returned as unique labels in the response.  This is a stateless API operation. That is, the operation does not persist any data. This operation requires permissions to perform the rekognition:DetectLabels action. 
    */
  def detectLabels(params: DetectLabelsRequest): Request[DetectLabelsResponse, AWSError] = js.native
  def detectLabels(
    params: DetectLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectLabelsResponse, Unit]
  ): Request[DetectLabelsResponse, AWSError] = js.native
  
  /**
    * Detects unsafe content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(): Request[DetectModerationLabelsResponse, AWSError] = js.native
  def detectModerationLabels(callback: js.Function2[/* err */ AWSError, /* data */ DetectModerationLabelsResponse, Unit]): Request[DetectModerationLabelsResponse, AWSError] = js.native
  /**
    * Detects unsafe content in a specified JPEG or PNG format image. Use DetectModerationLabels to moderate images depending on your requirements. For example, you might want to filter images that contain nudity, but not images containing suggestive content. To filter images, use the labels returned by DetectModerationLabels to determine which types of content are appropriate. For information about moderation labels, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file. 
    */
  def detectModerationLabels(params: DetectModerationLabelsRequest): Request[DetectModerationLabelsResponse, AWSError] = js.native
  def detectModerationLabels(
    params: DetectModerationLabelsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectModerationLabelsResponse, Unit]
  ): Request[DetectModerationLabelsResponse, AWSError] = js.native
  
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
    */
  def detectText(): Request[DetectTextResponse, AWSError] = js.native
  def detectText(callback: js.Function2[/* err */ AWSError, /* data */ DetectTextResponse, Unit]): Request[DetectTextResponse, AWSError] = js.native
  /**
    * Detects text in the input image and converts it into machine-readable text. Pass the input image as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, you must pass it as a reference to an image in an Amazon S3 bucket. For the AWS CLI, passing image bytes is not supported. The image must be either a .png or .jpeg formatted file.  The DetectText operation returns text in an array of TextDetection elements, TextDetections. Each TextDetection element provides information about a single word or line of text that was detected in the image.  A word is one or more ISO basic latin script characters that are not separated by spaces. DetectText can detect up to 50 words in an image. A line is a string of equally spaced words. A line isn't necessarily a complete sentence. For example, a driver's license number is detected as a line. A line ends when there is no aligned text after it. Also, a line ends when there is a large gap between words, relative to the length of the words. This means, depending on the gap between words, Amazon Rekognition may detect multiple lines in text aligned in the same direction. Periods don't represent the end of a line. If a sentence spans multiple lines, the DetectText operation returns multiple lines. To determine whether a TextDetection element is a line of text or a word, use the TextDetection object Type field.  To be detected, text must be within +/- 90 degrees orientation of the horizontal axis. For more information, see DetectText in the Amazon Rekognition Developer Guide.
    */
  def detectText(params: DetectTextRequest): Request[DetectTextResponse, AWSError] = js.native
  def detectText(
    params: DetectTextRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectTextResponse, Unit]
  ): Request[DetectTextResponse, AWSError] = js.native
  
  /**
    * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(): Request[GetCelebrityInfoResponse, AWSError] = js.native
  def getCelebrityInfo(callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityInfoResponse, Unit]): Request[GetCelebrityInfoResponse, AWSError] = js.native
  /**
    * Gets the name and additional information about a celebrity based on his or her Amazon Rekognition ID. The additional information is returned as an array of URLs. If there is no additional information about the celebrity, this list is empty. For more information, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:GetCelebrityInfo action. 
    */
  def getCelebrityInfo(params: GetCelebrityInfoRequest): Request[GetCelebrityInfoResponse, AWSError] = js.native
  def getCelebrityInfo(
    params: GetCelebrityInfoRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityInfoResponse, Unit]
  ): Request[GetCelebrityInfoResponse, AWSError] = js.native
  
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  def getCelebrityRecognition(callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityRecognitionResponse, Unit]): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  /**
    * Gets the celebrity recognition results for a Amazon Rekognition Video analysis started by StartCelebrityRecognition. Celebrity recognition in a video is an asynchronous operation. Analysis is started by a call to StartCelebrityRecognition which returns a job identifier (JobId). When the celebrity recognition operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartCelebrityRecognition. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityDetection and pass the job identifier (JobId) from the initial call to StartCelebrityDetection.  For more information, see Working With Stored Videos in the Amazon Rekognition Developer Guide.  GetCelebrityRecognition returns detected celebrities and the time(s) they are detected in an array (Celebrities) of CelebrityRecognition objects. Each CelebrityRecognition contains information about the celebrity in a CelebrityDetail object and the time, Timestamp, the celebrity was detected.    GetCelebrityRecognition only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Celebrities array is sorted by time (milliseconds from the start of the video). You can also sort the array by celebrity by specifying the value ID in the SortBy input parameter. The CelebrityDetail object includes the celebrity identifer and additional information urls. If you don't store the additional information urls, you can get them later by calling GetCelebrityInfo with the celebrity identifer. No information is returned for faces not recognized as celebrities. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetCelebrityDetection and populate the NextToken request parameter with the token value returned from the previous call to GetCelebrityRecognition.
    */
  def getCelebrityRecognition(params: GetCelebrityRecognitionRequest): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  def getCelebrityRecognition(
    params: GetCelebrityRecognitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCelebrityRecognitionResponse, Unit]
  ): Request[GetCelebrityRecognitionResponse, AWSError] = js.native
  
  /**
    * Gets the unsafe content analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. Unsafe content analysis of a video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the unsafe content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected unsafe content labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(): Request[GetContentModerationResponse, AWSError] = js.native
  def getContentModeration(callback: js.Function2[/* err */ AWSError, /* data */ GetContentModerationResponse, Unit]): Request[GetContentModerationResponse, AWSError] = js.native
  /**
    * Gets the unsafe content analysis results for a Amazon Rekognition Video analysis started by StartContentModeration. Unsafe content analysis of a video is an asynchronous operation. You start analysis by calling StartContentModeration which returns a job identifier (JobId). When analysis finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartContentModeration. To get the results of the unsafe content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Working with Stored Videos in the Amazon Rekognition Devlopers Guide.  GetContentModeration returns detected unsafe content labels, and the time they are detected, in an array, ModerationLabels, of ContentModerationDetection objects.  By default, the moderated labels are returned sorted by time, in milliseconds from the start of the video. You can also sort them by moderated label by specifying NAME for the SortBy input parameter.  Since video analysis can return a large number of results, use the MaxResults parameter to limit the number of labels returned in a single call to GetContentModeration. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetContentModeration and populate the NextToken request parameter with the value of NextToken returned from the previous call to GetContentModeration. For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def getContentModeration(params: GetContentModerationRequest): Request[GetContentModerationResponse, AWSError] = js.native
  def getContentModeration(
    params: GetContentModerationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContentModerationResponse, Unit]
  ): Request[GetContentModerationResponse, AWSError] = js.native
  
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(): Request[GetFaceDetectionResponse, AWSError] = js.native
  def getFaceDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetFaceDetectionResponse, Unit]): Request[GetFaceDetectionResponse, AWSError] = js.native
  /**
    * Gets face detection results for a Amazon Rekognition Video analysis started by StartFaceDetection. Face detection with Amazon Rekognition Video is an asynchronous operation. You start face detection by calling StartFaceDetection which returns a job identifier (JobId). When the face detection operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceDetection. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection.  GetFaceDetection returns an array of detected faces (Faces) sorted by the time the faces were detected.  Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetFaceDetection and populate the NextToken request parameter with the token value returned from the previous call to GetFaceDetection.
    */
  def getFaceDetection(params: GetFaceDetectionRequest): Request[GetFaceDetectionResponse, AWSError] = js.native
  def getFaceDetection(
    params: GetFaceDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFaceDetectionResponse, Unit]
  ): Request[GetFaceDetectionResponse, AWSError] = js.native
  
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(): Request[GetFaceSearchResponse, AWSError] = js.native
  def getFaceSearch(callback: js.Function2[/* err */ AWSError, /* data */ GetFaceSearchResponse, Unit]): Request[GetFaceSearchResponse, AWSError] = js.native
  /**
    * Gets the face search results for Amazon Rekognition Video face search started by StartFaceSearch. The search returns faces in a collection that match the faces of persons detected in a video. It also includes the time(s) that faces are matched in the video. Face search in a video is an asynchronous operation. You start face search by calling to StartFaceSearch which returns a job identifier (JobId). When the search operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartFaceSearch. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see Searching Faces in a Collection in the Amazon Rekognition Developer Guide. The search results are retured in an array, Persons, of PersonMatch objects. EachPersonMatch element contains details about the matching faces in the input collection, person information (facial attributes, bounding boxes, and person identifer) for the matched person, and the time the person was matched in the video.   GetFaceSearch only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned. For more information, see FaceDetail in the Amazon Rekognition Developer Guide.   By default, the Persons array is sorted by the time, in milliseconds from the start of the video, persons are matched. You can also sort by persons by specifying INDEX for the SORTBY input parameter.
    */
  def getFaceSearch(params: GetFaceSearchRequest): Request[GetFaceSearchResponse, AWSError] = js.native
  def getFaceSearch(
    params: GetFaceSearchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetFaceSearchResponse, Unit]
  ): Request[GetFaceSearchResponse, AWSError] = js.native
  
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected labels, and the version of the label model used for detection. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
    */
  def getLabelDetection(): Request[GetLabelDetectionResponse, AWSError] = js.native
  def getLabelDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetLabelDetectionResponse, Unit]): Request[GetLabelDetectionResponse, AWSError] = js.native
  /**
    * Gets the label detection results of a Amazon Rekognition Video analysis started by StartLabelDetection.  The label detection operation is started by a call to StartLabelDetection which returns a job identifier (JobId). When the label detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartlabelDetection. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection.  GetLabelDetection returns an array of detected labels (Labels) sorted by the time the labels were detected. You can also sort by the label name by specifying NAME for the SortBy input parameter. The labels returned include the label name, the percentage confidence in the accuracy of the detected label, and the time the label was detected in the video. The returned labels also include bounding box information for common objects, a hierarchical taxonomy of detected labels, and the version of the label model used for detection. Use MaxResults parameter to limit the number of labels returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetlabelDetection and populate the NextToken request parameter with the token value returned from the previous call to GetLabelDetection.
    */
  def getLabelDetection(params: GetLabelDetectionRequest): Request[GetLabelDetectionResponse, AWSError] = js.native
  def getLabelDetection(
    params: GetLabelDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetLabelDetectionResponse, Unit]
  ): Request[GetLabelDetectionResponse, AWSError] = js.native
  
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(): Request[GetPersonTrackingResponse, AWSError] = js.native
  def getPersonTracking(callback: js.Function2[/* err */ AWSError, /* data */ GetPersonTrackingResponse, Unit]): Request[GetPersonTrackingResponse, AWSError] = js.native
  /**
    * Gets the path tracking results of a Amazon Rekognition Video analysis started by StartPersonTracking. The person path tracking operation is started by a call to StartPersonTracking which returns a job identifier (JobId). When the operation finishes, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartPersonTracking. To get the results of the person path tracking operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.  GetPersonTracking returns an array, Persons, of tracked persons and the time(s) their paths were tracked in the video.    GetPersonTracking only returns the default facial attributes (BoundingBox, Confidence, Landmarks, Pose, and Quality). The other facial attributes listed in the Face object of the following response syntax are not returned.  For more information, see FaceDetail in the Amazon Rekognition Developer Guide.  By default, the array is sorted by the time(s) a person's path is tracked in the video. You can sort by tracked persons by specifying INDEX for the SortBy input parameter. Use the MaxResults parameter to limit the number of items returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetPersonTracking and populate the NextToken request parameter with the token value returned from the previous call to GetPersonTracking.
    */
  def getPersonTracking(params: GetPersonTrackingRequest): Request[GetPersonTrackingResponse, AWSError] = js.native
  def getPersonTracking(
    params: GetPersonTrackingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPersonTrackingResponse, Unit]
  ): Request[GetPersonTrackingResponse, AWSError] = js.native
  
  /**
    * Gets the segment detection results of a Amazon Rekognition Video analysis started by StartSegmentDetection. Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by calling StartSegmentDetection which returns a job identifier (JobId). When the segment detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartSegmentDetection. To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call of StartSegmentDetection.  GetSegmentDetection returns detected segments in an array (Segments) of SegmentDetection objects. Segments is sorted by the segment types specified in the SegmentTypes input parameter of StartSegmentDetection. Each element of the array includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the segment, and the frame in which the segment was detected. Use SelectedSegmentTypes to find out the type of segment detection requested in the call to StartSegmentDetection. Use the MaxResults parameter to limit the number of segment detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetSegmentDetection and populate the NextToken request parameter with the token value returned from the previous call to GetSegmentDetection. For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
    */
  def getSegmentDetection(): Request[GetSegmentDetectionResponse, AWSError] = js.native
  def getSegmentDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentDetectionResponse, Unit]): Request[GetSegmentDetectionResponse, AWSError] = js.native
  /**
    * Gets the segment detection results of a Amazon Rekognition Video analysis started by StartSegmentDetection. Segment detection with Amazon Rekognition Video is an asynchronous operation. You start segment detection by calling StartSegmentDetection which returns a job identifier (JobId). When the segment detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartSegmentDetection. To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call of StartSegmentDetection.  GetSegmentDetection returns detected segments in an array (Segments) of SegmentDetection objects. Segments is sorted by the segment types specified in the SegmentTypes input parameter of StartSegmentDetection. Each element of the array includes the detected segment, the precentage confidence in the acuracy of the detected segment, the type of the segment, and the frame in which the segment was detected. Use SelectedSegmentTypes to find out the type of segment detection requested in the call to StartSegmentDetection. Use the MaxResults parameter to limit the number of segment detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetSegmentDetection and populate the NextToken request parameter with the token value returned from the previous call to GetSegmentDetection. For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
    */
  def getSegmentDetection(params: GetSegmentDetectionRequest): Request[GetSegmentDetectionResponse, AWSError] = js.native
  def getSegmentDetection(
    params: GetSegmentDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSegmentDetectionResponse, Unit]
  ): Request[GetSegmentDetectionResponse, AWSError] = js.native
  
  /**
    * Gets the text detection results of a Amazon Rekognition Video analysis started by StartTextDetection. Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling StartTextDetection which returns a job identifier (JobId) When the text detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartTextDetection. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call of StartLabelDetection.  GetTextDetection returns an array of detected text (TextDetections) sorted by the time the text was detected, up to 50 words per frame of video. Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected text, the time the text was detected, bounding box information for where the text was located, and unique identifiers for words and their lines. Use MaxResults parameter to limit the number of text detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetTextDetection and populate the NextToken request parameter with the token value returned from the previous call to GetTextDetection.
    */
  def getTextDetection(): Request[GetTextDetectionResponse, AWSError] = js.native
  def getTextDetection(callback: js.Function2[/* err */ AWSError, /* data */ GetTextDetectionResponse, Unit]): Request[GetTextDetectionResponse, AWSError] = js.native
  /**
    * Gets the text detection results of a Amazon Rekognition Video analysis started by StartTextDetection. Text detection with Amazon Rekognition Video is an asynchronous operation. You start text detection by calling StartTextDetection which returns a job identifier (JobId) When the text detection operation finishes, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic registered in the initial call to StartTextDetection. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call of StartLabelDetection.  GetTextDetection returns an array of detected text (TextDetections) sorted by the time the text was detected, up to 50 words per frame of video. Each element of the array includes the detected text, the precentage confidence in the acuracy of the detected text, the time the text was detected, bounding box information for where the text was located, and unique identifiers for words and their lines. Use MaxResults parameter to limit the number of text detections returned. If there are more results than specified in MaxResults, the value of NextToken in the operation response contains a pagination token for getting the next set of results. To get the next page of results, call GetTextDetection and populate the NextToken request parameter with the token value returned from the previous call to GetTextDetection.
    */
  def getTextDetection(params: GetTextDetectionRequest): Request[GetTextDetectionResponse, AWSError] = js.native
  def getTextDetection(
    params: GetTextDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetTextDetectionResponse, Unit]
  ): Request[GetTextDetectionResponse, AWSError] = js.native
  
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageId for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. By default, IndexFaces chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use QualityFilter, to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   The face doesn’t have enough detail to be suitable for face search.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(): Request[IndexFacesResponse, AWSError] = js.native
  def indexFaces(callback: js.Function2[/* err */ AWSError, /* data */ IndexFacesResponse, Unit]): Request[IndexFacesResponse, AWSError] = js.native
  /**
    * Detects faces in the input image and adds them to the specified collection.  Amazon Rekognition doesn't save the actual faces that are detected. Instead, the underlying detection algorithm first detects the faces in the input image. For each face, the algorithm extracts facial features into a feature vector, and stores it in the backend database. Amazon Rekognition uses feature vectors when it performs face match and search operations using the SearchFaces and SearchFacesByImage operations. For more information, see Adding Faces to a Collection in the Amazon Rekognition Developer Guide. To get the number of faces in a collection, call DescribeCollection.  If you're using version 1.0 of the face detection model, IndexFaces indexes the 15 largest faces in the input image. Later versions of the face detection model index the 100 largest faces in the input image.  If you're using version 4 or later of the face model, image orientation information is not returned in the OrientationCorrection field.  To determine which version of the model you're using, call DescribeCollection and supply the collection ID. You can also get the model version from the value of FaceModelVersion in the response from IndexFaces  For more information, see Model Versioning in the Amazon Rekognition Developer Guide. If you provide the optional ExternalImageId for the input image you provided, Amazon Rekognition associates this ID with all faces that it detects. When you call the ListFaces operation, the response returns the external ID. You can use this external image ID to create a client-side index to associate the faces with each image. You can then use the index to find all faces in an image. You can specify the maximum number of faces to index with the MaxFaces input parameter. This is useful when you want to index the largest faces in an image and don't want to index smaller faces, such as those belonging to people standing in the background. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. By default, IndexFaces chooses the quality bar that's used to filter faces. You can also explicitly choose the quality bar. Use QualityFilter, to set the quality bar by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE.   To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   Information about faces detected in an image, but not indexed, is returned in an array of UnindexedFace objects, UnindexedFaces. Faces aren't indexed for reasons such as:   The number of faces detected exceeds the value of the MaxFaces request parameter.   The face is too small compared to the image dimensions.   The face is too blurry.   The image is too dark.   The face has an extreme pose.   The face doesn’t have enough detail to be suitable for face search.   In response, the IndexFaces operation returns an array of metadata for all detected faces, FaceRecords. This includes:    The bounding box, BoundingBox, of the detected face.    A confidence value, Confidence, which indicates the confidence that the bounding box contains a face.   A face ID, FaceId, assigned by the service for each face that's detected and stored.   An image ID, ImageId, assigned by the service for the input image.   If you request all facial attributes (by using the detectionAttributes parameter), Amazon Rekognition returns detailed facial attributes, such as facial landmarks (for example, location of eye and mouth) and other facial attributes. If you provide the same image, specify the same collection, and use the same external ID in the IndexFaces operation, Amazon Rekognition doesn't save duplicate face metadata.  The input image is passed either as base64-encoded image bytes, or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes isn't supported. The image must be formatted as a PNG or JPEG file.  This operation requires permissions to perform the rekognition:IndexFaces action.
    */
  def indexFaces(params: IndexFacesRequest): Request[IndexFacesResponse, AWSError] = js.native
  def indexFaces(
    params: IndexFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ IndexFacesResponse, Unit]
  ): Request[IndexFacesResponse, AWSError] = js.native
  
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]): Request[ListCollectionsResponse, AWSError] = js.native
  /**
    * Returns list of collection IDs in your account. If the result is truncated, the response also provides a NextToken that you can use in the subsequent request to fetch the next set of collection IDs. For an example, see Listing Collections in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListCollections action.
    */
  def listCollections(params: ListCollectionsRequest): Request[ListCollectionsResponse, AWSError] = js.native
  def listCollections(
    params: ListCollectionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCollectionsResponse, Unit]
  ): Request[ListCollectionsResponse, AWSError] = js.native
  
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(): Request[ListFacesResponse, AWSError] = js.native
  def listFaces(callback: js.Function2[/* err */ AWSError, /* data */ ListFacesResponse, Unit]): Request[ListFacesResponse, AWSError] = js.native
  /**
    * Returns metadata for faces in the specified collection. This metadata includes information such as the bounding box coordinates, the confidence (that the bounding box contains a face), and face ID. For an example, see Listing Faces in a Collection in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:ListFaces action.
    */
  def listFaces(params: ListFacesRequest): Request[ListFacesResponse, AWSError] = js.native
  def listFaces(
    params: ListFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListFacesResponse, Unit]
  ): Request[ListFacesResponse, AWSError] = js.native
  
  /**
    * Gets a list of stream processors that you have created with CreateStreamProcessor. 
    */
  def listStreamProcessors(): Request[ListStreamProcessorsResponse, AWSError] = js.native
  def listStreamProcessors(callback: js.Function2[/* err */ AWSError, /* data */ ListStreamProcessorsResponse, Unit]): Request[ListStreamProcessorsResponse, AWSError] = js.native
  /**
    * Gets a list of stream processors that you have created with CreateStreamProcessor. 
    */
  def listStreamProcessors(params: ListStreamProcessorsRequest): Request[ListStreamProcessorsResponse, AWSError] = js.native
  def listStreamProcessors(
    params: ListStreamProcessorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListStreamProcessorsResponse, Unit]
  ): Request[ListStreamProcessorsResponse, AWSError] = js.native
  
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  def recognizeCelebrities(callback: js.Function2[/* err */ AWSError, /* data */ RecognizeCelebritiesResponse, Unit]): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  /**
    * Returns an array of celebrities recognized in the input image. For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.   RecognizeCelebrities returns the 100 largest faces in the image. It lists recognized celebrities in the CelebrityFaces array and unrecognized faces in the UnrecognizedFaces array. RecognizeCelebrities doesn't return celebrities whose faces aren't among the largest 100 faces in the image. For each celebrity recognized, RecognizeCelebrities returns a Celebrity object. The Celebrity object contains the celebrity name, ID, URL links to additional information, match confidence, and a ComparedFace object that you can use to locate the celebrity's face on the image. Amazon Rekognition doesn't retain information about which images a celebrity has been recognized in. Your application must store this information and use the Celebrity ID property as a unique identifier for the celebrity. If you don't store the celebrity name or additional information URLs returned by RecognizeCelebrities, you will need the ID to identify the celebrity in a call to the GetCelebrityInfo operation. You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.  For an example, see Recognizing Celebrities in an Image in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:RecognizeCelebrities operation.
    */
  def recognizeCelebrities(params: RecognizeCelebritiesRequest): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  def recognizeCelebrities(
    params: RecognizeCelebritiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RecognizeCelebritiesResponse, Unit]
  ): Request[RecognizeCelebritiesResponse, AWSError] = js.native
  
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(): Request[SearchFacesResponse, AWSError] = js.native
  def searchFaces(callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesResponse, Unit]): Request[SearchFacesResponse, AWSError] = js.native
  /**
    * For a given input face ID, searches for matching faces in the collection the face belongs to. You get a face ID when you add a face to the collection using the IndexFaces operation. The operation compares the features of the input face with faces in the specified collection.   You can also search faces without indexing faces by using the SearchFacesByImage operation.   The operation response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match that is found. Along with the metadata, the response also includes a confidence value for each face match, indicating the confidence that the specific face matches the input face.  For an example, see Searching for a Face Using Its Face ID in the Amazon Rekognition Developer Guide. This operation requires permissions to perform the rekognition:SearchFaces action.
    */
  def searchFaces(params: SearchFacesRequest): Request[SearchFacesResponse, AWSError] = js.native
  def searchFaces(
    params: SearchFacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesResponse, Unit]
  ): Request[SearchFacesResponse, AWSError] = js.native
  
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar for filtering by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(): Request[SearchFacesByImageResponse, AWSError] = js.native
  def searchFacesByImage(callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesByImageResponse, Unit]): Request[SearchFacesByImageResponse, AWSError] = js.native
  /**
    * For a given input image, first detects the largest face in the image, and then searches the specified collection for matching faces. The operation compares the features of the input face with faces in the specified collection.   To search for all faces in an input image, you might first call the IndexFaces operation, and then use the face IDs returned in subsequent calls to the SearchFaces operation.   You can also call the DetectFaces operation and use the bounding boxes in the response to make face crops, which then you can pass in to the SearchFacesByImage operation.   You pass the input image either as base64-encoded image bytes or as a reference to an image in an Amazon S3 bucket. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. The image must be either a PNG or JPEG formatted file.   The response returns an array of faces that match, ordered by similarity score with the highest similarity first. More specifically, it is an array of metadata for each face match found. Along with the metadata, the response also includes a similarity indicating how similar the face is to the input face. In the response, the operation also returns the bounding box (and a confidence level that the bounding box contains a face) of the face that Amazon Rekognition used for the input image.  For an example, Searching for a Face Using an Image in the Amazon Rekognition Developer Guide. The QualityFilter input parameter allows you to filter out detected faces that don’t meet a required quality bar. The quality bar is based on a variety of common use cases. Use QualityFilter to set the quality bar for filtering by specifying LOW, MEDIUM, or HIGH. If you do not want to filter detected faces, specify NONE. The default value is NONE.  To use quality filtering, you need a collection associated with version 3 of the face model or higher. To get the version of the face model associated with a collection, call DescribeCollection.   This operation requires permissions to perform the rekognition:SearchFacesByImage action.
    */
  def searchFacesByImage(params: SearchFacesByImageRequest): Request[SearchFacesByImageResponse, AWSError] = js.native
  def searchFacesByImage(
    params: SearchFacesByImageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchFacesByImageResponse, Unit]
  ): Request[SearchFacesByImageResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  def startCelebrityRecognition(callback: js.Function2[/* err */ AWSError, /* data */ StartCelebrityRecognitionResponse, Unit]): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  /**
    * Starts asynchronous recognition of celebrities in a stored video. Amazon Rekognition Video can detect celebrities in a video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartCelebrityRecognition returns a job identifier (JobId) which you use to get the results of the analysis. When celebrity recognition analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the celebrity recognition analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetCelebrityRecognition and pass the job identifier (JobId) from the initial call to StartCelebrityRecognition.  For more information, see Recognizing Celebrities in the Amazon Rekognition Developer Guide.
    */
  def startCelebrityRecognition(params: StartCelebrityRecognitionRequest): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  def startCelebrityRecognition(
    params: StartCelebrityRecognitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartCelebrityRecognitionResponse, Unit]
  ): Request[StartCelebrityRecognitionResponse, AWSError] = js.native
  
  /**
    *  Starts asynchronous detection of unsafe content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When unsafe content analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the unsafe content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(): Request[StartContentModerationResponse, AWSError] = js.native
  def startContentModeration(callback: js.Function2[/* err */ AWSError, /* data */ StartContentModerationResponse, Unit]): Request[StartContentModerationResponse, AWSError] = js.native
  /**
    *  Starts asynchronous detection of unsafe content in a stored video. Amazon Rekognition Video can moderate content in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartContentModeration returns a job identifier (JobId) which you use to get the results of the analysis. When unsafe content analysis is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the unsafe content analysis, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetContentModeration and pass the job identifier (JobId) from the initial call to StartContentModeration.  For more information, see Detecting Unsafe Content in the Amazon Rekognition Developer Guide.
    */
  def startContentModeration(params: StartContentModerationRequest): Request[StartContentModerationResponse, AWSError] = js.native
  def startContentModeration(
    params: StartContentModerationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartContentModerationResponse, Unit]
  ): Request[StartContentModerationResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(): Request[StartFaceDetectionResponse, AWSError] = js.native
  def startFaceDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartFaceDetectionResponse, Unit]): Request[StartFaceDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of faces in a stored video. Amazon Rekognition Video can detect faces in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceDetection returns a job identifier (JobId) that you use to get the results of the operation. When face detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the face detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceDetection and pass the job identifier (JobId) from the initial call to StartFaceDetection. For more information, see Detecting Faces in a Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startFaceDetection(params: StartFaceDetectionRequest): Request[StartFaceDetectionResponse, AWSError] = js.native
  def startFaceDetection(
    params: StartFaceDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFaceDetectionResponse, Unit]
  ): Request[StartFaceDetectionResponse, AWSError] = js.native
  
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
    */
  def startFaceSearch(): Request[StartFaceSearchResponse, AWSError] = js.native
  def startFaceSearch(callback: js.Function2[/* err */ AWSError, /* data */ StartFaceSearchResponse, Unit]): Request[StartFaceSearchResponse, AWSError] = js.native
  /**
    * Starts the asynchronous search for faces in a collection that match the faces of persons detected in a stored video. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartFaceSearch returns a job identifier (JobId) which you use to get the search results once the search has completed. When searching is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the search results, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetFaceSearch and pass the job identifier (JobId) from the initial call to StartFaceSearch. For more information, see procedure-person-search-videos.
    */
  def startFaceSearch(params: StartFaceSearchRequest): Request[StartFaceSearchResponse, AWSError] = js.native
  def startFaceSearch(
    params: StartFaceSearchRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartFaceSearchResponse, Unit]
  ): Request[StartFaceSearchResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
    */
  def startLabelDetection(): Request[StartLabelDetectionResponse, AWSError] = js.native
  def startLabelDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartLabelDetectionResponse, Unit]): Request[StartLabelDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of labels in a stored video. Amazon Rekognition Video can detect labels in a video. Labels are instances of real-world entities. This includes objects like flower, tree, and table; events like wedding, graduation, and birthday party; concepts like landscape, evening, and nature; and activities like a person getting out of a car or a person skiing. The video must be stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartLabelDetection returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the label detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetLabelDetection and pass the job identifier (JobId) from the initial call to StartLabelDetection. 
    */
  def startLabelDetection(params: StartLabelDetectionRequest): Request[StartLabelDetectionResponse, AWSError] = js.native
  def startLabelDetection(
    params: StartLabelDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartLabelDetectionResponse, Unit]
  ): Request[StartLabelDetectionResponse, AWSError] = js.native
  
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(): Request[StartPersonTrackingResponse, AWSError] = js.native
  def startPersonTracking(callback: js.Function2[/* err */ AWSError, /* data */ StartPersonTrackingResponse, Unit]): Request[StartPersonTrackingResponse, AWSError] = js.native
  /**
    * Starts the asynchronous tracking of a person's path in a stored video. Amazon Rekognition Video can track the path of people in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartPersonTracking returns a job identifier (JobId) which you use to get the results of the operation. When label detection is finished, Amazon Rekognition publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel.  To get the results of the person detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. If so, call GetPersonTracking and pass the job identifier (JobId) from the initial call to StartPersonTracking.
    */
  def startPersonTracking(params: StartPersonTrackingRequest): Request[StartPersonTrackingResponse, AWSError] = js.native
  def startPersonTracking(
    params: StartPersonTrackingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartPersonTrackingResponse, Unit]
  ): Request[StartPersonTrackingResponse, AWSError] = js.native
  
  /**
    * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current state of the model, use DescribeProjectVersions. Once the model is running, you can detect custom labels in new images by calling DetectCustomLabels.  You are charged for the amount of time that the model is running. To stop a running model, call StopProjectVersion.  This operation requires permissions to perform the rekognition:StartProjectVersion action.
    */
  def startProjectVersion(): Request[StartProjectVersionResponse, AWSError] = js.native
  def startProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ StartProjectVersionResponse, Unit]): Request[StartProjectVersionResponse, AWSError] = js.native
  /**
    * Starts the running of the version of a model. Starting a model takes a while to complete. To check the current state of the model, use DescribeProjectVersions. Once the model is running, you can detect custom labels in new images by calling DetectCustomLabels.  You are charged for the amount of time that the model is running. To stop a running model, call StopProjectVersion.  This operation requires permissions to perform the rekognition:StartProjectVersion action.
    */
  def startProjectVersion(params: StartProjectVersionRequest): Request[StartProjectVersionResponse, AWSError] = js.native
  def startProjectVersion(
    params: StartProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartProjectVersionResponse, Unit]
  ): Request[StartProjectVersionResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of segment detection in a stored video. Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartSegmentDetection returns a job identifier (JobId) which you use to get the results of the operation. When segment detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. You can use the Filters (StartSegmentDetectionFilters) input parameter to specify the minimum detection confidence returned in the response. Within Filters, use ShotFilter (StartShotDetectionFilter) to filter detected shots. Use TechnicalCueFilter (StartTechnicalCueDetectionFilter) to filter technical cues.  To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call to StartSegmentDetection.  For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startSegmentDetection(): Request[StartSegmentDetectionResponse, AWSError] = js.native
  def startSegmentDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartSegmentDetectionResponse, Unit]): Request[StartSegmentDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of segment detection in a stored video. Amazon Rekognition Video can detect segments in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartSegmentDetection returns a job identifier (JobId) which you use to get the results of the operation. When segment detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. You can use the Filters (StartSegmentDetectionFilters) input parameter to specify the minimum detection confidence returned in the response. Within Filters, use ShotFilter (StartShotDetectionFilter) to filter detected shots. Use TechnicalCueFilter (StartTechnicalCueDetectionFilter) to filter technical cues.  To get the results of the segment detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetSegmentDetection and pass the job identifier (JobId) from the initial call to StartSegmentDetection.  For more information, see Detecting Video Segments in Stored Video in the Amazon Rekognition Developer Guide.
    */
  def startSegmentDetection(params: StartSegmentDetectionRequest): Request[StartSegmentDetectionResponse, AWSError] = js.native
  def startSegmentDetection(
    params: StartSegmentDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSegmentDetectionResponse, Unit]
  ): Request[StartSegmentDetectionResponse, AWSError] = js.native
  
  /**
    * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
    */
  def startStreamProcessor(): Request[StartStreamProcessorResponse, AWSError] = js.native
  def startStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ StartStreamProcessorResponse, Unit]): Request[StartStreamProcessorResponse, AWSError] = js.native
  /**
    * Starts processing a stream processor. You create a stream processor by calling CreateStreamProcessor. To tell StartStreamProcessor which stream processor to start, use the value of the Name field specified in the call to CreateStreamProcessor.
    */
  def startStreamProcessor(params: StartStreamProcessorRequest): Request[StartStreamProcessorResponse, AWSError] = js.native
  def startStreamProcessor(
    params: StartStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartStreamProcessorResponse, Unit]
  ): Request[StartStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Starts asynchronous detection of text in a stored video. Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartTextDetection returns a job identifier (JobId) which you use to get the results of the operation. When text detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call to StartTextDetection. 
    */
  def startTextDetection(): Request[StartTextDetectionResponse, AWSError] = js.native
  def startTextDetection(callback: js.Function2[/* err */ AWSError, /* data */ StartTextDetectionResponse, Unit]): Request[StartTextDetectionResponse, AWSError] = js.native
  /**
    * Starts asynchronous detection of text in a stored video. Amazon Rekognition Video can detect text in a video stored in an Amazon S3 bucket. Use Video to specify the bucket name and the filename of the video. StartTextDetection returns a job identifier (JobId) which you use to get the results of the operation. When text detection is finished, Amazon Rekognition Video publishes a completion status to the Amazon Simple Notification Service topic that you specify in NotificationChannel. To get the results of the text detection operation, first check that the status value published to the Amazon SNS topic is SUCCEEDED. if so, call GetTextDetection and pass the job identifier (JobId) from the initial call to StartTextDetection. 
    */
  def startTextDetection(params: StartTextDetectionRequest): Request[StartTextDetectionResponse, AWSError] = js.native
  def startTextDetection(
    params: StartTextDetectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTextDetectionResponse, Unit]
  ): Request[StartTextDetectionResponse, AWSError] = js.native
  
  /**
    * Stops a running model. The operation might take a while to complete. To check the current status, call DescribeProjectVersions. 
    */
  def stopProjectVersion(): Request[StopProjectVersionResponse, AWSError] = js.native
  def stopProjectVersion(callback: js.Function2[/* err */ AWSError, /* data */ StopProjectVersionResponse, Unit]): Request[StopProjectVersionResponse, AWSError] = js.native
  /**
    * Stops a running model. The operation might take a while to complete. To check the current status, call DescribeProjectVersions. 
    */
  def stopProjectVersion(params: StopProjectVersionRequest): Request[StopProjectVersionResponse, AWSError] = js.native
  def stopProjectVersion(
    params: StopProjectVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopProjectVersionResponse, Unit]
  ): Request[StopProjectVersionResponse, AWSError] = js.native
  
  /**
    * Stops a running stream processor that was created by CreateStreamProcessor.
    */
  def stopStreamProcessor(): Request[StopStreamProcessorResponse, AWSError] = js.native
  def stopStreamProcessor(callback: js.Function2[/* err */ AWSError, /* data */ StopStreamProcessorResponse, Unit]): Request[StopStreamProcessorResponse, AWSError] = js.native
  /**
    * Stops a running stream processor that was created by CreateStreamProcessor.
    */
  def stopStreamProcessor(params: StopStreamProcessorRequest): Request[StopStreamProcessorResponse, AWSError] = js.native
  def stopStreamProcessor(
    params: StopStreamProcessorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopStreamProcessorResponse, Unit]
  ): Request[StopStreamProcessorResponse, AWSError] = js.native
  
  /**
    * Waits for the projectVersionRunning state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 30 seconds (at most 40 times). Wait until the ProjectVersion is running.
    */
  @JSName("waitFor")
  def waitFor_projectVersionRunning(state: projectVersionRunning): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionRunning(
    state: projectVersionRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionRunning state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 30 seconds (at most 40 times). Wait until the ProjectVersion is running.
    */
  @JSName("waitFor")
  def waitFor_projectVersionRunning(state: projectVersionRunning, params: DescribeProjectVersionsRe): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionRunning(
    state: projectVersionRunning,
    params: DescribeProjectVersionsRe,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionTrainingCompleted state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 120 seconds (at most 360 times). Wait until the ProjectVersion training completes.
    */
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(state: projectVersionTrainingCompleted): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(
    state: projectVersionTrainingCompleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  /**
    * Waits for the projectVersionTrainingCompleted state by periodically calling the underlying Rekognition.describeProjectVersionsoperation every 120 seconds (at most 360 times). Wait until the ProjectVersion training completes.
    */
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(state: projectVersionTrainingCompleted, params: DescribeProjectVersionsRe): Request[DescribeProjectVersionsResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_projectVersionTrainingCompleted(
    state: projectVersionTrainingCompleted,
    params: DescribeProjectVersionsRe,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectVersionsResponse, Unit]
  ): Request[DescribeProjectVersionsResponse, AWSError] = js.native
}
