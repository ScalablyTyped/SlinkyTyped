package typingsSlinky.naverWhale.whale.system

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object storage {
  type SystemStorageAttachedEvent = typingsSlinky.chrome.chrome.events.Event[
    js.Function1[/* info */ typingsSlinky.chrome.chrome.system.storage.StorageUnitInfo, scala.Unit]
  ]
  type SystemStorageDetachedEvent = typingsSlinky.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
}
