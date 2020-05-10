package typingsSlinky.hark.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.raw.HTMLAudioElement
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hark", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(stream: HTMLAudioElement): Harker = js.native
  def apply(stream: HTMLAudioElement, option: Option): Harker = js.native
  def apply(stream: HTMLVideoElement): Harker = js.native
  def apply(stream: HTMLVideoElement, option: Option): Harker = js.native
  def apply(stream: MediaStream): Harker = js.native
  def apply(stream: MediaStream, option: Option): Harker = js.native
}

