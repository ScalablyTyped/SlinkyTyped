package typingsSlinky.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.MeasureInWindowOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureLayoutOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureOnSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-native.react-native.NativeMethods> */
trait ReadonlyNativeMethods extends js.Object {
  val blur: js.Function0[Unit]
  val focus: js.Function0[Unit]
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit]
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit]
  val measureLayout: js.Function3[
    /* relativeToNativeNode */ Double, 
    /* onSuccess */ MeasureLayoutOnSuccessCallback, 
    /* onFail */ js.Function0[Unit], 
    Unit
  ]
  val refs: StringDictionary[ReactComponentClass[_]]
  val setNativeProps: js.Function1[/* nativeProps */ js.Object, Unit]
}

object ReadonlyNativeMethods {
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    measure: /* callback */ MeasureOnSuccessCallback => Unit,
    measureInWindow: /* callback */ MeasureInWindowOnSuccessCallback => Unit,
    measureLayout: (/* relativeToNativeNode */ Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit,
    refs: StringDictionary[ReactComponentClass[_]],
    setNativeProps: /* nativeProps */ js.Object => Unit
  ): ReadonlyNativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), measure = js.Any.fromFunction1(measure), measureInWindow = js.Any.fromFunction1(measureInWindow), measureLayout = js.Any.fromFunction3(measureLayout), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
    __obj.asInstanceOf[ReadonlyNativeMethods]
  }
}

