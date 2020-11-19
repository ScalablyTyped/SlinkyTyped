package typingsSlinky.reactSpinkit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactSpinkit.mod.SpinnerProps
import typingsSlinky.reactSpinkit.mod.^
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

object ReactSpinkit {
  
  @JSImport("react-spinkit", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fadeIn(value: full | half | quarter | none): this.type = set("fadeIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(
      value: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
    ): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrideSpinnerClassName(value: String): this.type = set("overrideSpinnerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SpinnerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactSpinkit.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
