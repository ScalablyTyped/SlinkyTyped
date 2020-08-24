package typingsSlinky.prettyFormat

import typingsSlinky.prettyFormat.typesMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  def apply(`val`: js.Any): String = js.native
  def apply(`val`: js.Any, options: typingsSlinky.prettyFormat.typesMod.OptionsReceived): String = js.native
  @js.native
  object plugins extends js.Object {
    var AsymmetricMatcher: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var ConvertAnsi: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var DOMCollection: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var DOMElement: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var Immutable: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var ReactElement: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    var ReactTestComponent: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
  }
  
  type Colors = typingsSlinky.prettyFormat.typesMod.Colors
  type Config = typingsSlinky.prettyFormat.typesMod.Config
  type NewPlugin = typingsSlinky.prettyFormat.typesMod.NewPlugin
  type OldPlugin = typingsSlinky.prettyFormat.typesMod.OldPlugin
  type Options = typingsSlinky.prettyFormat.typesMod.Options
  type OptionsReceived = typingsSlinky.prettyFormat.typesMod.OptionsReceived
  type Plugin = typingsSlinky.prettyFormat.typesMod.Plugin
  type Plugins_ = Plugins
  type Refs = typingsSlinky.prettyFormat.typesMod.Refs
  type Theme = typingsSlinky.prettyFormat.typesMod.Theme
}

