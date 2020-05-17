package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}
