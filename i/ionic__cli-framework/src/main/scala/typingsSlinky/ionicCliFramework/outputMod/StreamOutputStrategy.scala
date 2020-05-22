package typingsSlinky.ionicCliFramework.outputMod

import typingsSlinky.ionicCliFramework.colorsMod.Colors
import typingsSlinky.ionicCliFramework.tasksMod.TaskChain
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/output", "StreamOutputStrategy")
@js.native
class StreamOutputStrategy protected () extends OutputStrategy {
  def this(hasStreamColors: StreamOutputStrategyOptions) = this()
  val colors: Colors = js.native
  /* CompleteClass */
  override val stream: WritableStream = js.native
  /* CompleteClass */
  override def createTaskChain(): TaskChain = js.native
}

