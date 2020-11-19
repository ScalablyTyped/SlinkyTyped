package typingsSlinky.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object types {
  
  type ChromeSettingChangedEvent = typingsSlinky.chrome.chrome.events.Event[typingsSlinky.chrome.chrome.types.DetailsCallback]
  
  type DetailsCallback = js.Function1[
    /* details */ typingsSlinky.chrome.chrome.types.ChromeSettingGetResultDetails, 
    scala.Unit
  ]
}
