package typingsSlinky.onsenui.mod

import typingsSlinky.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @description Should be used as root component of each page. The content inside page component is scrollable
  */
@js.native
trait OnsPageElement extends HTMLElement {
  
  /**
    * @description Back-button handler.
    */
  var backButtonHandler: js.Any = js.native
  
  /**
    * @description User's custom data passed to `pushPage()`-like methods.
    */
  var data: js.Any = js.native
  
  var onDeviceBackButton: js.Any = js.native
  
  /**
    * @description Function to be executed when scrolling to the bottom of the page. The function receives a done callback as an argument that must be called when it's finished.
    */
  var onInfiniteScroll: js.Function = js.native
}
