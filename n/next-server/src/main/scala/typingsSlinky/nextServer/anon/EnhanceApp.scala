package typingsSlinky.nextServer.anon

import typingsSlinky.nextServer.libUtilsMod.AppType
import typingsSlinky.nextServer.libUtilsMod.ComponentsEnhancer
import typingsSlinky.nextServer.libUtilsMod.Enhancer
import typingsSlinky.nextServer.libUtilsMod.NextComponentType
import typingsSlinky.nextServer.libUtilsMod.NextPageContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnhanceApp extends ComponentsEnhancer {
  var enhanceApp: js.UndefOr[Enhancer[AppType]] = js.native
  var enhanceComponent: js.UndefOr[Enhancer[NextComponentType[NextPageContext, js.Object, js.Object]]] = js.native
}

object EnhanceApp {
  @scala.inline
  def apply(): EnhanceApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnhanceApp]
  }
  @scala.inline
  implicit class EnhanceAppOps[Self <: EnhanceApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnhanceApp(value: AppType => AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceApp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnhanceApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceApp")(js.undefined)
        ret
    }
    @scala.inline
    def withEnhanceComponent(
      value: NextComponentType[NextPageContext, js.Object, js.Object] => NextComponentType[NextPageContext, js.Object, js.Object]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceComponent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEnhanceComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enhanceComponent")(js.undefined)
        ret
    }
  }
  
}

