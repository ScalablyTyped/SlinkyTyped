package typingsSlinky.firebaseStorage

import typingsSlinky.firebaseStorage.blobMod.FbsBlob
import typingsSlinky.firebaseStorage.errorMod.FirebaseStorageError
import typingsSlinky.firebaseStorage.locationMod.Location
import typingsSlinky.firebaseStorage.metadataMod.Mappings
import typingsSlinky.firebaseStorage.requestinfoMod.RequestInfo
import typingsSlinky.firebaseStorage.serviceMod.StorageService
import typingsSlinky.firebaseStorage.srcListMod.ListResult
import typingsSlinky.firebaseStorage.srcMetadataMod.Metadata
import typingsSlinky.firebaseStorage.xhrioMod.XhrIo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/storage/dist/src/implementation/requests", JSImport.Namespace)
@js.native
object requestsMod extends js.Object {
  
  @JSName("checkResumeHeader_")
  def checkResumeHeader(xhr: XhrIo): String = js.native
  @JSName("checkResumeHeader_")
  def checkResumeHeader(xhr: XhrIo, allowed: js.Array[String]): String = js.native
  
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: js.UndefOr[scala.Nothing],
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: Null,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus
  ): RequestInfo[ResumableUploadStatus] = js.native
  def continueResumableUpload(
    location: Location,
    service: StorageService,
    url: String,
    blob: FbsBlob,
    chunkSize: Double,
    mappings: Mappings,
    status: ResumableUploadStatus,
    progressCallback: js.Function2[/* p1 */ Double, /* p2 */ Double, Unit]
  ): RequestInfo[ResumableUploadStatus] = js.native
  
  def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[String] = js.native
  def createResumableUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[String] = js.native
  
  def deleteObject(service: StorageService, location: Location): RequestInfo[Unit] = js.native
  
  @JSName("determineContentType_")
  def determineContentType(): String = js.native
  @JSName("determineContentType_")
  def determineContentType(metadata: Null, blob: FbsBlob): String = js.native
  @JSName("determineContentType_")
  def determineContentType(metadata: Metadata): String = js.native
  @JSName("determineContentType_")
  def determineContentType(metadata: Metadata, blob: FbsBlob): String = js.native
  
  def downloadUrlHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, String | Null] = js.native
  
  def getDownloadUrl(service: StorageService, location: Location, mappings: Mappings): RequestInfo[String | Null] = js.native
  
  def getMetadata(service: StorageService, location: Location, mappings: Mappings): RequestInfo[Metadata] = js.native
  
  def getResumableUploadStatus(service: StorageService, location: Location, url: String, blob: FbsBlob): RequestInfo[ResumableUploadStatus] = js.native
  
  def handlerCheck(cndn: Boolean): Unit = js.native
  
  def list(service: StorageService, location: Location): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: String
  ): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: js.UndefOr[scala.Nothing],
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(service: StorageService, location: Location, delimiter: String): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: js.UndefOr[scala.Nothing],
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(service: StorageService, location: Location, delimiter: String, pageToken: String): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: String,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  def list(
    service: StorageService,
    location: Location,
    delimiter: String,
    pageToken: Null,
    maxResults: Double
  ): RequestInfo[ListResult] = js.native
  
  def listHandler(service: StorageService, bucket: String): js.Function2[/* p1 */ XhrIo, /* p2 */ String, ListResult] = js.native
  
  @JSName("metadataForUpload_")
  def metadataForUpload(location: Location, blob: FbsBlob): Metadata = js.native
  @JSName("metadataForUpload_")
  def metadataForUpload(location: Location, blob: FbsBlob, metadata: Metadata): Metadata = js.native
  
  def metadataHandler(service: StorageService, mappings: Mappings): js.Function2[/* p1 */ XhrIo, /* p2 */ String, Metadata] = js.native
  
  def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob): RequestInfo[Metadata] = js.native
  def multipartUpload(service: StorageService, location: Location, mappings: Mappings, blob: FbsBlob, metadata: Metadata): RequestInfo[Metadata] = js.native
  
  def objectErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  
  val resumableUploadChunkSize: Double = js.native
  
  def sharedErrorHandler(location: Location): js.Function2[/* p1 */ XhrIo, /* p2 */ FirebaseStorageError, FirebaseStorageError] = js.native
  
  def updateMetadata(service: StorageService, location: Location, metadata: Metadata, mappings: Mappings): RequestInfo[Metadata] = js.native
  
  @js.native
  class ResumableUploadStatus protected () extends js.Object {
    def this(current: Double, total: Double) = this()
    def this(current: Double, total: Double, finalized: Boolean) = this()
    def this(current: Double, total: Double, finalized: js.UndefOr[scala.Nothing], metadata: Metadata) = this()
    def this(current: Double, total: Double, finalized: Boolean, metadata: Metadata) = this()
    
    var current: Double = js.native
    
    var finalized: Boolean = js.native
    
    var metadata: Metadata | Null = js.native
    
    var total: Double = js.native
  }
}
