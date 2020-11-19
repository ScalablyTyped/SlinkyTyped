package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeMethods extends js.Object {
  
  /**
    * Removes focus from an input or view. This is the opposite of `focus()`.
    */
  def blur(): Unit = js.native
  
  /**
    * Requests focus for the given input or view. The exact behavior triggered
    * will depend on the platform and type of view.
    */
  def focus(): Unit = js.native
  
  /**
    * Determines the location on screen, width, and height of the given view and
    * returns the values via an async callback. If successful, the callback will
    * be called with the following arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *  - pageX
    *  - pageY
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native. If you need the measurements as soon as
    * possible, consider using the [`onLayout`
    * prop](docs/view.html#onlayout) instead.
    */
  def measure(callback: MeasureOnSuccessCallback): Unit = js.native
  
  /**
    * Determines the location of the given view in the window and returns the
    * values via an async callback. If the React root view is embedded in
    * another native view, this will give you the absolute coordinates. If
    * successful, the callback will be called with the following
    * arguments:
    *
    *  - x
    *  - y
    *  - width
    *  - height
    *
    * Note that these measurements are not available until after the rendering
    * has been completed in native.
    */
  def measureInWindow(callback: MeasureInWindowOnSuccessCallback): Unit = js.native
  
  /**
    * Like [`measure()`](#measure), but measures the view relative an ancestor,
    * specified as `relativeToNativeNode`. This means that the returned x, y
    * are relative to the origin x, y of the ancestor view.
    *
    * As always, to obtain a native node handle for a component, you can use
    * `React.findNodeHandle(component)`.
    */
  def measureLayout(
    relativeToNativeNode: Double,
    onSuccess: MeasureLayoutOnSuccessCallback,
    onFail: js.Function0[Unit]
  ): Unit = js.native
  
  var refs: StringDictionary[ReactComponentClass[_]] = js.native
  
  /**
    * This function sends props straight to native. They will not participate in
    * future diff process - this means that if you do not include them in the
    * next render, they will remain active (see [Direct
    * Manipulation](docs/direct-manipulation.html)).
    */
  def setNativeProps(nativeProps: js.Object): Unit = js.native
}
object NativeMethods {
  
  @scala.inline
  def apply(
    blur: () => Unit,
    focus: () => Unit,
    measure: MeasureOnSuccessCallback => Unit,
    measureInWindow: MeasureInWindowOnSuccessCallback => Unit,
    measureLayout: (Double, MeasureLayoutOnSuccessCallback, js.Function0[Unit]) => Unit,
    refs: StringDictionary[ReactComponentClass[_]],
    setNativeProps: js.Object => Unit
  ): NativeMethods = {
    val __obj = js.Dynamic.literal(blur = js.Any.fromFunction0(blur), focus = js.Any.fromFunction0(focus), measure = js.Any.fromFunction1(measure), measureInWindow = js.Any.fromFunction1(measureInWindow), measureLayout = js.Any.fromFunction3(measureLayout), refs = refs.asInstanceOf[js.Any], setNativeProps = js.Any.fromFunction1(setNativeProps))
    __obj.asInstanceOf[NativeMethods]
  }
  
  @scala.inline
  implicit class NativeMethodsOps[Self <: NativeMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlur(value: () => Unit): Self = this.set("blur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMeasure(value: MeasureOnSuccessCallback => Unit): Self = this.set("measure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasureInWindow(value: MeasureInWindowOnSuccessCallback => Unit): Self = this.set("measureInWindow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMeasureLayout(value: (Double, MeasureLayoutOnSuccessCallback, js.Function0[Unit]) => Unit): Self = this.set("measureLayout", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRefs(value: StringDictionary[ReactComponentClass[_]]): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetNativeProps(value: js.Object => Unit): Self = this.set("setNativeProps", js.Any.fromFunction1(value))
  }
}
