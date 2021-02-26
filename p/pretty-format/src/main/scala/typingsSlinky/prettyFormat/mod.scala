package typingsSlinky.prettyFormat

import typingsSlinky.prettyFormat.typesMod.Plugins
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a presentation string of your `val` object
    * @param val any potential JavaScript object
    * @param options Custom settings
    */
  @JSImport("pretty-format", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any): String = js.native
  @JSImport("pretty-format", JSImport.Namespace)
  @js.native
  def apply(`val`: js.Any, options: typingsSlinky.prettyFormat.typesMod.OptionsReceived): String = js.native
  
  object plugins {
    
    @JSImport("pretty-format", "plugins")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("pretty-format", "plugins.AsymmetricMatcher")
    @js.native
    def AsymmetricMatcher: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def AsymmetricMatcher_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsymmetricMatcher")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ConvertAnsi")
    @js.native
    def ConvertAnsi: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ConvertAnsi_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConvertAnsi")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMCollection")
    @js.native
    def DOMCollection: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def DOMCollection_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMCollection")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.DOMElement")
    @js.native
    def DOMElement: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def DOMElement_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOMElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.Immutable")
    @js.native
    def Immutable: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def Immutable_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Immutable")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactElement")
    @js.native
    def ReactElement: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ReactElement_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactElement")(x.asInstanceOf[js.Any])
    
    @JSImport("pretty-format", "plugins.ReactTestComponent")
    @js.native
    def ReactTestComponent: typingsSlinky.prettyFormat.typesMod.NewPlugin = js.native
    @scala.inline
    def ReactTestComponent_=(x: typingsSlinky.prettyFormat.typesMod.NewPlugin): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReactTestComponent")(x.asInstanceOf[js.Any])
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
