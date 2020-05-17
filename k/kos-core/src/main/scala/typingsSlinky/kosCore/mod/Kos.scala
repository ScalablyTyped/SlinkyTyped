package typingsSlinky.kosCore.mod

import slinky.core.ReactComponentClass
import typingsSlinky.kosCore.anon.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kos extends js.Object {
  var Util: typingsSlinky.kosCore.mod.Util = js.native
  def Wrapper(config: WrapperConfig): js.Function1[ReactComponentClass[js.Any with KosProps[_]], _] = js.native
  def getModel(namespace: String): KosModel[_] = js.native
  def registeModel(model: js.Any): Unit = js.native
  def removeModel(namespace: String): Unit = js.native
  def start(Layout: ReactComponentClass[_]): Unit = js.native
  def start(Layout: ReactComponentClass[_], container: String): Unit = js.native
  def use(middleware: js.Function1[/* api */ Dispatch, Unit]): Unit = js.native
}

