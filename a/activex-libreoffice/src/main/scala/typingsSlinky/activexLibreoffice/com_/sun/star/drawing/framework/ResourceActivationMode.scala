package typingsSlinky.activexLibreoffice.com_.sun.star.drawing.framework

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ResourceActivationMode specifies, for example for the {@link com.sun.star.drawing.framework.XConfigurationController.requestResourceActivation()}
  * , whether a requested resource is to replace an existing resource of the same class or is to be activated additionally.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ResourceActivationMode extends js.Object

object ResourceActivationMode {
  /** A resource is requested in addition to already existing ones. This is used for example for panes. */
  @scala.inline
  def ADD: `0` = 0.asInstanceOf[`0`]
  /** A resource is requested to replace an already existing one of the same class. This is used for example for views. */
  @scala.inline
  def REPLACE: `1` = 1.asInstanceOf[`1`]
}

