package typingsSlinky.pulumiAws.getFileSystemMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.efs.GetFileSystemLifecyclePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileSystemResult extends js.Object {
  /**
    * Amazon Resource Name of the file system.
    */
  val arn: String = js.native
  val creationToken: String = js.native
  /**
    * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: String = js.native
  /**
    * Whether EFS is encrypted.
    */
  val encrypted: Boolean = js.native
  val fileSystemId: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  /**
    * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object.
    */
  val lifecyclePolicy: GetFileSystemLifecyclePolicy = js.native
  /**
    * The file system performance mode.
    */
  val performanceMode: String = js.native
  /**
    * The throughput, measured in MiB/s, that you want to provision for the file system.
    * * `tags` -A mapping of tags to assign to the file system.
    */
  val provisionedThroughputInMibps: Double = js.native
  val tags: StringDictionary[js.Any] = js.native
  /**
    * Throughput mode for the file system.
    */
  val throughputMode: String = js.native
}

object GetFileSystemResult {
  @scala.inline
  def apply(
    arn: String,
    creationToken: String,
    dnsName: String,
    encrypted: Boolean,
    fileSystemId: String,
    id: String,
    kmsKeyId: String,
    lifecyclePolicy: GetFileSystemLifecyclePolicy,
    performanceMode: String,
    provisionedThroughputInMibps: Double,
    tags: StringDictionary[js.Any],
    throughputMode: String
  ): GetFileSystemResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationToken = creationToken.asInstanceOf[js.Any], dnsName = dnsName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], lifecyclePolicy = lifecyclePolicy.asInstanceOf[js.Any], performanceMode = performanceMode.asInstanceOf[js.Any], provisionedThroughputInMibps = provisionedThroughputInMibps.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], throughputMode = throughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileSystemResult]
  }
  @scala.inline
  implicit class GetFileSystemResultOps[Self <: GetFileSystemResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKmsKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLifecyclePolicy(value: GetFileSystemLifecyclePolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecyclePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPerformanceMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedThroughputInMibps(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provisionedThroughputInMibps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThroughputMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throughputMode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

