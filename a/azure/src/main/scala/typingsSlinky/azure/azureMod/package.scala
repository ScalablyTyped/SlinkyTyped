package typingsSlinky.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object azureMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.azure.Anon_TableName

  type CreateTableIfNotExistsCallback = js.Function3[/* error */ js.Error, /* created */ Boolean, /* response */ WebResponse, Unit]
  type DeleteEntityCallback = js.Function3[/* error */ js.Error, /* successful */ Boolean, /* response */ WebResponse, Unit]
  type DeleteTableCallback = js.Function3[/* error */ js.Error, /* successful */ Boolean, /* response */ WebResponse, Unit]
  type Dictionary[T] = StringDictionary[T]
  type ErrorCallback = js.Function1[/* error */ js.Error, Unit]
  type GetBlobToTextCallback = js.Function4[
    /* err */ js.Error, 
    /* text */ String, 
    /* result */ BlobResult, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListBlobsCallback = js.Function4[
    /* err */ js.Error, 
    /* blobs */ js.Array[BlobResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListContainersCallback = js.Function4[
    /* err */ js.Error, 
    /* containers */ js.Array[ContainerResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ListQueuesCallback = js.Function4[
    /* err */ js.Error, 
    /* queues */ js.Array[QueueResult], 
    /* continuationToken */ ContinuationToken, 
    /* response */ WebResponse, 
    Unit
  ]
  type ModifyEntityCallback = js.Function3[/* error */ js.Error, /* entity */ Entity, /* response */ WebResponse, Unit]
  type QueryEntitiesCallback = js.Function4[
    /* error */ js.Error, 
    /* entities */ js.Array[Entity], 
    /* resultContinuation */ QueryEntitiesResultContinuation, 
    /* response */ WebResponse, 
    Unit
  ]
  type QueryEntityCallback = js.Function3[/* error */ js.Error, /* entity */ Entity, /* response */ WebResponse, Unit]
  type QueryTablesCallback = js.Function4[
    /* error */ js.Error, 
    /* queryTablesResult */ js.Array[TableResult], 
    /* resultsContinuation */ QueryResultContinuation, 
    /* response */ WebResponse, 
    Unit
  ]
  type SimpleCallback[T] = js.Function2[/* error */ js.Error, /* result */ T, Unit]
  type StorageCallback[T] = js.Function3[/* err */ js.Error, /* result */ T, /* response */ WebResponse, Unit]
  type StorageCallbackVoid = js.Function2[/* err */ js.Error, /* response */ WebResponse, Unit]
  type StorageMetadata = StringDictionary[String]
  type StorageServicePropertiesCallback = StorageCallback[StorageServiceProperties]
  type StorageServiceStatsCallback = StorageCallback[StorageServiceStats]
  type TableRequestCallback = js.Function3[
    /* error */ js.Error, 
    /* tableResult */ Anon_TableName, 
    /* response */ WebResponse, 
    Unit
  ]
  type ValidatorFunction = js.Function1[/* userSettings */ Dictionary[js.Any], js.Any]
}
