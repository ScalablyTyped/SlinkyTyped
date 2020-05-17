package typingsSlinky.ionicCore

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.interfaceMod.RouterDirection
import typingsSlinky.ionicCore.mod.CssClassMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/utils/theme", JSImport.Namespace)
@js.native
object themeMod extends js.Object {
  def createColorClasses(): js.UndefOr[CssClassMap] = js.native
  def createColorClasses(color: String): js.UndefOr[CssClassMap] = js.native
  def getClassList(): js.Array[String] = js.native
  def getClassList(classes: String): js.Array[String] = js.native
  def getClassList(classes: js.Array[js.UndefOr[String | Null]]): js.Array[String] = js.native
  def getClassMap(): CssClassMap = js.native
  def getClassMap(classes: String): CssClassMap = js.native
  def getClassMap(classes: js.Array[String]): CssClassMap = js.native
  def hostContext(selector: String, el: HTMLElement): Boolean = js.native
  def openURL(url: js.UndefOr[Null | String], ev: js.UndefOr[Event | Null], direction: RouterDirection): js.Promise[Boolean] = js.native
}

