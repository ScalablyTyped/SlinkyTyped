package typingsSlinky.naverDashWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.chrome.chrome.events.Event

  type StorageChangedEvent = Event[
    js.Function2[
      /* changes */ StringDictionary[typingsSlinky.chrome.chrome.storage.StorageChange], 
      /* areaName */ String, 
      Unit
    ]
  ]
}
