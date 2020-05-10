package typingsSlinky.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonBucketPolicyOnly
import typingsSlinky.googleapis.AnonDefaultKmsKeyName
import typingsSlinky.googleapis.AnonEffectiveTime
import typingsSlinky.googleapis.AnonEnabledBoolean
import typingsSlinky.googleapis.AnonEntity
import typingsSlinky.googleapis.AnonLogBucket
import typingsSlinky.googleapis.AnonMainPageSuffix
import typingsSlinky.googleapis.AnonMaxAgeSeconds
import typingsSlinky.googleapis.AnonRequesterPays
import typingsSlinky.googleapis.AnonRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bucket.
  */
@js.native
trait SchemaBucket extends js.Object {
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.native
  /**
    * The bucket&#39;s billing configuration.
    */
  var billing: js.UndefOr[AnonRequesterPays] = js.native
  /**
    * The bucket&#39;s Cross-Origin Resource Sharing (CORS) configuration.
    */
  var cors: js.UndefOr[js.Array[AnonMaxAgeSeconds]] = js.native
  /**
    * The default value for event-based hold on newly created objects in this
    * bucket. Event-based hold is a way to retain objects indefinitely until an
    * event occurs, signified by the hold&#39;s release. After being released,
    * such objects will be subject to bucket-level retention (if any). One
    * sample use case of this flag is for banks to hold loan documents for at
    * least 3 years after loan is paid in full. Here, bucket-level retention is
    * 3 years and the event is loan being paid in full. In this example, these
    * objects will be held intact for any number of years until the event has
    * occurred (event-based hold on the object is released) and then 3 more
    * years after that. That means retention duration of the objects begins
    * from the moment event-based hold transitioned from true to false. Objects
    * under event-based hold cannot be deleted, overwritten or archived until
    * the hold is removed.
    */
  var defaultEventBasedHold: js.UndefOr[Boolean] = js.native
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.native
  /**
    * Encryption configuration for a bucket.
    */
  var encryption: js.UndefOr[AnonDefaultKmsKeyName] = js.native
  /**
    * HTTP 1.1 Entity tag for the bucket.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s IAM configuration.
    */
  var iamConfiguration: js.UndefOr[AnonBucketPolicyOnly] = js.native
  /**
    * The ID of the bucket. For buckets, the id and name properties are the
    * same.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * User-provided labels, in key/value pairs.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The bucket&#39;s lifecycle configuration. See lifecycle management for
    * more information.
    */
  var lifecycle: js.UndefOr[AnonRule] = js.native
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage within this region. Defaults to US. See the
    * developer&#39;s guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s logging configuration, which defines the destination
    * bucket and optional name prefix for the current bucket&#39;s logs.
    */
  var logging: js.UndefOr[AnonLogBucket] = js.native
  /**
    * The metadata generation of this bucket.
    */
  var metageneration: js.UndefOr[String] = js.native
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The owner of the bucket. This is always the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[AnonEntity] = js.native
  /**
    * The project number of the project the bucket belongs to.
    */
  var projectNumber: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s retention policy. The retention policy enforces a
    * minimum retention time for all objects contained in the bucket, based on
    * their creation time. Any attempt to overwrite or delete objects younger
    * than the retention period will result in a PERMISSION_DENIED error. An
    * unlocked retention policy can be modified or removed from the bucket via
    * a storage.buckets.update operation. A locked retention policy cannot be
    * removed or shortened in duration for the lifetime of the bucket.
    * Attempting to remove or decrease period of a locked retention policy will
    * result in a PERMISSION_DENIED error.
    */
  var retentionPolicy: js.UndefOr[AnonEffectiveTime] = js.native
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s default storage class, used whenever no storageClass is
    * specified for a newly-created object. This defines how objects in the
    * bucket are stored and determines the SLA and the cost of storage. Values
    * include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, and
    * DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the
    * bucket is created, it will default to STANDARD. For more information, see
    * storage classes.
    */
  var storageClass: js.UndefOr[String] = js.native
  /**
    * The creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.native
  /**
    * The modification time of the bucket in RFC 3339 format.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * The bucket&#39;s versioning configuration.
    */
  var versioning: js.UndefOr[AnonEnabledBoolean] = js.native
  /**
    * The bucket&#39;s website configuration, controlling how the service
    * behaves when accessing bucket contents as a web site. See the Static
    * Website Examples for more information.
    */
  var website: js.UndefOr[AnonMainPageSuffix] = js.native
}

object SchemaBucket {
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  @scala.inline
  implicit class SchemaBucketOps[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcl(value: js.Array[SchemaBucketAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acl")(js.undefined)
        ret
    }
    @scala.inline
    def withBilling(value: AnonRequesterPays): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBilling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billing")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: js.Array[AnonMaxAgeSeconds]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEventBasedHold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventBasedHold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEventBasedHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEventBasedHold")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultObjectAcl(value: js.Array[SchemaObjectAccessControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultObjectAcl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultObjectAcl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultObjectAcl")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryption(value: AnonDefaultKmsKeyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryption")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withIamConfiguration(value: AnonBucketPolicyOnly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withLifecycle(value: AnonRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecycle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lifecycle")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLogging(value: AnonLogBucket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logging")(js.undefined)
        ret
    }
    @scala.inline
    def withMetageneration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metageneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetageneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metageneration")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOwner(value: AnonEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("owner")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withRetentionPolicy(value: AnonEffectiveTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetentionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retentionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioning(value: AnonEnabledBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(js.undefined)
        ret
    }
    @scala.inline
    def withWebsite(value: AnonMainPageSuffix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebsite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("website")(js.undefined)
        ret
    }
  }
  
}

