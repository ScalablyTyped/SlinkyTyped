package typingsSlinky.reactDashSpinkit.reactDashSpinkitMod

import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-beat`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate-multiple`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate-pulse`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-clip-rotate`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-grid-beat`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-grid-pulse`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-pulse-rise`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-pulse-sync`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-multiple`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-ripple-multiple`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-scale-ripple`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-spin-fade-loader`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-triangle-path`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-zig-zag-deflect`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`ball-zig-zag`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`chasing-dots`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`cube-grid`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`double-bounce`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`folding-cube`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-party`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-pulse-out-rapid`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`line-scale-pulse-out`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`line-scale`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`line-spin-fade-loader`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`rotating-plane`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`three-bounce`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`triangle-skew-spin`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.`wandering-cubes`
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.circle
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.full
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.half
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.none
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.pacman
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.pulse
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.quarter
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.wave
import typingsSlinky.reactDashSpinkit.reactDashSpinkitStrings.wordpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinnerProps extends js.Object {
  /**
    * Component className.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Programmatically set the color of the spinners (does not work
    * for circle or folding-cube); this can either be a hex value or a color word
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Set the time before the spinner fades in
    */
  var fadeIn: js.UndefOr[full | half | quarter | none] = js.undefined
  /**
    * Specify spinner to use.
    */
  var name: js.UndefOr[
    `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman
  ] = js.undefined
  /**
    * Change the default "spinner" className.
    */
  var overrideSpinnerClassName: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object SpinnerProps {
  @scala.inline
  def apply(
    className: String = null,
    color: String = null,
    fadeIn: full | half | quarter | none = null,
    name: `three-bounce` | `double-bounce` | `rotating-plane` | `folding-cube` | wave | `wandering-cubes` | pulse | `chasing-dots` | circle | `cube-grid` | wordpress | `ball-grid-beat` | `ball-grid-pulse` | `line-spin-fade-loader` | `ball-spin-fade-loader` | `ball-pulse-rise` | `line-scale` | `line-scale-pulse-out` | `line-scale-pulse-out-rapid` | `line-scale-party` | `ball-triangle-path` | `ball-scale-ripple-multiple` | `ball-pulse-sync` | `ball-beat` | `ball-scale-multiple` | `ball-zig-zag` | `ball-zig-zag-deflect` | `ball-clip-rotate` | `ball-clip-rotate-pulse` | `ball-clip-rotate-multiple` | `ball-scale-ripple` | `triangle-skew-spin` | pacman = null,
    overrideSpinnerClassName: String = null,
    style: CSSProperties = null
  ): SpinnerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fadeIn != null) __obj.updateDynamic("fadeIn")(fadeIn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (overrideSpinnerClassName != null) __obj.updateDynamic("overrideSpinnerClassName")(overrideSpinnerClassName.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinnerProps]
  }
}

