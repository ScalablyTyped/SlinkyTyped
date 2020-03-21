package typingsSlinky.rcDrawer.drawerWrapperMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.rcDrawer.AnonAfterVisibleChange
import typingsSlinky.rcDrawer.AnonOpen
import typingsSlinky.rcDrawer.AnonPrevPropsIDrawerProps
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/DrawerWrapper", JSImport.Default)
@js.native
class default protected () extends DrawerWrapper {
  def this(props: IDrawerProps) = this()
}

@JSImport("rc-drawer/lib/DrawerWrapper", JSImport.Default)
@js.native
object default extends Instantiable1[/* props */ IDrawerProps, DrawerWrapper] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: AnonAfterVisibleChange = js.native
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any = js.native
  def getDerivedStateFromProps(props: IDrawerProps, hasPrevProps: AnonPrevPropsIDrawerProps): AnonOpen = js.native
}

