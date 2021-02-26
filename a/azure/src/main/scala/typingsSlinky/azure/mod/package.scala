package typingsSlinky.azure

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CreateTableIfNotExistsCallback = js.Function3[
    /* error */ js.Error, 
    /* created */ scala.Boolean, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type DeleteEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type DeleteTableCallback = js.Function3[
    /* error */ js.Error, 
    /* successful */ scala.Boolean, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  
  type ErrorCallback = js.Function1[/* error */ js.Error, scala.Unit]
  
  type GetBlobToTextCallback = js.Function4[
    /* err */ js.Error, 
    /* text */ java.lang.String, 
    /* result */ typingsSlinky.azure.mod.BlobResult, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type ListBlobsCallback = js.Function4[
    /* err */ js.Error, 
    /* blobs */ js.Array[typingsSlinky.azure.mod.BlobResult], 
    /* continuationToken */ typingsSlinky.azure.mod.ContinuationToken, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type ListContainersCallback = js.Function4[
    /* err */ js.Error, 
    /* containers */ js.Array[typingsSlinky.azure.mod.ContainerResult], 
    /* continuationToken */ typingsSlinky.azure.mod.ContinuationToken, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type ListQueuesCallback = js.Function4[
    /* err */ js.Error, 
    /* queues */ js.Array[typingsSlinky.azure.mod.QueueResult], 
    /* continuationToken */ typingsSlinky.azure.mod.ContinuationToken, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type ModifyEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* entity */ typingsSlinky.azure.mod.Entity, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type QueryEntitiesCallback = js.Function4[
    /* error */ js.Error, 
    /* entities */ js.Array[typingsSlinky.azure.mod.Entity], 
    /* resultContinuation */ typingsSlinky.azure.mod.QueryEntitiesResultContinuation, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type QueryEntityCallback = js.Function3[
    /* error */ js.Error, 
    /* entity */ typingsSlinky.azure.mod.Entity, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type QueryTablesCallback = js.Function4[
    /* error */ js.Error, 
    /* queryTablesResult */ js.Array[typingsSlinky.azure.mod.TableResult], 
    /* resultsContinuation */ typingsSlinky.azure.mod.QueryResultContinuation, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  @scala.inline
  def RoleEnvironment: typingsSlinky.azure.mod.RoleEnvironmentInterface = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].selectDynamic("RoleEnvironment").asInstanceOf[typingsSlinky.azure.mod.RoleEnvironmentInterface]
  @scala.inline
  def RoleEnvironment_=(x: typingsSlinky.azure.mod.RoleEnvironmentInterface): scala.Unit = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].updateDynamic("RoleEnvironment")(x.asInstanceOf[js.Any])
  
  type SimpleCallback[T] = js.Function2[/* error */ js.Error, /* result */ T, scala.Unit]
  
  type StorageCallback[T] = js.Function3[
    /* err */ js.Error, 
    /* result */ T, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type StorageCallbackVoid = js.Function2[/* err */ js.Error, /* response */ typingsSlinky.azure.mod.WebResponse, scala.Unit]
  
  type StorageMetadata = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type StorageServicePropertiesCallback = typingsSlinky.azure.mod.StorageCallback[typingsSlinky.azure.mod.StorageServiceProperties]
  
  type StorageServiceStatsCallback = typingsSlinky.azure.mod.StorageCallback[typingsSlinky.azure.mod.StorageServiceStats]
  
  type TableRequestCallback = js.Function3[
    /* error */ js.Error, 
    /* tableResult */ typingsSlinky.azure.anon.TableName, 
    /* response */ typingsSlinky.azure.mod.WebResponse, 
    scala.Unit
  ]
  
  type ValidatorFunction = js.Function1[/* userSettings */ typingsSlinky.azure.mod.Dictionary[js.Any], js.Any]
  
  @scala.inline
  def createBlobService(): typingsSlinky.azure.mod.BlobService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")().asInstanceOf[typingsSlinky.azure.mod.BlobService]
  @scala.inline
  def createBlobService(connectionString: java.lang.String): typingsSlinky.azure.mod.BlobService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.azure.mod.BlobService]
  @scala.inline
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typingsSlinky.azure.mod.BlobService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.BlobService]
  @scala.inline
  def createBlobService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.BlobService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.BlobService]
  @scala.inline
  def createBlobService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typingsSlinky.azure.mod.BlobService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.BlobService]
  @scala.inline
  def createBlobService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.BlobService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createBlobService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.BlobService]
  
  @scala.inline
  def createQueueService(): typingsSlinky.azure.mod.QueueService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")().asInstanceOf[typingsSlinky.azure.mod.QueueService]
  @scala.inline
  def createQueueService(connectionString: java.lang.String): typingsSlinky.azure.mod.QueueService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.azure.mod.QueueService]
  @scala.inline
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typingsSlinky.azure.mod.QueueService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.QueueService]
  @scala.inline
  def createQueueService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.QueueService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.QueueService]
  @scala.inline
  def createQueueService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typingsSlinky.azure.mod.QueueService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.QueueService]
  @scala.inline
  def createQueueService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.QueueService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createQueueService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.QueueService]
  
  @scala.inline
  def createServiceBusService(): typingsSlinky.azure.mod.ServiceBusService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")().asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(connectionString: java.lang.String): typingsSlinky.azure.mod.ServiceBusService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(namespace: java.lang.String, accessKey: js.UndefOr[scala.Nothing], issuer: java.lang.String): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: js.UndefOr[scala.Nothing],
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: js.UndefOr[scala.Nothing],
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(namespace: java.lang.String, accessKey: java.lang.String, issuer: java.lang.String): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: js.UndefOr[scala.Nothing],
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  @scala.inline
  def createServiceBusService(
    namespace: java.lang.String,
    accessKey: java.lang.String,
    issuer: java.lang.String,
    acsNamespace: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.ServiceBusService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceBusService")(namespace.asInstanceOf[js.Any], accessKey.asInstanceOf[js.Any], issuer.asInstanceOf[js.Any], acsNamespace.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceBusService]
  
  @scala.inline
  def createServiceManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): typingsSlinky.azure.mod.ServiceManagementService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createServiceManagementService")(subscriptionId.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], hostOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.ServiceManagementService]
  
  @scala.inline
  def createSqlManagementService(subscriptionId: java.lang.String, authentication: java.lang.String, hostOptions: java.lang.String): typingsSlinky.azure.mod.SqlManagementService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlManagementService")(subscriptionId.asInstanceOf[js.Any], authentication.asInstanceOf[js.Any], hostOptions.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlManagementService]
  
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    acsHost: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    acsHost: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    acsHost: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  @scala.inline
  def createSqlService(
    serverName: java.lang.String,
    administratorLogin: java.lang.String,
    administratorLoginPassword: java.lang.String,
    host: java.lang.String,
    acsHost: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.SqlService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createSqlService")(serverName.asInstanceOf[js.Any], administratorLogin.asInstanceOf[js.Any], administratorLoginPassword.asInstanceOf[js.Any], host.asInstanceOf[js.Any], acsHost.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.SqlService]
  
  @scala.inline
  def createTableService(): typingsSlinky.azure.mod.TableService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")().asInstanceOf[typingsSlinky.azure.mod.TableService]
  @scala.inline
  def createTableService(connectionString: java.lang.String): typingsSlinky.azure.mod.TableService = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.azure.mod.TableService]
  @scala.inline
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String): typingsSlinky.azure.mod.TableService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.TableService]
  @scala.inline
  def createTableService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: js.UndefOr[scala.Nothing],
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.TableService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.TableService]
  @scala.inline
  def createTableService(storageAccount: java.lang.String, storageAccessKey: java.lang.String, host: java.lang.String): typingsSlinky.azure.mod.TableService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.TableService]
  @scala.inline
  def createTableService(
    storageAccount: java.lang.String,
    storageAccessKey: java.lang.String,
    host: java.lang.String,
    authenticationProvider: java.lang.String
  ): typingsSlinky.azure.mod.TableService = (typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createTableService")(storageAccount.asInstanceOf[js.Any], storageAccessKey.asInstanceOf[js.Any], host.asInstanceOf[js.Any], authenticationProvider.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.azure.mod.TableService]
  
  @scala.inline
  def isEmulated(): scala.Boolean = typingsSlinky.azure.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isEmulated")().asInstanceOf[scala.Boolean]
}
