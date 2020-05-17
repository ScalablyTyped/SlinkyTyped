package typingsSlinky.materialUiCore

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.enzyme.mod.ReactWrapper
import typingsSlinky.materialUiCore.anon.Fn0
import typingsSlinky.materialUiCore.anon.Fn1
import typingsSlinky.materialUiCore.anon.NonePSnodeReactElementopt
import typingsSlinky.materialUiCore.anon.PartialMountOptions
import typingsSlinky.materialUiCore.anon.PartialRenderOptions
import typingsSlinky.materialUiCore.anon.PartialShallowOptions
import typingsSlinky.materialUiCore.anon.PartialwithThemeboolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/test-utils", JSImport.Namespace)
@js.native
object testUtilsMod extends js.Object {
  def createMount(): NonePSnodeReactElementopt = js.native
  def createMount(options: PartialMountOptions): NonePSnodeReactElementopt = js.native
  def createRender(): Fn0 = js.native
  def createRender(options: PartialRenderOptions): Fn0 = js.native
  def createShallow(): Fn1 = js.native
  def createShallow(options: PartialShallowOptions): Fn1 = js.native
  def findOutermostIntrinsic(reactWrapper: ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]]): ReactWrapper[js.Object, js.Object, ReactComponentClass[js.Object]] = js.native
  def getClasses[T](element: ReactElement): T = js.native
  def getClasses[T](element: ReactElement, options: PartialwithThemeboolean): T = js.native
  def unwrap(element: ReactElement): ReactElement = js.native
}

