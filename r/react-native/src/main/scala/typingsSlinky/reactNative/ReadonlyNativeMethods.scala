package typingsSlinky.reactNative

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.MeasureInWindowOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureLayoutOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureOnSuccessCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-native.react-native.NativeMethods> */
@js.native
trait ReadonlyNativeMethods extends js.Object {
  val blur: js.Function0[Unit] = js.native
  val focus: js.Function0[Unit] = js.native
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit] = js.native
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit] = js.native
  val measureLayout: js.Function3[
    /* relativeToNativeNode */ Double, 
    /* onSuccess */ MeasureLayoutOnSuccessCallback, 
    /* onFail */ js.Function0[Unit], 
    Unit
  ] = js.native
  val refs: StringDictionary[ReactComponentClass[_]] = js.native
  val setNativeProps: js.Function1[/* nativeProps */ js.Object, Unit] = js.native
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
  @scala.inline
  implicit class ReadonlyNativeMethodsOps[Self <: ReadonlyNativeMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlur(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFocus(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMeasure(value: /* callback */ MeasureOnSuccessCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasureInWindow(value: /* callback */ MeasureInWindowOnSuccessCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureInWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeasureLayout(
      value: (/* relativeToNativeNode */ Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureLayout")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRefs(value: StringDictionary[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetNativeProps(value: /* nativeProps */ js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setNativeProps")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

