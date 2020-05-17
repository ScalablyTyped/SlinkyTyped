package typingsSlinky.hlsJs.hlsLightMod

import typingsSlinky.hlsJs.anon.AUDIOTRACKLOADED
import typingsSlinky.hlsJs.anon.AUDIOTRACKLOADERROR
import typingsSlinky.hlsJs.anon.KEYSYSTEMERROR
import typingsSlinky.hlsJs.anon.PartialConfig
import typingsSlinky.hlsJs.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
/**
  * Constructor. Can be provided an HlsConfig object as default properties and or overrides
  */
class ^ ()
  extends typingsSlinky.hlsJs.mod.^ {
  def this(config: PartialConfig) = this()
}

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * override Hls default configuration
    * this configuration will be applied by default to all instances
    */
  var DefaultConfig: Config = js.native
  /**
    * Hls error details
    */
  var ErrorDetails: AUDIOTRACKLOADERROR = js.native
  /**
    * Hls error types
    */
  var ErrorTypes: KEYSYSTEMERROR = js.native
  /**
    * Hls events
    */
  var Events: AUDIOTRACKLOADED = js.native
  /**
    * returns hls.js dist version number
    */
  var version: String = js.native
  /**
    * checks whether your browser is supporting MediaSource Extensions
    */
  def isSupported(): Boolean = js.native
}

