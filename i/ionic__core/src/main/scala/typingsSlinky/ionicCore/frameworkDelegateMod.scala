package typingsSlinky.ionicCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.mod.FrameworkDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/framework-delegate", JSImport.Namespace)
@js.native
object frameworkDelegateMod extends js.Object {
  def attachComponent(delegate: js.UndefOr[FrameworkDelegate], container: Element, component: ComponentRef): js.Promise[HTMLElement] = js.native
  def attachComponent(
    delegate: js.UndefOr[FrameworkDelegate],
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String]
  ): js.Promise[HTMLElement] = js.native
  def attachComponent(
    delegate: js.UndefOr[FrameworkDelegate],
    container: Element,
    component: ComponentRef,
    cssClasses: js.Array[String],
    componentProps: StringDictionary[js.Any]
  ): js.Promise[HTMLElement] = js.native
  def detachComponent(): js.Promise[Unit] = js.native
  def detachComponent(delegate: FrameworkDelegate): js.Promise[Unit] = js.native
  def detachComponent(delegate: FrameworkDelegate, element: HTMLElement): js.Promise[Unit] = js.native
}

