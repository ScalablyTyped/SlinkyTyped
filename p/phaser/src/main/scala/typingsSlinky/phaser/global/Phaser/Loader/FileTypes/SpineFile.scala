package typingsSlinky.phaser.global.Phaser.Loader.FileTypes

import typingsSlinky.phaser.Phaser.Loader.FileTypes.SpineFileConfig
import typingsSlinky.phaser.Phaser.Loader.LoaderPlugin
import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Phaser.Loader.FileTypes.SpineFile")
@js.native
class SpineFile protected ()
  extends typingsSlinky.phaser.Phaser.Loader.FileTypes.SpineFile {
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    jsonURL: js.Array[String],
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpineFileConfig,
    jsonURL: String,
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: SpineFileConfig,
    jsonURL: js.Array[String],
    atlasURL: String,
    preMultipliedAlpha: Boolean,
    jsonXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
}
