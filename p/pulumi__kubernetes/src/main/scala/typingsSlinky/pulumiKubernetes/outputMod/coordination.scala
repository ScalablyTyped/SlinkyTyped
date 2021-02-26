package typingsSlinky.pulumiKubernetes.outputMod

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordination {
  
  object v1 {
    
    /**
      * Lease defines a lease concept.
      */
    @js.native
    trait Lease extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: coordinationDotk8sDotioSlashv1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: LeaseSpec = js.native
    }
    object Lease {
      
      @scala.inline
      def apply(
        apiVersion: coordinationDotk8sDotioSlashv1,
        kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease,
        metadata: ObjectMeta,
        spec: LeaseSpec
      ): Lease = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[Lease]
      }
      
      @scala.inline
      implicit class LeaseMutableBuilder[Self <: Lease] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: coordinationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: LeaseSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    @js.native
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: String = js.native
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: String = js.native
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: Double = js.native
      
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: Double = js.native
      
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: String = js.native
    }
    object LeaseSpec {
      
      @scala.inline
      def apply(
        acquireTime: String,
        holderIdentity: String,
        leaseDurationSeconds: Double,
        leaseTransitions: Double,
        renewTime: String
      ): LeaseSpec = {
        val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[LeaseSpec]
      }
      
      @scala.inline
      implicit class LeaseSpecMutableBuilder[Self <: LeaseSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAcquireTime(value: String): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHolderIdentity(value: String): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaseDurationSeconds(value: Double): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaseTransitions(value: Double): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenewTime(value: String): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Lease defines a lease concept.
      */
    @js.native
    trait Lease extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: coordinationDotk8sDotioSlashv1beta1 = js.native
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease = js.native
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta = js.native
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: LeaseSpec = js.native
    }
    object Lease {
      
      @scala.inline
      def apply(
        apiVersion: coordinationDotk8sDotioSlashv1beta1,
        kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease,
        metadata: ObjectMeta,
        spec: LeaseSpec
      ): Lease = {
        val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[Lease]
      }
      
      @scala.inline
      implicit class LeaseMutableBuilder[Self <: Lease] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApiVersion(value: coordinationDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Lease): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSpec(value: LeaseSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    @js.native
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: String = js.native
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: String = js.native
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: Double = js.native
      
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: Double = js.native
      
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: String = js.native
    }
    object LeaseSpec {
      
      @scala.inline
      def apply(
        acquireTime: String,
        holderIdentity: String,
        leaseDurationSeconds: Double,
        leaseTransitions: Double,
        renewTime: String
      ): LeaseSpec = {
        val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[LeaseSpec]
      }
      
      @scala.inline
      implicit class LeaseSpecMutableBuilder[Self <: LeaseSpec] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAcquireTime(value: String): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHolderIdentity(value: String): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaseDurationSeconds(value: Double): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaseTransitions(value: Double): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenewTime(value: String): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
      }
    }
  }
}
