package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.reactNative.ReadonlyNativeMethods
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<react.react.ComponentClass<P, react.react.ComponentState>, std.Exclude<keyof react.react.ComponentClass<P, react.react.ComponentState>, 'new'>> */
@js.native
trait HostComponent[P]
  extends Instantiable1[/* props */ P, ReactComponentClass[P] with ReadonlyNativeMethods]
     with Instantiable2[
      /* props */ P, 
      /* context */ js.Any, 
      ReactComponentClass[P] with ReadonlyNativeMethods
    ] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var contextType: js.UndefOr[Context[_]] = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[Partial[typingsSlinky.reactNative.reactNativeStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[
    GetDerivedStateFromError[typingsSlinky.reactNative.reactNativeStrings.getDerivedStateFromError, js.Object]
  ] = js.native
  var getDerivedStateFromProps: js.UndefOr[
    GetDerivedStateFromProps[typingsSlinky.reactNative.reactNativeStrings.getDerivedStateFromProps, js.Object]
  ] = js.native
  var propTypes: js.UndefOr[WeakValidationMap[typingsSlinky.reactNative.reactNativeStrings.propTypes]] = js.native
}

