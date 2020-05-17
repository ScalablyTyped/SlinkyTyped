package typingsSlinky.rcDrawer

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.rcDrawer.anon.AfterVisibleChange
import typingsSlinky.rcDrawer.anon.Open
import typingsSlinky.rcDrawer.anon.PrevPropsIDrawerProps
import typingsSlinky.rcDrawer.drawerWrapperMod.DrawerWrapper
import typingsSlinky.rcDrawer.idrawerproptypesMod.IDrawerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-drawer/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends DrawerWrapper {
    def this(props: IDrawerProps) = this()
  }
  
  @js.native
  object default extends Instantiable1[/* props */ IDrawerProps, DrawerWrapper] {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: AfterVisibleChange = js.native
    var getDerivedStateFromProps: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DrawerWrapper.getDerivedStateFromProps */ js.Any = js.native
    def getDerivedStateFromProps(props: IDrawerProps, hasPrevProps: PrevPropsIDrawerProps): Open = js.native
  }
  
}

