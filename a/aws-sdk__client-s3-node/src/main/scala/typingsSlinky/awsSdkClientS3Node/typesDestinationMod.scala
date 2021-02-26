package typingsSlinky.awsSdkClientS3Node

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ONEZONE_IA
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.REDUCED_REDUNDANCY
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.STANDARD_IA
import typingsSlinky.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
import typingsSlinky.awsSdkClientS3Node.typesAccessControlTranslationMod.UnmarshalledAccessControlTranslation
import typingsSlinky.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
import typingsSlinky.awsSdkClientS3Node.typesEncryptionConfigurationMod.UnmarshalledEncryptionConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDestinationMod {
  
  @js.native
  trait Destination extends StObject {
    
    /**
      * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
      */
    var AccessControlTranslation: js.UndefOr[
        typingsSlinky.awsSdkClientS3Node.typesAccessControlTranslationMod.AccessControlTranslation
      ] = js.native
    
    /**
      * <p> Account ID of the destination bucket. Currently Amazon S3 verifies this value only if Access Control Translation is enabled. </p> <p> In a cross-account scenario, if you tell Amazon S3 to change replica ownership to the AWS account that owns the destination bucket by adding the <code>AccessControlTranslation</code> element, this is the account ID of the destination bucket owner. </p>
      */
    var Account: js.UndefOr[String] = js.native
    
    /**
      * <p> Amazon resource name (ARN) of the bucket where you want Amazon S3 to store replicas of the object identified by the rule. </p> <p> If you have multiple rules in your replication configuration, all rules must specify the same bucket as the destination. A replication configuration can replicate objects only to one destination bucket. </p>
      */
    var Bucket: String = js.native
    
    /**
      * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
      */
    var EncryptionConfiguration: js.UndefOr[
        typingsSlinky.awsSdkClientS3Node.typesEncryptionConfigurationMod.EncryptionConfiguration
      ] = js.native
    
    /**
      * <p>The class of storage used to store the object.</p>
      */
    var StorageClass: js.UndefOr[STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String] = js.native
  }
  object Destination {
    
    @scala.inline
    def apply(Bucket: String): Destination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[Destination]
    }
    
    @scala.inline
    implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlTranslation(value: AccessControlTranslation): Self = StObject.set(x, "AccessControlTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlTranslationUndefined: Self = StObject.set(x, "AccessControlTranslation", js.undefined)
      
      @scala.inline
      def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountUndefined: Self = StObject.set(x, "Account", js.undefined)
      
      @scala.inline
      def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
      
      @scala.inline
      def setStorageClass(value: STANDARD | REDUCED_REDUNDANCY | STANDARD_IA | ONEZONE_IA | String): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledDestination extends Destination {
    
    /**
      * <p> Container for information regarding the access control for replicas. </p> <p> Use only in a cross-account scenario, where source and destination bucket owners are not the same, when you want to change replica ownership to the AWS account that owns the destination bucket. If you don't add this element to the replication configuration, the replicas are owned by same AWS account that owns the source object. </p>
      */
    @JSName("AccessControlTranslation")
    var AccessControlTranslation_UnmarshalledDestination: js.UndefOr[UnmarshalledAccessControlTranslation] = js.native
    
    /**
      * <p> Container that provides encryption-related information. You must specify this element if the <code>SourceSelectionCriteria</code> is specified. </p>
      */
    @JSName("EncryptionConfiguration")
    var EncryptionConfiguration_UnmarshalledDestination: js.UndefOr[UnmarshalledEncryptionConfiguration] = js.native
  }
  object UnmarshalledDestination {
    
    @scala.inline
    def apply(Bucket: String): UnmarshalledDestination = {
      val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledDestination]
    }
    
    @scala.inline
    implicit class UnmarshalledDestinationMutableBuilder[Self <: UnmarshalledDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessControlTranslation(value: UnmarshalledAccessControlTranslation): Self = StObject.set(x, "AccessControlTranslation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessControlTranslationUndefined: Self = StObject.set(x, "AccessControlTranslation", js.undefined)
      
      @scala.inline
      def setEncryptionConfiguration(value: UnmarshalledEncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    }
  }
}
