package typingsSlinky.reactSpinkit.mod

import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-beat`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-multiple`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate-pulse`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-clip-rotate`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-grid-beat`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-grid-pulse`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-pulse-rise`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-pulse-sync`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-scale-multiple`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple-multiple`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-scale-ripple`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-spin-fade-loader`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-triangle-path`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-zig-zag-deflect`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`ball-zig-zag`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`chasing-dots`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`cube-grid`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`double-bounce`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`folding-cube`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`line-scale-party`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out-rapid`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`line-scale-pulse-out`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`line-scale`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`line-spin-fade-loader`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`rotating-plane`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`three-bounce`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`triangle-skew-spin`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.`wandering-cubes`
import typingsSlinky.reactSpinkit.reactSpinkitStrings.circle
import typingsSlinky.reactSpinkit.reactSpinkitStrings.full
import typingsSlinky.reactSpinkit.reactSpinkitStrings.half
import typingsSlinky.reactSpinkit.reactSpinkitStrings.none
import typingsSlinky.reactSpinkit.reactSpinkitStrings.pacman
import typingsSlinky.reactSpinkit.reactSpinkitStrings.pulse
import typingsSlinky.reactSpinkit.reactSpinkitStrings.quarter
import typingsSlinky.reactSpinkit.reactSpinkitStrings.wave
import typingsSlinky.reactSpinkit.reactSpinkitStrings.wordpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpinnerProps extends js.Object {
  
  /**
    * Component className.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Programmatically set the color of the spinners (does not work
    * for circle or folding-cube); this can either be a hex value or a color word
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Set the time before the spinner fades in
    */
  var fadeIn: js.UndefOr[full | half | quarter | none] = js.native
  
  /**
    * Specify spinner to use.
    */
  var name: js.UndefOr[
    `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
  ] = js.native
  
  /**
    * Change the default "spinner" className.
    */
  var overrideSpinnerClassName: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object SpinnerProps {
  
  @scala.inline
  def apply(): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerProps]
  }
  
  @scala.inline
  implicit class SpinnerPropsOps[Self <: SpinnerProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFadeIn(value: full | half | quarter | none): Self = this.set("fadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFadeIn: Self = this.set("fadeIn", js.undefined)
    
    @scala.inline
    def setName(
      value: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
    ): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOverrideSpinnerClassName(value: String): Self = this.set("overrideSpinnerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideSpinnerClassName: Self = this.set("overrideSpinnerClassName", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
