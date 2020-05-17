package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.jsplumbStrings.Bezier
  - typingsSlinky.jsplumb.jsplumbStrings.StateMachine
  - typingsSlinky.jsplumb.jsplumbStrings.Flowchart
  - typingsSlinky.jsplumb.jsplumbStrings.Straight
  - typingsSlinky.jsplumb.mod.UserDefinedConnectorId
*/
trait ConnectorId extends ConnectorSpec

object ConnectorId {
  @scala.inline
  def Bezier: typingsSlinky.jsplumb.jsplumbStrings.Bezier = "Bezier".asInstanceOf[typingsSlinky.jsplumb.jsplumbStrings.Bezier]
  @scala.inline
  def StateMachine: typingsSlinky.jsplumb.jsplumbStrings.StateMachine = "StateMachine".asInstanceOf[typingsSlinky.jsplumb.jsplumbStrings.StateMachine]
  @scala.inline
  def Flowchart: typingsSlinky.jsplumb.jsplumbStrings.Flowchart = "Flowchart".asInstanceOf[typingsSlinky.jsplumb.jsplumbStrings.Flowchart]
  @scala.inline
  def Straight: typingsSlinky.jsplumb.jsplumbStrings.Straight = "Straight".asInstanceOf[typingsSlinky.jsplumb.jsplumbStrings.Straight]
  @scala.inline
  implicit def apply(value: UserDefinedConnectorId): ConnectorId = value.asInstanceOf[ConnectorId]
}

