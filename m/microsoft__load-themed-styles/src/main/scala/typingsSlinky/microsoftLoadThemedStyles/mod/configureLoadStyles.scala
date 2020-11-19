package typingsSlinky.microsoftLoadThemedStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@microsoft/load-themed-styles", "configureLoadStyles")
@js.native
object configureLoadStyles extends js.Object {
  
  def apply(): Unit = js.native
  def apply(
    loadStylesFn: js.Function2[
      /* processedStyles */ String, 
      /* rawStyles */ js.UndefOr[String | ThemableArray], 
      Unit
    ]
  ): Unit = js.native
}
