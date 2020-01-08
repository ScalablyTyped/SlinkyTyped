package typingsSlinky.fundamentalDashReact

import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.className
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Breadcrumb/Breadcrumb", JSImport.Namespace)
@js.native
object libBreadcrumbBreadcrumbMod extends js.Object {
  val default: ReactComponentClass[BreadcrumbProps] with Anon_Breadcrumb = js.native
  type BreadcrumbItemProps = Anon_Name with HTMLAttributes[HTMLLIElement]
  type BreadcrumbProps = Anon_CustomStyles with (Pick[HTMLAttributes[HTMLUListElement], Exclude[String, className]])
}

