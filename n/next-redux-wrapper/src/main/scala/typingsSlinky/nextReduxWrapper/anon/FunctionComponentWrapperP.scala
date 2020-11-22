package typingsSlinky.nextReduxWrapper.anon

import slinky.core.facade.ReactElement
import typingsSlinky.next.libUtilsMod.NextPageContext
import typingsSlinky.nextReduxWrapper.mod.WrapperProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FunctionComponent<next-redux-wrapper.next-redux-wrapper.WrapperProps> & {  getInitialProps :(context : next.next.NextPageContext): next-redux-wrapper.next-redux-wrapper.WrapperProps | std.Promise<next-redux-wrapper.next-redux-wrapper.WrapperProps> | undefined} */
@js.native
trait FunctionComponentWrapperP extends js.Object {
  
  def apply(props: PropsWithChildren[WrapperProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[WrapperProps], context: js.Any): ReactElement | Null = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[PartialWrapperProps] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getInitialProps: js.UndefOr[
    js.Function1[/* context */ NextPageContext, WrapperProps | js.Promise[WrapperProps]]
  ] = js.native
  
  var propTypes: js.UndefOr[WeakValidationMapWrapperP] = js.native
}
