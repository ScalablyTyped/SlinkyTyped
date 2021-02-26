package typingsSlinky.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.reactNative.mod.HostComponent
import typingsSlinky.reactNative.mod.MeasureInWindowOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureLayoutOnSuccessCallback
import typingsSlinky.reactNative.mod.MeasureOnSuccessCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<react-native.react-native.NativeMethods> */
@js.native
trait ReadonlyNativeMethods extends StObject {
  
  val blur: js.Function0[Unit] = js.native
  
  val focus: js.Function0[Unit] = js.native
  
  val measure: js.Function1[/* callback */ MeasureOnSuccessCallback, Unit] = js.native
  
  val measureInWindow: js.Function1[/* callback */ MeasureInWindowOnSuccessCallback, Unit] = js.native
  
  val measureLayout: js.Function3[
    /* relativeToNativeComponentRef */ HostComponent[_] | Double, 
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
    measureLayout: (/* relativeToNativeComponentRef */ HostComponent[_] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit,
    refs: StringDictionary[ReactComponentClass[_]],
    setNativeProps: /* nativeProps */ js.Object => Unit
  ): ReadonlyNativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), measure = js.Any.fromFunction1(measure), measureInWindow = js.Any.fromFunction1(measureInWindow), measureLayout = js.Any.fromFunction3(measureLayout), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
    __obj.asInstanceOf[ReadonlyNativeMethods]
  }
  
  @scala.inline
  implicit class ReadonlyNativeMethodsMutableBuilder[Self <: ReadonlyNativeMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: () => Unit): Self = StObject.set(x, "blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMeasure(value: /* callback */ MeasureOnSuccessCallback => Unit): Self = StObject.set(x, "measure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasureInWindow(value: /* callback */ MeasureInWindowOnSuccessCallback => Unit): Self = StObject.set(x, "measureInWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasureLayout(
      value: (/* relativeToNativeComponentRef */ HostComponent[_] | Double, /* onSuccess */ MeasureLayoutOnSuccessCallback, /* onFail */ js.Function0[Unit]) => Unit
    ): Self = StObject.set(x, "measureLayout", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRefs(value: StringDictionary[ReactComponentClass[_]]): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNativeProps(value: /* nativeProps */ js.Object => Unit): Self = StObject.set(x, "setNativeProps", js.Any.fromFunction1(value))
  }
}
