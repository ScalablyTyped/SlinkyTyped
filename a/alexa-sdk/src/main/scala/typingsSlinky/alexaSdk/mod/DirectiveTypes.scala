package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay
  - typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotStop
  - typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue
  - typingsSlinky.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate
  - typingsSlinky.alexaSdk.alexaSdkStrings.Hint
  - typingsSlinky.alexaSdk.alexaSdkStrings.VideoAppDotLaunch
*/
trait DirectiveTypes extends js.Object

object DirectiveTypes {
  @scala.inline
  def AudioPlayerDotClearQueue: typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue = this.cast("AudioPlayer.ClearQueue")
  @scala.inline
  def AudioPlayerDotPlay: typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay = this.cast("AudioPlayer.Play")
  @scala.inline
  def AudioPlayerDotStop: typingsSlinky.alexaSdk.alexaSdkStrings.AudioPlayerDotStop = this.cast("AudioPlayer.Stop")
  @scala.inline
  def DisplayDotRenderTemplate: typingsSlinky.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate = this.cast("Display.RenderTemplate")
  @scala.inline
  def Hint: typingsSlinky.alexaSdk.alexaSdkStrings.Hint = this.cast("Hint")
  @scala.inline
  def VideoAppDotLaunch: typingsSlinky.alexaSdk.alexaSdkStrings.VideoAppDotLaunch = this.cast("VideoApp.Launch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

