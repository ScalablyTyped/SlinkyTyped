package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it easy to set suitable defaults for illumination and rotation for 3D charts
  * @see Dim3DDiagram
  */
@js.native
trait X3DDefaultSetter extends XInterface {
  /** The result may depend on the current chart type and the current shade mode. */
  def set3DSettingsToDefault(): Unit = js.native
  /**
    * set suitable defaults for the illumination of the current 3D chart. The result may dependent on other 3D settings as rotation or shade mode. It may
    * depend on the current chart type also.
    */
  def setDefaultIllumination(): Unit = js.native
  /** sets a suitable default for the rotation of the current 3D chart. The result may depend on the current chart type. */
  def setDefaultRotation(): Unit = js.native
}

object X3DDefaultSetter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    set3DSettingsToDefault: () => Unit,
    setDefaultIllumination: () => Unit,
    setDefaultRotation: () => Unit
  ): X3DDefaultSetter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), set3DSettingsToDefault = js.Any.fromFunction0(set3DSettingsToDefault), setDefaultIllumination = js.Any.fromFunction0(setDefaultIllumination), setDefaultRotation = js.Any.fromFunction0(setDefaultRotation))
    __obj.asInstanceOf[X3DDefaultSetter]
  }
  @scala.inline
  implicit class X3DDefaultSetterOps[Self <: X3DDefaultSetter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet3DSettingsToDefault(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set3DSettingsToDefault")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultIllumination(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultIllumination")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDefaultRotation(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDefaultRotation")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

