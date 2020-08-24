package typingsSlinky.guacamoleClient.mod

import typingsSlinky.guacamoleClient.guacCommonMod.Mimetype
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("guacamole-client", "RawAudioFormat")
@js.native
class RawAudioFormat protected ()
  extends typingsSlinky.guacamoleClient.rawAudioFormatMod.RawAudioFormat {
  /**
    * @param template The object whose properties should be copied into the corresponding
    * properties of the new Guacamole.RawAudioFormat.
    */
  def this(template: typingsSlinky.guacamoleClient.rawAudioFormatMod.RawAudioFormat) = this()
}

/* static members */
@JSImport("guacamole-client", "RawAudioFormat")
@js.native
object RawAudioFormat extends js.Object {
  /**
    * Parses the given mimetype, returning a new Guacamole.RawAudioFormat
    * which describes the type of raw audio data represented by that mimetype. If
    * the mimetype is not a supported raw audio data mimetype, null is returned.
    *
    * @param mimetype The audio mimetype to parse.
    * @returns
    *     A new Guacamole.RawAudioFormat which describes the type of raw
    *     audio data represented by the given mimetype, or null if the given
    *     mimetype is not supported.
    */
  def parse(mimetype: Mimetype): typingsSlinky.guacamoleClient.rawAudioFormatMod.RawAudioFormat = js.native
}

