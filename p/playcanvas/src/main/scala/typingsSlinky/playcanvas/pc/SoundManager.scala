package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.SoundManager
  * @augments pc.EventHandler
  * @classdesc The SoundManager is used to load and play audio. As well as apply system-wide settings
  * like global volume, suspend and resume.
  * @description Creates a new sound manager.
  * @param {object} [options] - Options options object.
  * @param {boolean} [options.forceWebAudioApi] - Always use the Web Audio API even check indicates that it if not available.
  * @property {number} volume Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
  */
@js.native
trait SoundManager extends EventHandler {
  /**
    * Global volume for the manager. All {@link pc.SoundInstance}s will scale their volume with this volume. Valid between [0, 1].
    */
  var volume: Double = js.native
}

