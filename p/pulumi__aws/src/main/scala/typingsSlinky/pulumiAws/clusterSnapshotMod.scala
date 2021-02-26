package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clusterSnapshotMod {
  
  @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot")
  @js.native
  class ClusterSnapshot protected () extends CustomResource {
    /**
      * Create a ClusterSnapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterSnapshotArgs) = this()
    def this(name: String, args: ClusterSnapshotArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
      */
    val availabilityZones: Output_[js.Array[String]] = js.native
    
    /**
      * The DocDB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: Output_[String] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
      */
    val dbClusterSnapshotArn: Output_[String] = js.native
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: Output_[String] = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: Output_[String] = js.native
    
    /**
      * Version of the database engine for this DocDB cluster snapshot.
      */
    val engineVersion: Output_[String] = js.native
    
    /**
      * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
      */
    val kmsKeyId: Output_[String] = js.native
    
    /**
      * Port that the DocDB cluster was listening on at the time of the snapshot.
      */
    val port: Output_[Double] = js.native
    
    val snapshotType: Output_[String] = js.native
    
    val sourceDbClusterSnapshotArn: Output_[String] = js.native
    
    /**
      * The status of this DocDB Cluster Snapshot.
      */
    val status: Output_[String] = js.native
    
    /**
      * Specifies whether the DocDB cluster snapshot is encrypted.
      */
    val storageEncrypted: Output_[Boolean] = js.native
    
    /**
      * The VPC ID associated with the DocDB cluster snapshot.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object ClusterSnapshot {
    
    /**
      * Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID]): ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState): ClusterSnapshot = js.native
    @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot.get")
    @js.native
    def get(name: String, id: Input[ID], state: ClusterSnapshotState, opts: CustomResourceOptions): ClusterSnapshot = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterSnapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/docdb/clusterSnapshot", "ClusterSnapshot.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/docdb/clusterSnapshot.ClusterSnapshot */ Boolean = js.native
  }
  
  @js.native
  trait ClusterSnapshotArgs extends StObject {
    
    /**
      * The DocDB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: Input[String] = js.native
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: Input[String] = js.native
  }
  object ClusterSnapshotArgs {
    
    @scala.inline
    def apply(dbClusterIdentifier: Input[String], dbClusterSnapshotIdentifier: Input[String]): ClusterSnapshotArgs = {
      val __obj = js.Dynamic.literal(dbClusterIdentifier = dbClusterIdentifier.asInstanceOf[js.Any], dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClusterSnapshotArgs]
    }
    
    @scala.inline
    implicit class ClusterSnapshotArgsMutableBuilder[Self <: ClusterSnapshotArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClusterSnapshotState extends StObject {
    
    /**
      * List of EC2 Availability Zones that instances in the DocDB cluster snapshot can be restored in.
      */
    val availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The DocDB Cluster Identifier from which to take the snapshot.
      */
    val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) for the DocDB Cluster Snapshot.
      */
    val dbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Identifier for the snapshot.
      */
    val dbClusterSnapshotIdentifier: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies the name of the database engine.
      */
    val engine: js.UndefOr[Input[String]] = js.native
    
    /**
      * Version of the database engine for this DocDB cluster snapshot.
      */
    val engineVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * If storageEncrypted is true, the AWS KMS key identifier for the encrypted DocDB cluster snapshot.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Port that the DocDB cluster was listening on at the time of the snapshot.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    val snapshotType: js.UndefOr[Input[String]] = js.native
    
    val sourceDbClusterSnapshotArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The status of this DocDB Cluster Snapshot.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specifies whether the DocDB cluster snapshot is encrypted.
      */
    val storageEncrypted: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The VPC ID associated with the DocDB cluster snapshot.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object ClusterSnapshotState {
    
    @scala.inline
    def apply(): ClusterSnapshotState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterSnapshotState]
    }
    
    @scala.inline
    implicit class ClusterSnapshotStateMutableBuilder[Self <: ClusterSnapshotState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setDbClusterIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterIdentifierUndefined: Self = StObject.set(x, "dbClusterIdentifier", js.undefined)
      
      @scala.inline
      def setDbClusterSnapshotArn(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotArnUndefined: Self = StObject.set(x, "dbClusterSnapshotArn", js.undefined)
      
      @scala.inline
      def setDbClusterSnapshotIdentifier(value: Input[String]): Self = StObject.set(x, "dbClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "dbClusterSnapshotIdentifier", js.undefined)
      
      @scala.inline
      def setEngine(value: Input[String]): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
      
      @scala.inline
      def setEngineVersion(value: Input[String]): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSnapshotType(value: Input[String]): Self = StObject.set(x, "snapshotType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotTypeUndefined: Self = StObject.set(x, "snapshotType", js.undefined)
      
      @scala.inline
      def setSourceDbClusterSnapshotArn(value: Input[String]): Self = StObject.set(x, "sourceDbClusterSnapshotArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDbClusterSnapshotArnUndefined: Self = StObject.set(x, "sourceDbClusterSnapshotArn", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStorageEncrypted(value: Input[Boolean]): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncryptedUndefined: Self = StObject.set(x, "storageEncrypted", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
