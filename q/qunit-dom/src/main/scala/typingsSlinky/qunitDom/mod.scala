package typingsSlinky.qunitDom

import org.scalajs.dom.raw.Element
import typingsSlinky.qunitDom.assertionsMod.default
import typingsSlinky.qunitDom.mod.global.Assert
import typingsSlinky.qunitDom.qunitDomModulesMod.SetupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qunit-dom", "setup")
  @js.native
  def setup(assert: Assert): Unit = js.native
  @JSImport("qunit-dom", "setup")
  @js.native
  def setup(assert: Assert, options: SetupOptions): Unit = js.native
  
  object global {
    
    @js.native
    trait Assert extends StObject {
      
      def dom(): default = js.native
      def dom(target: js.UndefOr[scala.Nothing], rootElement: Element): default = js.native
      def dom(target: String): default = js.native
      def dom(target: String, rootElement: Element): default = js.native
      def dom(target: Element): default = js.native
      def dom(target: Element, rootElement: Element): default = js.native
      def dom(target: Null, rootElement: Element): default = js.native
    }
  }
}
