package typingsSlinky.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamJournalToKinesisRequest extends js.Object {
  
  /**
    * The exclusive date and time that specifies when the stream ends. If you don't define this parameter, the stream runs indefinitely until you cancel it. The ExclusiveEndTime must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z 
    */
  var ExclusiveEndTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The inclusive start date and time from which to start streaming journal data. This parameter must be in ISO 8601 date and time format and in Universal Coordinated Time (UTC). For example: 2019-06-13T21:36:34Z  The InclusiveStartTime cannot be in the future and must be before ExclusiveEndTime. If you provide an InclusiveStartTime that is before the ledger's CreationDateTime, QLDB effectively defaults it to the ledger's CreationDateTime.
    */
  var InclusiveStartTime: js.Date = js.native
  
  /**
    * The configuration settings of the Kinesis Data Streams destination for your stream request.
    */
  var KinesisConfiguration: typingsSlinky.awsSdk.qldbMod.KinesisConfiguration = js.native
  
  /**
    * The name of the ledger.
    */
  var LedgerName: typingsSlinky.awsSdk.qldbMod.LedgerName = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants QLDB permissions for a journal stream to write data records to a Kinesis Data Streams resource.
    */
  var RoleArn: Arn = js.native
  
  /**
    * The name that you want to assign to the QLDB journal stream. User-defined names can help identify and indicate the purpose of a stream. Your stream name must be unique among other active streams for a given ledger. Stream names have the same naming constraints as ledger names, as defined in Quotas in Amazon QLDB in the Amazon QLDB Developer Guide.
    */
  var StreamName: typingsSlinky.awsSdk.qldbMod.StreamName = js.native
  
  /**
    * The key-value pairs to add as tags to the stream that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.qldbMod.Tags] = js.native
}
object StreamJournalToKinesisRequest {
  
  @scala.inline
  def apply(
    InclusiveStartTime: js.Date,
    KinesisConfiguration: KinesisConfiguration,
    LedgerName: LedgerName,
    RoleArn: Arn,
    StreamName: StreamName
  ): StreamJournalToKinesisRequest = {
    val __obj = js.Dynamic.literal(InclusiveStartTime = InclusiveStartTime.asInstanceOf[js.Any], KinesisConfiguration = KinesisConfiguration.asInstanceOf[js.Any], LedgerName = LedgerName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamJournalToKinesisRequest]
  }
  
  @scala.inline
  implicit class StreamJournalToKinesisRequestOps[Self <: StreamJournalToKinesisRequest] (val x: Self) extends AnyVal {
    
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
    def setInclusiveStartTime(value: js.Date): Self = this.set("InclusiveStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisConfiguration(value: KinesisConfiguration): Self = this.set("KinesisConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerName(value: LedgerName): Self = this.set("LedgerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Arn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveEndTime(value: js.Date): Self = this.set("ExclusiveEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveEndTime: Self = this.set("ExclusiveEndTime", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
