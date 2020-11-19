package typingsSlinky.miniStore

import typingsSlinky.miniStore.connectMod.ConnectOptions
import typingsSlinky.miniStore.typesMod.ConnectedComponent
import typingsSlinky.miniStore.typesMod.Store
import typingsSlinky.miniStore.typesMod.StoreProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mini-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def connect[TStateProps, TOwnProps, State](): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.UndefOr[scala.Nothing], options: ConnectOptions): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps]): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  def connect[TStateProps, TOwnProps, State](
    mapStateToProps: js.Function2[/* state */ State, /* ownProps */ TOwnProps, TStateProps],
    options: ConnectOptions
  ): js.Function1[
    /* WrappedComponent */ js.Any, 
    ConnectedComponent[_, TStateProps with StoreProp[State], TOwnProps]
  ] = js.native
  
  def create[S](initialState: S): Store[S] = js.native
  
  @js.native
  class Provider ()
    extends typingsSlinky.miniStore.providerMod.Provider
}
