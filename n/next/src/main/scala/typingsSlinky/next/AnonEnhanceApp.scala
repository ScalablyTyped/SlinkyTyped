package typingsSlinky.next

import typingsSlinky.next.utilsMod.AppType
import typingsSlinky.next.utilsMod.Enhancer
import typingsSlinky.next.utilsMod.NextComponentType
import typingsSlinky.next.utilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnhanceApp extends js.Object {
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.undefined
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.undefined
}

object AnonEnhanceApp {
  @scala.inline
  def apply(
    enhanceApp: AppType => AppType = null,
    enhanceComponent: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object] = null
  ): AnonEnhanceApp = {
    val __obj = js.Dynamic.literal()
    if (enhanceApp != null) __obj.updateDynamic("enhanceApp")(js.Any.fromFunction1(enhanceApp))
    if (enhanceComponent != null) __obj.updateDynamic("enhanceComponent")(js.Any.fromFunction1(enhanceComponent))
    __obj.asInstanceOf[AnonEnhanceApp]
  }
}

