package typingsSlinky.phaser.phaserMod.Loader.FileTypes

import org.scalajs.dom.raw.AudioContext
import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.AudioFileConfig
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single Audio File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#audio method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#audio.
  */
@JSImport("phaser", "Loader.FileTypes.AudioFile")
@js.native
class AudioFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.AudioFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param urlConfig The absolute or relative URL to load this file from in a config object.
    * @param xhrSettings Extra XHR Settings specifically for this file.
    * @param audioContext The AudioContext this file will use to process itself.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: js.Any) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: js.Any) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: String, urlConfig: js.Any, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: AudioFileConfig, urlConfig: js.Any, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    xhrSettings: js.UndefOr[scala.Nothing],
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: js.UndefOr[scala.Nothing],
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.Any,
    xhrSettings: js.UndefOr[scala.Nothing],
    audioContext: AudioContext
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: AudioFileConfig,
    urlConfig: js.Any,
    xhrSettings: XHRSettingsObject,
    audioContext: AudioContext
  ) = this()
}
