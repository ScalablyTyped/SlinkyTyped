package typingsSlinky.miniStore.connectMod

import typingsSlinky.miniStore.typesMod.ConnectedComponent
import typingsSlinky.miniStore.typesMod.StoreProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mini-store/cjs/connect", "connect")
@js.native
object connect extends js.Object {
  
  def apply[TStateProps, TOwnProps, State](): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def apply[TStateProps, TOwnProps, State](mapStateToProps: js.UndefOr[scala.Nothing], options: ConnectOptions): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def apply[TStateProps, TOwnProps, State](mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def apply[TStateProps, TOwnProps, State](
    mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps],
    options: ConnectOptions
  ): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
}
