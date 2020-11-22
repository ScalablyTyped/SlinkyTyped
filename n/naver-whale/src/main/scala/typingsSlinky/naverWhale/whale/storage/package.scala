package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object storage {
  
  type StorageChangedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function2[
      /* changes */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.chrome.chrome.storage.StorageChange], 
      /* areaName */ typingsSlinky.chrome.chrome.storage.AreaName, 
      scala.Unit
    ]
  ]
}
