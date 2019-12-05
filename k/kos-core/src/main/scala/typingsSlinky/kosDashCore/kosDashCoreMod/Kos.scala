package typingsSlinky.kosDashCore.kosDashCoreMod

import slinky.core.ReactComponentClass
import typingsSlinky.kosDashCore.Anon_Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kos extends js.Object {
  var Util: typingsSlinky.kosDashCore.kosDashCoreMod.Util = js.native
  def Wrapper(config: WrapperConfig): js.Function1[ReactComponentClass[js.Any with KosProps[_]], _] = js.native
  def getModel(namespace: String): KosModel[_] = js.native
  def registeModel(model: js.Any): Unit = js.native
  def removeModel(namespace: String): Unit = js.native
  def start(Layout: ReactComponentClass[_]): Unit = js.native
  def start(Layout: ReactComponentClass[_], container: String): Unit = js.native
  def use(middleware: js.Function1[/* api */ Anon_Dispatch, Unit]): Unit = js.native
}

