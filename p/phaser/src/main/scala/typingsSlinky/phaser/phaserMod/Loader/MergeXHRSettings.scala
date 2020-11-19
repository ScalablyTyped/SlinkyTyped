package typingsSlinky.phaser.phaserMod.Loader

import typingsSlinky.phaser.Phaser.Types.Loader.XHRSettingsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Loader.MergeXHRSettings")
@js.native
object MergeXHRSettings extends js.Object {
  
  /**
    * Takes two XHRSettings Objects and creates a new XHRSettings object from them.
    * 
    * The new object is seeded by the values given in the global settings, but any setting in
    * the local object overrides the global ones.
    * @param global The global XHRSettings object.
    * @param local The local XHRSettings object.
    */
  def apply(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = js.native
}
