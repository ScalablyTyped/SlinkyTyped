package typingsSlinky.minio.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpsMod.AgentOptions
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minio", "Client")
@js.native
class Client protected () extends js.Object {
  def this(options: ClientOptions) = this()
  
  def bucketExists(bucketName: String): js.Promise[Boolean] = js.native
  def bucketExists(bucketName: String, callback: ResultCallback[Boolean]): Unit = js.native
  
  def copyObject(bucketName: String, objectName: String, sourceObject: String, conditions: CopyConditions): js.Promise[BucketItemCopy] = js.native
  def copyObject(
    bucketName: String,
    objectName: String,
    sourceObject: String,
    conditions: CopyConditions,
    callback: ResultCallback[BucketItemCopy]
  ): Unit = js.native
  
  def fGetObject(bucketName: String, objectName: String, filePath: String): js.Promise[Unit] = js.native
  def fGetObject(bucketName: String, objectName: String, filePath: String, callback: NoResultCallback): Unit = js.native
  
  def fPutObject(bucketName: String, objectName: String, filePath: String, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def fPutObject(
    bucketName: String,
    objectName: String,
    filePath: String,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[String]
  ): Unit = js.native
  
  def getBucketNotification(bucketName: String): js.Promise[NotificationConfig] = js.native
  // Bucket Policy & Notification operations
  def getBucketNotification(bucketName: String, callback: ResultCallback[NotificationConfig]): Unit = js.native
  
  def getBucketPolicy(bucketName: String): js.Promise[String] = js.native
  def getBucketPolicy(bucketName: String, callback: ResultCallback[String]): Unit = js.native
  
  def getObject(bucketName: String, objectName: String): js.Promise[Readable] = js.native
  // Object operations
  def getObject(bucketName: String, objectName: String, callback: ResultCallback[Readable]): Unit = js.native
  
  def getPartialObject(bucketName: String, objectName: String, offset: Double): js.Promise[Readable] = js.native
  def getPartialObject(bucketName: String, objectName: String, offset: Double, callback: ResultCallback[Readable]): Unit = js.native
  def getPartialObject(bucketName: String, objectName: String, offset: Double, length: Double): js.Promise[Readable] = js.native
  def getPartialObject(
    bucketName: String,
    objectName: String,
    offset: Double,
    length: Double,
    callback: ResultCallback[Readable]
  ): Unit = js.native
  
  def listBuckets(): js.Promise[js.Array[BucketItemFromList]] = js.native
  def listBuckets(callback: ResultCallback[js.Array[BucketItemFromList]]): Unit = js.native
  
  def listIncompleteUploads(bucketName: String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: String): BucketStream[IncompleteUploadedBucketItem] = js.native
  def listIncompleteUploads(bucketName: String, prefix: String, recursive: Boolean): BucketStream[IncompleteUploadedBucketItem] = js.native
  
  def listObjects(bucketName: String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
  def listObjects(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
  
  def listObjectsV2(bucketName: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(
    bucketName: String,
    prefix: js.UndefOr[scala.Nothing],
    recursive: js.UndefOr[scala.Nothing],
    startAfter: String
  ): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: js.UndefOr[scala.Nothing], recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: js.UndefOr[scala.Nothing], startAfter: String): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean): BucketStream[BucketItem] = js.native
  def listObjectsV2(bucketName: String, prefix: String, recursive: Boolean, startAfter: String): BucketStream[BucketItem] = js.native
  
  // todo #low Specify events
  def listenBucketNotification(bucketName: String, prefix: String, suffix: String, events: js.Array[String]): EventEmitter = js.native
  
  def makeBucket(bucketName: String, region: Region): js.Promise[Unit] = js.native
  // Bucket operations
  def makeBucket(bucketName: String, region: Region, callback: NoResultCallback): Unit = js.native
  
  // Other
  def newPostPolicy(): PostPolicy = js.native
  
  def presignedGetObject(bucketName: String, objectName: String): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    respHeaders: js.UndefOr[scala.Nothing],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    respHeaders: StringDictionary[js.Any]
  ): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    respHeaders: StringDictionary[js.Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: js.UndefOr[scala.Nothing],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(bucketName: String, objectName: String, expiry: Double, respHeaders: StringDictionary[js.Any]): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[js.Any],
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[js.Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedGetObject(
    bucketName: String,
    objectName: String,
    expiry: Double,
    respHeaders: StringDictionary[js.Any],
    requestDate: js.Date,
    callback: ResultCallback[String]
  ): Unit = js.native
  
  def presignedPostPolicy(policy: PostPolicy): js.Promise[PostPolicyResult] = js.native
  def presignedPostPolicy(policy: PostPolicy, callback: ResultCallback[PostPolicyResult]): Unit = js.native
  
  def presignedPutObject(bucketName: String, objectName: String): js.Promise[String] = js.native
  def presignedPutObject(bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedPutObject(bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedPutObject(bucketName: String, objectName: String, expiry: Double, callback: ResultCallback[String]): Unit = js.native
  
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String): js.Promise[String] = js.native
  // Presigned operations
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String, callback: ResultCallback[String]): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    reqParams: js.UndefOr[scala.Nothing],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    reqParams: StringDictionary[js.Any]
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: js.UndefOr[scala.Nothing],
    reqParams: StringDictionary[js.Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(httpMethod: String, bucketName: String, objectName: String, expiry: Double): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: js.UndefOr[scala.Nothing],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[js.Any]
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[js.Any],
    callback: ResultCallback[String]
  ): Unit = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[js.Any],
    requestDate: js.Date
  ): js.Promise[String] = js.native
  def presignedUrl(
    httpMethod: String,
    bucketName: String,
    objectName: String,
    expiry: Double,
    reqParams: StringDictionary[js.Any],
    requestDate: js.Date,
    callback: ResultCallback[String]
  ): Unit = js.native
  
  def putObject(bucketName: String, objectName: String, stream: String): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: String, callback: ResultCallback[String]): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: String, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    size: js.UndefOr[scala.Nothing],
    metaData: ItemBucketMetadata
  ): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: String, size: Double): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    size: Double,
    callback: ResultCallback[String]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: String, size: Double, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: String,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[String]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, callback: ResultCallback[String]): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    size: js.UndefOr[scala.Nothing],
    metaData: ItemBucketMetadata
  ): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    size: Double,
    callback: ResultCallback[String]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Buffer, size: Double, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Buffer,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[String]
  ): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, callback: ResultCallback[String]): Unit = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, metaData: ItemBucketMetadata): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: js.UndefOr[scala.Nothing],
    metaData: ItemBucketMetadata
  ): js.Promise[String] = js.native
  def putObject(bucketName: String, objectName: String, stream: Readable, size: Double): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    callback: ResultCallback[String]
  ): Unit = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    metaData: ItemBucketMetadata
  ): js.Promise[String] = js.native
  def putObject(
    bucketName: String,
    objectName: String,
    stream: Readable,
    size: Double,
    metaData: ItemBucketMetadata,
    callback: ResultCallback[String]
  ): Unit = js.native
  
  def removeAllBucketNotification(bucketName: String): js.Promise[Unit] = js.native
  def removeAllBucketNotification(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeBucket(bucketName: String): js.Promise[Unit] = js.native
  def removeBucket(bucketName: String, callback: NoResultCallback): Unit = js.native
  
  def removeIncompleteUpload(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def removeIncompleteUpload(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  
  def removeObject(bucketName: String, objectName: String): js.Promise[Unit] = js.native
  def removeObject(bucketName: String, objectName: String, callback: NoResultCallback): Unit = js.native
  
  def removeObjects(bucketName: String, objectsList: js.Array[String]): js.Promise[Unit] = js.native
  def removeObjects(bucketName: String, objectsList: js.Array[String], callback: NoResultCallback): Unit = js.native
  
  def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig): js.Promise[Unit] = js.native
  def setBucketNotification(bucketName: String, bucketNotificationConfig: NotificationConfig, callback: NoResultCallback): Unit = js.native
  
  def setBucketPolicy(bucketName: String, bucketPolicy: String): js.Promise[Unit] = js.native
  def setBucketPolicy(bucketName: String, bucketPolicy: String, callback: NoResultCallback): Unit = js.native
  
  def setRequestOptions(otpions: AgentOptions): Unit = js.native
  
  def statObject(bucketName: String, objectName: String): js.Promise[BucketItemStat] = js.native
  def statObject(bucketName: String, objectName: String, callback: ResultCallback[BucketItemStat]): Unit = js.native
}
