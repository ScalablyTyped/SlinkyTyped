package typingsSlinky.materialFloatingLabel

import org.scalajs.dom.raw.Element
import typingsSlinky.materialFloatingLabel.adapterMod.MDCFloatingLabelAdapter
import typingsSlinky.materialFloatingLabel.foundationMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/floating-label", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MDCFloatingLabel ()
    extends typingsSlinky.materialBase.componentMod.default[MDCFloatingLabelAdapter, default] {
    /**
      * Styles label to float/dock.
      * @param shouldFloat styles the label to float by adding float class
      * if true, otherwise docks the label by removing the float class.
      */
    def float(shouldFloat: Boolean): Unit = js.native
    def getWidth(): Double = js.native
    /**
      * Styles the label to produce the label shake for errors.
      * @param  shouldShake styles the label to shake by adding shake class
      * if true, otherwise will stop shaking by removing shake class.
      */
    def shake(shouldShake: Boolean): Unit = js.native
  }
  
  @js.native
  class MDCFloatingLabelFoundation () extends default
  
  /* static members */
  @js.native
  object MDCFloatingLabel extends js.Object {
    def attachTo(root: Element): MDCFloatingLabel = js.native
  }
  
  /* static members */
  @js.native
  object MDCFloatingLabelFoundation extends js.Object {
    val cssClasses: typingsSlinky.materialFloatingLabel.constantsMod.cssClasses = js.native
    val defaultAdapter: MDCFloatingLabelAdapter = js.native
  }
  
}

