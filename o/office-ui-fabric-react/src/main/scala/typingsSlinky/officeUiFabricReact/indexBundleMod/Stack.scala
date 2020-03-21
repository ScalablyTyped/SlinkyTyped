package typingsSlinky.officeUiFabricReact.indexBundleMod

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.PartialIStackProps
import typingsSlinky.officeUiFabricReact.WeakValidationMapIStackPr
import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typingsSlinky.officeUiFabricReact.stackTypesMod.IStackProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/index.bundle", "Stack")
@js.native
object Stack extends js.Object {
  var Item: ReactComponentClass[IStackItemProps] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialIStackProps] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
  def apply(props: PropsWithChildren[IStackProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[IStackProps], context: js.Any): ReactElement | Null = js.native
}

