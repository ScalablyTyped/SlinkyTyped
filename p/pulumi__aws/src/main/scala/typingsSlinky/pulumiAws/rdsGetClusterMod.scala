package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rdsGetClusterMod {
  
  @JSImport("@pulumi/aws/rds/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] = js.native
  @JSImport("@pulumi/aws/rds/getCluster", "getCluster")
  @js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] = js.native
  
  @js.native
  trait GetClusterArgs extends StObject {
    
    /**
      * The cluster identifier of the RDS cluster.
      */
    val clusterIdentifier: String = js.native
    
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetClusterArgs {
    
    @scala.inline
    def apply(clusterIdentifier: String): GetClusterArgs = {
      val __obj = js.Dynamic.literal(clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterArgs]
    }
    
    @scala.inline
    implicit class GetClusterArgsMutableBuilder[Self <: GetClusterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetClusterResult extends StObject {
    
    val arn: String = js.native
    
    val availabilityZones: js.Array[String] = js.native
    
    val backtrackWindow: Double = js.native
    
    val backupRetentionPeriod: Double = js.native
    
    val clusterIdentifier: String = js.native
    
    val clusterMembers: js.Array[String] = js.native
    
    val clusterResourceId: String = js.native
    
    val databaseName: String = js.native
    
    val dbClusterParameterGroupName: String = js.native
    
    val dbSubnetGroupName: String = js.native
    
    val enabledCloudwatchLogsExports: js.Array[String] = js.native
    
    val endpoint: String = js.native
    
    val engine: String = js.native
    
    val engineVersion: String = js.native
    
    val finalSnapshotIdentifier: String = js.native
    
    val hostedZoneId: String = js.native
    
    val iamDatabaseAuthenticationEnabled: Boolean = js.native
    
    val iamRoles: js.Array[String] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val kmsKeyId: String = js.native
    
    val masterUsername: String = js.native
    
    val port: Double = js.native
    
    val preferredBackupWindow: String = js.native
    
    val preferredMaintenanceWindow: String = js.native
    
    val readerEndpoint: String = js.native
    
    val replicationSourceIdentifier: String = js.native
    
    val storageEncrypted: Boolean = js.native
    
    val tags: StringDictionary[String] = js.native
    
    val vpcSecurityGroupIds: js.Array[String] = js.native
  }
  object GetClusterResult {
    
    @scala.inline
    def apply(
      arn: String,
      availabilityZones: js.Array[String],
      backtrackWindow: Double,
      backupRetentionPeriod: Double,
      clusterIdentifier: String,
      clusterMembers: js.Array[String],
      clusterResourceId: String,
      databaseName: String,
      dbClusterParameterGroupName: String,
      dbSubnetGroupName: String,
      enabledCloudwatchLogsExports: js.Array[String],
      endpoint: String,
      engine: String,
      engineVersion: String,
      finalSnapshotIdentifier: String,
      hostedZoneId: String,
      iamDatabaseAuthenticationEnabled: Boolean,
      iamRoles: js.Array[String],
      id: String,
      kmsKeyId: String,
      masterUsername: String,
      port: Double,
      preferredBackupWindow: String,
      preferredMaintenanceWindow: String,
      readerEndpoint: String,
      replicationSourceIdentifier: String,
      storageEncrypted: Boolean,
      tags: StringDictionary[String],
      vpcSecurityGroupIds: js.Array[String]
    ): GetClusterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], backtrackWindow = backtrackWindow.asInstanceOf[js.Any], backupRetentionPeriod = backupRetentionPeriod.asInstanceOf[js.Any], clusterIdentifier = clusterIdentifier.asInstanceOf[js.Any], clusterMembers = clusterMembers.asInstanceOf[js.Any], clusterResourceId = clusterResourceId.asInstanceOf[js.Any], databaseName = databaseName.asInstanceOf[js.Any], dbClusterParameterGroupName = dbClusterParameterGroupName.asInstanceOf[js.Any], dbSubnetGroupName = dbSubnetGroupName.asInstanceOf[js.Any], enabledCloudwatchLogsExports = enabledCloudwatchLogsExports.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], finalSnapshotIdentifier = finalSnapshotIdentifier.asInstanceOf[js.Any], hostedZoneId = hostedZoneId.asInstanceOf[js.Any], iamDatabaseAuthenticationEnabled = iamDatabaseAuthenticationEnabled.asInstanceOf[js.Any], iamRoles = iamRoles.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], masterUsername = masterUsername.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], preferredBackupWindow = preferredBackupWindow.asInstanceOf[js.Any], preferredMaintenanceWindow = preferredMaintenanceWindow.asInstanceOf[js.Any], readerEndpoint = readerEndpoint.asInstanceOf[js.Any], replicationSourceIdentifier = replicationSourceIdentifier.asInstanceOf[js.Any], storageEncrypted = storageEncrypted.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcSecurityGroupIds = vpcSecurityGroupIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetClusterResult]
    }
    
    @scala.inline
    implicit class GetClusterResultMutableBuilder[Self <: GetClusterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setBacktrackWindow(value: Double): Self = StObject.set(x, "backtrackWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackupRetentionPeriod(value: Double): Self = StObject.set(x, "backupRetentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterIdentifier(value: String): Self = StObject.set(x, "clusterIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterMembers(value: js.Array[String]): Self = StObject.set(x, "clusterMembers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterMembersVarargs(value: String*): Self = StObject.set(x, "clusterMembers", js.Array(value :_*))
      
      @scala.inline
      def setClusterResourceId(value: String): Self = StObject.set(x, "clusterResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbClusterParameterGroupName(value: String): Self = StObject.set(x, "dbClusterParameterGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbSubnetGroupName(value: String): Self = StObject.set(x, "dbSubnetGroupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCloudwatchLogsExports(value: js.Array[String]): Self = StObject.set(x, "enabledCloudwatchLogsExports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledCloudwatchLogsExportsVarargs(value: String*): Self = StObject.set(x, "enabledCloudwatchLogsExports", js.Array(value :_*))
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSnapshotIdentifier(value: String): Self = StObject.set(x, "finalSnapshotIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostedZoneId(value: String): Self = StObject.set(x, "hostedZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "iamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRoles(value: js.Array[String]): Self = StObject.set(x, "iamRoles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIamRolesVarargs(value: String*): Self = StObject.set(x, "iamRoles", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUsername(value: String): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredBackupWindow(value: String): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReaderEndpoint(value: String): Self = StObject.set(x, "readerEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplicationSourceIdentifier(value: String): Self = StObject.set(x, "replicationSourceIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "storageEncrypted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "vpcSecurityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "vpcSecurityGroupIds", js.Array(value :_*))
    }
  }
}
