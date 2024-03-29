package typingsSlinky.maximMazurokGapiClientStorage.gapi.client.storage

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.maximMazurokGapiClientStorage.anon.BucketPolicyOnly
import typingsSlinky.maximMazurokGapiClientStorage.anon.DefaultKmsKeyName
import typingsSlinky.maximMazurokGapiClientStorage.anon.EffectiveTime
import typingsSlinky.maximMazurokGapiClientStorage.anon.Entity
import typingsSlinky.maximMazurokGapiClientStorage.anon.LogBucket
import typingsSlinky.maximMazurokGapiClientStorage.anon.MainPageSuffix
import typingsSlinky.maximMazurokGapiClientStorage.anon.MaxAgeSeconds
import typingsSlinky.maximMazurokGapiClientStorage.anon.RequesterPays
import typingsSlinky.maximMazurokGapiClientStorage.anon.Rule
import typingsSlinky.maximMazurokGapiClientStorage.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends StObject {
  
  /** Access controls on the bucket. */
  var acl: js.UndefOr[js.Array[BucketAccessControl]] = js.native
  
  /** The bucket's billing configuration. */
  var billing: js.UndefOr[RequesterPays] = js.native
  
  /** The bucket's Cross-Origin Resource Sharing (CORS) configuration. */
  var cors: js.UndefOr[js.Array[MaxAgeSeconds]] = js.native
  
  /**
    * The default value for event-based hold on newly created objects in this bucket. Event-based hold is a way to retain objects indefinitely until an event occurs, signified by the
    * hold's release. After being released, such objects will be subject to bucket-level retention (if any). One sample use case of this flag is for banks to hold loan documents for at
    * least 3 years after loan is paid in full. Here, bucket-level retention is 3 years and the event is loan being paid in full. In this example, these objects will be held intact for
    * any number of years until the event has occurred (event-based hold on the object is released) and then 3 more years after that. That means retention duration of the objects begins
    * from the moment event-based hold transitioned from true to false. Objects under event-based hold cannot be deleted, overwritten or archived until the hold is removed.
    */
  var defaultEventBasedHold: js.UndefOr[Boolean] = js.native
  
  /** Default access controls to apply to new objects when no ACL is provided. */
  var defaultObjectAcl: js.UndefOr[js.Array[ObjectAccessControl]] = js.native
  
  /** Encryption configuration for a bucket. */
  var encryption: js.UndefOr[DefaultKmsKeyName] = js.native
  
  /** HTTP 1.1 Entity tag for the bucket. */
  var etag: js.UndefOr[String] = js.native
  
  /** The bucket's IAM configuration. */
  var iamConfiguration: js.UndefOr[BucketPolicyOnly] = js.native
  
  /** The ID of the bucket. For buckets, the id and name properties are the same. */
  var id: js.UndefOr[String] = js.native
  
  /** The kind of item this is. For buckets, this is always storage#bucket. */
  var kind: js.UndefOr[String] = js.native
  
  /** User-provided labels, in key/value pairs. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Bucket with TopLevel[js.Any]
  ] = js.native
  
  /** The bucket's lifecycle configuration. See lifecycle management for more information. */
  var lifecycle: js.UndefOr[Rule] = js.native
  
  /**
    * The location of the bucket. Object data for objects in the bucket resides in physical storage within this region. Defaults to US. See the developer's guide for the authoritative
    * list.
    */
  var location: js.UndefOr[String] = js.native
  
  /** The type of the bucket location. */
  var locationType: js.UndefOr[String] = js.native
  
  /** The bucket's logging configuration, which defines the destination bucket and optional name prefix for the current bucket's logs. */
  var logging: js.UndefOr[LogBucket] = js.native
  
  /** The metadata generation of this bucket. */
  var metageneration: js.UndefOr[String] = js.native
  
  /** The name of the bucket. */
  var name: js.UndefOr[String] = js.native
  
  /** The owner of the bucket. This is always the project team's owner group. */
  var owner: js.UndefOr[Entity] = js.native
  
  /** The project number of the project the bucket belongs to. */
  var projectNumber: js.UndefOr[String] = js.native
  
  /**
    * The bucket's retention policy. The retention policy enforces a minimum retention time for all objects contained in the bucket, based on their creation time. Any attempt to overwrite
    * or delete objects younger than the retention period will result in a PERMISSION_DENIED error. An unlocked retention policy can be modified or removed from the bucket via a
    * storage.buckets.update operation. A locked retention policy cannot be removed or shortened in duration for the lifetime of the bucket. Attempting to remove or decrease period of a
    * locked retention policy will result in a PERMISSION_DENIED error.
    */
  var retentionPolicy: js.UndefOr[EffectiveTime] = js.native
  
  /** The URI of this bucket. */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * The bucket's default storage class, used whenever no storageClass is specified for a newly-created object. This defines how objects in the bucket are stored and determines the SLA
    * and the cost of storage. Values include MULTI_REGIONAL, REGIONAL, STANDARD, NEARLINE, COLDLINE, ARCHIVE, and DURABLE_REDUCED_AVAILABILITY. If this value is not specified when the
    * bucket is created, it will default to STANDARD. For more information, see storage classes.
    */
  var storageClass: js.UndefOr[String] = js.native
  
  /** The creation time of the bucket in RFC 3339 format. */
  var timeCreated: js.UndefOr[String] = js.native
  
  /** The modification time of the bucket in RFC 3339 format. */
  var updated: js.UndefOr[String] = js.native
  
  /** The bucket's versioning configuration. */
  var versioning: js.UndefOr[`0`] = js.native
  
  /** The bucket's website configuration, controlling how the service behaves when accessing bucket contents as a web site. See the Static Website Examples for more information. */
  var website: js.UndefOr[MainPageSuffix] = js.native
  
  /**
    * The zone or zones from which the bucket is intended to use zonal quota. Requests for data from outside the specified affinities are still allowed but won't be able to use zonal
    * quota. The zone or zones need to be within the bucket location otherwise the requests will fail with a 400 Bad Request response.
    */
  var zoneAffinity: js.UndefOr[js.Array[String]] = js.native
}
object Bucket {
  
  @scala.inline
  def apply(): Bucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: js.Array[BucketAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setAclVarargs(value: BucketAccessControl*): Self = StObject.set(x, "acl", js.Array(value :_*))
    
    @scala.inline
    def setBilling(value: RequesterPays): Self = StObject.set(x, "billing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingUndefined: Self = StObject.set(x, "billing", js.undefined)
    
    @scala.inline
    def setCors(value: js.Array[MaxAgeSeconds]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setCorsVarargs(value: MaxAgeSeconds*): Self = StObject.set(x, "cors", js.Array(value :_*))
    
    @scala.inline
    def setDefaultEventBasedHold(value: Boolean): Self = StObject.set(x, "defaultEventBasedHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEventBasedHoldUndefined: Self = StObject.set(x, "defaultEventBasedHold", js.undefined)
    
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[ObjectAccessControl]): Self = StObject.set(x, "defaultObjectAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultObjectAclUndefined: Self = StObject.set(x, "defaultObjectAcl", js.undefined)
    
    @scala.inline
    def setDefaultObjectAclVarargs(value: ObjectAccessControl*): Self = StObject.set(x, "defaultObjectAcl", js.Array(value :_*))
    
    @scala.inline
    def setEncryption(value: DefaultKmsKeyName): Self = StObject.set(x, "encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "encryption", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setIamConfiguration(value: BucketPolicyOnly): Self = StObject.set(x, "iamConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamConfigurationUndefined: Self = StObject.set(x, "iamConfiguration", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientStorage.maximMazurokGapiClientStorageStrings.Bucket with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLifecycle(value: Rule): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLogging(value: LogBucket): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    @scala.inline
    def setRetentionPolicy(value: EffectiveTime): Self = StObject.set(x, "retentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicyUndefined: Self = StObject.set(x, "retentionPolicy", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setVersioning(value: `0`): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    
    @scala.inline
    def setZoneAffinity(value: js.Array[String]): Self = StObject.set(x, "zoneAffinity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneAffinityUndefined: Self = StObject.set(x, "zoneAffinity", js.undefined)
    
    @scala.inline
    def setZoneAffinityVarargs(value: String*): Self = StObject.set(x, "zoneAffinity", js.Array(value :_*))
  }
}
