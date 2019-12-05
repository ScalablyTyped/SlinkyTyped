package typingsSlinky.expressDashActuator

import typingsSlinky.expressDashActuator.expressDashActuatorMod.InfoGitMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object expressDashActuatorStrings {
  @js.native
  sealed trait full extends InfoGitMode
  
  @js.native
  sealed trait simple extends InfoGitMode
  
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
}

