package typingsSlinky.phaser.phaserMod.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.FileTypes.CSSFileConfig
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single CSS File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#css method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#css.
  */
@JSImport("phaser", "Loader.FileTypes.CSSFile")
@js.native
class CSSFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.CSSFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param url The absolute or relative URL to load this file from. If undefined or `null` it will be set to `<key>.js`, i.e. if `key` was "alien" then the URL will be "alien.js".
    * @param xhrSettings Extra XHR Settings specifically for this file.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: CSSFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, url: String) = this()
  def this(loader: LoaderPlugin, key: CSSFileConfig, url: String) = this()
  def this(loader: LoaderPlugin, key: String, url: js.UndefOr[scala.Nothing], xhrSettings: XHRSettingsObject) = this()
  def this(loader: LoaderPlugin, key: String, url: String, xhrSettings: XHRSettingsObject) = this()
  def this(
    loader: LoaderPlugin,
    key: CSSFileConfig,
    url: js.UndefOr[scala.Nothing],
    xhrSettings: XHRSettingsObject
  ) = this()
  def this(loader: LoaderPlugin, key: CSSFileConfig, url: String, xhrSettings: XHRSettingsObject) = this()
}
