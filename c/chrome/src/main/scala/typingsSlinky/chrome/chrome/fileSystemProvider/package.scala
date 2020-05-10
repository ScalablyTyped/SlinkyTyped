package typingsSlinky.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemProvider {
  type DirectoryPathRecursiveRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type DirectoryPathRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEventOptions, 
      /* successCallback */ js.Function2[
        /* entries */ js.Array[typingsSlinky.chrome.chrome.fileSystemProvider.EntryMetadata], 
        /* hasMore */ scala.Boolean, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type EntryPathRecursiveRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathLengthRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.FilePathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type MetadataRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[
        /* metadata */ typingsSlinky.chrome.chrome.fileSystemProvider.EntryMetadata, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenFileRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileIoRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileOffsetRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEventOptions, 
      /* successCallback */ js.Function2[/* data */ js.typedarray.ArrayBuffer, /* hasMore */ scala.Boolean, scala.Unit], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.OpenedFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OperationRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.OperationRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OptionlessRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type RequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.RequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type SourceTargetPathRequestedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsSlinky.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
}
