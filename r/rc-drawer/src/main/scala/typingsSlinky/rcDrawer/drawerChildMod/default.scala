package typingsSlinky.rcDrawer.drawerChildMod

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.rcDrawer.anon.PrevProps
import typingsSlinky.rcDrawer.anon.PrevPropsIDrawerChildProps
import typingsSlinky.rcDrawer.anon.SwitchScrollingEffect
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerChildProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
class default protected () extends DrawerChild {
  def this(props: IDrawerChildProps) = this()
}

@JSImport("rc-drawer/lib/DrawerChild", JSImport.Default)
@js.native
object default extends Instantiable1[/* props */ IDrawerChildProps, DrawerChild] {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: SwitchScrollingEffect = js.native
  var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerChild.getDerivedStateFromProps */ js.Any = js.native
  def getDerivedStateFromProps(props: IDrawerChildProps, hasPrevProps_self: PrevProps): PrevPropsIDrawerChildProps = js.native
}

