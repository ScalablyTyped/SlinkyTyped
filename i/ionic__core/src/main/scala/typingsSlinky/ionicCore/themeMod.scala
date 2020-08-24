package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.animationInterfaceMod.AnimationBuilder
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.mod.Color
import typingsSlinky.ionicCore.mod.CssClassMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  def createColorClasses(): js.UndefOr[CssClassMap] = js.native
  def createColorClasses(color: Color): js.UndefOr[CssClassMap] = js.native
  def getClassList(): js.Array[String] = js.native
  def getClassList(classes: String): js.Array[String] = js.native
  def getClassList(classes: js.Array[js.UndefOr[String | Null]]): js.Array[String] = js.native
  def getClassMap(): CssClassMap = js.native
  def getClassMap(classes: String): CssClassMap = js.native
  def getClassMap(classes: js.Array[String]): CssClassMap = js.native
  def hostContext(selector: String, el: HTMLElement): Boolean = js.native
  def openURL(url: js.UndefOr[scala.Nothing], ev: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(
    url: js.UndefOr[scala.Nothing],
    ev: js.UndefOr[scala.Nothing],
    direction: RouterDirection,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def openURL(url: js.UndefOr[scala.Nothing], ev: Null, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: js.UndefOr[scala.Nothing], ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: js.UndefOr[scala.Nothing], ev: Event, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: js.UndefOr[scala.Nothing], ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: String, ev: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(
    url: String,
    ev: js.UndefOr[scala.Nothing],
    direction: RouterDirection,
    animation: AnimationBuilder
  ): js.Promise[Boolean] = js.native
  def openURL(url: String, ev: Null, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: String, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: String, ev: Event, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: String, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: js.UndefOr[scala.Nothing], direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: Null, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: Null, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: Event, direction: RouterDirection): js.Promise[Boolean] = js.native
  def openURL(url: Null, ev: Event, direction: RouterDirection, animation: AnimationBuilder): js.Promise[Boolean] = js.native
}

